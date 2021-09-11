package woniuxy.h_simplefactory.b;

/*
 �����a����ȱ�㣬 �ع��������£�
 1. �����һ���򵥹����� ���ݲ����Ĳ�ͬ�������ز�ͬ�ľ����Ʒ��
 2. �ŵ��ǣ��ͻ�����Ҳ����Ҫ֪���������Ʒ��ϸ���ˣ�������
*/

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

// public
// Food����
class FoodFactory {
	public static Food getFood(int a) {
		Food food = null;
		switch (a) {
			case 1:
				food = new Hamburger();
				break;
			case 2:
				food = new FrenchFries();
				break;
			default:
				break;
		}
		return food;
	}
}

// ==================================================================


// ��Ƥ
class LP implements Food {
	@Override
	public void eat() {
		System.out.println("������Ƥ");
	}
}


public class Test {
	public static void main(String[] args) {
		Food f = FoodFactory.getFood(1);
		f.eat();
		
		
		f= FoodFactory.getFood(2);
		f.eat();
		
	}
}

// ȱ�㣺
// 1. ��ĳ�̶ֳ���Υ����һְ��
// 2. ��������Ʒ�ر�࣬��򵥹����Ĵ��뽫��ʮ��ӷ�ס� ����Ҳ�����˰Ѽ򵥹����������ϵ��ࡱ��ԭ�򡣣�
// 3. �����˿ͻ��˴���ĸ��Ӷȣ��ͻ��˳���Ա������֪��ÿ�����֣����ֱ�ӳ��ʲô�����Ʒ
// 4. ��ؼ���ȱ�㣺���ڣ��ͻ���Ҫ����²�Ʒ��զ�죿 �ͻ��˵������Լ���չһ���²�Ʒ������Ϊ�˰��²�Ʒ����򵥹����У��Ʊ�Ҫ��Χ������ԭ�򡱡�

// �ɴˣ�����������һ�����ģʽ�� �����������ģʽ