
package symmetrical_word;

import java.util.Scanner;


public class SymmetricalWord {

    
    public static void main(String[] args) {
        
        String reverse = "";
        System.out.println("please enter a word:");
        Scanner scan = new Scanner(System.in);
        String enteredKeyword = scan.nextLine();
        
        for(int i = enteredKeyword.length()-1 ; i >= 0 ; i--){
            reverse = reverse + enteredKeyword.charAt(i);
            
        }
        System.out.println("entered word: " + enteredKeyword + "\n" +
        		           "reverse of word: " + reverse);

        if(enteredKeyword.equals(reverse))
            System.out.println("*entered word is symmetrical");
        
        else
            System.out.println("*entered word is not symmetrical");
        
        
    }
    
}
