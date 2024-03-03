//import java.util.*;

import java.util.InputMismatchException;
import java.util.Scanner;

class Excetion{
    public static void main(String args[]){
        
        Scanner scan= new Scanner(System.in);
    try{
        System.out.print("Enter the dividend: ");
        int x=scan.nextInt();

        System.out.print("Enter the divisor: ");
        int y=scan.nextInt();

        int z= x/y;   
//If we give y==0 then jdk will throw "ArithmeticException"
        System.out.println("remainder= "+z);
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero!");
    }    
    catch(InputMismatchException e){
        System.out.println("Please enter a number.");
    }
    catch(Exception e){
        System.out.println("Something went wrong.");
    }
    finally{
        System.out.println("This will be printed anyways.\n");
        scan.close();
    }
        scan.close();
    }
}