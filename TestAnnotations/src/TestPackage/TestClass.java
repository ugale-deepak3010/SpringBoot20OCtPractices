package TestPackage;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		One o = new One();
		o.oneM();
		Two t = new Two();  
		o.depr();
	}
}

class One{
	public void oneM() {
		ArrayList<String> day = new ArrayList<String>();
		
		day.add("Sunday");
		
		System.out.println("Done");
	}
	
	@Deprecated
	void depr() {
		System.out.println("Hello...");
	}
}

class Two extends One{
	public void oneM() {
		System.out.println("From Two OneM");
	}
}
