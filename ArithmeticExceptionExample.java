class ArithmeticExceptionExample {
	
	public static void show() throws ArithmeticException {
	
	int x = 10/0;
	throw new ArithmeticException();
	}
	
	public static void main(String args[]) {
		
		try {
			show();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
	