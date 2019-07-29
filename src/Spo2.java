
public class Spo2 {
	
	private double reading;
	private double upperHealthyReading = 100;
	private double upperAcceptableReading = 95;
	private double lowerAcceptableReading = 91;
	private double upperUnsafeLevelReading = 90;
	private double lowerUnsafeLevelReading = 70;
	
//	private int lowerNormalVal;
//	private int UpperNormalVal;
	
	public Spo2(double reading) { // constructor
		this.reading = reading;
	}
	
	public double getReading() {
		return this.reading;
	}

	public double getLowerNormalVal() {
		return this.lowerAcceptableReading;
	}

	public double getUpperNormalVal() {
		return this.upperAcceptableReading;
	}
	
	public String Spo2Checker() {
		
		String result = "";
		
		if(this.reading > upperAcceptableReading && this.reading < upperHealthyReading) {
			result = "Normal healthy individual spo2 level";
			System.out.println(result);
			return "Normal";
		}
		else if(this.reading > lowerAcceptableReading && this.reading < upperAcceptableReading) {
			result = "SPO2 level clinically acceptable but patient may be smoker";
			System.out.println(result);
			return "Normal";
		}
		else if(this.reading > lowerUnsafeLevelReading && this.reading < upperUnsafeLevelReading) {
			result = "Unhealthy and unsafe SPO2 level indicates Hypoxemia, ";
			System.out.println(result);
			return result;
		}
		
		return "Extreme lack of oxygen";
//		if(this.reading < this.getLowerNormalVal() || this.reading > this.getUpperNormalVal())
//			return "Care Needed - Body Temperature is abnormal";
//		return "Normal";
	}
}
