package woniuxy.m_decorator.e;

import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

// �������й��ܣ�������ǿ��Ĺ��ܣ�
class MyBufferedReader extends FilterReader {

	private Reader in;
	
	protected MyBufferedReader(Reader in) {
		super(in);
		this.in = in;
	}
	
	public String readLine() throws IOException {
		
		StringBuilder sb = new StringBuilder("");
		int n = 0;
		while((n = in.read()) != -1) {
			if(n == '\r' ) {
				continue;
			}
			if(n == '\n' ) {
				break;
			}
			sb.append((char)n);
		}
		
		// �������ߵ����n�м��ֿ��ܣ� һ����-1,  ��\n
		return n == -1  ? null: sb.toString();
		
	}
	
	@Override
	public void close() throws IOException {
		in.close();
	}
	
	
	
}

public class Test {
	public static void main(String[] args) throws Exception {
		Reader in = new FileReader("F:\\1.txt");
		MyBufferedReader mbr = new MyBufferedReader(in);
		
		String line = null;
		
		while((line = mbr.readLine()) != null) {
			System.out.println(line);
		}
		mbr.close();
		
	}
}
