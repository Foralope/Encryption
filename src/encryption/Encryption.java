/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encryption;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner keyedInput = new Scanner(System.in),keyedInput2 = new Scanner(System.in);
        String encrypted = "",startMessage,decrypted = "";
        char temporaryChar;
        int ascii,oneTwoThree = 0;
        while (oneTwoThree != 3){
            encrypted = "";
            decrypted = "";
            System.out.println("Encrypt (1), decrypt (2) or exit (3)?");
            oneTwoThree = keyedInput.nextInt();
            switch (oneTwoThree){
                case 1:
                    System.out.println("Please enter a message to encrypt.");
                    startMessage = keyedInput2.nextLine();
                    //Looping through the String
                    for(int i = 0; i < startMessage.length(); i = i + 1){
                        temporaryChar = startMessage.charAt(i);
                        ascii = (int)temporaryChar;
                        ascii = ascii + 3;
                        temporaryChar = (char)ascii;
                        encrypted = encrypted + temporaryChar;
                        //Encrypted message
                        System.out.println("Encrypted message: "+encrypted);
                    }
                    break;
                case 2:
                    System.out.println("Please enter a message to decrypt.");
                    startMessage = keyedInput2.nextLine();
                    for(int i = 0; i < startMessage.length(); i = i + 1){
                    temporaryChar = startMessage.charAt(i);
                        ascii = (int)temporaryChar;
                        ascii = ascii - 3;
                        temporaryChar = (char)ascii;
                        decrypted = decrypted + temporaryChar;
                        //Encrypted message
                        System.out.println("Decrypted message: "+decrypted);
                    }
                    break;
                case 3:
                 System.out.println("Exiting.");
                    System.exit(0);
                default:
                    System.out.println("That is not an option, please pick again.");
                    break;
            }
        }
    }
    
}
