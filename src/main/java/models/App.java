package  models;

import java.util.Scanner;
import static models.Decoding.decrypt;
import static models.Encoding.encrypt;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ceaser Cipher where we code and decode any text!");


        System.out.println("Please enter a sentence without spacing:");
        String plain = scanner.nextLine();

        System.out.println("Please enter a key between 1 to 25: ");
        int Key =  scanner.nextInt();

            if (Key < 1 || Key > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", Key );
            }
        String condition = scanner.nextLine();


        String cipherText = encrypt (plain,Key);
        System.out.println( "The encrypted text is: " + cipherText);
        String getCipherText = decrypt (plain,Key);
        System.out.println( "The decrypted  text is: " +  decrypt (cipherText, Key));
    }

}
