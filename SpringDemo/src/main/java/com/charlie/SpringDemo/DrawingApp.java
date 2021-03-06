package com.charlie.SpringDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
       Shape shape = (Shape)context.getBean("circle");
       shape.draw();
       context.registerShutdownHook();
    }
}
