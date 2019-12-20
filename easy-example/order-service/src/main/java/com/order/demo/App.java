package com.order.demo;

import com.dubo.demo.PayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/application.xml");
        PayService payService = (PayService) context.getBean("payService");
        payService.pay("1 yuan");
        System.out.println( "Hello World!" );
    }
}
