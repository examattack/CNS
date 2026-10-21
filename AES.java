import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;

class AES {
    public static void main(String[] args) throws Exception {
        String text="HELLO";
        SecretKey key=new SecretKeySpec(
            "1234567890123456".getBytes(),"AES");
        Cipher c=Cipher.getInstance("AES");

        c.init(Cipher.ENCRYPT_MODE,key);
        byte[] enc=c.doFinal(text.getBytes());

        c.init(Cipher.DECRYPT_MODE,key);
        byte[] dec=c.doFinal(enc);

        System.out.println("Encrypted: "+
            Base64.getEncoder().encodeToString(enc));
        System.out.println("Decrypted: "+new String(dec));
    }
}
