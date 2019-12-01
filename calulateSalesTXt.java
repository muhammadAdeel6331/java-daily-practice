
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Adeel
 */
public class calulateSalesTXt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double txt;
        int amount;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Amount");
        amount=in.nextInt();
         System.out.println(" Enter the  Tax percentage!");
         int per=in.nextInt();
        
        txt= amount*per/100;
        System.out.println("your tax is "+txt);
        
    
    }
    
}
