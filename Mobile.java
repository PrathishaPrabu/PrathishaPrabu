package week1.Day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Call Home");
	}
	
	public void sendMsg() {
		System.out.println("Message Nila");
	}
	
	public static void main(String[] args) {
		//classname objectname=new classname()
		Mobile Nokia =new Mobile();
		// calling objects using methods
		//Objectname.method()
		Nokia.makeCall();
		Nokia.sendMsg();
				
	}
}
