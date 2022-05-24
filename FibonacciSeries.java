package week1.Day1;

public class FibonacciSeries {
public static void main(String[] args) {
int range=8,firstNum=0,secNum=1;
int sum=0;
for(int i = 1; i<8; i++)
		
	{
			System.out.println(firstNum);
			sum=firstNum+secNum;
					
		// Assign second number to the first number
			firstNum=secNum;
		// Assign sum to the second number
		secNum=sum;
		// print sum

	}

}
}
