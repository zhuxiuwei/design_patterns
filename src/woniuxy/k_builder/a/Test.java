package woniuxy.k_builder.a;

// �����û������.

class Computer {
	private String cpu;
	private String memery;
	private String harddisk;
	private String gpu;
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setMemery(String memery) {
		this.memery = memery;
	}
	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", memery=" + memery + ", harddisk=" + harddisk + ", gpu=" + gpu + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		Computer c = new Computer();
		
		c.setCpu("i7 7700hq");
		c.setMemery("16");
		c.setHarddisk("1T");
		c.setGpu("Rtx2080ti");
		
		System.out.println(c);
		
	}
}

// ȱ�㣺
// 1. ��һ���������ɹ����ر������ر��鷳��ʱ�򣬾Ͳ�Ӧ���ÿͻ����Լ�����ɡ�(�൱����ȥ����ԣ����Ұ��������������ڳ����������Լ����Զ�����װ)��
// 2. �����ͻ��˿��ܻ᲻����ȷ������װ���󣬻�ȱ����ĳһ�������
// 3. ����Υ���˵����ط���


// �Աȣ�����ģʽ������ֻ����Ѷ���ֱ��ʵ�������������ܶ����״̬��  ��������ǿ�����ڰѶ���new�����Ժ󣬸���������Ը�ֵ��
