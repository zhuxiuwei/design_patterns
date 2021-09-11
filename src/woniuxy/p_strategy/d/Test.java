package woniuxy.p_strategy.d;

// �����c���е����⣬������Ҫһ���������ķ������á�ĳЩ����������ȫ����Ѽ�����Ϳɷɻ�ɽС�
/*
 	
 	ͨ��ǰ���ѧϰ������֪��������Ҫ���ܶ����ڸ����У�����չ���ܶ����ڽӿ��С�
 	
 	
 	��Ŀǰ���״�����������ɡ��͡����ɽС���Ϊ��Ѽ�ӵ���չ���ܣ���Ϊ���������е�Ѽ�Ӷ��ᡰ�ɡ��͡����ɽС�

 	
  
	Joe�Ľ��֮���ǣ�
	�ҿ��԰�fly()�ӳ�����ȡ�������Ž�һ����Flyable�ӿڡ��С���ôһ����ֻ�л�ɵ�Ѽ�Ӳ�ʵ�ִ˽ӿڡ�
	ͬ���ķ�ʽ��Ҳ�����������һ����Quackable���ӿڣ���Ϊ�������е�Ѽ�Ӷ���С�
*/
abstract class Duck {
	public void swim() {
		System.out.println("��Ӿ");
	}
	public abstract void display();
}

interface Flyable {
	public void fly();
}

interface Quackable {
	public void quack();
}

class MallardDuck extends Duck implements Flyable, Quackable {
	@Override
	public void quack() {
		System.out.println("�¸½�");
	}
	@Override
	public void fly() {
		System.out.println("��������");
	}
	@Override
	public void display() {
		System.out.println("�������ͷѼ");
	}
}

class RedheadDuck extends Duck implements Flyable, Quackable  {
	@Override
	public void quack() {
		System.out.println("�¸½�");
	}
	@Override
	public void fly() {
		System.out.println("��������");
	}
	@Override
	public void display() {
		System.out.println("����Ǻ�ͷѼ");
	}
}

class RubberDuck extends Duck implements Quackable {
	@Override
	public void quack() {
		System.out.println("�¸½�");
	}
	@Override
	public void display() {
		System.out.println("�������ƤѼ");
	}
}

class WoodenDuck extends Duck {
	@Override
	public void display() {
		System.out.println("�����ľͷ��Ѽ");
	}
}

public class Test {
	public static void main(String[] args) {
		
	}
}

// ����֪�������ǡ����С������඼���з��к����ɽе���Ϊ�����Լ̳в������ʵ��Ľ����ʽ��
// ��ȻFlyable��Quackable���Խ����һ���֡����⣨�������л�ɵ���ƤѼ��������
// ȴ��ɴ����޷����ã�fly��quack������ֻ�����Ǵ�һ������������һ�����Ρ�
// �������ڻ�ɵ�Ѽ���У����еĶ������ܻ��ж��ֱ仯.....

// Ҳ�����˵����jdk1.8��ʼ���ӿ���Ĭ��ʵ�֡�
// ��ô����48��Ѽ�ӵ����࣬����12�ַ��еķ�ʽ���ָ���ô˵�� �ӿڵ�Ĭ��ʵ��ѡ����һ�ַ��з�ʽ�����У�