package salary_calculation;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int month = 0;
        
        Scanner key = new Scanner(System.in);
        System.out.println("Ahmet Bey'in Baslangic maas degerini(yilbasi) giriniz= ");
        int ahmetmaas = key.nextInt();
        System.out.println("Hasan Bey'in Baslangic maas degerini(yilbasi) giriniz= ");
        int hasanmaas = key.nextInt();
        
        System.out.println("Hangi ay'a kadar maas degerlerini hesaplamak istiyorsunuz(january, february, ..., december) = ");
        String choice;
        choice = key.next();

        switch(choice){
            case "january":
                month = 1;
                break;
            case "february":
                month = 2;
                break;
            case "march":
                month = 3;
                break;     
            case "april":
                month = 4;
                break;
            case "may":
                month = 5;
                break;
            case "jun":
                month = 6;
                break;
            case "july":
                month = 7;
                break;
            case "agust":
                month = 8;
                break;
            case "september":
                month = 9;
                break;
            case "october":
                month = 10;
                break;
            case "november":
                month = 11;
                break;
            case "december":
                month = 12;
                break;   
            default:
                System.out.println("Lutfen bir ay ismi giriniz!");
        }
        
        System.out.println();
        
        String[] months = {"january","february","march","april","may","jun",
            "july","agust","september","october","november","december"};
       
        for(int i=1 ; i <= month ; i++){
            
            System.out.println(months[i-1] + " ayi maaslari: ");
            
            if(i%2==0){
                ahmetmaas=ahmetmaas-(ahmetmaas*25/100);
                System.out.println("ahmet="+ahmetmaas);
            }
            
            else{
                ahmetmaas=ahmetmaas+(ahmetmaas*50/100);
                System.out.println("ahmet: "+ahmetmaas);
                
                
            }
                hasanmaas=hasanmaas+(hasanmaas*25/100);
                System.out.println("hasan: "+hasanmaas);
                
                System.out.println();
        }
            if(ahmetmaas>hasanmaas)
                System.out.println(choice + " ayina gore Ahmet Bey'in maasi daha yuksektir!");
            else if(hasanmaas>ahmetmaas)
                System.out.println(choice + " ayina gore Hasan Bey'in maasi daha yuksektir!");
            else
                System.out.println(choice + " ayina gore maaslar esittir");
        
    }
    
}
