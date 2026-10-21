import java.security.*;

class DSS {
    public static void main(String[] args) throws Exception {
        String text="HELLO";

        KeyPairGenerator g=KeyPairGenerator.getInstance("DSA");
        g.initialize(2048);
        KeyPair kp=g.generateKeyPair();

        Signature s=Signature.getInstance("SHA256withDSA");

        s.initSign(kp.getPrivate());
        s.update(text.getBytes());
        byte[] sign=s.sign();

        s.initVerify(kp.getPublic());
        s.update(text.getBytes());

        System.out.println("Valid: "+s.verify(sign));
    }
}
