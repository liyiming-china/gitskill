import bean.IPerson;

import bean.impl.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args)
    {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        Chinese chinese = act.getBean("chinese",Chinese.class);
        chinese.information();
    }
}
