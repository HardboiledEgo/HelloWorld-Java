package Chapter_5;

class Bubble {
	public static void main(String args[]) {
		int arr[] = {2, 5, 65, 23, 47, -12, -35, -72, -14, 0};
		int min = arr[0];
		int max = arr[1];
		
		for (int i = 0; i < arr.length - 1; i ++) {
			System.out.println("i �����: " + i);
			if (arr[i] > arr[i+1]) {
				System.out.println("���� ��� �����: " + arr[i] + " " + arr[i+1]);
				System.out.println("***************");
				min = arr[i+1];
				max = arr[i];
				arr[i+1] = max;
				arr[i] = min;
				i = -1;
			}
			else System.out.println("���� ��� �����: " + arr[i] + " " + arr[i+1]);
		}
		System.out.println("***************");
		for (int j = 0; j < arr.length; j++) 
			System.out.println("������� [" + j + "]: " + arr[j]);
	}

}
