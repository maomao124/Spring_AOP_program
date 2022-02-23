package t1;

/**
 * Project name(项目名称)：Spring_AOP编程
 * Package(包名): t1
 * Class(类名): UserDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/23
 * Time(创建时间)： 20:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class UserDaoImpl implements UserDao
{

    @Override
    public void add()
    {
        System.out.println("正在执行 UserDao 的 add() 方法……");
    }

    @Override
    public void delete()
    {
        System.out.println("正在执行 UserDao 的 delete() 方法……");
    }

    @Override
    public void modify()
    {
        System.out.println("正在执行 UserDao 的 modify() 方法……");
    }

    @Override
    public void get()
    {
        System.out.println("正在执行 UserDao 的 get() 方法……");
    }
}
