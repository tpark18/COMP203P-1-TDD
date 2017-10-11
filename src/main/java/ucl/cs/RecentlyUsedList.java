package ucl.cs;

import java.util.ArrayList;

public class RecentlyUsedList {
	private ArrayList<String> list = new ArrayList<>();
	
	public RecentlyUsedList() {
		// do nothing here
	}
	
	public int getSize() {
		return list.size();
	}
	
	// where 0 returns latest item added
	public String get(int i) {
		if(i > getSize()-1 || i < 0) {
			throw new IllegalArgumentException("Index too large or negative");
		}
		return list.get(getSize()-1-i);
	}
	
	public void add(String itemToAdd) {
		list.add(itemToAdd);
	}
}

