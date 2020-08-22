package com.maistruk.spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maistruk.spring_aop.xml.Student;

public class Main {

    public static void main(String[] args) {
      //  xmlSchemaBasedExample();
        
        annotationsExample();
    }
    
    public static void xmlSchemaBasedExample() {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansXml.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
       // student.printThrowException();
    }
    
    public static void annotationsExample() {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        
        com.maistruk.spring_aop.annotations.Student student = (com.maistruk.spring_aop.annotations.Student) context.getBean("student");
        student.getName();
        student.getAge();
        
        //student.printThrowException();
    }
}
