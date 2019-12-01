
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
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double weight;
        double height, BMI;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Body Mass !");
        weight= in.nextDouble();
        System.out.println("Enter the body height in inch !");
        height= in.nextDouble();
         BMI=(weight/(Math.sqrt(height)))*703;
         System.out.println(" Your BMI is "+BMI);
        
    }
    
}
