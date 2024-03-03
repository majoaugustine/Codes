import java.io.*;
import java.net.*;
import java.util.*;

/**
 * server
 */
public class client {
    public static void main(String[] args) {
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s;
        try {
            String msg;
            cs= new Socket("localhost",1235);
            sin = new DataInputStream(cs.getInputStream());
            sout= new DataOutputStream(cs.getOutputStream());
            s = new Scanner(System.in);
            System.out.println("\nClient\n");
            String str=sin.readUTF();
            while (!str.equals("quit")) {
                System.out.println("server >> "+str);
                System.out.print("you >>");
                msg = s.nextLine();
                sout.writeUTF(msg);
                str=sin.readUTF();
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}