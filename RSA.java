import java.security.*;
import javax.crypto.Cipher;
import java.util.*;

class RSA {
    public static void main(String[] args) throws Exception {
        String text="HELLO";

        KeyPairGenerator g=KeyPairGenerator.getInstance("RSA");
        g.initialize(2048);
        KeyPair kp=g.generateKeyPair();

        Cipher c=Cipher.getInstance("RSA");

        c.init(Cipher.ENCRYPT_MODE,kp.getPublic());
        byte[] enc=c.doFinal(text.getBytes());

        c.init(Cipher.DECRYPT_MODE,kp.getPrivate());
        byte[] dec=c.doFinal(enc);

        System.out.println("Encrypted: "+
            Base64.getEncoder().encodeToString(enc));
        System.out.println("Decrypted: "+new String(dec));
    }
}
