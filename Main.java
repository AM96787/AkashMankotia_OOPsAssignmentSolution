package com.greatlearning.assessment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment(); // Creating an Object of Class AdminDepartment
		HrDepartment hd = new HrDepartment(); // Creating an Object of Class HrDepartment
		TechDepartment td = new TechDepartment(); // Creating an Object of ClassTechDepartment

		// Object of Class AdminDepartment is invoking methods of AdminDepartment
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		// Object of Class AdminDepartment is invoking method of SuperDepartment
		System.out.println(ad.isTodayAHoliday() + "\n");

		// Object of Class HrDepartment is invoking methods of HrDepartment
		System.out.println("Welcome to " + hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		// Object of Class HrDepartment is invoking method of SuperDepartment
		System.out.println(hd.isTodayAHoliday() + "\n");

		// Object of Class TechDepartment is invoking methods of TechDepartment
		System.out.println("Welcome to " + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		// Object of Class TechDepartment is invoking method of SuperDepartment
		System.out.println(td.isTodayAHoliday() + "\n");

	}

}
