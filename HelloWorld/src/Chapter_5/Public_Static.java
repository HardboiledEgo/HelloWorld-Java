package Chapter_5;

class MyClass {
	private int alpha = 10;
	public int beta = 9;
	int gamma = 0;
	
	void setAlpha(int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
}

public class Public_Static {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		ob.setAlpha(-99); //������ ���������� �������� � �������� �����������, 
						  //���� ����� ��������� ������ (���� ����������)
		System.out.println(ob.getAlpha());
		ob.beta = 100;
		ob.gamma = 1;
	}
}
