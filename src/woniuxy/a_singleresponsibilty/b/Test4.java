package woniuxy.a_singleresponsibilty.b;

// ���������ƣ���ʱ����Ҫ����������жϣ�ֻ��Ҫ�޸�DivCalc���ɣ������Ĺ��ܲ����յ�Ӱ��!

public class Test4 {
	public static void main(String[] args) {
		// �Ӽ�������2�����֣�������һ���������Ȼ�������
		double num1 = 100;
		double num2 = 0;
		String oper = "/";
		
		double r = 0;
		
		Calc c = null;
		
		switch (oper) {
			case "+":
				c = new AddCalc();
				break;
			case "-":
				c = new SubCalc();
				break;
			case "*":
				c = new MulCalc();
				break;
			case "/":
				c = new DivCalc();
				break;
			default:
				break;
		}
		
		r = c.calc(num1, num2);
		
		System.out.println("����ǣ�" + r);
		
	}
}

