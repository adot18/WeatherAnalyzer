package climatechange;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner; 


public class ClimateAnalyzer implements IClimateAnalyzer{
	WeatherWriter a = new WeatherWriter();
	String filename = "/Users/alexong/eclipse-workspace/cs46b_project/data/world_temp_2000-2016.csv";
	ArrayList<ITemperature> tempArrayList = a.readDataFromFile("/Users/alexong/eclipse-workspace/cs46b_project/data/world_temp_2000-2016.csv");

	
	public ClimateAnalyzer()
	{
	}
	
	@Override
	public ITemperature getLowestTempByMonth(String country, int month) {
		ITemperature min = tempArrayList.get(0);
		
		for(ITemperature x1 :  tempArrayList)
		{
			if(x1.getCountry().equals(country))
			{	
				switch(month)
				{
				case 1:
				if(x1.getMonthAvg().equals("Jan"))
				{
					if(x1.getTemperature(true) < min.getTemperature(true))
					{
						min = x1;
					}
				}
				case 2:
					if(x1.getMonthAvg().equals("Feb"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 3:
					if(x1.getMonthAvg().equals("Mar"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 4:
					if(x1.getMonthAvg().equals("Apr"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 5:
					if(x1.getMonthAvg().equals("May"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 6:
					if(x1.getMonthAvg().equals("Jun"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 7:
					if(x1.getMonthAvg().equals("Jul"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 8:
					if(x1.getMonthAvg().equals("Aug"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 9:
					if(x1.getMonthAvg().equals("Sep"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 10:
					if(x1.getMonthAvg().equals("Oct"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 11:
					if(x1.getMonthAvg().equals("Nov"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				case 12:
					if(x1.getMonthAvg().equals("Dec"))
					{
						if(x1.getTemperature(true) < min.getTemperature(true))
						{
							min = x1;
						}
					}
				
				}
			
				
			}
			
			
		}
		return min;
		
	
		
	
	}

	@Override
	public ITemperature getHighestTempByMonth(String country, int month) {
		ITemperature max = tempArrayList.get(0);
		
		for(ITemperature x1 :  tempArrayList)
		{
			if(x1.getCountry().equals(country))
			{	
				switch(month)
				{
				case 1:
				if(x1.getMonthAvg().equals("Jan"))
				{
					if(x1.getTemperature(true) > max.getTemperature(true))
					{
						max = x1;
					}
				}
				case 2:
					if(x1.getMonthAvg().equals("Feb"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 3:
					if(x1.getMonthAvg().equals("Mar"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 4:
					if(x1.getMonthAvg().equals("Apr"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 5:
					if(x1.getMonthAvg().equals("May"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 6:
					if(x1.getMonthAvg().equals("Jun"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 7:
					if(x1.getMonthAvg().equals("Jul"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 8:
					if(x1.getMonthAvg().equals("Aug"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 9:
					if(x1.getMonthAvg().equals("Sep"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 10:
					if(x1.getMonthAvg().equals("Oct"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 11:
					if(x1.getMonthAvg().equals("Nov"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				case 12:
					if(x1.getMonthAvg().equals("Dec"))
					{
						if(x1.getTemperature(true) > max.getTemperature(true))
						{
							max = x1;
						}
					}
				
				}
			
				
			}
			
			
		}
		return max;
	}

	@Override
	public ITemperature getLowestTempByYear(String country, int year) {
		ITemperature minYear = tempArrayList.get(0);
		
		for(ITemperature x1 :  tempArrayList)
		{
			if(x1.getCountry().equals(country))
			{	
				switch(year)
				{
				case 2000:
				if(x1.getYear() == 2000)
				{
					if(x1.getTemperature(true) < minYear.getTemperature(true))
					{
						minYear = x1;
					}
				}
				case 2001:
					if(x1.getYear() == 2001)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2002:
					if(x1.getYear() == 2002)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2003:
					if(x1.getYear() == 2003)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2004:
					if(x1.getYear()==2004)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2005:
					if(x1.getYear() == 2005)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2006:
					if(x1.getYear() == 2006)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2007:
					if(x1.getYear() == 2007)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2008:
					if(x1.getYear() == 2008)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2009:
					if(x1.getYear() == 2009)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2010:
					if(x1.getYear() == 2010)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2011:
					if(x1.getYear() == 2011)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2012:
					if(x1.getYear() == 2012)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2013:
					if(x1.getYear() == 2013)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2014:
					if(x1.getYear() == 2014)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2015:
					if(x1.getYear() == 2015)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				case 2016:
					if(x1.getYear() == 2016)
					{
						if(x1.getTemperature(true) < minYear.getTemperature(true))
						{
							minYear = x1;
						}
					}
				
				}
			
				
			}
			
			
		}
		return minYear;
	}

	@Override
	public ITemperature getHighestTempByYear(String country, int year) {
		ITemperature maxYear = tempArrayList.get(0);
		
		for(ITemperature x1 :  tempArrayList)
		{
			if(x1.getCountry().equals(country))
			{	
				switch(year)
				{
				case 2000:
				if(x1.getYear() == 2000)
				{
					if(x1.getTemperature(true) > maxYear.getTemperature(true))
					{
						maxYear = x1;
					}
				}
				case 2001:
					if(x1.getYear() == 2001)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2002:
					if(x1.getYear() == 2002)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2003:
					if(x1.getYear() == 2003)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2004:
					if(x1.getYear()==2004)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2005:
					if(x1.getYear() == 2005)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2006:
					if(x1.getYear() == 2006)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2007:
					if(x1.getYear() == 2007)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2008:
					if(x1.getYear() == 2008)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2009:
					if(x1.getYear() == 2009)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2010:
					if(x1.getYear() == 2010)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2011:
					if(x1.getYear() == 2011)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2012:
					if(x1.getYear() == 2012)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2013:
					if(x1.getYear() == 2013)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2014:
					if(x1.getYear() == 2014)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2015:
					if(x1.getYear() == 2015)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				case 2016:
					if(x1.getYear() == 2016)
					{
						if(x1.getTemperature(true) > maxYear.getTemperature(true))
						{
							maxYear = x1;
						}
					}
				
				}
			
				
			}
			
			
		}
		return maxYear;
	}

	@Override
	public TreeSet<ITemperature> getTempWithinRange(String country, double rangeLowTemp, double rangeHighTemp) {
		
		TreeSet<Temp> tempRange = new TreeSet<Temp>();
		TreeSet<ITemperature> sortedTempRange = new TreeSet<ITemperature>();
		
		for(ITemperature s: tempArrayList)
		{
			if(s.getCountry().equals(country))
			{
				if(s.getTemperature(false)>rangeLowTemp && s.getTemperature(false)<rangeHighTemp)
				{
					tempRange.add((Temp) s);
				}
			}
				
		}
		for(Temp a : tempRange)
		{
			sortedTempRange.add(a);
		}
	
		return sortedTempRange;
		
	}
		
	
	


	@Override
	public ITemperature getLowestTempYearByCountry(String country) {
		ITemperature lowestTempObj = tempArrayList.get(0);
		Double lowestTemp = tempArrayList.get(0).getTemperature(true);
		for(ITemperature a : tempArrayList)
		{
			if(a.getCountry().equals(country))
			{
				if(a.getTemperature(true) < lowestTemp)
				{
					lowestTempObj = a;
				}
			}
		}
		return lowestTempObj;
	}

	
	@Override
	public ArrayList<ITemperature> allCountriesGetTop10LowestTemp(int month) {
		TreeSet<Temp> lowest10TempinMonth = new TreeSet<Temp>();
		ArrayList<ITemperature> lowTemps = new ArrayList<ITemperature>();
		ArrayList<String> country = countryRoad();
		ArrayList<ITemperature> sorted10LowestTemp = new ArrayList<ITemperature>();
		
		for(String a : country)
		{
			lowTemps.add(getLowestTempByMonth(a, month));
		}
		
			{
		for(ITemperature x1 :  lowTemps)
		{
				switch(month)
				{
				case 1:
				{
					if(x1.getMonthAvg().equals("Jan"))
						{
						lowest10TempinMonth.add((Temp) x1);
						}
				}
				case 2:
				{
					if(x1.getMonthAvg().equals("Feb"))
						{
						lowest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 3:
				{
					if(x1.getMonthAvg().equals("Mar"))
						{
						lowest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 4:
				{
					if(x1.getMonthAvg().equals("Apr"))
							{
						lowest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 5:
				{
					if(x1.getMonthAvg().equals("May"))
							{
						lowest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 6:
				{
					if(x1.getMonthAvg().equals("Jun"))
						{
						lowest10TempinMonth.add((Temp) x1);
						}
				}

				case 7:
				{
					if(x1.getMonthAvg().equals("Jul"))
							{
						lowest10TempinMonth.add((Temp) x1);

					
						}
				}

				case 8:
	
				{
					if(x1.getMonthAvg().equals("Aug"))
							{
						lowest10TempinMonth.add((Temp) x1);
						}
				}
						
				case 9:
				{
					if(x1.getMonthAvg().equals("Sep"))
							{

						lowest10TempinMonth.add((Temp) x1);

						}
				}
					
				case 10:
				{
					if(x1.getMonthAvg().equals("Oct"))
							{

						lowest10TempinMonth.add((Temp) x1);

						}
				}
					
				case 11:
				{
					if(x1.getMonthAvg().equals("Nov"))
							{

						lowest10TempinMonth.add((Temp) x1);

						}
				}
			
				case 12:
					
				{
					if(x1.getMonthAvg().equals("Dec"))
						{
						lowest10TempinMonth.add((Temp) x1);
						}
				}
				
			
				
			}
			
			
		}
		Iterator<Temp> iterator = lowest10TempinMonth.iterator();
		
	for(int i = 0; i < 10; i++)
	{
		sorted10LowestTemp.add(iterator.next());
	}
		
		return sorted10LowestTemp;
	}
		
		
	}

	

	@Override  //FIX
	public ArrayList<ITemperature> allCountriesGetTop10HighestTemp(int month) {
		TreeSet<Temp> highest10TempinMonth = new TreeSet<Temp>();
		ArrayList<String> country = countryRoad();
		ArrayList<ITemperature> transfer = new ArrayList<ITemperature>();
		ArrayList<ITemperature> sorted = new ArrayList<ITemperature>();
		for(String a : country)
		{
			transfer.add(getHighestTempByMonth(a, month));
		}
			{
		for(ITemperature x1 :  transfer)
		{
				switch(month)
				{
				case 1:
				{
					if(x1.getMonthAvg().equals("Jan"))
						{
						highest10TempinMonth.add((Temp) x1);
						}
				}
				case 2:
				{
					if(x1.getMonthAvg().equals("Feb"))
						{
						highest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 3:
				{
					if(x1.getMonthAvg().equals("Mar"))
						{
						highest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 4:
				{
					if(x1.getMonthAvg().equals("Apr"))
							{
						highest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 5:
				{
					if(x1.getMonthAvg().equals("May"))
							{
						highest10TempinMonth.add((Temp) x1);
						}
				}
					
				case 6:
				{
					if(x1.getMonthAvg().equals("Jun"))
						{
						highest10TempinMonth.add((Temp) x1);
						}
				}

				case 7:
				{
					if(x1.getMonthAvg().equals("Jul"))
							{
						highest10TempinMonth.add((Temp) x1);

						}
				}

				case 8:
	
				{
					if(x1.getMonthAvg().equals("Aug"))
							{
						highest10TempinMonth.add((Temp) x1);
						}
				}
						
				case 9:
				{
					if(x1.getMonthAvg().equals("Sep"))
							{

						highest10TempinMonth.add((Temp) x1);

						}
				}
					
				case 10:
				{
					if(x1.getMonthAvg().equals("Oct"))
							{

						highest10TempinMonth.add((Temp) x1);

						}
				}
					
				case 11:
				{
					if(x1.getMonthAvg().equals("Nov"))
							{

						highest10TempinMonth.add((Temp) x1);

						}
				}
			
				case 12:
					
				{
					if(x1.getMonthAvg().equals("Dec"))
						{
						highest10TempinMonth.add((Temp) x1);
						}
				}
				
				
			
				
			}
			
			
		}
		
		
		
		for(Temp a : highest10TempinMonth)	
		{
		transfer.add(a);
		}
			
		for(int i = 10; i> 0; i--)
		{
			sorted.add(transfer.get(transfer.size()-i));
		}
			
		return sorted;
		}
	}
	 

	

	@Override 
	public ArrayList<ITemperature> allCountriesGetTop10LowestTemp() {
		TreeSet<Temp> lowest10Temps = new TreeSet<Temp>();
		ArrayList<ITemperature> holder = new ArrayList<ITemperature>();
		ArrayList<ITemperature> sorted = new ArrayList<ITemperature>();
		ArrayList<String> country = countryRoad();
		for(String a : country)
		{
			holder.add(getLowestTempYearByCountry(a));
		}
		
		for(ITemperature p: holder)
		{
			lowest10Temps.add((Temp) p);
		}

	Iterator<Temp> iterator = lowest10Temps.iterator();
	
	for(int i = 0; i < 10; i++)
	{
		sorted.add(iterator.next());
	}
	return sorted;	
	}

	@Override //FIX
	public ArrayList<ITemperature> allCountriesGetTop10HighestTemp() {
		TreeSet<Temp> highest10Temps = new TreeSet<Temp>();
		ArrayList<ITemperature> holder = new ArrayList<ITemperature>();
		ArrayList<ITemperature> sorted = new ArrayList<ITemperature>();
		ArrayList<String> country = countryRoad();
		for(String l : country)
		{
			holder.add(getLowestTempYearByCountry(l));
		}
		
	for(ITemperature a : holder)
	{
		highest10Temps.add((Temp) a);
	}
	for(ITemperature f : highest10Temps)
	{
		holder.add(f);
	}
	
	for(int i = 10; i> 0; i--)
	{
		sorted.add(holder.get(holder.size()-i));
	}
		
	return sorted;
}


	@Override
	public ArrayList<ITemperature> allCountriesGetAllDataWithinTempRange(double lowRangeTemp, double highRangeTemp) {
	
		TreeSet<Temp> tempRange = new TreeSet<Temp>();
		ArrayList<ITemperature> sortedTempRange = new ArrayList<ITemperature>();
		

		
		for(ITemperature s: tempArrayList)
		{
			
				if(s.getTemperature(true)>lowRangeTemp && s.getTemperature(true)<highRangeTemp)
				{
					tempRange.add((Temp) s);
				}
				
		}
		for(Temp a : tempRange)
		{
			sortedTempRange.add(a);
		}
	
		return sortedTempRange;
		
	}
	

	@Override
	public ArrayList<ITemperature> allCountriesTop10TempDelta(int month, int year1, int year2) {

	TreeSet<Temp> allCountriesTop10 = new TreeSet<Temp>();
	ArrayList<ITemperature> holder = new ArrayList<ITemperature>();
	ArrayList<ITemperature> finalArray = new ArrayList<ITemperature>();
	
	for(ITemperature x : tempArrayList)
	{
		Temp p = (Temp)x;
		Integer currentMonth = p.convertMonth(x.getMonthAvg());
		Integer currentYear = p.getYear();
		
		if((currentMonth == month) && (currentYear == year1 || currentYear == year2))	
		{
			holder.add(p);

		}
	}
	
	for(int i = 0; i < holder.size(); i++)
		{
		ITemperature currentVal = holder.get(i);
		holder.remove(i);
		String countryCur = currentVal.getCountry();
		String codeCur = currentVal.getCountry3LetterCode();
		String monthCur = currentVal.getMonthAvg();
		
		ITemperature foundIt = null;
		
		for(int o = 0; o < holder.size(); o++)
		{
			ITemperature u = holder.get(o);
			
			if(countryCur.equals(holder.get(o).getCountry()))
					{
				
					foundIt = u;
					break;
				}
			
		}
		
		if(foundIt != null)
		{
			double currTemp = currentVal.getTemperature(true);
			double matchTemp =  foundIt.getTemperature(true);
			double diffTemp = Math.abs(currTemp - matchTemp);
			
			int currentYear = currentVal.getYear();
			int matchYear = foundIt.getYear();
			int diffYear = Math.abs(currentYear - matchYear);
			
			Temp deltaTemp = new Temp(diffTemp, diffYear, monthCur, countryCur, codeCur);
			allCountriesTop10.add(deltaTemp);
			
		}
		
	}
	
	Iterator<Temp> iterator = allCountriesTop10.iterator();
	
	for(int i = 0; i < 10; i++)
	{
		finalArray.add(iterator.next());
		
	}
	for(ITemperature x: tempArrayList)
	{
		System.out.print(x.getMonthAvg());
	}
	
	return finalArray;	
	
}
		
	
	


	

	
	public ArrayList<String> countryRoad() //Gets the country names
	{
		ArrayList<String> countries = new ArrayList<>();
		for(ITemperature a : tempArrayList)
		{
			countries.add(a.getCountry());
		}
		return countries;
	}
	
	public ArrayList<Integer> months()
	{
		ArrayList<Integer> months = new ArrayList<>();
		for(int i = 0; i < 13; i++)
		{
			months.add(i);
		}
		return months;
	}
	
	public ArrayList<Integer> year()
	{
		ArrayList<Integer> year = new ArrayList<>();
		for(int i = 2000; i < 2017; i++)
		{
			year.add(i);
		}
		return year;
	}
	

	
	@Override
	public void runClimateAnalyzer() {
		
		ArrayList<String> countryGood = countryRoad();
	
		ArrayList<Integer> monthGood = months();
		
		ArrayList<Integer> yearGood = year();
		
		ArrayList<ITemperature> holdThat = new ArrayList <ITemperature>();
		
		String country = null;
		Integer month = 0;
	
	
		
		
		Scanner in = new Scanner(System.in);		
		//Task A1 Low
			System.out.println("Task A1 is staring. Input a country: ");
			country = in.next();
			System.out.println("Task A1 continued. Input a month: ");
			month = in.nextInt();
		while(!countryGood.contains(country) && !monthGood.contains(month))
		{
			System.out.println("Invalid country and/or month. Please put a valid country: ");
			country = in.nextLine();
			System.out.println("Please put a valid month: ");
			month = in.nextInt();

			if(countryGood.contains(country) && monthGood.contains(month))
			{
				break;
			}
		}
		
		//Task A1 Low output
				String topicLow = "Task A1: Lowest Temperature for " + country + " for the Month " + monthGood.get(month);
				holdThat.add(getLowestTempByMonth(country, month));
				a.writeDataToFile("file", topicLow , holdThat);  //a is the WeatherWriter object used to call this method
				holdThat.clear();
				;
				
		//Task A1 High output 
				String topicHigh = "Task A1: Highest Temperature for " + country + " for the Month " + monthGood.get(month);
				holdThat.add(getHighestTempByMonth(country, month));
				a.writeDataToFile("file", topicHigh, holdThat); //String type filename, String type topic, ArrayList<ITemperature> input
				holdThat.clear(); //Resets the temporary arraylist that holds the objects
				
	
		in.close();
		//Task A2 Lowest
				/*
				System.out.println("Task A2 lowest temperature is beginning now. Input a country: ");
				country = in.nextLine();
				System.out.println("Task A2 requires a year as well: ");
				year = in.nextInt();
				while(!countryGood.contains(country) && !yearGood.contains(year))
				{
					System.out.println("Invalid country and/or year. Please put a valid country: ");
					country = in.nextLine();
					System.out.println("Please put a valid year: ");
					year = in.nextInt();
					
				}
				String topicA2Low = "Task A1: Highest Temperature for " + country + " for the Month " + monthGood.get(month); */
				
				
				
				
				
		
		
		
		
	}



	

	}



	

	


