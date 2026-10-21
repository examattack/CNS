import javax.crypto.*;
import java.util.*;

class TripleDES {
    public static void main(String[] args) throws Exception {
        String text="HELLO";

        KeyGenerator g=KeyGenerator.getInstance("DESede");
        SecretKey key=g.generateKey();

        Cipher c=Cipher.getInstance("DESede");

        c.init(Cipher.ENCRYPT_MODE,key);
        byte[] enc=c.doFinal(text.getBytes());

        c.init(Cipher.DECRYPT_MODE,key);
        byte[] dec=c.doFinal(enc);

        System.out.println("Encrypted: "+
            Base64.getEncoder().encodeToString(enc));
        System.out.println("Decrypted: "+new String(dec));
    }
}
