package test.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class MyAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        //return the target object(extended class)
        Object object = invocation.proceed();

        System.out.println("must implement methodInterceptor");

        //let it go
        //if not return object, the method of the extended class will not be executed.
        return object;
    }
}
