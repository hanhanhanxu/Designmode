package hx.insist.itface;

//被观察者提供的接口，去各自实现 当 被观察者发出动作时，观察者的相应反应。
public interface WeatherSign {
	void notifyweather(String weather);
	String tostring();
}