package climatechange;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;



public class WeatherWriter implements IWeatherIO {
	
	public String header;
	public PrintWriter printWrite;
	public FileWriter before;
	
	public ArrayList<ITemperature> readDataFromFile(String fileName)
	{
		
		ArrayList<ITemperature> tempArrayList = new ArrayList<ITemperature>();
		
		try 
		{
		Scanner br = new Scanner(new FileReader(fileName));
		header = br.nextLine();
		
		while(br.hasNextLine())
		{
		String readData = br.nextLine();				//Reads next line
		String[] array = readData.split(", ");		// Splits by , and a space
		
		Double temp = Double.parseDouble(array[0]); //Convert from String to double for temp
		int year = Integer.parseInt(array[1]);	//Convert from String to int for year
		String monthAvg = array[2];	//Initialize for the next 3
		String country = array[3];
		String tresLetter = array[4];
		
		Temp a = new Temp(temp, year, monthAvg, country, tresLetter); //Constructs a temp object which can be added as a ITemperature Object due to inheritance
		tempArrayList.add(a);
		}
		
		br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tempArrayList;
		
		
		
		// read all data from the weather data file
	}
	
	public void writeSubjectHeaderInFile(String filename, String subject)
	{
	
			try {
				printWrite = new PrintWriter(filename);
				printWrite.println(subject);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	// 1. write the subject header before dumping data returned from each ClimateAnalyzer method // 2. a subject header is to be written for each ClimateAnalyzer method call
	public void writeDataToFile(String filename, String topic, ArrayList<ITemperature> theWeatherList) 
	{
		try
		{
		String[] sepTopic = topic.split(" ");
		String xx = sepTopic[1]; 
		String taskNum = xx.substring(0, 2);  //Gives me the task number
		String taskFileName = "data/task" + taskNum + "_climate_info.csv";
		
		File check = new File(taskFileName);
		
	
		if(check.exists())
		{
			before = new FileWriter(taskFileName, true);
			printWrite = new PrintWriter(before);
		
		}
		
		else
		{
		
			printWrite = new PrintWriter(taskFileName);	
		

		}
		
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		printWrite.println(topic);
	
		this.writeSubjectHeaderInFile(filename, topic);
		
		
		for (ITemperature x: theWeatherList)
		{

			Temp currentInfo = (Temp)x;
			
			int year = currentInfo.getYear();
			
			String month = currentInfo.getMonthAvg();
			String country = currentInfo.getCountry();
			String monthCode = currentInfo.getCountry3LetterCode();

			double cTemperature = currentInfo.getTemperature(false);
			double fTemperature = currentInfo.getTemperature(true);
			printWrite.printf("%2f", cTemperature);
			printWrite.print("(C) ");
			printWrite.printf("%2f", fTemperature);
			printWrite.print("(F), ");
			printWrite.print(year + ", ");
			printWrite.print(month + ", ");
			printWrite.print(country + ", ");
			printWrite.print(monthCode + ", ");
			printWrite.println();
		
			
		}
		
		
		printWrite.close();	
	
	}
	
}
	// 1. file name should be called “taskXX_climate_info.csv” where XX will be replaced by the task id: A1, A2, etc // 2. use this method to store the temperature info (for each Climate Analyzer task)
	// a) one row for each temperature data object (i.e. all fields in one row (each comma delimited) )
	// b) similar to the original input data file)
	// 3. temperature value should be formatted to use a maximum of 2 decimal places
	// 4. temperature field should also show the Fahrenheit value (using decimal rules above) // a) the temperature field should look like i.e. 21.34(C) 70.42(F)



