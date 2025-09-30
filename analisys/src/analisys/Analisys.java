/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisys;
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class Analisys {

   
    public static void main(String[] args) {    
        Scanner input = new Scanner (System.in);
        int passes = 0;
        int failures = 0;
        int studentcounter = 1;
        int result;
        
        while (studentcounter <= 10)
        {
            
            System.out.println("enter results (1 = pass, 2 = fail;  )");
            result = input.nextInt();
            
            if (result == 1)
                passes = passes + 1;
            else 
                failures = failures + 1;
            
            
            studentcounter = studentcounter + 1;
        }
        System.out.printf("passed: %d\nFailed: %d\n", passes, failures);
        
        if (passes > 8)
                System.out.println("bonus to instructor");
      
    }
    
}
