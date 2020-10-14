package climatechange;

import java.util.ArrayList;

public class tester {
	public static void main (String[] args)
	{
		WeatherWriter a = new WeatherWriter();
		
		
		ArrayList<ITemperature> c = a.readDataFromFile("/Users/alexong/eclipse-workspace/cs46b_project/data/world_temp_2000-2016.csv");
		/*for(ITemperature x: c)
		{
			System.out.println(x.getYear());
		}*/
		//System.out.println(c.get(0).getTemperature(false));
		//System.out.println(c.get(1).getTemperature(true));
		
		ClimateAnalyzer x = new ClimateAnalyzer();
	x.runClimateAnalyzer();
	/*
		System.out.println(x.getHighestTempByMonth("Afghanistan", 5));
		System.out.println(x.allCountriesGetAllDataWithinTempRange(0, 5).get(0));
		System.out.println(x.allCountriesGetAllDataWithinTempRange(0, 5).get(1));*/
		//System.out.println(x.allCountriesGetAllDataWithinTempRange(0, 5).get(2));
	//	System.out.println(x.allCountriesTop10TempDelta(11, 2000, 2006).get(1).getTemperature(true));
		//System.out.println(x.allCountriesTop10TempDelta(9, 2000, 2006).get(8).getTemperature(true));
		//System.out.println(x.allCountriesTop10TempDelta(12, 2000, 2006).get(9).getTemperature(true));
	 /*System.out.println(x.allCountriesGetTop10LowestTemp(1).get(1).getTemperature(true));
		System.out.println(x.allCountriesGetTop10LowestTemp(1).get(2).getTemperature(true));
		System.out.println(x.allCountriesGetTop10LowestTemp(1).get(3).getCountry());
		System.out.println(x.allCountriesGetTop10LowestTemp(1).get(4).getCountry());
		System.out.println(x.allCountriesGetTop10LowestTemp(1).get(5).getCountry());
		System.out.println(x.allCountriesGetTop10LowestTemp(1).get(6).getCountry());
		System.out.println(x.allCountriesGetTop10LowestTemp(1).get(7).getCountry());
		System.out.println(x.allCountriesGetTop10LowestTemp(1).get(8).getCountry()); */
		//System.out.println(x.getTempWithinRange("Afghanistan", -.5, 5).first().getTemperature(false));
		//System.out.println(x.getTempWithinRange("Afghanistan", -.5, 5).last().getTemperature(false));
		//System.out.println(x.allCountriesGetTop10LowestTemp().get(0).getTemperature(true));
		//System.out.println(x.allCountriesGetTop10LowestTemp().get(9).getTemperature(true));
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(0).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(1).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(2).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(3).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(4).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(5).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(6).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(7).getTemperature(true));	
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(8).getTemperature(true));
		//System.out.println(x.allCountriesGetTop10HighestTemp().get(9).getTemperature(true));	
	}
}
