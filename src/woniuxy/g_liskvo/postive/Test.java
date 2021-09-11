package woniuxy.g_liskvo.postive;

// Ҫ��������е����⣬�ͱ�����Square��Rectangle�ļ̳й�ϵ
// ��Ϊ��������ҵ�񳡾�֮�£����ܰ�Square����һ��Rectangle���ͣ�

// Ҳ����˵������Square �� Rectangle û�� ��is a����ϵ��

interface Quadrangle {
	double getWidth();
	double getLength();
}

class Rectangle implements Quadrangle {
	private double width;
	private double length;
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
}
class Square implements Quadrangle {
	private double sideLength;

	@Override
	public double getWidth() {
		return sideLength;
	}

	@Override
	public double getLength() {
		return sideLength;
	}
	
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
}
// ��������һ������������һ�������Σ����޸ĳ����εĿ�ͳ��� 
// ֻҪ���ֿ�ȳ�С�����ÿ��ۼ�1��֪����պó�����Ϊֹ��
public class Test {
	public static void tranfrom(Rectangle r) {
		while(r.getWidth() <= r.getLength()) {
			r.setWidth(r.getWidth() + 1);
			System.out.println("width:" + r.getWidth() + ", " + r.getLength());
		}
	}
	
	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		tranfrom(r);
	}
}

// ���Υ���������滻ԭ��
