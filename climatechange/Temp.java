package climatechange;

public class Temp implements Comparable<ITemperature>, ITemperature{

	public String country;
	public int year;
	public double fahrenheit;
	public String threeLetterCode;
	public String monthAvg;
	
	public Temp(double fahrenheit, int year, String monthAvg, String country, String threeLetterCode)
	{
		this.fahrenheit = fahrenheit;
		this.year = year;
		this.monthAvg = monthAvg;
		this.country = country;
		this.threeLetterCode = threeLetterCode;
	}
	
	@Override
	public String getCountry() {
		
		return this.country;
	}
	@Override
	public String getMonthAvg() {
		return this.monthAvg;
	}

	@Override
	public String getCountry3LetterCode() {
		
		return this.threeLetterCode;
	}

	@Override
	public int getYear() {

		return this.year;
	}

	@Override
	public double getTemperature(boolean getFahrenheit) {
		
		if(getFahrenheit = true) 
		{
			return fahrenheit; //If temp is in Fahrenheit, then it returns fahrenhiet
		}
		else 
		{
			double celsius = (fahrenheit - 32) * (5/9); // converts fahrenheit to celsius if getFahrenheit is false
			return celsius;
		}
		
	}
	
	public int convertMonth(String x)
	{
		int convertMonth = 0;

		String month = x;

		if(month.equals("Jan"))
		{
			convertMonth = 1;
			
		}
		if(month.equals("Feb"))
		{
			convertMonth = 2;
		}
		if(month.equals("Mar"))
		{
			convertMonth = 3;
			
		}
		if(month.equals("Apr"))
		{
			convertMonth = 4;
		}
		if(month.equals("May"))
		{
			convertMonth = 5;
		}
		if(month.equals("Jun"))
		{
			convertMonth = 6;
		}
		if(month.equals("Jul"))
		{
			convertMonth = 7;
		}	
		if(month.equals("Aug"))
		{
			convertMonth = 8;
		}
		if(month.equals("Sep"))
		{
			convertMonth = 9;
		}
		if(month.equals("Oct"))
		{
			convertMonth = 10;
		}
		if(month.equals("Nov"))
		{
			convertMonth = 11;
		}
		if(month.equals("Dec"))
		{
			convertMonth = 12;
		}

		return convertMonth;
		
	}
	
	public int hashCode()
	{
		return country.hashCode() + monthAvg.hashCode() + threeLetterCode.hashCode();
	}
	
	@Override
	public boolean equals(Object x)
	{
		ITemperature temp = (ITemperature)x;
		return this.compareTo(temp) == 0;
	}
	
	@Override
	public int compareTo(ITemperature o) {		//compare by temperature, country, year, month 
	
		if(this.fahrenheit == (o.getTemperature(true))) {
			
			if(this.country.equals(o.getCountry()))
			{
				if(this.year == (o.getYear()))
				{
					if(this.monthAvg.equals(o.getMonthAvg()))
					{
						return 0;
					}
				}
			}
		} 
		else if(this.fahrenheit == (o.getTemperature(true)))
		{
			if(!this.country.equals(o.getCountry())) {
				return String.CASE_INSENSITIVE_ORDER.compare(this.country, o.getCountry());
			}
		}
		else if(this.fahrenheit == (o.getTemperature(true)))
		{
			if(this.country.equals(o.getCountry()))
			{
				if(this.year != (o.getYear()))
				{
					return Integer.compare(this.year, o.getYear());
				}
			}
		}
		else if(this.fahrenheit == (o.getTemperature(true))) {
			
			if(this.country.equals(o.getCountry()))
			{
				if(this.year == (o.getYear()))
				{
					if(!this.monthAvg.equals(o.getMonthAvg()))
					{
						return String.CASE_INSENSITIVE_ORDER.compare(this.monthAvg, o.getMonthAvg());
					}
				}
			}
		}
		
		return Double.compare(fahrenheit, o.getTemperature(true));
			
	}
	
}


