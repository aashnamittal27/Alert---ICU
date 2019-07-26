import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class AppRunner {
	public static void main(String[] args) { // to do json 
		// TO DO -- > IF we give unexpected values for values it throws exception  TRY catch ### 
		
 		String monitorInput;
		boolean startApp = true;
		int exitStatus;
		JSONObject jo = null;
		
		Scanner s = new Scanner(System.in);
		while(startApp == true) {
			
			monitorInput = s.nextLine();
			Object obj = null;
			try {
				obj = new JSONParser().parse(monitorInput);
				jo = (JSONObject) obj; 
			} 
			catch (ParseException e) {
				System.out.println("Unexpected Error occured while parsing Input, make sure valid value is entered");
			}

			exitStatus = parseMonitorInput(jo) ? 1 : 0;
	
			startApp = s.nextBoolean();
			
		}
		// { "patient id": "TRJIW432", "SPO2": 96, "pulse rate": 75, "temperature": 98.6 }
		// { "patient id": "TRJI$432", "SPO2": 96, "pulse rate": 75, "temperature": 98.6 }
		// { "patient id": "TRJIW432", "SPO2": 6, "pulse rate": 75, "temperature": 98.6 }
		// { "patient id": "TRJIW432", "SPO2": 96, "pulse rate": 29, "temperature": 98.6 }
		// { "patient id": "TRJIW432", "SPO2": 96, "pulse rate": 75, "temperature": 90.6 }
		// { "patient id": "TRJIW432", "SPO2": 96, "pulse rate": 75, "temperature": . }
		// { "patient id": "TRJIW432", "SPO2": 96, "pulse rate": 75, "temperature": @ }
		// { "patient id": "TRJIW432", "SPO2": 96, "pulse rate": -, "temperature": 98.6 }

	}
	
	// validate INPUTS	
	public static boolean parseMonitorInput(JSONObject jo) {

		String patientID = (String) jo.get("patient id");
		
		System.out.println();		

		int pulseRate = 0;
		try
		{
			pulseRate = Integer.parseInt(jo.get("pulse rate").toString());
		} 
		catch(NumberFormatException e) 
		{
			  // handle here	
		}
		catch(NullPointerException ex) {
			System.out.println("pulse rate value does not exist");
		}
			
		double spo2 =  0.0;
		try {
			spo2 = Double.parseDouble(jo.get("SPO2").toString());
		}
		catch(NullPointerException ex) {
			System.out.println("SPO2 value was not entered");
		}
		
		double temperature = 0.0;
		
		try {
			temperature = Double.parseDouble(jo.get("temperature").toString());
		}
		catch(NullPointerException e) {
			System.out.println("Temperature value not entered");
		}

		if(validateMonitorInput(patientID, pulseRate, spo2, temperature)){ //
			Patient patientObj = new Patient(patientID, temperature, spo2, pulseRate);
			return true;
		}	
		else {
			return false;
		}
	}
	
	
	public static boolean validateMonitorInput(String patientID, int pulseRate, double spo2, double temperature ) {
		
		if(pulseRate < 30 || pulseRate > 254) { //detect type of temperature int  ## 
			System.out.println("Undetectable pulse Rate");

			return false;
		}
		else if(spo2 > 100 || spo2 < 70) {//detect type of spo2 int o float
			System.out.println("Undetectable SPO2 levels");
			return false;
		}
		else if(temperature < 93 || temperature > 108) { //detect type of temperature int o float
			System.out.println("Undetectable temperature levels");
			return false;
		}
		else if(patientID == null || !patientID.matches("^[a-zA-Z0-9]*$")) {
			System.out.println(patientID);
			System.out.println("Inappropriate symbols in patientID");
			return false;
		}
			
		return true;
		
	} 
	// 1. parse string and call validate
	// 2. make object 
	// 3. checker that calls all checker functions of classes
	// 4. compiles checker output
	
}
