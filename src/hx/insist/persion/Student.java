package hx.insist.persion;

import hx.insist.itface.Strategy;

//学生
public class Student implements Strategy {

	String name;
	public Student(String name) {
		this.name = name;
	}

	@Override
	public void behavior(String weather) {
		if("晴天".equals(weather)) {
			System.out.println(name  + "不高兴的去上学了");
		}else if("下雨".equals(weather)) {
			System.out.println(name + "打着雨伞去上学了");
		}else if("刮风".equals(weather)) {
			System.out.println(name + "吹着风冷冷的去上学了");
		}else if("下雪".equals(weather)) {
			System.out.println(name + "在家休息不上学了");
		}else if("冰雹".equals(weather)) {
			System.out.println(name + "又可以不上学了");
		}
	}

	@Override
	public String toString() {
		return name;
	}
}
