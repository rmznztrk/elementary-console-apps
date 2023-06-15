
package sum_digits_without_mod;

import java.util.Scanner;



public class SumDigitsWithoutMod {

    
    public static void main(String[] args) {

        int sayi1=0, sayi2=0, sayi3=0, sayi4=0, sayi5=0, sayi6=0;
        Scanner giris = new Scanner(System.in);
        System.out.println("Uc basamakli sayi giriniz: ");
        int sayi = giris.nextInt();
        double birler1 = 0;
        
        birler1 = sayi/10;
        sayi1 = (int)(birler1*10);
        sayi2 = sayi - sayi1;
        System.out.println("Birler basamagi: " + sayi2);
        
        
        sayi3 = sayi / 10;
        
        if(sayi3 >= 100){
            
        while (sayi3 > 100) { 
           sayi3 = sayi3 / 10;   
        }
        
        
        }
        sayi4 = sayi3 / 10;
        sayi5 = sayi4 * 10;
        sayi6 = sayi3 - sayi5;
        System.out.println("Onlar basamagi: " + sayi6);
        
        
        
        sayi3 = sayi3 / 10;
        while(sayi3 > 10){
            sayi3 = sayi3 / 10;
        }
        System.out.println("Yuzler basamagi: " + sayi3);
        
        
        System.out.println("Sayinin basamaktaki rakamlarinin toplami= " + (sayi3 + sayi6 + sayi2) );
        
        
    }
    
}
