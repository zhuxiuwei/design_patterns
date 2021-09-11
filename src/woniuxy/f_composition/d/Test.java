package woniuxy.f_composition.d;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

// �����c����ȱ�㣬������дaddAll�����ˣ� ����д�����Ƕ�����չ������ӷ�������api�ĵ���˵��������Ҫ����addAll��ʱ�򣬶�����addAll2
class MyHashSet extends HashSet {
	private int count = 0;

	@Override
	public boolean add(Object e) {
		count++;
		return super.add(e);
	}
	
	public boolean addAll2(Collection c) {
		boolean bb = false;
		for(Object obj : c) {
			if(add(obj)) {
				bb = true;
			}
		}
		return bb;
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
 	������̫��ǿ�ˣ�����Ҫ���ǣ���δ������jd�汾�У�������ô�磬�����¼��˸�������addAll2������ 
 	
 	�̳У��Ѿ�������...
*/
