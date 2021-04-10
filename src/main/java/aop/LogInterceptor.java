package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String methodName = invocation.getMethod().getName();
        Object obj = invocation.proceed();
        System.out.println("==拦截器===日志记录： 尝试执行" + methodName + "方法");
        return obj;
    }
}
