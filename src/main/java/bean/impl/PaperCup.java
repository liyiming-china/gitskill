package bean.impl;

import bean.ICup;

public class PaperCup implements ICup {

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void fillWater() {
        System.out.println("使用" + this.color +"颜色的纸杯喝水.");
    }
}
