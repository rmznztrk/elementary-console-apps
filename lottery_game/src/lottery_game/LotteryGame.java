
package lottery_game;

import java.util.Scanner;


public class LotteryGame {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("***Lottery Game***");
        
        //Math.Random(); fonksiyonu [0,0.99999] arasinda sayi uretir.
        
        while(true){
        int producedNumber =(int)(Math.random()*9) + 1; //0-9 arasi bir rakam uretir
        
        System.out.println("Bir rakam tahmin ediniz: ");
        int enteredNumber = key.nextInt();
        
        int difference = enteredNumber - producedNumber;
        int absoluteDifference = Math.abs(difference);
        
        
        if(enteredNumber == producedNumber)
            System.out.println("******^ Tebrikler Tam Bilet kazandiniz!!! ^******");
        else if(enteredNumber > 9 || enteredNumber < 0)
                System.out.println("Lutfen bir rakam giriniz!!!");
       else if(enteredNumber == 0){
                System.out.println("Cikis yaptiniz...");
            break;}
        else if(absoluteDifference == 1)
            System.out.println("*** Tebrikler Yarim Bilet kazandiiz!!! ***");
        
        else
            System.out.println("Kazanamadiniz :( \n");
            System.out.println("Uretilen sayi= " + producedNumber + " idi");
            System.out.println("(Oyunu bitirmek icin '0' tusuna basabilirsiniz.) \n");
        
        }
        
    
        
        }
    
}
