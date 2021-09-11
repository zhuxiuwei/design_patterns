package woniuxy.g_liskvo.negtive;
class Rectangle {
	private double width;
	private double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
}
class Square extends Rectangle {
	private double sideLength;
	@Override
	public void setWidth(double width) {
		this.sideLength = width;
	}
	@Override
	public void setLength(double length) {
		this.sideLength = length;
	}
	@Override
	public double getWidth() {
		return sideLength;
	}
	@Override
	public double getLength() {
		return sideLength;
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
		Rectangle r = new Square();
		r.setWidth(20);
		r.setLength(30);
		tranfrom(r);
	}
}

// ���Υ���������滻ԭ��
