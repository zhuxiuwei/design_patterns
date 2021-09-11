package woniuxy.k_builder.f;


// ��һ����������ر���ʱ�򣬹������Ĳ���Ҳ���ر�࣬�����ǹ������Ķ���������ͻ���һ����
// ��ô�ͻ��˴���ͺ����׳���

class Computer {
	private String cpu;
	private String harddisk;
	private String memery;
	private String gpu;
	private String power;
	private String motherboard; // ����
	private String cdrom;
	private String fan;
	private String netcard;
//	public Computer(String cpu, String harddisk, String memery, String gpu, String power, String motherboard,
//			String cdrom, String fan, String netcard) {
//		super();
//		this.cpu = cpu;
//		this.harddisk = harddisk;
//		this.memery = memery;
//		this.gpu = gpu;
//		this.power = power;
//		this.motherboard = motherboard;
//		this.cdrom = cdrom;
//		this.fan = fan;
//		this.netcard = netcard;
//	}
	
	public Computer() {
	}
	
	private Computer(ComputerBuilder cb) {
		this.cpu = cb.cpu;
		this.harddisk = cb.harddisk;
		this.memery = cb.memery;
		this.gpu = cb.gpu;
		this.power = cb.power;
		this.netcard = cb.netcard;
		this.motherboard = cb.motherboard;
		this.fan = cb.fan;
		this.cdrom = cb.cdrom;
	}
	
	// ���ϵĹ�������ʹ������ȷʵ���鷳�� Ҳ����С�������������ǿ��ԶԹ������������أ��Ѳ�������, ��ʵ֤������Ҳ��2....
	
	// ��õĽ��������ʹ�ý��������ģʽ�ĵڶ�����̬
	// 1. �����߱����ǲ�Ʒ��һ����̬�ڲ���
	// 2. �����ߵ�������ȫ���Ʒ����������һ��
	// 3. Ϊ�����ߵ�ÿһ�����Զ����һ��setter�������Ҹ�setter�������뷵�ؽ����߶�����
	// (��ǰ��javabean��setter����������ֵ��void)
	
	public static class ComputerBuilder {
		private String cpu;
		private String harddisk;
		private String memery;
		private String gpu;
		private String power;
		private String motherboard; // ����
		private String cdrom;
		private String fan;
		private String netcard;
		public ComputerBuilder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}
		public ComputerBuilder setHarddisk(String harddisk) {
			this.harddisk = harddisk;
			return this;
		}
		public ComputerBuilder setMemery(String memery) {
			this.memery = memery;
			return this;
		}
		public ComputerBuilder setGpu(String gpu) {
			this.gpu = gpu;
			return this;
		}
		public ComputerBuilder setPower(String power) {
			this.power = power;
			return this;
		}
		public ComputerBuilder setMotherboard(String motherboard) {
			this.motherboard = motherboard;
			return this;
		}
		public ComputerBuilder setCdrom(String cdrom) {
			this.cdrom = cdrom;
			return this;
		}
		public ComputerBuilder setFan(String fan) {
			this.fan = fan;
			return this;
		}
		public ComputerBuilder setNetcard(String netcard) {
			this.netcard = netcard;
			return this;
		}
		
		public Computer build() {
			System.out.println("��װ" + cpu + "," + gpu + "," + memery);
			return new Computer(this);
		}
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", harddisk=" + harddisk + ", memery=" + memery + ", gpu=" + gpu + ", power="
				+ power + ", motherboard=" + motherboard + ", cdrom=" + cdrom + ", fan=" + fan + ", netcard=" + netcard
				+ "]";
	}

	public Computer setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}

	public void setMemery(String memery) {
		this.memery = memery;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public void setCdrom(String cdrom) {
		this.cdrom = cdrom;
	}

	public void setFan(String fan) {
		this.fan = fan;
	}

	public void setNetcard(String netcard) {
		this.netcard = netcard;
	}
	
}


public class Test {
	public static void main(String[] args) {
		Computer.ComputerBuilder cb = new Computer.ComputerBuilder();
		Computer c = cb.setMotherboard("��˶����").setCpu("���8��").setFan("cpu�Դ��ķ���").setHarddisk("500g").build();
		System.out.println(c);
	}
}

// ���������ģʽ�ĵڶ�����̬�� �ο�effective java �ڶ���2 ����������Թ���ʱ����ʹ�ý��������ģʽ�ĵڶ�����̬  