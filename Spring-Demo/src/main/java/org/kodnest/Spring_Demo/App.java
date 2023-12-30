package org.kodnest.Spring_Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.Bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Student st= (Student) context.getBean("s1");
    	Student st2=(Student) context.getBean("s2");
    	System.out.println("----->"+st);
    	System.out.println("----->"+st2);
    	
    }
}
