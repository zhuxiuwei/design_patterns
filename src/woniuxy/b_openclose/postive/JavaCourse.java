package woniuxy.b_openclose.postive;
// ����
class JavaCourse {

	private String name;
	private double price;
	private int hours;
	
	public JavaCourse(String name, double price, int hours) {
		this.name = name;
		this.price = price;
		this.hours = hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
}
