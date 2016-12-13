package TemplateFactory;

public class GreenTeaProduct extends TeaProduct{

	public boolean customerWantsIce() { return false; }
	
	public void brew(){
		System.out.println("	Brew Green Tea Bag.");
	}
	
	public void addIce() {}
	
	public void addSugar(){
		System.out.println("	Adding Suger.");
	}
}
