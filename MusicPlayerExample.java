import java.lang.*; 
public class MusicPlayerExample extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Music Player is Running");
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println( "Received a Whatsapp notififcation ");
		}
	}
	public static void main(String[] args) 
	{
		 MusicPlayerExample t=new MusicPlayerExample();
		 t.start();  //  calls run() function
		 t.interrupt();
	}
	}
