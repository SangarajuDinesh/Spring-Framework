package org.kodnest.Spring_Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.Bean.Trainer;
import com.kn.Bean.University;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Trainer t= (Trainer) context.getBean("trainer");
    	University u= (University) context.getBean("university");
    	System.out.println(t);
    	System.out.println(u);
    }
}
