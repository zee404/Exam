package lab;
	
	import java.time.LocalDate;
	import java.time.ZoneId;
	import java.util.Date;
	public class Lab {
	static Date today = new Date();
	/**
	 * This method converts fahrenheit temperature to Centrigrade
	 * @author zeeshan
	 * @param fahrenheit takes the value of fahrnheit as input 
	 * @return outputs centigrade temperature 
	 * */
	public static int fahrenheitToCentigrade(int fahrenheit) {
	return (fahrenheit - 32) * 5 / 9;
	}
	
	/**
	 * This method converts centigrade temperature to fahrnheit
	 * @author zeeshan
	 * @param centigrade takes the value of centigrade as input 
	 * @return outputs fahrenheit temperature 
	 * */
	public static int centigradeToFahrenheit(int centigrade) {
	return centigrade * 9 / 5 + 32;
	}
	/**
	 * This method remove sign of exclimation
	 * @author zeeshan
	 * @param in takes the value of String as input 
	 * @return outputs string without sign 
	 * */
	public static String removeSignOfExclaimation(String in){
	if(in==null||in.length()==0)
	return in;
	return in.replaceAll("!", "");
	}
	/**
	 * This method get current day 
	 * @author zeeshan
 
	 * @return outputs the day
	 * */
	public static int getCurrentDay(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getDayOfMonth();
	}
	/**
	 * This method get current month 
	 * @author zeeshan
	 * @return outputs the month
	 * */
	public static int getCurrentMonth(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getMonthValue();
	}
	/**
	 * This method get current year 
	 * @author zeeshan
	 * @return outputs the year
	 * */
	public static int getCurrentYear(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getYear();
	}

}
