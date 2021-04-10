package bean.impl;

import bean.ICup;
import bean.IPerson;

public class American implements IPerson {
    private String name;
    private ICup cup;

    public String getName() {
        return name;
    }

    public ICup getCup() {
        return cup;
    }

    public void setCup(ICup cup) {
        this.cup = cup;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(name +" say,hello");
    }

    @Override
    public void drink() {
        this.cup.fillWater();
    }
}
