import java.security.*;

class MD5 {
    public static void main(String[] args) throws Exception {
        String text="HELLO";

        MessageDigest md=MessageDigest.getInstance("MD5");
        byte[] hash=md.digest(text.getBytes());

        for(byte b:hash)
            System.out.printf("%02x",b);
    }
}
