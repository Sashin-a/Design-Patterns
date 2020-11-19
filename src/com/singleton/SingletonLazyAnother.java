package com.singleton;

public class SingletonLazyAnother {
	private static SingletonLazyAnother instance=null;
	
	private SingletonLazyAnother()
	{
		
	}
	
	
	public static SingletonLazyAnother getInstance()
	{
		if(instance==null)
		{
			synchronized (SingletonLazyAnother.class) {
				
				if(instance==null)
				{
					instance = new SingletonLazyAnother();
				}
			}
		}
		
		return instance;
	}
}
