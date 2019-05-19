package com.dmart.shopping.model;

public class product {
	int pid;
	String pname;
	String pcost;
	

	 
	public product(int pid, String pname, String pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}

	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcost() {
		return pcost;
	}
	public void setPcost(String pcost) {
		this.pcost = pcost;
	}
	
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	

}
