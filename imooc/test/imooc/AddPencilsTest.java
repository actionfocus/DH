package imooc;

import org.junit.Test;

import com.imooc.FirstDayAtSchool;

import static org.junit.Assert.*;

public class AddPencilsTest {

	FirstDayAtSchool school = new FirstDayAtSchool();

	String[] bag1 = { "Books", "Notebooks", "Pens", "Pencils" };

	@Test
	public void testAddPencils() {

		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag1, school.addPencils());

	}

}