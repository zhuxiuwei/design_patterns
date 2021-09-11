package woniuxy.p_strategy.b;

/*
	�����и�����
	�����Ǿ�������ģ�������Ҫ��ɵ�Ѽ���������������ں�ͷ����Ȼ�������ʱ��Joe�ľ������ظ����������ǣ�
	Joeֻ��Ҫһ�����ھͿ��Ը㶨�����Ͼ���Joe��һ��OO����Ա......����ʲô���ѣ�����
	
	Joe��Ϊ��ֻ��Ҫ��Duck���м���fly()������Ȼ������Ѽ�Ӷ���̳�fly()�� �������Ҵ������֣�չʾOO�Ż���ʱ���ˣ���
*/

abstract class Duck {
	public void quack() {
		System.out.println("���ɽ�");
	}
	public void swim() {
		System.out.println("��Ӿ");
	}
	public void fly() {
		System.out.println("��ķ�������!");
	}
	// ��Ϊÿһ��Ѽ�ӵ���۶���ͬ������display���������ǳ����
	public abstract void display(); 
}

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

// �����ƺ�����ˣ� �������������?
// Joe��û���뵽�����ڶ��Duck�����У�����һ��RubberDuck����ƤѼ��
class RubberDuck extends Duck {
	// ��ƤѼ�Ӳ������ɽУ����԰�quack()�Ķ��帲�ǳɡ�֨֨�С�
	@Override
	public void quack() {
		System.out.println("֨֨��"); 
	}
	@Override
	public void display() {
		System.out.println("�������ƤѼ");
	}
}
// Joe������һ���£�����Duck���������඼��ɡ�Joe��Duck�����м����µ���Ϊ��
// ��ʹ��ĳЩ�����ʺϸ���Ϊ������Ҳ���и���Ϊ�����ڿɺ��ˣ�SimUDuck����������
// һ���������Ļ�ɵĶ�����

public class Test {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		System.out.println("=========================================");
		
		duck = new RedHeadDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		System.out.println("=========================================");
		
		duck = new RubberDuck();
		duck.quack();
		duck.swim();
		duck.fly(); // ��ƤѼ�������ˣ���
		duck.display();
		
	}
}
// ���Ƿ���һ���£� һ����ơ�ά����ʱ��Ϊ�ˡ����á�Ŀ�Ķ�ʹ�ü̳У���ֲ���������


