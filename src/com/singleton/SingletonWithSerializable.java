package com.singleton;

import java.io.Serializable;

public class SingletonWithSerializable implements Serializable{

	private static SingletonWithSerializable instance = null;
	
	private SingletonWithSerializable()
	{
		
	}
	
	public static SingletonWithSerializable getInstance()
	{
		if(instance==null)
		{
			synchronized (SingletonWithSerializable.class) {
				
				if(instance==null)
				{
					instance = new SingletonWithSerializable();
				}
			}
		}
		
		return instance;
	}
	
	
	public Object readResolve()
	{
		return getInstance();
	}
}
