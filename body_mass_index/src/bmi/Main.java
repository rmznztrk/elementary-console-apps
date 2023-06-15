package bmi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("***BodyMassIndex"); 
        
        
        System.out.println("Please enter your height in cm: ");
        int height = scan.nextInt();
        
        System.out.println("Enter your weight: ");
        float weight = scan.nextFloat();
        
        System.out.println("");
        
        float floatHeight = (float)height/100;
       
        System.out.println("Your height: " + floatHeight + "m");
        System.out.println("Your Weight: " + weight + "kg");
        
        float squareOfHeight = floatHeight * floatHeight;
        
        float bmi = weight / squareOfHeight; // bmi: body mass index

        System.out.println("Your Body Mass Index: " + bmi + "\n");

        if(0 < bmi && bmi < 15)
            System.out.println("***Extremely underweight***");

        else if(15 < bmi && bmi < 16)
            System.out.println("***severely underweight***");

        else if(16 < bmi && bmi < 18.5)
            System.out.println("***underweight***");

        else if(18.5 < bmi && bmi < 25)
            System.out.println("***normal (healthy) weight***");

        else if(25 < bmi && bmi < 30)
            System.out.println("***Overweight***");

        else if(30 < bmi && bmi < 35)
            System.out.println("***Level 1 (slightly) obese***");

        else if(35 < bmi && bmi < 40)
            System.out.println("***Level 2 (severely) obese***");

        else if(40 < bmi && bmi < 100)
            System.out.println("***Levele 3 (extremely) obese***");
            
        else {
			System.out.println("please enter bmi value!");
		}

	}

}
