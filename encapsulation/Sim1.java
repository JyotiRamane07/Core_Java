package com.jsp.encapsulation;

public class Sim1 {
private String service_provider;
private long contact_no;

public Sim1(String sp,long cno)
{
	this.service_provider=sp;
	this.contact_no=cno;
}
public void setService_provider(String service_provider) {
	this.service_provider = service_provider;
}
public String getService_provider() {
	return service_provider;
}

public void setContact_no(long contact_no) {
	this.contact_no = contact_no;
}
public long getContact_no() {
	return contact_no;
}
public void printSim1Details()
{
	System.out.println("Sim1 config.....");
	System.out.println("Sim1 Service Provider :"+service_provider);
	System.out.println("Sim1 contact no :"+contact_no);
}
}
