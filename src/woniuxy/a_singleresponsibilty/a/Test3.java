package woniuxy.a_singleresponsibilty.a;

public class Test3 {
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
				// ���ڣ�Ҫ���һ�����ܣ���֤��������ʱ�����������Ϊ0�����Ϊ0����...
				if(num2 == 0) {
					return;
				}
				r = num1 / num2;
				break;
			default:
				break;
		}
		
		System.out.println("����ǣ�" + r);
		
	}
}
// ��������ȱ���ǣ� ��ΪҪ�޸ĵĹ��ܣ��������Ѿ��������еĹ�����һ��������һ�ַ��գ����޸�ĳ�����ܵ�ʱ���м��ʰ��Ѿ����õĹ��ܸû�����

