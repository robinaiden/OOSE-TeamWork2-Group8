package strategy;

import java.util.ArrayList;
import decorator.TeaComponent;
import iterator.BillIterator;

public class Checkstand {
	
	private static Checkstand checkstand = new Checkstand();
	private DiscountStrategy strategy = null;
	private ArrayList<TeaComponent> list = null;
	
	private Checkstand() {
		this.list = new ArrayList<TeaComponent>();
	}
	
	public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
	
	public static Checkstand getInstance()
	{    
		return checkstand;
	}

	public void printBill() {
		BillIterator billList = checkstand.getIterator();
		while(billList.hasNext()) {
			TeaComponent s = billList.next();
			System.out.println(s.getDescription() + "¡A" + s.getCost());
		}
	}
	
	public boolean add(TeaComponent child) {
		this.list.add(child);
		return true;
    }

    public boolean remove(TeaComponent child) {
    	this.list.remove(child);
    	return true;
    }

	public BillIterator getIterator() {
		return new BillIterator(this.list);
	}
	
}
