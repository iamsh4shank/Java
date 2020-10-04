import java.math.BigInteger; 
import java.util.Scanner;
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 
  
public class md5 { 
    public static String getMd5(String input) { 
        try { 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    public static void main(String args[]) throws NoSuchAlgorithmException { 
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        System.out.println(getMd5(s)); 
    } 
}
