package numbers;
import java.text.NumberFormat;
import java.util.Random;
public class DateUtility {
	public static void main(String[] args){

		print(toString(2,3,1994,"/"));
		print(String.valueOf(getLastDayOfMonth(2,2017)));
		print(String.valueOf(getLastDayOfMonth(8,2020)));
		print(String.valueOf(getLastDayOfMonth(2,2020)));
		print(String.valueOf(isLeapYear(2015)));
		print(String.valueOf(isLeapYear(2004)));
		print(String.valueOf(isLeapYear(2100)));
		
	}
	
	
	public static String toString(int month, int day, int year, String delimiter){
		return String.format("%02d", month)+(delimiter)+String.format("%02d", day)+(delimiter)+String.format("%02d", year);
	}
	
	
	public static int getLastDayOfMonth(int month, int year){
		if(month==2){
			if (isLeapYear(year)){
				return 29;
			}
			else{
				return 28;
			}
			
		}
		else{
			if (month==4){
				return 30;
			}
			else if (month ==6){
				return 30;
			}
			else if (month ==9){
				return 30;
			}
			else if (month ==11){
				return 30;
			}
			else{
				return 31;
			}
		}
		
	}
	
	public static boolean isLeapYear(int year){
		//returns t/f if the year is a leap year
		// leap years are all years divisible by 4 but not 100
		// years that are divisible by 400 are leap years, too
		// is it divisible by 4?
		// Note that the year is not passed as an argument. It could be but 
		// I choose to use the class level private variable for my method.
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		// is it divisible by 4 and not 100
		bLeapYear = bLeapYear && (year % 100 != 0);
		// is it divisible by 4 and not 100 unless it's divisible by 400
		bLeapYear = bLeapYear || (year % 400 == 0);
		return bLeapYear;
		}
	
	
	public static void print(String s)
	{
		System.out.println(s);
	}
}
