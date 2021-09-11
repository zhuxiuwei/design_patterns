package woniuxy.p_strategy.a;

/*
 Joe�ϰ�Ĺ�˾����һ���൱�ɹ���ģ��Ѽ����Ϸ��SimUDuck����Ϸ�л���ָ���Ѽ�ӣ�һ����ӾϷˮ��һ�����ɽС�
 ��ϵͳ���ڲ����ʹ���˱�׼��OO�����������һ��Ѽ�ӳ��࣬���ø���Ѽ�Ӽ̳д˳���
*/

abstract class Duck {
	public void quack() {
		System.out.println("���ɽ�");
	}
	public void swim() {
		System.out.println("��Ӿ");
	}
	// ��Ϊÿһ��Ѽ�ӵ���۶���ͬ������display���������ǳ����
	public abstract void display(); 
}

// ҰѼ
class MallardDuck extends Duck {
	@Override
	public void display() {
		System.out.println("�������ͷ");
	}
}
class RedHeadDuck extends Duck {
	@Override
	public void display() {
		System.out.println("����Ǻ�ͷ");
	}
}


public class Test {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.display();
		
		System.out.println("=========================================");
		
		duck = new RedHeadDuck();
		duck.quack();
		duck.swim();
		duck.display();
	}
}
