/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@modifier Navpreet Kaur
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 */
public class ArithmeticBase 
{
 public double x,y;

    

 enum arthematic {
     PLUS,MINUS,TIMES,DIVIDE;

        public static arthematic getPLUS() {
            return PLUS;
        }

        public static arthematic getMINUS() {
            return MINUS;
        }

        public static arthematic getTIMES() {
            return TIMES;
        }

        public static arthematic getDIVIDE() {
            return DIVIDE;
        }
    }
    double calculate(double x, double y) 
        {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String");     
        String inputType = input.nextLine();
     String inputName = input.nextLine(); //takes input for artemetic string
        System.out.println("Choose an arthemetic operation");
        
        int i=0;
        for(arthematic s : arthematic.values())
        {
            System.out.println((i+1)+" for "+s);
            i++;
        }
           //takes input for account type
     return x*y;
        
    

        }
}


