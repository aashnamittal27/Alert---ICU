
public class Temperature {
	private double reading;
	private double lowerNormalVal = 97;
	private double UpperNormalVal = 98.6;
	
	public Temperature(double reading) { // constructor
		this.reading = reading;
	}
	
	public double getReading() {
		return this.reading;
	}
	
	public double getLowerNormalVal() {
		return this.lowerNormalVal;
	}

	public double getUpperNormalVal() {
		return this.UpperNormalVal;
	}
	
	public String temperatureChecker() { // c
		
		if(this.reading < this.getLowerNormalVal() || this.reading >this.getUpperNormalVal())
			return "Care Needed - Body Temperature is abnormal";
		return "Normal";
	}
}

