package woniuxy.l_prototype.a;

import java.util.Date;

/*
 ����OA���칫�Զ�����Ŀ����Ŀ��ʱ�� ����Ҫ��һ���ܱ����ܡ�
���ھ�ģ��һ���ܱ�����
*/

class WeekReport {
	private String name;			// Ա������
	private String content;			// �ܱ�����
	private String department;		// Ա����������
	private String question;		// ���ܹ�������������
	private String suggestion;		// һЩ����
	private Date pubdate;			// �ύ�ܱ���ʱ��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	@Override
	public String toString() {
		return "WeekReport [name=" + name + ", content=" + content + ", department=" + department + ", question="
				+ question + ", suggestion=" + suggestion + ", pubdate=" + pubdate + "]";
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		// ��ɺɺ��11�µ�1���ܱ�:
		WeekReport wr = new WeekReport();
		wr.setName("��ɺɺ");
		wr.setContent("����֯������ë��");
		wr.setQuestion("��");
		wr.setSuggestion("��");
		wr.setDepartment("ë�߲�");
		wr.setPubdate(new Date());
		System.out.println("�ύ�ܱ����:" + wr);
		
		// ��ɺɺ��11�µ�2���ܱ�:
		WeekReport wr2 = new WeekReport();
		wr2.setName("��ɺɺ");
		wr2.setContent("��������һ������");
		wr2.setQuestion("��");
		wr2.setSuggestion("��");
		wr2.setDepartment("ë�߲�");
		wr2.setPubdate(new Date());
		System.out.println("�ύ�ܱ����:" + wr2);
		
		// ��ɺɺ��11�µ�3���ܱ�:
		WeekReport wr3 = new WeekReport();
		wr3.setName("��ɺɺ");
		wr3.setContent("����ɶ��û��");
		wr3.setQuestion("��");
		wr3.setSuggestion("��");
		wr3.setDepartment("ë�߲�");
		wr3.setPubdate(new Date());
		System.out.println("�ύ�ܱ����:" + wr3);
	}
}
