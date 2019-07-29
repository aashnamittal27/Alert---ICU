
public class Temperature {
	private double reading;
	private double lowerNormalVal = 97;
	private double upperNormalVal = 98.9;
	private double lowerAcceptableFeverReading = 99;
	private double upperAcceptableFeverReading = 100.5;
	private double lowerConcernFeverReading = 100.6;
	private double upperConcernFeverReading = 103.1;
	private double lowerHighFeverReading = 105.8;
	
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
		return this.upperNormalVal;
	}
	
	public String temperatureChecker() {
		
		String result = "";
		
		if(this.reading < lowerNormalVal) {
			result = "Unacceptably low temperature level";
			System.out.println(result);
			return result;
		}
		else if(this.reading >= lowerNormalVal && this.reading <= upperNormalVal) {
			result = "Normal body temperature";
			System.out.println(result);
			return result;
		}
		else if(this.reading >= lowerAcceptableFeverReading && this.reading <= upperAcceptableFeverReading) {
			result = "Care needed - minor fever";
			System.out.println(result);
			return result;
		}
		else if(this.reading >= lowerConcernFeverReading && this.reading <= upperConcernFeverReading) {
			result = "Extreme care needed - High Fever";
			System.out.println(result);
			return result;
		}
		else if(this.reading >= upperConcernFeverReading && this.reading <= lowerHighFeverReading) {
			result = "Critical care needed - Very High Fever";
			System.out.println(result);
			return result;
		}
		result = "Doctor supervision needed - Concern High fever level";
		System.out.println(result);
		return result;
		
		
		
		
		
//		if(this.reading < this.getLowerNormalVal() || this.reading >this.getUpperNormalVal())
//			return "Care Needed - Body Temperature is abnormal";
//		return "Normal";
		
	}
}

