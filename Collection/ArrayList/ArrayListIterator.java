import java.util.*;

public class ArrayListIterator {

	public static void main(String args[]) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Rafee");
		al.add("Umar");
		al.add("Imran");
		al.add("Faiyaz");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
