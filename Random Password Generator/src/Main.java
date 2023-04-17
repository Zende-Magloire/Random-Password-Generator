import java.util.*;

public class Main {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your desired password length: ");

            int length = Integer.parseInt(scan.nextLine());
            System.out.println(Password(length));
        }


        static char[] Password(int len)
        {
            System.out.println("Generating password (length = " + len + ")");
            System.out.println(".......................................");
            System.out.print("Your password is: ");

            String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String Small_chars = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String symbols = "!@#$%^&*_=+-/.?<>)";

            String values = Capital_chars + Small_chars + numbers + symbols;

            Random rndm_method = new Random();

            char[] password = new char[len];

            for (int i = 0; i < len; i++)
            {
                password[i] = values.charAt(rndm_method.nextInt(values.length()));
            }
            return password;
        }
    }

