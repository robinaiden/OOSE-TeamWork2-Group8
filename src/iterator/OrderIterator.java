package iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import decorator.TeaComponent;

public class OrderIterator implements IOrderIterator {
	
	private ArrayList<TeaComponent> list;
	private int index;
	
	public OrderIterator(ArrayList<TeaComponent> list) {
        this.list = list;
        this.index = 0;
    }

	@Override
	public boolean hasNext() {
		if(index < list.size()) {
			return true;
		} else {
			index = 0;
			return false;
		}
	}

	@Override
	public TeaComponent next() {
		if(hasNext()) {
			return this.list.get(index++);
		} else {
			throw new NoSuchElementException();
		}
	}
	
}
