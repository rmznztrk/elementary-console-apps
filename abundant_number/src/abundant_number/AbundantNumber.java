package abundant_number;

import java.util.Scanner;


public class AbundantNumber{

    
    public static void main(String[] args) {

        int divisors = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scan.nextInt();

        for(int i = 1 ; i < number ; i++){
        	
        	if(number % i == 0){
        		divisors += i;
        	}
        	
        }
        
        System.out.println("divisors of the number= " + divisors);
        
        if(divisors > number){
                System.out.println("*" + number + " number is a abundant number");
        }
        else{
            System.out.println("*" + number + " number is not a abundant number!");
        }   
        
        
        }

  
}
    

