package TemplateFactory;

public class LemonTeaProduct extends TeaProduct{
	
	public boolean customerWantsSugar() { return false; }
	
	public void brew(){
		System.out.println("	Brew Lemon Tea Bag.");
	}
	
	public void addIce(){
		System.out.println("	Adding Ice.");
	}

	@Override
	public void addSugar() {}
}
