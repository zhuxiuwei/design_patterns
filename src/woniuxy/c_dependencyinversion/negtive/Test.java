package woniuxy.c_dependencyinversion.negtive;



/*

������˵�������֮��Ĺ�ϵ�����֣��̳С�������������

����: һ����Ķ�����Ϊ����һ������ֶ�ʱ���ͷ����˹�����ϵ.
class A {
}
class B {
	A a = new A();  // B������A
}

����: һ����Ķ�����Ϊ����һ����ľֲ�����ʱ���ͷ�����������ϵ
class A {
}
class B {
	public void f1() {
		A a = new A();   // B������A �����f1������  
	}
}




 
 ��������ԭ�� �ϲ㲻Ӧ���������²㣬���ǣ��ϲ���²��ܣ���Ӧ���������ڳ���
*/

// �û�

class Gitar {
	public void sound() {
		System.out.println("��Ϊ�������԰�!!");
	}
}

class Harp {
	public void sound() {
		System.out.println("����... ������...");
	}
}

public class Test {
	public static void main(String[] args) {
		Piano p = new Piano();
		Gitar g = new Gitar();
		Harp h = new Harp();
		Person person = new Person("��ҩʦ");
		person.play(p);
		person.play(g);
		person.play(h);
	}
}
