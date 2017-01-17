package berlinClock;

public enum LampColor {
	YELLOW,
	RED,
	OFF;
	
	public String toString(){
		switch (this){
			case YELLOW: return 	"\u001B[43m \u001B[0m ";
			case RED: return "\u001B[41m \u001B[0m ";
			case OFF: return "\u001B[47m \u001B[0m ";
			default: return "messed up";
		}
	}
	
}
