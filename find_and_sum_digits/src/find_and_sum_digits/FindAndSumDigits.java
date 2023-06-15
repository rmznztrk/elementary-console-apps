
package find_and_sum_digits;

import java.util.Scanner;
public class FindAndSumDigits{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int sum=0;
        
        System.out.println("enter a number:");
        
        int number = scan.nextInt();
          
        do{
            sum += number % 10; //mod alarak son basamaktaki sayi bulunur ve sonra toplama gerceklestirilir
            number = number / 10; //sagdan sola dogru bir basamak gecmek icin int tipindeki sayiyi 10' a boleriz
        }while(number > 0);
           System.out.println("sum of digits= " + sum);

    }
    
}
