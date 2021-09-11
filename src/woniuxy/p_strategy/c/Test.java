package woniuxy.p_strategy.c;

/*
	�����b���е����⣬Joe�Ľ��֮���������ģ�
	�ҿ��԰���ƤѼ���е�fly()�������ǵ����ͺ��񸲸�quack()������һ��
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
	// ��ƤѼ�Ӳ���ɣ����԰�fly()����Ϊʲô�¶������������׳�һ��UnsupportedOperationException
	@Override
	public void fly() {
		throw new UnsupportedOperationException("you can you up, no can no bb!");
	}
}

// ����������ƤѼ�Ͳ�����������ط������ˣ� ����ͻ��˷�Ҫ��һ����ƤѼ�ɣ�ֻ���յ�һ������ʱ�쳣!

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
		duck.fly(); // �Ͳ�Ҫ����Ѽ���ϼ����ˣ�
		duck.display();
		
	}
}
/*
	���ǣ�����Ժ����ľѼ��WoodenDuck�����ֻ���Σ���
	ľͷ��Ѽ�������Ҳ�����......
*/

class WoodenDuck extends Duck {
	@Override
	public void quack() {
		// ���ǣ����ʲô�¶�����
	}
	@Override
	public void display() {
		System.out.println("�����ľѼ");
	}
	@Override
	public void fly() {
		// ���ǣ����ʲô�¶�����
	}
}


// ���ü̳����ṩDuck����Ϊ���ᵼ��:
// 1. ����֪������Ѽ�ӵ�ȫ����Ϊ��
// 2. �ı��ǣһ������ȫ���������Ѽ�Ӳ���Ҫ�ĸı䡣

// �������ǣ�ÿ������Ѽ��������֣�Joe��Ҫ���ȼ�鲢���ܸ���fly()��quack()����...
// ���ֱ�������޾���ج��!