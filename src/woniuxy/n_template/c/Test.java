package woniuxy.n_template.c;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

abstract class Template {
	
	private String name;
	
	public Template(String name) {
		this.name = name;
	}
	
	public boolean bb() {
		return true;
	}

	// ģ�巽��
	public void template() {
		System.out.println(name + "���Կ�ʼ");
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println(name+"���Գ���ʱ�䣺" + (end - start));
		
		if(bb()) {
			System.out.println("����ʱ�䣺" + new Date() + "*************************");
		}
	}
	
	
	public abstract void code();
}

// ===================================================================

class A extends Template {
	private List list;
	public A(List list) {
		super(list.getClass().getName() + "����");
		this.list = list;
	}
	@Override
	public void code() {
		for (int i = 1; i <= 100000; i++) {
			list.add(0,"a");
		}
	}
	
	@Override
	public boolean bb() {
		return false;
	}
	
}

class B extends Template {
	private List list;
	public B(List list) {
		super(list.getClass().getName() + "��ѯ");
		this.list = list;
	}
	@Override
	public void code() {
		for (int i = 1; i <= 100000; i++) {
			list.add(0,"a");
		}
		for(int i = 1; i <= 100000; i++) {
			list.get(50000);
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Template[] ts = new Template[] {
				new A(new ArrayList<>()),
				new A(new LinkedList<>()),
				new B(new ArrayList<>()),
				new B(new LinkedList<>()),
				new A(new Vector<>()),
		};
		
		for (Template t : ts) {
			t.template();
			System.out.println("============================");
		}
	}
}

/*
	��ģ��ģʽ��Template Pattern���У�
	һ�������๫��������ִ�����ķ����ķ�ʽ/ģ�塣����������԰���Ҫ��д����ʵ�֣������ý��Գ������ж���ķ�ʽ���С��������͵����ģʽ������Ϊ��ģʽ��
*/
