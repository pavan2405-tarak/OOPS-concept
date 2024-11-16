package Pratice;

public class test 
{
	public static void main(String[] args) {
		Room rm=new Room();
		// TV
		TV tv=new TV();
		rm.setTv(tv);
		tv.setBrand("Sony");
		tv.setHeight(100);
		tv.setLength(200);
		System.out.println(tv.getBrand());
		System.out.println(tv.getHeight());
		System.out.println(tv.getLength());
		//CHAIR
		Chair ch=new Chair();
		rm.setChair(ch);
		ch.setDesign("Plain");
		ch.setHeight(100);
		ch.setType("Plastic");
		System.out.println(ch.getDesign());
		System.out.println(ch.getHeight());
		System.out.println(ch.getType());
		//FAN
		Fan fn=new Fan();
		rm.setFan(fn);
		fn.setCompany("havells");
		fn.setDesign("4 bladed");
		fn.setType("metalic");
		System.out.println(fn.getCompany());
		System.out.println(fn.getDesign());
		System.out.println(fn.getType());
		//DOORS
		Doors dr=new Doors();
		rm.setDoors(dr);
		dr.setDesign("Square");
		dr.setType("Wooden");
		dr.setLength(200);
		dr.setSize(100);
		System.out.println(dr.getDesign());
		System.out.println(dr.getType());
		System.out.println(dr.getLength());
		System.out.println(dr.getSize());
		
		

		
	}
}