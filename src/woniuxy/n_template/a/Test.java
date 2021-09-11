package woniuxy.n_template.a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 	�Ƚ�2�����ϵ���ɾ����ѯЧ�ʡ�
 	
 	ArrayList: �����ѯ�� �� ��ɾ�� ��
 	�ײ㣺���飬 ����Ԫ�����ڴ��еĴ洢�ص���������š�
 	ǡǡ����Ϊ������ţ����������ѯ�� �� ��ɾ�� ��
 	
 	LinkedList: �����ѯ���� ��ɾ�졣
 	�ײ㣺˫����������Ԫ�����ڴ��еĴ洢�ص��ǲ�������š�
 	ǡǡ����Ϊ��������ţ����������ѯ�� �� ��ɾ�� ��
*/

public class Test {
	public static void main(String[] args) {
		
		System.out.println("ArrayList���Ӳ��Կ�ʼ");
		long start = System.currentTimeMillis();
		List list = new ArrayList();
		for (int i = 1; i <= 1000000; i++) {
			list.add(0,"a");
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList��������ʱ��:" + (end - start));
		
		System.out.println("ArrayList��ѯ���Կ�ʼ");
		long start2 = System.currentTimeMillis();
		List list2 = new ArrayList();
		for (int i = 1; i <= 1000000; i++) {
			list2.add("a");
		}
		for(int i = 1; i <= 1000000; i++) {
			list2.get(500000);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("ArrayList��ѯ����ʱ��:" + (end2 - start2));
		
	}
}

// ȱ�㣺
// 1. ÿ�����滻���Եļ���ʱ���������޸��ࡣ
// 2. ������2��������仯��ԭ�� ������Ϣ�� ���Եļ����࣬Υ����һְ��