
public class ThreadExample_4 extends Thread
{

	public static void main(String[] args) 
	{
		ThreadExample_4 t1=new ThreadExample_4();
		t1.start();

	}
	public void run()
	{
		System.out.println("Am in run method by extending thread");
	}
}
