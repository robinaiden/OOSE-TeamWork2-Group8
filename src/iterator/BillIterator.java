package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import decorator.TeaComponent;

public class BillIterator implements Iterator<TeaComponent> {
	
	private ArrayList<TeaComponent> list;
	private int index;
	
	public BillIterator(ArrayList<TeaComponent> list) {
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
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
