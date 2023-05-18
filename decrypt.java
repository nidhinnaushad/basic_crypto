
/**
 * Write a description of class encrypt here.
 *
 * @author (Nidhin Naushad)
 * @version (1.0)
 */

import java.util.*;

public class decrypt
{
    public static void main(String[] args){
        int key = 13;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string to be decrypted");
        String text = sc.nextLine();
        char[] chars = text.toCharArray();
        for(char c :chars){
            c -= key; 
            System.out.print(c);
        }
    }
}
