import java.util.*;

class TwoPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("User1: ");
        String u1=sc.nextLine();
        System.out.print("Pass1: ");
        String p1=sc.nextLine();

        System.out.print("User2: ");
        String u2=sc.nextLine();
        System.out.print("Pass2: ");
        String p2=sc.nextLine();

        if(u1.equals("user1") && p1.equals("pass1") &&
           u2.equals("user2") && p2.equals("pass2"))
            System.out.println("Access Granted");
        else
            System.out.println("Access Denied");
    }
}
