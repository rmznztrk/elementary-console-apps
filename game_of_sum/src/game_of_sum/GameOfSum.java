package game_of_sum;

import java.util.Scanner;

public class GameOfSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int totalPoints = 0, trueAnswer = 0, wrongAnswer = 0;
            do{ 
                int random1 = 1 + (int)(Math.random()*99);
                int random2 = 1 + (int)(Math.random()*99);
                
                System.out.println("Puaniniz=" + totalPoints + "P");
                System.out.print(random1 + "+" + random2 + "=?" + "\n");
                int sum = random1 + random2;
                
                System.out.println("Yukaridaki toplama isleminin sonucu kactir? ");
                int entered = scan.nextInt();
                
                if(entered == sum){
                    totalPoints += 5;
                    trueAnswer++;
                    System.out.println("Dogru cevap,TEBRIKLER!!! puaniniz:" + totalPoints + "P");
                }
                else{
                    totalPoints -= 2;
                    wrongAnswer++;
                    System.out.println("Yanlis cevap verdiniz!!! puaniniz:" + totalPoints + "P");
                }

                System.out.println();
                System.out.println("Oyuna devam etmek istiyor musunuz?(e/h)");
                String choice = scan.next();
                System.out.println();
                
                if("e".equals(choice)){
                    continue;
                }
                
                else if("h".equals(choice)){
                    System.out.println("Oyun bitti!");
                    System.out.print("Dogru cevap sayisi: " + trueAnswer);
                    System.out.println(" Yanlis cevap sayisi: " + wrongAnswer);
                    System.out.println("Toplam Puaniniz: " + totalPoints + "P");
                    break;
                }
                    
                else
                    System.out.println("e/h karakterlerinden birini giriniz!");
                    break;
                
            }while(true);
    
    
    }}
