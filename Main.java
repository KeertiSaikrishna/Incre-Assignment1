package Saikrishna.assignment.main;
import Saikrishna.assignment.data.A;
import Saikrishna.assignment.singleton.B;

public class Main{
	public static void main(String[] args){
		A obj1 = new A();

		obj1.display1();
		obj1.display2();

		B obj2 = B.initStr("hello");
		obj2.displayStr();
	}
}
