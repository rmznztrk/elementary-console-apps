package random_function;


public class RandomFunction {

    
    public static void main(String[] args) {
        int num1, num2;
        num1 = (int)(Math.random()*50);
        num2 = (int)(Math.random()*50);
        System.out.println(num1 + " ve " + num2);
        if(num1 > num2){
            System.out.println("Buyuk olan sayi= " + num1);
            System.out.println("Kucuk olan sayi= " + num2);
        }
        else if(num2 > num1){
            System.out.println("Buyuk olan sayi= " + num1); 
            System.out.println("Kucuk olan sayi= " + num2);
        }
        else
            System.out.println("iki deger esit");
       
            
    }
        
                
    }
    

