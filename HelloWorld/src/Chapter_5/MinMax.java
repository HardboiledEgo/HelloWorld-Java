package Chapter_5;

class MinMax {
	public static void main(String args[]) {
		int nums[] = {1, 22, -34, 5, -3, 234, 999};
		int min, max;
		
		min = max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}
		System.out.println("min è max: " + min + " " + max);
	}

}
