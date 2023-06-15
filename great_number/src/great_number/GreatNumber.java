
package great_number;

import java.util.Scanner;


public class GreatNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        int enteredNum[] = new int[1];

        System.out.println("enter a number= ");

        enteredNum[0] = scan.nextInt();

        System.out.println("divisors of " + enteredNum[0] + "= ");

            for(int i = 1 ; i < enteredNum[0] ; i++){
                
                if(enteredNum[0] % i == 0){
                    System.out.println(i);
                    sum = sum + i;
                }      
                    
            }
            
            if(sum == enteredNum[0]){
                System.out.println("Great Number");
            }
            else{
                System.out.println("no Great Number");
            }
    }
    
}
