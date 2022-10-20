import java.io.*;

class FileNotFoundExceptionExample {
	
	public static void show() throws FileNotFoundException {
		
		FileReader f = new FileReader("Rafi.txt");
		BufferedReader br = new BufferedReader(f);
		throw new FileNotFoundException();
	}
	
	public static void main(String args[]) {
		
		try {
			show();
		}
		
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}