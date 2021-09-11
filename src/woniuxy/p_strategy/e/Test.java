package woniuxy.p_strategy.e;

/*
	��һ�����ԭ�� ��װ�仯ԭ��
	�ҳ�Ӧ���п�����Ҫ�仯֮���������Ƕ�����������Ҫ����Щ����Ҫ�仯�Ĵ������һ��
	
	�����ĸ���ܼ򵥣�������ÿ�����ģʽ����ľ������ڡ����е�ģʽ���ṩ��һ�׷�����
	�á�ϵͳ�е�ĳ���ָı䲻��Ӱ���������֡���
	
	�ã����ǰ�Ѽ�ӵ���Ϊ��Duck����ȡ����ʱ����!
	
	����֪��Duck���ڵ�fly()��quack()������Ѽ�ӵĲ�ͬ���ı䡣
	Ϊ��Ҫ����������Ϊ��Duck���зֿ������ǽ������Ǵ�Duck����ȡ����������һ������������ÿ����Ϊ��(��ͼ1)
	
	�ڡ���Խӿڱ�̣����������ʵ�ֱ�̡���ԭ��ָ���£� ��ע��������˵�Ľӿ�ָ���ǳ����ʵ�ʵĽӿڣ�
	���Ƕ��������ӿ�: FlyBehavior��QuackBehavior�����������е���Ϊ�඼ʵ���������ӿ��е�����֮һ(��ͼ2)
	
*/

interface FlyBehavior {
	void fly();
}

class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
}

class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}

class FlyRockedPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}
}

interface QuackBehavior {
	void quack();
}

class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}

class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}

class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}

abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("All ducks float, even wooden duck!");
	}
	
	public abstract void display();

	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
}

class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}	
}

class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();	// һ��ʼ��Ѽģ���ǲ���ɵ�
		quackBehavior = new Quack();	
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
	
}




// ==============================================================

public class Test {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("=====================");
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRockedPowered());
		model.performFly();
	}
}


// ==============================================

class Tang extends Duck {

	public Tang() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("���������Ѽ");
	}
	
}

// ����ģʽ:
// �������㷨�壬�ֱ��װ������������֮����Ի����滻����ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ���