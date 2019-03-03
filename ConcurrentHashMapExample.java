package com.nucleus;

import java.util.Date;

class Department {

	private int id;
	private String name;
	private String course;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, String course, Date date) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.date = date;
	}

	/*
	 * @Override public boolean equals(Object obj) { Department d = (Department)
	 * obj; return this.getId().equals(d.getId()); }
	 */

	@Override
	public int hashCode() {
		int PRIME = 31;
		int NO = 29;
		return (int) (this.getId() * PRIME * NO);
	}

}

public class ConcurrentHashMapExample {

	public static void main(String args[]) {

		Date d = new Date();
		int i = 1;
		Department d1 = new Department(i, "Jatin", "IT", d);
		System.out.println(d1.getDate());
		System.out.println(d.hashCode());
		System.out.println(d1.getDate().hashCode());
		if (d == d1.getDate()) {
			System.out.println("True");
		}

		if (d.equals(d1.getDate())) {
			System.out.println("True");
		}
		// Calendar.
		d1.getDate().setDate(10);
		System.out.println(d1.getId());
		// l=10l;
		// l = d1.getId();
		System.out.println(d1.getId());

		System.out.println(d1.getDate());
		/*
		 * Department d2 = new Department(1L, "Manish", "COMP"); Department d3 =
		 * new Department(1L, "Mitin", "ELEC"); System.out.println("D1 >" +
		 * d1.hashCode()); System.out.println("D2 >" + d2.hashCode());
		 * System.out.println("D3 >" + d3.hashCode()); Map<Department, String>
		 * map = new HashMap<Department, String>(); map.put(d1, "ONE");
		 * map.put(d2, "TWO"); map.put(d3, "THREE");
		 * 
		 * System.out.println(map.get(d3));
		 * 
		 * for (Map.Entry<Department, String> result : map.entrySet()) {
		 * System.out.println("Key >" + result.getKey().getId() + " Value >"+
		 * result.getValue()); }
		 * 
		 * if(d1.equals(d3)){ System.out.println("True"); }else{
		 * System.out.println("False"); }
		 */

	}

}
