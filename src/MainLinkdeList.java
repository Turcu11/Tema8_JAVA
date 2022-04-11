import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainLinkdeList {

	public static void main(String[] args) {
		LinkedList<String> initialList = new LinkedList<String>();
		LinkedList<String> noDuplicateList = new LinkedList<String>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("Insert a string of chars: ");
			String str = s.next();
			if (str.equals("STOP")) {
				break;
			} else {
				initialList.add(str);
			}
		}

		Iterator<String> it = initialList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " - ");
		}

		for (String ss : initialList) {
			if (!noDuplicateList.contains(ss))
				noDuplicateList.add(ss);
		}

		System.out.println("No Duplicates : ");
		System.out.println(noDuplicateList);
	}
}
