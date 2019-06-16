package hx.insist.station;

import hx.insist.itface.WeatherSign;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//天气广播站：被观察者，发出通知。
//单例
public class WeatherStation {

	List<String> weathers;//天气的可能性
	String weather;//当前天气
	ArrayList<WeatherSign> list = new ArrayList<>();

	//构造
	private WeatherStation(){
		List<String> list = new ArrayList(){
			{//构造代码块在构造函数前调用
				this.add("晴天");
				this.add("下雨");
				this.add("刮风");
				this.add("下雪");
				this.add("冰雹");
			}
		};
		this.weathers = list;
	}

	//静态内部类
	private static class WeatherStationInstance{
		//属性
		private static final WeatherStation INSTANCE = new WeatherStation();
	}
	//返回实例
	public static WeatherStation getInstance(){
		return WeatherStationInstance.INSTANCE;
	}

	//*************************************************************************
    public List getList(){
	    return list;
    }

	//添加
	public void addweather(String weather){
		weathers.add(weather);
	}

	//谁想要接受消息提醒就实现 那个接口，做出他的相关反应notifyweather()  , 然后天气站把它加进来
	public void addmessP(WeatherSign w) {
		list.add(w);
	}

	public void startwork(int n) {
		Random random = new Random();
		int x;
		boolean sign = false;
		try {
			if(n==-1){
				sign = true;
				n=1;
			}
			while(n>0) {
				updateweather();//每次更新天气后
				for(WeatherSign w : list) {//就通知集合中的每个人去完成他们的反应
					w.notifyweather(weather);
				}
				x = random.nextInt(501)+1000;
				Thread.sleep(x);
				System.out.println("---------------------------------------------------");
				n--;
				if(sign==true){
					n++;//一直循环
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void updateweather(){
		Random random = new Random();
		int x = random.nextInt(5);
		weather = weathers.get(x);
		System.out.println("当前天气是:" + weather);
	}


}
