class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	int range() {
		return mpg * fuelcap;
	}
}

class RetMeth {
	public static void main(String args[]) {
		//Vehicle minivan; ���������� ������ �� ������
		//minivan = new Vehicle(); ��������� ������ ��� ������� ���� Vehicle
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		System.out.println("����-������ ����� ��������� " + minivan.passengers + 
				" ���������� �� ���������� " + minivan.range() + " ����");
		
		System.out.println("�������� ����� ��������� " + sportcar.passengers + 
				" ���������� �� ���������� " + sportcar.range() + " ����");
		
	}

}
