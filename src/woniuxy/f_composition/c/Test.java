package woniuxy.f_composition.c;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

// �����b����ȱ�㣬������Ҫ�ٴ���дaddAll���������addAll��������ֱ�ӵ���super.addAll()
// ������Ҫ�������֣���дaddAll�ľ���ʵ�֣���֤addAllһ����ص�add����!
class MyHashSet extends HashSet {
	private int count = 0;

	@Override
	public boolean add(Object e) {
		count++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection c) {
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
 	��������������û���κ������ˣ���ʵ��Ȼ�� ��������Ȼ�ܴ���!
 	
 	����2��ȱ�㣺
 	
 	һ��
 	����HashSet���Ԫ�صķ����ǣ� add  addAll
 	������°汾�е�HashSet������һЩ���Ԫ�صķ�����addSome .
 	
 	��������ʹ�õ��Ǽ̳У���ô�°汾��HashSet����addSome������Ҳ��MyHashSet�̳��ˣ��ͻ��˾��ܵ���addSome�����addSomeҲ�Ǽ�Ԫ�ص�
 	���Ǹ÷����У�û��ͳ�������������Υ��������
 	
 	����
 	addAllԭ���������Լ�ʵ�ֵģ����addAll����ᱻHashSet�е������������ã�Ҳ����HashSet��������������addAll����ɹ��ܣ�
 	����һ���Լ���дaddAll��������ô�������������addAll�����ķ��������п��ܳ��ֲ���Ԥ֪����
 	
 	����2�����⣬����Դ�ڷ�����д�� 
 	
*/
