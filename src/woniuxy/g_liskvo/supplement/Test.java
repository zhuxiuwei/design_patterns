package woniuxy.g_liskvo.supplement;

// �����滻ԭ�� �κ���ʹ�ø������ĵط�������͸����ʹ�����ֱࣨ���滻Ϊ���࣬������Ϊ���ᷢ�����󣡣�

// ������д��2������
// 1. ������д����ķ���ʱ�������׳��ȸ��෽��������쳣
// 2. ������д����ķ���ʱ�������ķ������η����ܱ���ĸ��ϸ�

class Fu {
	void f1() throws Exception {
		
	}
}

class Zi extends Fu {
	public void f1()  {
		
	}
}

public class Test {
	public static void main(String[] args) throws Exception {
			Fu fu = new Zi();
			fu.f1();
	}
}