package woniuxy.j_abstractfactory.c;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
	public  Factory getFactory( ) {
		Factory f = null;
		try {
			InputStream in = SimpleFactory.class.getResourceAsStream("aa.properties");
			Properties prop = new Properties();
			prop.load(in);
			
			String className = prop.getProperty("factory");
			System.out.println(className + "!!!!");
			f = (Factory) Class.forName(className).newInstance();
			
			prop.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}

// ========================================================

public class Test {
	public static void main(String[] args) {
		while(true) {
			Business b = new Business();
			b.taste(new SimpleFactory().getFactory());
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



