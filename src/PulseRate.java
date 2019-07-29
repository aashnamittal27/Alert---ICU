
public class PulseRate{
	int reading;
	private int lowerSleepingRate = 40;
	private int upperSleepingRate = 60;
	private int upperRestingRate = 100;
	private int upperExerciseRate = 220;
	
//	private int lowerNormalVal = 60;
//	private int upperNormalVal = 100;
	
	public PulseRate(int reading) { // constructor
		this.reading = reading;
	}
	
	public int getReading() {
		return this.reading;
	}
	
	public int getLowerNormalVal() {
		return this.upperSleepingRate;
	}
	
	public int getUpperNormalVal() {
		return this.upperRestingRate;
	}
	
	public String pulseRateChecker() {
		String result = "";
		if(this.reading < lowerSleepingRate) {
			result = "Below healthy resting heart rates.";
			System.out.println(result);
			return result;
			
		}
		else if(this.reading > lowerSleepingRate && this.reading <= upperSleepingRate) {
			result = "Normal heart rate for sleeping.";
			System.out.println(result);
			return "Normal";
		}
		else if(this.reading > upperSleepingRate && this.reading <= upperRestingRate) {
			result = "Healthy adult resting heartrate.";
			System.out.println(result);
			return "Normal";
		}
		else if(this.reading > upperRestingRate && this.reading <= upperExerciseRate) {
			result = "Unacceptable resting heartrate";
			System.out.println(result);
			return result;
		}
		
		return "Abnormally high heart rate";
		
//		if(this.reading < this.getLowerNormalVal() && this.reading > this.getUpperNormalVal())
//			return "Care Needed - Pulse Rate is abnormal";
//		
//		return "Normal";
	}
}


