
package person_table;

import java.util.Scanner;

//Creating a contact table based on the information entered

public class ContactTable {

    
    public static void main(String[] args) {

        Scanner keyword = new Scanner(System.in);
        System.out.println("Please enter values ​​without spaces!");
        System.out.println("How many people will you add to the contact table: ");
        int numberOfContact = keyword.nextInt();
        
        String[][] table = new String[numberOfContact][4];
        String[] titles = {"NAME_SURNAME(​​without spaces!)","GENDER","AGE","JOB"};
        
        for(int i = 0 ; i < numberOfContact ; i++){
            for(int j = 0; j < 4; j++){
                System.out.println((i+1) + ". of contact " + titles[j] );
                table[i][j] = keyword.next();
            }
            System.out.println();
        }
        System.out.print("NAME_SURNAME  GENDER   AGE\tJOB\n");
        for(int i = 0; i < numberOfContact; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
        }
        
        
    }
    
}
