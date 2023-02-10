package Task7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FruitsListService {
	static List<String> addFruitsToList(String fruit) {
		String[] fr = fruit.split(",");
		List<String> s = new ArrayList<String>();
		for (int i = 0; i < fr.length; i++) {
			s.add(fr[i].toLowerCase());
		}
		
		Set<String> set = new LinkedHashSet<String>(s);
		List<String> a = new ArrayList<String>(set);
		return a;
	}

	static int searchFruitInList(List<String> a, String name) {
		int i = 0;
		for (int x = 0; x < a.size(); x++) {
			if (a.get(x).equals(name)) {
				i = x;
			} else {
				i = -1;
			}
		}
		return i;

	}

	static int searchFruitInListIgnoreCase(List<String> a, String name) {
		String x = name.toLowerCase();
		if (a.contains(x)) {
			return a.indexOf(x);
		} else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println(searchFruitInList(addFruitsToList("Orange,Watermeleon,lemon"), "lemon"));

	}
}
