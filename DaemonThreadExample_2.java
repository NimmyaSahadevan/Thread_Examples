
public class DaemonThreadExample_2 extends Thread
{
	public void run()
	{
		System.out.println(" Thread name:"+Thread.currentThread().getName());
		System.out.println(" Check if it is DaemonThread: "+Thread.currentThread());
		
	}
	public static void main(String[] args) 
	{
		DaemonThreadExample_2 t1=new DaemonThreadExample_2(); //creating thread
		DaemonThreadExample_2 t2=new DaemonThreadExample_2();
		t1.start();
		//Exception as the thread is already started
		t1.setDaemon(true);
        t2.start();
	}

}
