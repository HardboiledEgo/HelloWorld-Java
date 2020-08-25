class KbIn {
	public static void main(String args[])
		throws java.io.IOException {
		
		char ch;
		
		System.out.print("Введите символ: ");
		ch = (char) System.in.read();
		
		System.out.println(ch);
	}

}
