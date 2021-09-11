package woniuxy.o_adapter.a;

class Calc {
	public int add(int a, int b) {
		return a + b;
	}
}

// ===================================================

// ���󣬿ͻ�����Ҫ����3�����ֵĺͣ��ͻ������add����������3������
class CalcAdapter {
	private Calc c = new Calc();

	public CalcAdapter() {
	}
	
	public int add(int x, int y, int z) {
		return c.add(c.add(x,y), z);
	}
}

public class Test {
	public static void main(String[] args) {
		
		CalcAdapter ca = new CalcAdapter();
		
		int r = ca.add(1, 2, 3);
		
		System.out.println(r);
		
		
	}
}
