package hx.insist.persion;

import hx.insist.itface.Strategy;

public class Boss implements Strategy {

    String name;
    public Boss(String name){
        this.name = name;
    }
    @Override
    public void behavior(String weather) {
        if("晴天".equals(weather)) {
            System.out.println(name  + "开心的去公司赚钱");
        }else if("下雨".equals(weather)) {
            System.out.println(name + "开心的在家赚钱");
        }else if("刮风".equals(weather)) {
            System.out.println(name + "开心的躺被窝里赚钱");
        }else if("下雪".equals(weather)) {
            System.out.println(name + "开心的看着电视赚钱");
        }else if("冰雹".equals(weather)) {
            System.out.println(name + "不开心工厂被砸坏了");
        }
    }

    public String toString() {
        return name;
    }
}
