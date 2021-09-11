package woniuxy.k_builder.e;

// �����d����ȱ�㣬�ع��������£�

// 1. ����һ��ָ���ߣ�Director�������ܲ�ͬ�Ľ����ߣ���ɽ������


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


class Director {
	public Computer build(ComputerBuilder cb) {
		cb.setCpu();
		cb.setHarddisk();
		cb.setMemery();
		cb.setGpu();
		return cb.build();
	}
}



// ==================================================================

public class Test {
	public static void main(String[] args) {
		
		AdvancedComputerBuilder acb = new AdvancedComputerBuilder();
		MiddleComputerBuilder mcb = new MiddleComputerBuilder();
		
		Director director = new Director();
		Computer c = director.build(mcb);
		
		System.out.println(c);
	}
}


// ���ˣ����������ģʽ�ĵ�һ����̬��������ϣ�

// ����̬��ȱ���ǣ��ͻ����޷������������ϸ�ڣ����磬�ͻ����޷�ֱ��ָ��cpu����Ӳ�̵��ͺš�
// ���Բ����˽�����ģʽ�ĵڶ�����̬�����ڶ�����̬�ֲ������ǽ�������ᵽ������ġ�


