package woniuxy.j_abstractfactory.a;

// ���󹤳��� 
// 1.�����˹��������࣬��Բ�Ʒ��ʱ���౬ը�ķ���Ч����
// 2.���󹤳����ɵĲ�Ʒ�أ�����һϵ�в�Ʒ����Щ��Ʒ֮�����߼������ڣ���ϵ��
// 3.�����������һ����Ʒ�أ� ���ֵĺܺã����������⣡

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

// ========================================================


public class Test {
	public static void main(String[] args) {
		Business b = new Business();
		b.taste(new KFCFactory());
		b.taste(new SanQinFactory());
	}
}

// ȱ�㣺
// �����ԣ���һ����Ʒ�ȼ�, �ͻᡰǣһ�� ����ȫ�֡��� ˵�����󹤳��������ڲ�Ʒ�ȼ������仯�������
// �����Ʒ���еĲ�Ʒ�ȼ����ȶ��ģ���ʹ�ó��󹤳��űȽϺ�ʱ����֮��������ʹ�ù����������ĸ���

// ��һ���Ƕ����������ϴ��룺
// ���Ƕ�֪������Ʒ����new�����Ķ��� �����Ʒ���ǽӿڡ������ࡣ
// ��ô��������main�����У�new��˭���� new KFCFactory() �� new SanQinFactory()  ��2������Ҳ���Կ����ǲ�Ʒ
// ��Ȼ�ǲ�Ʒ����Ӧ�úͿͻ��˽���Է���Ʒ�����仯�����ÿͻ��˱�����
