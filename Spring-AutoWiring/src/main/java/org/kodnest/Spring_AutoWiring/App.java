package org.kodnest.Spring_AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.Bean.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Person p= (Person) context.getBean("person");
    	System.out.println(p);
    }
}
