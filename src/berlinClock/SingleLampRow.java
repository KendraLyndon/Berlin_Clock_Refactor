package berlinClock;

public class SingleLampRow extends LampRow {
	
	
	public SingleLampRow() {
		
		super(1);
		
		lamps.add(new Lamp());
	
	}
	
	public void setColor(LampColor lampColor){
		lamps.get(0).setLampColor(lampColor);
	}
	
	public static LampColor fromInt(int seconds){
		if(seconds % 2 == 0){
			return LampColor.YELLOW;
		} else {
			return LampColor.OFF;
		}
	}

	public int size(){
		return 1;
	}
}
