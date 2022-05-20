package week1.Day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=908765l;
	boolean isPunctured=false;
	String bikeName="Honda";
		double runningKM=110.25;
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
//classname object=new classname();
	TwoWheeler HeroHonda=new TwoWheeler();
	System.out.println("Number Of Wheels:"+HeroHonda.noOfWheels);
	System.out.println("Number Of Mirrors:"+HeroHonda.noOfMirrors);
	System.out.println("Chasis Number:"+HeroHonda.chassisNumber);
	System.out.println("Is Punctured:"+HeroHonda.isPunctured);
	System.out.println("Name of Bike:"+HeroHonda.bikeName);
	System.out.println("Running km:"+HeroHonda.runningKM);
		}

}