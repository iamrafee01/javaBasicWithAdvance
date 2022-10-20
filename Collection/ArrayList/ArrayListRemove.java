import java.util.*;

class ArrayListRemove throws IndexOutOfBoundsException {
	
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.remove(20);
		System.out.println(al);
		System.out.println(al.size());
	}
}