import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static Scanner scan = new Scanner(System.in);
	static int number = 11;
	static ArrayList<Integer> ptbs = new ArrayList<Integer>(); //ptbs: pozitif tam bolen sayisi(positive integer divisor number)
	static int count = 0;
	
	public static void main(String[] args) {
		
		int number = wantANumber();
		  
		int count = counter(number);

		isPrimeNumber(count, number);
		
	}

	private static int wantANumber() {
		System.out.println("Can you enter a number?");
		int number = scan.nextInt();
		return number;
	}

	private static void isPrimeNumber(int count,int number) {
		if(count == 2) {
			System.out.println(number + " sayisi asaldir. ");
			
		}
		else {
			System.out.println(number + " sayisi asal degildir.\n"
							+ number + " 'in " + " PTBS(Pozitif Tam Bolen Sayisi):");
			
			for (Integer value : ptbs) {
				System.out.println(value);
			}
		}
	}

	private static int counter(int number) {
		for (int i = 1; i <= number; i++) {
			if( number%i == 0 ) {
				ptbs.add(i);
				count++;
			}
		}
		return count;
	}

}
