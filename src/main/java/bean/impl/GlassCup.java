package bean.impl;

import bean.ICup;

public class GlassCup implements ICup {

    private String color;
    public GlassCup()
    {
        System.out.println("GlassCup构造");
    }
    public void setColor(String color) {
        System.out.println("setcolor");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void fillWater() {
        System.out.println("使用" + this.color + "颜色的玻璃杯喝水.");
    }
}
