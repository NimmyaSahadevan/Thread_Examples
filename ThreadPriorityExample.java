
public class ThreadPriorityExample extends Thread
{
	public void run()
	{
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) 
	{
		ThreadLocal <Integer> obj_local=new ThreadLocal <Integer>();  // creating ThreadLocal variable
		ThreadLocal <String> obj=new ThreadLocal <String>();
		obj_local.set(100);
		System.out.println("value = "+obj_local.get());
		obj_local.set(90);
		System.out.println("value = "+obj_local.get());
		obj.set("Java");
		System.out.println("value = "+obj.get());
		obj.remove();
		System.out.println("value = "+obj.get());
		obj_local.remove();
		System.out.println("value = "+obj_local.get());
		ThreadPriorityExample m1=new ThreadPriorityExample();
		ThreadPriorityExample m2=new ThreadPriorityExample();
		m1.setPriority(Thread.MIN_PRIORITY);  //set minimum priority as 1
		m2.setPriority(Thread.MAX_PRIORITY);  //set maximum priority as 10
		m1.start();
		m2.start();
	}

}
