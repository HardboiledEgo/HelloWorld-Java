package Chapter_5;

class OverloadDemo {
	void ovlDemo() {
		System.out.println("��� ����������");
	}

	void ovlDemo(int a) {
		System.out.println("���� ��������: " + a);
	}

	int ovlDemo(int a, int b) {
		System.out.println("��� ���������: " + a + " " + b);
		return a + b;
	}

	double ovlDemo(double a, double b) {
		System.out.println("��� ���������: " + a + " " + b);
		return a + b;
	}
}

public class Overload {
	public static void main(String args[]) {
		OverloadDemo ob = new OverloadDemo();
		int resI;
		double resD;

		ob.ovlDemo();
		System.out.println();

		ob.ovlDemo(2);
		System.out.println();

		resI = ob.ovlDemo(4, 6);
		System.out.println("�������� ������ ob.ovlDemo(4, 6): " + resI);
		System.out.println();

		resD = ob.ovlDemo(1.1, 2.32);
		System.out.println("��������� ������ ob.ovlDemo(1.1, 2.32): " + resD);
	}
}
