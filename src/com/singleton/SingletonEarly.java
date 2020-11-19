package com.singleton;

public class SingletonEarly {
	
	private static SingletonEarly singleTonEarlyObj = new SingletonEarly();
	
	private SingletonEarly()
	{
		
	}
	
	private static SingletonEarly getInstance() {
		return singleTonEarlyObj;
	}

}
