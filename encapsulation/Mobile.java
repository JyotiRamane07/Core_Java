package com.jsp.encapsulation;


public class Mobile {

		//attribute of mobile object
		private String mobile_name;
		private String brand;
		private double price;
		private String ram;

		//achieves has a relationship with Sim1
		private Sim1 sim1;
		//achieves has a relationship with Sim2
		private Sim2 sim2;

		//constructor of mobile
		public Mobile(String mobile_name, String brand, double price, String ram) {
			this.mobile_name = mobile_name;
			this.brand = brand;
			this.price = price;
			this.ram = ram;
		}
		//setters and getters 
		public void setMobile_name(String mobile_name) {
			this.mobile_name = mobile_name;
		}

		public String getMobile_name() {
			return mobile_name;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getBrand() {
			return brand;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getPrice() {
			return price;
		}

		public String getRam() {
			return ram;
		}

		public void setRam(String ram) {
			this.ram = ram;
		}

		public void setSim1(Sim1 sim1) {
			this.sim1 = sim1;
		}

		public Sim1 getSim1() {
			return sim1;
		}

		public void setSim2(Sim2 sim2) {
			this.sim2 = sim2;
		}

		public Sim2 getSim2() {
			return sim2;
		}
		public void printMobileDetails() {
			System.out.println("Mobile Configurations...");
			System.out.println("Mobile name:"+mobile_name);
			System.out.println("Brand is :"+brand);
			System.out.println("Price :"+price);
			System.out.println("Ram:" +ram +"gb");
			System.out.println("==============================");
			if(sim1!=null)
			{
				sim1.printSim1Details();
			}
			else
			{
				System.out.println("Sim1 is not inserted...");
			}
			System.out.println("==============================");
			if(sim2!=null)
			{
				System.out.println("Sim2 config.....");
				System.out.println("Sim1 Service Provider :"+sim2.getService_provider());
				System.out.println("Sim2 contact no :"+sim2.getContact_no());
			}
			else
			{
				System.out.println("Sim2 is not inserted... ");
			}
		}
}
