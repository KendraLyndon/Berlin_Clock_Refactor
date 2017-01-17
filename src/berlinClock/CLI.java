package berlinClock;

public final class CLI {

	private static String errorMessage = "The BerlinClock CLI requires an argument";
	
	public static void main(String[] args) {
		
		try {
			
			for(String arg : args){
				CLI.runCli(arg);
			}
			
		} 
	
		catch(Exception e) {
			if(args.length == 0){
				System.out.println(errorMessage);
			}
			
		} // end catch
	}
	
	private static void runCli(String arg){

		BerlinClock berlinClock = new BerlinClock();
		
		berlinClock.setTime(arg);
		
		berlinClock.display();
	}

}