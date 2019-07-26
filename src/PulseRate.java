
public class PulseRate{
	int reading;
	private int lowerNormalVal = 60;
	private int upperNormalVal = 100;
	
	public PulseRate(int reading) { // constructor
		this.reading = reading;
	}
	
	public int getReading() {
		return this.reading;
	}
	
	public int getLowerNormalVal() {
		return this.lowerNormalVal;
	}
	
	public int getUpperNormalVal() {
		return this.upperNormalVal;
	}
	
	public String pulseRateChecker() {
		
		if(this.reading < this.getLowerNormalVal() && this.reading > this.getUpperNormalVal())
			return "Care Needed - Pulse Rate is abnormal";
		
		return "Normal";
	}
}


