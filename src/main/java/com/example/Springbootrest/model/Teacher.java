package com.example.Springbootrest.model;

public class Teacher {
	private int id;
	private String name;
	private int expereince;
	private String subject;
	
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
	public int getExpereince() {
		return expereince;
	}
	public void setExpereince(int expereince) {
		this.expereince = expereince;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [Id=" + id + ", name=" + name + ", expereince=" + expereince + ", subject=" + subject
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getExpereince()=" + getExpereince()
				+ ", getSubject()=" + getSubject() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
