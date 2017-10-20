package com.ftian.test;
import org.junit.Test;

public class Test_log4j {
	int a=0;
    @Test
	public void log4j(){
	  for (int i = 0; i < 5; i++) {
		a+=1;
		System.out.println("a:"+a);
	}
	  
	}
}
