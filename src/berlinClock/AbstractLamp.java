package berlinClock;

public abstract class AbstractLamp implements ILamp {
	
	private LampColor lampColor = LampColor.OFF;
	
	public LampColor getLampColor(){
		return lampColor;
	}

	public void setLampColor(LampColor lampColor) {
		this.lampColor = lampColor;
	}

}
