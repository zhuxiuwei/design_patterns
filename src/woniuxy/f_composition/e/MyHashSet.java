package woniuxy.f_composition.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet implements Set {
	private int count = 0;
	private Set set;
	
	public MyHashSet(Set set) {
		this.set = set;
	}

	@Override
	public int size() {
		return set.size();
	}

	@Override
	public boolean isEmpty() {
		return set.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return set.contains(o);
	}

	@Override
	public Iterator iterator() {
		return set.iterator();
	}

	@Override
	public Object[] toArray() {
		return set.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		return set.toArray(a);
	}

	@Override
	public boolean add(Object e) {
		count++;
		return set.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return set.remove(o);
	}

	@Override
	public boolean containsAll(Collection c) {
		return set.containsAll(c);
	}

	@Override
	public boolean addAll(Collection c) {
		count += c.size();
		return set.addAll(c);
	}

	@Override
	public boolean retainAll(Collection c) {
		return set.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection c) {
		return set.removeAll(c);
	}

	@Override
	public void clear() {
		set.clear();
	}

	public int getCount() {
		return count;
	}
}

// ����˵һ�� ����������

// ˵�����ü̳У� ��ôʲôʱ��Ӧ���ü̳С�

// �ղŵļ̳�֮���ԣ������Ƿ��������ȱ�㣬��Ҫ����Ϊһ���㣺��д������ˣ��ͱ�д������ˣ�����ͬһ���ˡ�
// HashSet��һ�������ģ�MyhashSet������һ�������ġ�  
// ���಻֪���������д�Լ�����Щ������ ����Ҳ��֪��δ����������ʲô�·������Լ��Ķ�ʲô���з����Ĺ���

// ��ͬһ�����ڣ������̳У�ӦΪͬһ�����µ������࣬����һ�������ġ� ��ͬ�����࣬����Ͼͱ�̳У�
