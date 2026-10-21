import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;

class SHA256 {
    public static void main(String[] args) throws Exception {
        String text="HELLO";
        String key="secret";

        Mac mac=Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(key.getBytes(),"HmacSHA256"));

        byte[] result=mac.doFinal(text.getBytes());

        System.out.println(
            Base64.getEncoder().encodeToString(result));
    }
}
