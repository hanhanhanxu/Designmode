package hx.insist.test;

import hx.insist.context.QuoteContext;
import hx.insist.itface.WeatherSign;
import hx.insist.persion.Boss;
import hx.insist.persion.Emp;
import hx.insist.persion.Student;
import hx.insist.station.WeatherStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    /*
    策略模式
    观察者模式
    单例模式
     */
    public static void main(String[] args) {
        int num = 3;
        Emp emp = new Emp("工人");
        QuoteContext context = new QuoteContext(emp);
        Student student = new Student("学生");
        QuoteContext context2 = new QuoteContext(student);
        Boss boss = new Boss("老板");
        QuoteContext context3 = new QuoteContext(boss);

        WeatherStation weatherStation = WeatherStation.getInstance();
       /* WeatherStation weatherStation2 = WeatherStation.getInstance();
        System.out.println(weatherStation==weatherStation2);*/



        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("**********************************************");
            System.out.println("程序运行开始，请选择功能：");
            System.out.println("1、添加用户");
            System.out.println("2、移除用户");
            System.out.println("3、运行天气广播3次");
            System.out.println("4、循环运行天气广播");

            String s = sc.next();
            if(s.equals("1")){
                System.out.println("请选择要添加的用户:");
               /* List list = weatherStation.getList();
                for(int i=0;i<num;i++){
                    if(!list.contains(emp)){
                        System.out.println();
                        continue;
                    }
                }*/
                System.out.println("1、工人");
                System.out.println("2、学生");
                System.out.println("3、老板");
                String s1 = sc.next();
                if(s1.equals("1")){
                    weatherStation.addmessP(context);
                }else if(s1.equals("2")){
                    weatherStation.addmessP(context2);
                }else if(s1.equals("3")){
                    weatherStation.addmessP(context3);
                }else {
                    System.out.println("输入指令不合法，请重新输入。");
                }
            }else if(s.equals("2")){
                ArrayList<WeatherSign> list = (ArrayList) weatherStation.getList();
                System.out.println("请输入要移除的序号:");
                for (int i=0;i<list.size();i++){
                    WeatherSign weatherSign = list.get(i);
                    System.out.println((i+1)+"："+weatherSign.tostring());
                }
                String s2 = sc.next();
                int i2 = Integer.parseInt(s2);
                if(0<i2 && i2<(list.size()+1)){
                    list.remove(i2-1);
                }else{
                    System.out.println("输入指令不合法，请重新输入。");
                }
            }else if(s.equals("3")){
                weatherStation.startwork(3);
            }else if(s.equals("4")){
                weatherStation.startwork(-1);
            }else {
                System.out.println("输入指令不合法，请重新输入。");
            }
            System.out.println("**********************************************");
        }

    }
}
