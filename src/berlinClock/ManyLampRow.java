package berlinClock;

import java.util.ArrayList;

public class ManyLampRow extends LampRow{
	
	public ManyLampRow() {
		super(11);
	
		for(int i=0; i<11; i++){
			lamps.add(new Lamp());
		}
	}
	
	public void setColors(ArrayList<LampColor> lampColors){
		for(int i=0; i<11; i++){
			lamps.get(i).setLampColor(lampColors.get(i));
		}
	}

	public static ArrayList<LampColor> fromIntManyMinutes(int minutes){

		int litLamps = minutes / 5;
		ArrayList<LampColor> lampColors = new ArrayList<LampColor>(11);
		
		for(int i=0; i<11; i++){
			if(i < litLamps){
				lampColors.add(LampColor.YELLOW);
			} else {
				lampColors.add(LampColor.OFF);
			}
		}
		
		return lampColors;
	}
	
	public int size(){
		return 11;
	}
}
