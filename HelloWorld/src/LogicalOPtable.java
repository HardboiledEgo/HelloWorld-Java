class LogicalOPtable {
	public static void main(String args[]) {
		double p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = 1; q = 1;
		System.out.print((int) p + "\t" + (int) q + "\t");
		System.out.print((int) (p * q) + "\t" + (int) ((p + q)/2 + 0.5) + "\t");
		System.out.println((int) (Math.abs(Math.abs((p+q)-1)-1)+0.5) + "\t" + (int) Math.abs(p - 1));
		
		p = 1; q = 0;
		System.out.print((int) p + "\t" + (int) q + "\t");
		System.out.print((int) (p * q) + "\t" + (int) ((p + q)/2 + 0.5) + "\t");
		System.out.println((int) (Math.abs(Math.abs((p+q)-1)-1)+0.5) + "\t" + (int) Math.abs(p - 1));
		
		p = 0; q = 1;
		System.out.print((int) p + "\t" + (int) q + "\t");
		System.out.print((int) (p * q) + "\t" + (int) ((p + q)/2 + 0.5) + "\t");
		System.out.println((int) (Math.abs(Math.abs((p+q)-1)-1)+0.5) + "\t" + (int) Math.abs(p - 1));
		
		p = 0; q = 0;
		System.out.print((int) p + "\t" + (int) q + "\t");
		System.out.print((int) (p * q) + "\t" + (int) ((p + q)/2 + 0.5) + "\t");
		System.out.println((int) (Math.abs(Math.abs((p+q)-1)-1)+0.5) + "\t" + (int) Math.abs(p - 1));
	}
}
