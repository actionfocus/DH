package com.imooc;

import java.util.Arrays;

public class FirstDayAtSchool {
	public String[] PreparedBag(){
		String[] schoolbag = {"Books", "NoteBooks", "Pens"};
		System.out.println("My School bag contains:" + Arrays.toString(schoolbag));
		
		return schoolbag;
	}
	
	public String[] addPencils() {
		String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils1" };
		System.out.println("Now my school bag contains: "
				+ Arrays.toString(schoolbag));
		return schoolbag;
	}

}
