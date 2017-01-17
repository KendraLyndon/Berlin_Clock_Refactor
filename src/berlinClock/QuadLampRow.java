package berlinClock;

import java.util.ArrayList;

public class QuadLampRow extends LampRow {
	
	public QuadLampRow() {
		super(4);
		
		for(int i=0; i<4; i++){
			lamps.add(new Lamp());
		}
		
	}

	public void setColors(ArrayList<LampColor> lampColors){
		for(int i=0; i<4; i++){
			lamps.get(i).setLampColor(lampColors.get(i));
		}
	}
	
	public static ArrayList<LampColor> fromIntTopHours(int hours){

		int litLamps = hours/5;
		ArrayList<LampColor> lampColors = new ArrayList<LampColor>(4);
		
		for(int i=0; i<4; i++){
			if(i < litLamps){
				lampColors.add(LampColor.RED);
			} else {
				lampColors.add(LampColor.OFF);
			}
		}
		
		return lampColors;
	}
	
	public static ArrayList<LampColor> fromIntBottomHours(int hours){

		int litLamps = 0;
		ArrayList<LampColor> lampColors = new ArrayList<LampColor>(4);
		
		if(hours%10 > 5){
			litLamps = (hours % 10)/2;
		} else {
			litLamps = hours % 10;
		}
		
		for(int i=0; i<4; i++){
			if(i < litLamps){
				lampColors.add(LampColor.RED);
			} else {
				lampColors.add(LampColor.OFF);
			}
		}
		
		return lampColors;
	}
	
	public static ArrayList<LampColor> fromIntBottomMinutes(int minutes){

		int litLamps =  minutes%5;
		ArrayList<LampColor> lampColors = new ArrayList<LampColor>(4);
		
		for(int i=0; i<4; i++){
			if(i < litLamps){
				lampColors.add(LampColor.YELLOW);
			} else {
				lampColors.add(LampColor.OFF);
			}
		}
		
		return lampColors;
	}
	
	public int size(){
		return 4;
	}
}
