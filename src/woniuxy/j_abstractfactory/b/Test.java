package woniuxy.j_abstractfactory.b;

// �����a������������⣬�ع���������:
interface Food {
	public void eat();
}

interface Drink {
	public void drink();
}

interface Factory {
	Food getFood();
	Drink getDrink();
}

class Hamburger implements Food {
	@Override
	public void eat() {
		System.out.println("������");
	}
}
class LiangPi implements Food {
	@Override
	public void eat() {
		System.out.println("��Ƥ����");
	}
}

class Cola implements Drink {
	@Override
	public void drink() {
		System.out.println("���֣���ֵ��ӵ��!");
	}
}
class IcePeek implements Drink {
	@Override
	public void drink() {
		System.out.println("���壬��С�ͺ���");
	}
}

class KFCFactory implements Factory {

	@Override
	public Food getFood() {
		return new Hamburger();
	}

	@Override
	public Drink getDrink() {
		return new Cola();
	}
}

class SanQinFactory implements Factory {

	@Override
	public Food getFood() {
		return new LiangPi();
	}

	@Override
	public Drink getDrink() {
		return new IcePeek();
	}
}


class Business {
	public void taste(Factory factory) {
		Food food = factory.getFood();
		Drink drink = factory.getDrink();
		
		System.out.println("��ί1������");
		food.eat();
		drink.drink();
		System.out.println("��ί1��ȷʵ���ѳ�...");
		
		
		System.out.println("��ί2������");
		food.eat();
		drink.drink();
		System.out.println("��ί2���ѳ�̫̫...");
		
		System.out.println("��ί3������");
		food.eat();
		drink.drink();
		System.out.println("��ί3���ѳԵ�����...");
	}
}


class SimpleFactory {
	private SimpleFactory() {
	}
	
	public static Factory getFactory(int n) {
		Factory f = null;
		switch (n) {
			case 1:
				f = new KFCFactory();
				break;
			case 2:
				f = new SanQinFactory();
				break;
		}
		return f;
	}
}

// ========================================================


public class Test {
	public static void main(String[] args) {
		Business b = new Business();
		b.taste(SimpleFactory.getFactory(1));
		b.taste(SimpleFactory.getFactory(2));
	}
}

// ���Ǻ����׷��֣��ֻص���ԭ�㣡���� 


