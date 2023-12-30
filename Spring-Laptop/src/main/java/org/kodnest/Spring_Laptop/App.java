package org.kodnest.Spring_Laptop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.main.Laptop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Laptop lap1=(Laptop) context.getBean("s1");
    	Laptop lap2=(Laptop) context.getBean("s2");
    	Laptop lap3=(Laptop) context.getBean("s3");
    	System.out.println(lap1);
    	System.out.println(lap2);
    	System.out.println(lap3);
    }
}
