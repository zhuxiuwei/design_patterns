package woniuxy.a_singleresponsibilty.a;

public class Test2 {
	public static void main(String[] args) {
		// �Ӽ�������2�����֣�������һ���������Ȼ�������
		double num1 = 1;
		double num2 = 2;
		String oper = "+";
		
		double r = 0;
		
		switch (oper) {
			case "+":
				r = num1 + num2;
				break;
			case "-":
				r = num1 - num2;
				break;
			case "*":
				r = num1 * num2;
				break;
			case "/":
				r = num1 / num2;
				break;
			default:
				break;
		}
		
		System.out.println("����ǣ�" + r);
		
	}
}
