package woniuxy.h_simplefactory.a;

/*
 ����ģʽ��ظ��
 1. ��Ʒ: new ���Ķ��󣬶��ǲ�Ʒ��
 2. �����Ʒ: �����ࡢ�ӿڣ�����֮Ϊ�����Ʒ��
 3. ��Ʒ��:   ��������Ʒ���һ����Ʒϵ�С�
 4. ��Ʒ�ȼ�:  ��Ʒ���е�ÿһ�������Ʒ���ǲ�Ʒ�ȼ���
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

// ==================================================================

public class Test {
	public static void main(String[] args) {
		Food f = new Hamburger();
		f.eat();
		Food f2 = new FrenchFries();
		f2.eat();
	}
}

// ���ϴ��룬 �ͻ��˳���Ҫ֪�����ӿڵ����ͣ�������֪���ӿڵ�ʵ��������ͣ�ʧ�ܣ���
// ��������ȱ���ǣ�������˴������µİ汾�аѾ�����������޸��ˣ���ͻ��˴���ֱ�ӡ����������� ʧ���е�ʧ�ܣ���















