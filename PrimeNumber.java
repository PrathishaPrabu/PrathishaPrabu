package week1.Day1;

public class PrimeNumber {

	/*
		 * Goal: To find whether a number is a Prime number or not
		 * 
		 * input: 13
		 * output: 13 is a Prime Number
		 * 
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
		 *   
		 * What are my learnings from this code?
		 * 1)
		 * 2)
		 * 3) 
		 * 
		 */

		

		public static void main(String[] args) {

			int input=13;
			boolean primeNum=false;
			 for (int i = 2; i < input/2; i++) {
				 int reminder=input%i;
				 if(reminder==0)
				 {
					 primeNum=true;
					 break;
				 }
				
			}
			 if(primeNum==false)
			 {
				 System.out.println("Prime number");
			 }
			 else if(primeNum==true)
			 {
				 System.out.println("Not a Prime number");
			 }
				}
	}