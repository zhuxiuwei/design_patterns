package woniuxy.f_composition.b;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

// �����a����ȱ�㣬����ֻ��Ҫ������д�����addAll��������
class MyHashSet extends HashSet {
	private int count = 0;

	@Override
	public boolean add(Object e) {
		count++;
		return super.add(e);
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

/*
 	����������Ȼ�Ѿ�ʵ�������󣬵��������Ȼ�ܴ���������
 	
 	��������ƣ�����������һ����ʵ�� ����addAll��������ȥ�ص�add�������С� 
 	
 	Ҫ֪����jdk����Щ��ǰ�����õ���ײ�Դ�룬�ڲ�ͬjdk�汾�У����п��ܷ����仯�������ڶ���汾�г�������Ĵ��룬Ҳ�ѱ���δ����ĳ���汾��䣡
 	
 	��һ��ĳһ��δ����jdk�汾�У�HashSet��addAll�������ٻص�add�����ˣ�����Ŀͻ��˴��룬�ͱ�������������
 	
*/
