package numbers;
import java.text.NumberFormat;
import java.util.Random;
public class NumberUtility {
	public static void main(String[] args){

	
	
		System.out.println(newPercent(.5052525252));
		System.out.println(newPercent(.5052525252,4));
		
		System.out.println(newCurrency(11.5753222));
		System.out.println(newCurrency(11.5753222,3));
		
		System.out.println(newDecimal(15324.25321));
		System.out.println(newDecimal(15324.25321,3));
		print(newRandom(3,9));
		print(newRandom(3.4,8.2));
		print(newMin(4,8));
		print(newMax(4,8));
		print(newMin(4.1,8.9));
		print(newMax(3.4,8.2));

		
		
		
		
	}
	//number formatted as a percentage
	public static String newPercent(double inNumber)
	{
		return newPercent(inNumber,2);
	}
	
	public static String newPercent(double inNumber, int places)
	{
		

		NumberFormat percent=NumberFormat.getPercentInstance();
		
		
		percent.setMaximumFractionDigits(places);
		String NumOut=percent.format(inNumber);
		return NumOut;
	}
	
	
	
	//number formatted as currency
	public static String newCurrency(double price)
	{
		return newCurrency(price,2);
		
	}
	
	public static String newCurrency(double price,int digLength)
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(digLength);
		String NumOut = currency.format(price);
		return NumOut;
		
	}
	public static String newDecimal(double miles)
	{
		return newDecimal(miles,2);
	}
	public static String newDecimal(double miles, int digLength)
	{
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(digLength);
		return number.format(miles);
	}
	public static String newRandom(int low, int high)
	{
		Random random = new Random();
	
		Integer number= low + random.nextInt(high-low+1);
		String value = String.valueOf(number);
		return value.toString();
		
	}
	
	public static String newRandom(double low, double high)
	{
		Random random = new Random();
	
		double number= low + (high - low) * random.nextDouble();
		String value = String.valueOf(number);
		return value.toString();
		
	}
	
	public static String newMin(int inNum1, int inNum2){
	Integer smaller = Math.min(inNum1, inNum2);
	return smaller.toString();
	}
	public static String newMax(int inNum1, int inNum2){
	Integer smaller = Math.max(inNum1, inNum2);
	return smaller.toString();
	}
	
	public static String newMin(double inNum1, double inNum2){
	Double smaller = Math.min(inNum1, inNum2);
	return smaller.toString();
	}
	
	public static String newMax(double inNum1, double inNum2){
	Double larger = Math.max(inNum1, inNum2);
	return larger.toString();
	}
	public static void print(String s)
	{
		System.out.println(s);
	}
}
