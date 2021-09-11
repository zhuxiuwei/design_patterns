package woniuxy.k_builder.c;

// �����b����ȱ�㣬�ع��������£�

// 1. ����ڲ�ͬ�����в�ͬ�Ľ����ߡ�
// 2. �ͻ�����Ȼ��֪��������ԵĹ��̡�

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

class AdvancedComputerBuilder {
	private Computer c = new Computer();
	
	public Computer build() {
		c.setCpu("i9 8700hk");
		c.setMemery("64");
		c.setHarddisk("2T+512��̬Ӳ��");
		c.setGpu("˫������ Rtx2080ti");
		return c;
	}
}

class MiddleComputerBuilder {
	private Computer c = new Computer();
	
	public Computer build() {
		c.setCpu("i7 7700hq");
		c.setMemery("16");
		c.setHarddisk("1T+256��̬");
		c.setGpu("GTX1070");
		return c;
	}
}

class LowComputerBuilder {
	private Computer c = new Computer();
	
	public Computer build() {
		c.setCpu("i5 3320m");
		c.setMemery("8");
		c.setHarddisk("500g");
		c.setGpu("�����Կ�");
		return c;
	}
}


// ==================================================================

public class Test {
	public static void main(String[] args) {
		AdvancedComputerBuilder acb = new AdvancedComputerBuilder();
		MiddleComputerBuilder mcb = new MiddleComputerBuilder();
		LowComputerBuilder lcb = new LowComputerBuilder();
		
		// ѧϰ
		Computer c = mcb.build();
		System.out.println(c);
		
		// �칫������
		Computer c2 = lcb.build();
		System.out.println(c2);
				
				
		// ��Ϸ
		Computer c3 = acb.build();
		System.out.println(c3);
	}
}

// ȱ�㣺
// 1. �����Ǹ� �� ����һ�����õĵ��ԣ����õĹ��̶���һ���ģ�ֻ����ϸ�ڲ�һ���� ��Ȼ���ظ����Ǿ����˻�ζ����
// 2. ��Щ�ظ��İ�װ���裬���ȶ�����һ��һ����������©��ĳһ�����裬������Ҳ���ᱨ��