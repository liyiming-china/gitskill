package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.sound.midi.Soundbank;

public class AuthorityInterceptor implements MethodInterceptor {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("==拦截器==权限验证开始====");
        String username = this.user.getUsername();
        String methodName = invocation.getMethod().getName();
        if(!username.equals("admin") && !username.equals("register"))
        {
            System.out.println("没有任何执行权限");
            return null;
        }
        else if(username.equals("register") && methodName.equals("modify"))
        {
            System.out.println("register 用户没有write权限");
            return null;
        }
        else {
            Object obj = invocation.proceed();
            System.out.println("==拦截器==权限验证结束===");
            System.out.println();
            return obj;
        }
    }
}
