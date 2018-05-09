package spring.boot.practice.model;

import java.util.Date;

public class Customer {

	private int sno;
	private String sname;
	private String bname;
	private Date date;
	public Customer() {
	}
	public Customer(int sno, String sname, String bname, Date date) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.bname = bname;
		this.date = date;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
