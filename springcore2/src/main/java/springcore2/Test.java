package springcore2;

public class Test{
	
	MyInterface my; //reference
	
	public Test(MyInterface my) // constructor injection
	{
		this.my=my;
	}
	
	public void start()
	{
		my.doTask();
	}
	
}
