package woniuxy.k_builder.d;

// �����c����ȱ�㣬�ع��������£�

// 1. �ȶ�ס��������ԵĹ���, ����һ�������߽ӿ�
// 2. �����о��彨����ʵ������ӿڣ���ô���о��彨���ߣ��ͱ���ʵ������ӿ��е����з������Ͳ�����©ĳһ�����衣
interface ComputerBuilder {
	void setCpu();
	void setMemery();
	void setHarddisk();
	void setGpu();
	
	Computer build();
}


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

class AdvancedComputerBuilder implements ComputerBuilder{
	private Computer c = new Computer(); 
	@Override
	public void setCpu() {
		c.setCpu("i9 8700hk");
	}
	@Override
	public void setMemery() {
		c.setMemery("64g");
	}
	@Override
	public void setHarddisk() {
		c.setHarddisk("2T + 515��̬");
	}
	@Override
	public void setGpu() {
		c.setGpu("rtx2080ti");
	}
	@Override
	public Computer build() {
		return c;
	}
}

class MiddleComputerBuilder implements ComputerBuilder{
	private Computer c = new Computer(); 
	@Override
	public void setCpu() {
		c.setCpu("i7 7700hq");
	}
	@Override
	public void setMemery() {
		c.setMemery("16g");
	}
	@Override
	public void setHarddisk() {
		c.setHarddisk("1T + 256��̬");
	}
	@Override
	public void setGpu() {
		c.setGpu("gtx1070");
	}
	@Override
	public Computer build() {
		return c;
	}
}

class LowComputerBuilder implements ComputerBuilder{
	private Computer c = new Computer(); 
	@Override
	public void setCpu() {
		c.setCpu("i5 3320m");
	}
	@Override
	public void setMemery() {
		c.setMemery("8");
	}
	@Override
	public void setHarddisk() {
		c.setHarddisk("500g");
	}
	@Override
	public void setGpu() {
		c.setGpu("�����Կ�");
	}
	@Override
	public Computer build() {
		return c;
	}
}



// ==================================================================

public class Test {
	public static void main(String[] args) {
		
		AdvancedComputerBuilder acb = new AdvancedComputerBuilder();
		acb.setCpu();
		acb.setHarddisk();
		acb.setMemery();
		acb.setGpu();
		Computer c = acb.build();
		System.out.println(c);
		
		
		MiddleComputerBuilder mcb = new MiddleComputerBuilder();
		mcb.setCpu();
		mcb.setHarddisk();
		mcb.setMemery();
		mcb.setGpu();
		Computer c2 = mcb.build();
		System.out.println(c2);
	}
}

// ȱ�㣺
// 1. �ͻ����ֱ���֪������Ĺ����ˣ� (�൱����ȥ��һ̨���ԣ���Ȼ�����Լ�������װ���ԣ�������Ҫֻ���Ǹ���С�����װ...��װ...��װ...)


