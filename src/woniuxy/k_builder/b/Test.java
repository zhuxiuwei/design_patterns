package woniuxy.k_builder.b;

// �����a����ȱ�㣬�ع��������£�
// 1. ���߶������һ�����ܣ�ֱ�ӷ�װװ����ԵĹ�����

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

class ComputerBuilder {
	private Computer c = new Computer();
	
	public Computer build() {
		c.setCpu("i7 7700hq");
		c.setMemery("16");
		c.setHarddisk("1T");
		c.setGpu("Rtx2080ti");
		return c;
	}
}

// ==================================================================

public class Test {
	public static void main(String[] args) {
		ComputerBuilder cb = new ComputerBuilder();
		
		// ѧϰ (cpu�� + �ڴ� )
		Computer c = cb.build();
		System.out.println(c);
		
		// ����Ϸ
		Computer c2 = cb.build();
		System.out.println(c2);
		
		// ���֡��칫
		Computer c3 = cb.build();
		System.out.println(c3);
		
	}
}

// ȱ�㣺
// 1. ��װ��̫�ݣ� ���ۿͻ�����ʲô���󣬿ͻ���û�취ѡ�����ã� �����ɷ������˶��������ã���



// Ӧ�ø��ݲ�ͬ�������ó���ͬ�� �Ͷˡ��жˡ��߶˵���.
