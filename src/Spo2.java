
public class Spo2 {
	
	private double reading;
	private int lowerNormalVal;
	private int UpperNormalVal;
	
	public Spo2(double reading) { // constructor
		this.reading = reading;
	}
	
	public double getReading() {
		return this.reading;
	}

	public int getLowerNormalVal() {
		return this.lowerNormalVal;
	}

	public int getUpperNormalVal() {
		return this.UpperNormalVal;
	}
	
	public String Spo2Checker() {
		
		if(this.reading < this.getLowerNormalVal() || this.reading > this.getUpperNormalVal())
			return "Care Needed - Body Temperature is abnormal";
		return "Normal";
	}
}
