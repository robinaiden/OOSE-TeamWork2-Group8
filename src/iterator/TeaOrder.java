package iterator;

import java.util.ArrayList;
import decorator.TeaComponent;

public class TeaOrder implements Order {
	
	private ArrayList<TeaComponent> list;
	
	public TeaOrder() {
		this.list = new ArrayList<TeaComponent>();
	}
	
	public boolean add(TeaComponent child) {
		this.list.add(child);
		return true;
    }

    public boolean remove(TeaComponent child) {
    	this.list.remove(child);
    	return true;
    }

	@Override
	public OrderIterator getIterator() {
		return new OrderIterator(this.list);
	}
	
}
