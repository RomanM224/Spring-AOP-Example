package com.maistruk.spring_aop.xml;

public class Logging {
    /**
     * This is the method which I would like to execute before a selected method
     * execution.
     */
    public void beforeAdvice() {
        System.out.println("beforeAdvice() called");
    }

    /**
     * This is the method which I would like to execute after a selected method
     * execution.
     */
    public void afterAdvice() {
        System.out.println("afterAdvice() called");
    }

    /**
     * This is the method which I would like to execute when any method returns.
     */
    public void afterReturningAdvice(Object retVal) {
        System.out.println("afterReturningAdvice() called:" + retVal.toString() );
    }

    /**
     * This is the method which I would like to execute if there is an exception
     * raised.
     */
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("AfterThrowingAdvice() called: " + ex.toString());
    }
}