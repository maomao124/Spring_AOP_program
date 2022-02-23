package t2;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * Project name(项目名称)：Spring_AOP编程
 * Package(包名): t2
 * Class(类名): OrderDaoAroundAdvice
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/23
 * Time(创建时间)： 21:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class OrderDaoAroundAdvice implements MethodInterceptor
{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable
    {
        System.out.println("环绕增强前********");
        //执行被代理对象中的逻辑
        Object result = invocation.proceed();
        System.out.println("环绕增强后********");
        return result;
    }
}
