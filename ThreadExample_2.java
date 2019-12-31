class Number implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
	}
} 
public class ThreadExample_2 
{

	public static void main(String[] args) 
	{
		Runnable obj1=new Number();     //can be reference of runnable interface
		Number obj2=new Number();
		Thread thread1=new Thread(obj1); //invokes thread class constructor
		Thread thread2=new Thread(obj2);
		//Multithreading
		thread1.start();
		thread2.start();
	}

}
