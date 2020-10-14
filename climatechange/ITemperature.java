package climatechange;

public interface ITemperature {
	public String getCountry(); //gets name of country
	public String getCountry3LetterCode(); //gets 3 letter code of country
	public int getYear(); // get the year
	public double getTemperature(boolean getFahrenheit); // get temperature; input parameter of false = return Celsius value)
	public String getMonthAvg();//Month avg
}
