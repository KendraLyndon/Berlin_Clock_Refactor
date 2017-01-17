package berlinClock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class LampRow implements Collection<Lamp> {

	protected ArrayList<Lamp> lamps;
	
	protected LampRow (int capacity){
		lamps = new ArrayList<Lamp>(capacity);
	}
	
	public void setColor(LampColor lampColor){
		
	}
	
	public String createLampRowString(){
		// consolidate all the LampColors & lamp.toString() it for each LampRow
		String lampColors = "";
		
		for(int i=0; i<lamps.size(); i++){
			lampColors += lamps.get(i).toString();
		}
		
		return lampColors;
	}
	
	public void setColors(ArrayList<LampColor> lampColors){
	
	}
	
	@Override
	public int size() {
		
		return lamps.size();
	}

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	@Override
	public boolean contains(Object o) {
	
		return lamps.contains(o);
	}

	@Override
	public Iterator<Lamp> iterator() {
		
		return lamps.iterator();
	}

	@Override
	public Object[] toArray() {
	
		return lamps.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return lamps.toArray(a);
	}

	@Override
	public boolean add(Lamp e) {
		
		return lamps.add(e);
	}

	@Override
	public boolean remove(Object o) {
		
		return lamps.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		return lamps.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Lamp> c) {
		
		return lamps.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		return lamps.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		return lamps.retainAll(c);
	}

	@Override
	public void clear() {
		
		throw new UnsupportedOperationException();
	}
	
}
