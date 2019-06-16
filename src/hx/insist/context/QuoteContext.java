package hx.insist.context;

import hx.insist.itface.Strategy;
import hx.insist.itface.WeatherSign;

public class QuoteContext implements WeatherSign {
    private Strategy strategy;

    //注入策略的实现者
    public QuoteContext(Strategy strategy) {
        this.strategy = strategy;
    }

    //"晴天","下雨","刮风","下雪","冰雹"		由上下文实现被观察者提供的接口
    @Override
    public void notifyweather(String weather) {
        strategy.behavior(weather);//上下文与策略交互
    }

    @Override
    public String tostring() {
        return strategy.toString();
    }


}
