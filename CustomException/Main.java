package CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Enter your age: ");
        Scanner scan= new Scanner(System.in);
        int age= scan.nextInt();
        scan.close();

        try{
            checkAge(age);   //This method will check whether the entered age is eligible or not, i.e. this will check the exceprion case.
        }
        catch(Exception e){
            System.out.println("Something went wrong:"+e);   
            //System.out.println("Something went wrong:");     //The content in 'e' wont be printed. Just "something went qent wrong:" will be printed. Also the order in wihic the statement in the if block of checkAge function is printed is decide by this print statement.
        }

    }

    static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("\n"+"You must be 18+ to sign up.");
        }
        else{
            System.out.println("You are now signed up.");
        }
    }
}

