package t1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Project name(项目名称)：Spring_AOP编程
 * Package(包名): t1
 * Class(类名): UserDaoBeforeAdvice
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/23
 * Time(创建时间)： 20:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class UserDaoBeforeAdvice implements MethodBeforeAdvice
{
    /**
     * 增强代码
     * MethodBeforeAdvice 前置增强
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable
    {
        System.out.println("正在执行前置增强操作…………");
    }
}
