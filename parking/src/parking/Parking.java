
package parking;

import java.util.Scanner;


public class Parking{

    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        float taksiucret=0,minubusucret=0,ticariucret=0;
        int vasita=0,taksiparksuresi=0,minubusparksuresi=0,ticariparksuresi=0;
        System.out.println("\t ***OTOPARK UYGULAMASI***");
        System.out.println("1-Taksi\n2-Minubus\n3-Ticari");
        System.out.println("Vasitanizi seciniz(1,2,3): ");
        vasita=klavye.nextInt();
        switch(vasita){
            case 1:
                System.out.println("Taksinizi kac saat park etmek istiyorsunuz: ");
                taksiparksuresi=klavye.nextInt();
                int taksiguncelpark=taksiparksuresi;
                
                    if(taksiparksuresi==1){
                        taksiucret=5;
                        System.out.println("Taksi park borcunuz: "+taksiucret+" TL'dir.");
                        
                    }
                    else if(taksiparksuresi>1){
                        
                        
                        for(int i=1;i<taksiparksuresi;i++){
                            taksiguncelpark--;
                            System.out.println("taksiguncelpark= "+taksiguncelpark+"TL'dir");
                        }
                        
                    }
                    break;
            case 2:
                System.out.println("Minubusunuzu kac saat park etmek istiyorsunuz: ");
                minubusparksuresi=klavye.nextInt();
                    if(minubusparksuresi==1){
                        minubusucret=6;
                        System.out.println("Minubus park borcunuz: "+minubusucret+" TL'dir.");
                    }
                    break;
            case 3:
                System.out.println("Ticarinizi kac saat park etmek istiyorsunuz: ");
                ticariparksuresi=klavye.nextInt();
                    if(ticariparksuresi==1){
                        ticariucret=6.5f;
                        System.out.println("Ticari park borcunuz: "+ticariucret+" TL'dir.");
                    }
                    
                
                
                   break;
        }
    }
    
}
