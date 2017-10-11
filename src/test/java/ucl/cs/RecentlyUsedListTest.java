package ucl.cs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class RecentlyUsedListTest {
	
	RecentlyUsedList list = new RecentlyUsedList();

	@Test
	public void newListIsEmpty() {
		assertThat(list.getSize(), is(0));
	}
	
	@Test
	public void addOneElementToListAndGetIt() {
		list.add("one");
		assertThat(list.getSize(), is(1));
		assertThat(list.get(0), is("one"));
	}
	
	@Test
	public void throwsExceptionForBadIndices() {
		try{
			list.get(5);
		} catch(IllegalArgumentException iae) {
			try {
				list.get(-1);
			}
			catch(IllegalArgumentException iae2) {
				
			}
		}
		
	}
}
