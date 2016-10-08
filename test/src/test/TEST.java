package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.WeakHashMap;

public class TEST {
//changing for the first time.
	//second
	public static void main(String args[]) throws Exception{
		//sup s=new sup();
		Integer n=new Integer(3);
		new Thread(new MyThread(n)).start();
		new Thread(new MyThread(n)).start(); 
		System.out.println(n);
	}
}
 
class MyThread implements Runnable{

	Integer i=null;
	MyThread(Integer ii){
		i=ii;
	}
	@SuppressWarnings("unused")
	@Override
	public void run() {
	i++;
    System.out.println(i);
    
		
	}
	
	
}