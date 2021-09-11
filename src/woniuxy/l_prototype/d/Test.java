package woniuxy.l_prototype.d;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Date;

/*
 	�����c���е�����: ���¡�ڿ������ò�κ���Ķ���ʱ��д�������鷳�� �ع��������£�
 	
 	ע�⣬ֻ�޸���WeekReport�е�clone�����������Ķ�û�䡣
 	
 	
*/

class WeekReport implements Cloneable, Serializable  {
	private String name;			// Ա������
	private String content;			// �ܱ�����
	private String department;		// Ա����������
	private String question;		// ���ܹ�������������
	private String suggestion;		// һЩ����
	private Date pubdate;			// �ύ�ܱ���ʱ��
	
	
	public WeekReport() {
		System.out.println("����WeekReport");
	}
	
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
	
	@Override
	protected Object clone()  {
		try {
			
			OutputStream out = new FileOutputStream("C:\\a.txt");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			oos.writeObject(this);
			
			oos.close();
			
			InputStream in = new FileInputStream("C:\\a.txt");
			ObjectInputStream ois = new ObjectInputStream(in);
			
			WeekReport copy = (WeekReport) ois.readObject();
			
			ois.close();
			
			return copy;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
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
		
		
		WeekReport wr2 = (WeekReport) wr.clone();
		wr2.setContent("����һ������");
		
		WeekReport wr3 = (WeekReport) wr.clone();
		wr3.setContent("ɶ��û��");
		
		
		System.out.println("1�ܱ����:" + wr);
		System.out.println("2�ܱ����:" + wr2);
		System.out.println("2�ܱ����:" + wr3);
		
		
		System.out.println("=========================================");
		// ˼��2��
		wr.getPubdate().setTime(0);
		
		System.out.println(wr);
		System.out.println(wr2);
		System.out.println(wr3);
		
		
	}
}

// ȱ��: �ļ���λ��д���ˣ��� ����д����




