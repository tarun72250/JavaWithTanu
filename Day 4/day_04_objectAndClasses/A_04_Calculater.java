package day_04_objectAndClasses;

public class A_04_Calculater {

	private int n1, n2;
	
	//instance method 
	public void add()
	{
		System.out.println("Addition : "+(n1+n2));
	}
	
	public void sub()
	{
		System.out.println("Sub : "+(n1-n2));

	}
	
	public void mul()
	{
		System.out.println("Mul : "+(n1*n2));
	}
	public void div()
	{
		System.out.println("Div : "+(n1/n2));
	}
}
