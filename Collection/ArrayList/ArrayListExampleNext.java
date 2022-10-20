import java.util.*;

class ArrayListExampleNext {
	
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList();
		
		al.add("Rafee");
		al.add("Umar");
		
		ArrayList alnew = new ArrayList();
		
		alnew.add("Imran");
		alnew.add("Faiyaz");
		
		alnew.addAll(al);
		
		System.out.println(alnew.size());
		System.out.println(alnew);
		System.out.println(alnew.contains(al));
	}
}