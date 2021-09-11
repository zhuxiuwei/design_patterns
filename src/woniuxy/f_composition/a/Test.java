package woniuxy.f_composition.a;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

// ����
// ��Ҫ����һ�����ϣ� �������Ҫͳ���Ըü��ϵ�����������һ���ӹ����ٸ�Ԫ�ء���������Ŀǰ�������ж��ٸ�Ԫ�أ�
class MyHashSet extends HashSet {
	private int count = 0;

	@Override
	public boolean add(Object e) {
		count++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection c) {
		count += c.size();
		return super.addAll(c);
	}

	public int getCount() {
		return count;
	}
}


public class Test {
	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
		set.add(1);
		set.add(22);
		set.add(333);
		
		HashSet set2 = new HashSet();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set.addAll(set2);
		
		System.out.println(set.getCount());  
	}
}

// �����õ�6������õ�9��why??? ��ΪaddAll�ص���add������