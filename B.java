package Saikrishna.assignment.singleton;

public class B{
	String str;
	
	public static B initStr(String s){
		B obj = new B();
		obj.str = s;
		return obj;		
	}
	
	public void displayStr(){
		System.out.println("string is:" + this.str);
	}
}
