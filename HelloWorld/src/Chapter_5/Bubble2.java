package Chapter_5;

class Bubble2 {
	public static void main(String args[]) {
		int arr[] = {2, 5, 65, 23, 47, -12, -35, -72, -14, 0};
        int a, b, t;
        int size = arr.length;
        
        System.out.print("�������� ������: ");
        for (int i = 0; i < size; i++) System.out.print(" " + arr[i]);
        System.out.println();
        
        for (a = 1; a < size; a++)
        	for (b = size - 1; b >= a; b --) {
        		if (arr[b-1] > arr[b]) {
        			t = arr[b-1];
        			arr[b-1] = arr[b];
        			arr[b] = t;
        		}
        	}
        System.out.print("��������������� ������: ");
        for (int i = 0; i < size; i++)
        	System.out.print(" " + arr[i]);
        System.out.println();
	}

}

