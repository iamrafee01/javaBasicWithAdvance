import java.util.*;

class ArrayListNewExample {
	
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		ArrayList alnew = new ArrayList();
		
		alnew.add(50);
		alnew.add(60);
		
		alnew.addAll(al);
		
		System.out.println(alnew.size());
		System.out.println(alnew.contains(50));
		System.out.println(al.contains(30));
	}
}