class MusicPlayer extends Thread
{
	public void run()
	{
		System.out.println("Music is Playing");
	}
}
class MsWord implements Runnable
{
	public void run()
	{
		System.out.println("Typing Ms Word document");
	}
}
public class ThreadExample_3 
{

	public static void main(String[] args)
	{
		Runnable obj1=new MsWord();
		MsWord obj2=new MsWord();
		Thread thread1=new Thread(obj1); //invokes thread class constructor
		MusicPlayer thread2=new MusicPlayer();
		//Multithreading
		thread1.start();
		thread2.start();
	}

}
