package woniuxy.i_factorymethod.a;

// Ϊ�˽���򵥹�����ȱ�㣬�����ع����룺

interface Food {
	public void eat();
}

class Hamburger implements Food {
	@Override
	public void eat() {
		System.out.println("������");
	}
}
class FrenchFries implements Food {
	@Override
	public void eat() {
		System.out.println("�������䷬�ѽ�������Ŷ��");
	}
}

interface FoodFactory {
	Food getFood();
}

class HamburgerFactory implements FoodFactory {
	@Override
	public Food getFood() {
		return new Hamburger();
	}
}
class FrenchFriesFactory implements FoodFactory {
	@Override
	public Food getFood() {
		return new FrenchFries();
	}
}

class Business {
	// Ʒ��
	public void taste(FoodFactory factory) {
		Food f = factory.getFood();
		System.out.println("��ίһ��");
		f.eat();
		System.out.println("��Ψһ���");
		
		
		System.out.println("��ί����");
		f.eat();
		System.out.println("��Ψ�����");
		
		
		System.out.println("��ί����");
		f.eat();
		System.out.println("��Ψ�����");
	}
}

//===========================================================

class MexicoChicken implements Food {
	@Override
	public void eat() {
		System.out.println("ī���缦���");
	}
}

class MexicoChickenFactory implements FoodFactory {

	@Override
	public Food getFood() {
		return new MexicoChicken();
	}
	
}


public class Test {

	public static void main(String[] args) {
		FoodFactory ff = new FrenchFriesFactory();
		FoodFactory ff2 = new MexicoChickenFactory();
		
		Business b = new Business();
		
		b.taste(ff);
		b.taste(ff2);
		
		
	}

}

// ���ɻ�
// 1. ��Ȼ���ͻ��˳���Ա���Ѿ�����չ���²�Ʒ�ˣ��²�Ʒ�ǿͻ����Լ����ģ��ͻ��˳���Ա�Ϳ���ֱ��ʹ���Լ����²�Ʒ�࣬�����ö����Ǹ���Ӧ�Ĺ�����
// 2. ��Ϊʲô���ǻ�Ҫ���������ࡱ��ȥ�Ӷ�Ӧ�Ĺ����أ�������
// 3. ��ô���Ǹ�Business��taste������ֱ�ӽ���Food���ɣ��������Ͳ�Ҫ������.

// �ðɣ���������Ҳ��ȱ�㣺
// 1. �����˸��Ӷ�
// 2. ���ж��ֲ�ͬ���͵Ĳ�Ʒʱ����Ʒ�ȼ��� �����磬���ڼ������� �� ��������ر��

// 3. �ɴ˾������ˣ����󹤳����ģʽ�� �»طֽ�

