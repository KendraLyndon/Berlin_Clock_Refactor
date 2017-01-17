package berlinClock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BerlinClock implements Collection<LampRow>{
	
	private ArrayList<LampRow> berlinClock;
	
	public BerlinClock(){
		
		berlinClock = new ArrayList<LampRow>(5);
		
		berlinClock.add(new SingleLampRow());
		berlinClock.add(new QuadLampRow());
		berlinClock.add(new QuadLampRow());
		berlinClock.add(new ManyLampRow());
		berlinClock.add(new QuadLampRow());
	}
	
	public static String[] parseTimeString(String time){
		return time.split(":");
	}
	
	private static int fromStringToInt(String time){
		return Integer.parseInt(time);
	}

	public void setTime(String time){
		// parse string into array of hh, mm, ss
		String[] parsedTimeString = BerlinClock.parseTimeString(time);
		//convert array indices to integers
		int hours = BerlinClock.fromStringToInt(parsedTimeString[0]);
		int minutes = BerlinClock.fromStringToInt(parsedTimeString[1]);
		int seconds = BerlinClock.fromStringToInt(parsedTimeString[2]);
		//access the rows and assign them to variables
		LampRow row1 = berlinClock.get(0);
		LampRow row2 = berlinClock.get(1);
		LampRow row3 = berlinClock.get(2);
		LampRow row4 = berlinClock.get(3);
		LampRow row5 = berlinClock.get(4);
		// take integers and set the colors of the lamps
		row1.setColor(SingleLampRow.fromInt(seconds));
		row2.setColors(QuadLampRow.fromIntTopHours(hours));
		row3.setColors(QuadLampRow.fromIntBottomHours(hours));
		row4.setColors(ManyLampRow.fromIntManyMinutes(minutes));
		row5.setColors(QuadLampRow.fromIntBottomMinutes(minutes));
	}

	public void display(){
		// loops thru each LampRow to print row colors
		for(int i=0; i<5; i++){
			String rowColors = berlinClock.get(i).createLampRowString();
			System.out.println(rowColors);
		}
	}
	
	@Override
	public int size() {
		
		return berlinClock.size();
	}

	@Override
	public boolean isEmpty() {

		return berlinClock.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		
		return berlinClock.contains(o);
	}

	@Override
	public Iterator<LampRow> iterator() {
		
		return berlinClock.iterator();
	}

	@Override
	public Object[] toArray() {
		
		return berlinClock.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return berlinClock.toArray(a);
	}

	@Override
	public boolean add(LampRow e) {
		
		return berlinClock.add(e);
	}

	@Override
	public boolean remove(Object o) {
		
		return berlinClock.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		return berlinClock.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends LampRow> c) {
		
		return berlinClock.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		return berlinClock.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		return berlinClock.retainAll(c);
	}

	@Override
	public void clear() {
		
		berlinClock.clear();
	}
}
