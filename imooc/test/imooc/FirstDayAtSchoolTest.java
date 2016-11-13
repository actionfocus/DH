package imooc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.FirstDayAtSchool;

public class FirstDayAtSchoolTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = {"Books", "NoteBooks", "Pens"};
	String[] bag2 = {"Books", "NoteBooks", "Pens", "Pencils"};
	@Test
	public void testPreparedBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.PreparedBag());
		
	}

}
