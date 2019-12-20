package com.dubo.demo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/application.xml");
        context.start();
        System.in.read();*/
        Main.main(args);
    }
}
