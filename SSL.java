import java.io.*;

class SSLServer {
    public static void main(String[] args) throws Exception {
        SSLServerSocket s=(SSLServerSocket)
            SSLServerSocketFactory.getDefault()
            .createServerSocket(8443);

        System.out.println("Server waiting...");
        SSLSocket c=(SSLSocket)s.accept();

        BufferedReader in=new BufferedReader(
            new InputStreamReader(c.getInputStream()));

        System.out.println("Client: "+in.readLine());

        c.close();
        s.close();
    }
}

// CLIENT
import javax.net.ssl.*;
import java.io.*;

class SSLClient {
    public static void main(String[] args) throws Exception {
        SSLSocket s=(SSLSocket)
            SSLSocketFactory.getDefault()
            .createSocket("localhost",8443);

        PrintWriter out=new PrintWriter(
            s.getOutputStream(),true);

        out.println("Hello Server");
        s.close();
    }
}
