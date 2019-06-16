package hx.insist.persion;

import hx.insist.itface.Strategy;

//工人
public class Emp implements Strategy {

	String name;
	public Emp(String name) {
		this.name = name;
	}

	@Override
	public void behavior(String weather) {
		if("晴天".equals(weather)) {
			System.out.println(name  + "很开心的去工作了");
		}else if("下雨".equals(weather)) {
			System.out.println(name + "打着雨伞去工作了");
		}else if("刮风".equals(weather)) {
			System.out.println(name + "吹着风美滋滋的工作了");
		}else if("下雪".equals(weather)) {
			System.out.println(name + "踩着雪叽叽喳喳的工作了");
		}else if("冰雹".equals(weather)) {
			System.out.println(name + "带着铁锅去工作了");
		}
	}

	@Override
	public String toString() {
		return name;
	}
}
