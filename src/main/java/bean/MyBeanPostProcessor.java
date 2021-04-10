package bean;

import bean.impl.Chinese;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器After "+ beanName + " 进行增强处理");

        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器before " + beanName + " 进行增强处理");
        if(bean instanceof  Chinese)
        {
            Chinese p = (Chinese)bean;
            p.setName("段松鹏");
        }
        return bean;
    }
}
