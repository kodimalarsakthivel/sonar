package main.java.com.app;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloCorona 
{
	static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) 
	{
		System.out.println("Hello World...");
		log.log(Level.INFO, "Hello Corona");
	}
}
