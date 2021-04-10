package bean.impl;

import bean.ICup;
import bean.IPerson;
import org.springframework.beans.factory.InitializingBean;

public class Chinese implements IPerson, InitializingBean {
    private String name;
    private ICup cup;
    /*construct*/
    Chinese(){
        System.out.println("无构造Spring 实例化bean: Person bean实例 ----- Person构造函数");
    }
    Chinese(String name, ICup c)
    {
        System.out.println("Spring 实例化bean: Person bean实例 ----- Person构造函数");

        this.name = name;
        this.cup = c;
    }
    /*set*/
    public void setName(String name) {
        System.out.println("Spring执行依赖注入--setName方法");
        System.out.println(name);
        this.name = name;
    }

    public void setCup(ICup cup) {
        System.out.println("Spring执行依赖注入--setCup方法");
        this.cup = cup;
    }
    /*get*/
    public ICup getCup() {
        return cup;
    }

    public String getName() {
        return name;
    }
    public void information()
    {
        System.out.println("这个人的名字是: " + name);
    }
    public void init()
    {
        System.out.println("正在执行初始化----init方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行----afterPropertiesSet方法");
    }

    @Override
    public void drink() {
        this.cup.fillWater();
    }

    @Override
    public void sayHello() {
        System.out.println(name +"说，你好");
    }

}
