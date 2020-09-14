class Vehicle {
	int passengers = 7;
	int fuelcap = 16;
	int mpg = 21;
    
	Vehicle() {
		//���������� ������������ ��� ���������� �������� �� ���������
	}
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range() {
		return mpg * fuelcap;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class RetMeth {
	public static void main(String args[]) {
		// Vehicle minivan; ���������� ������ �� ������
		// minivan = new Vehicle(); ��������� ������ ��� ������� ���� Vehicle
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle(2, 14, 12);

		System.out.println("����-������ ����� ��������� " + minivan.passengers + 
				" ���������� �� ���������� "
				+ minivan.range() + " ����");

		System.out.println("�������� ����� ��������� " + sportcar.passengers + 
				" ���������� �� ���������� "
				+ sportcar.range() + " ����");

	}

}
