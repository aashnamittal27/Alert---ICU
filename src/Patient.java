
public class Patient {
	String patientID;
	PulseRate pulseRate;
	Spo2 Spo2;
	Temperature temp;
	
	public Patient(String patientID,double tempReading, double spo2Reading, int pulseRateReading ) { // constructor
		this.patientID = patientID;
		pulseRate = new PulseRate(pulseRateReading);
		Spo2 = new Spo2(spo2Reading);
		temp = new Temperature(tempReading);
	}
	
	public boolean Checker() {
		boolean spo2CheckerResult = (Spo2.Spo2Checker() == "Normal") ? true : false;
		boolean temperatureCheckerResult = (temp.temperatureChecker() == "Normal") ? true : false;
		boolean pulseRateCheckerResult = (pulseRate.pulseRateChecker() == "Normal") ? true : false;
		
		return (spo2CheckerResult && temperatureCheckerResult && pulseRateCheckerResult);
	}
}
