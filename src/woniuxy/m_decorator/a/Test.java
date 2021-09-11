package woniuxy.m_decorator.a;

/*
  �ǰͿ��������ȵģ� һ��ʼ��������Ƚ��٣�����ʹ�ü̳У�������ʲô���⡣

  ÿ�ֿ��ȣ��������������м۸� �������п��ȵĹ��ԣ���Ȼ�ǹ��ԣ���Ҫ���ᵽ�����С�
 
*/

abstract class Beverage {
	
	private String description;

	public Beverage(String description) {
		super();
		this.description = description;
	}
	
	public abstract double cost(); 
}


class DarkRoast extends Beverage {

	public DarkRoast(String descriptoin) {
		super(descriptoin);
	}
	
	public double cost() {
		return 10;
	}
}

class Decaf extends Beverage {

	public Decaf(String description) {
		super(description);
	}

	@Override
	public double cost() {
		return 8;
	}
}

class Espresso extends Beverage {

	public Espresso(String description) {
		super(description);
	}

	@Override
	public double cost() {
		return 12;
	}
	
}

class HouseBlend extends Beverage {

	public HouseBlend(String description) {
		super(description);
	}

	@Override
	public double cost() {
		return 15;
	}
	
}

public class Test {

}
