package Date;
/**
 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved. 
 * Any redistribution or reproduction of part or all of the contents in any form is 
 * prohibited without the express consent of CyberTek.
 */

import java.util.Calendar;

public class Date implements Comparable<Date>{

	private static final int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	protected final int month;
	protected final int day;
	protected final int year;

	/*
	 * Initialized a new date from the month, day and year.
	 * @param month the month (between 1 and 12)
	 * @param day the day (between 1 and 28-31, depending on the month)
	 * @param year the year
	 
	 */

	public Date(int month, int day, int year){
		if(!isValid(month, day, year)){
			System.out.println("Invalid Date");
			throw new IllegalArgumentException();
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/*
	 * @return month of that month
	 */
	public int getMonth(){
		return this.month;
	}

	/*
	 * @return day of that day
	 */
	public int getDay(){
		return this.day;
	}

	/*
	 * @return year of that year
	 */
	public int getYear(){
		return this.year;
	}

	/**
	 * This method checks if a given date is a valid calendar date
	 * 
	 * @param m  month
	 * @param d  day
	 * @param y  year. (A year is no less than 1900, and no greater than 2100)
	 * @return  true if the given date is a valid calendar date. false otherwise
	 */
	public static boolean isValid(int m, int d, int y){
		//TO DO
		return (m>0&&m<13)&&(d>0&&d<32)&&(y>1899&&y<2101);
	}

	
	/** 
	 * @param year
	 * @return true if the given year is a leap year. false otherwise.
	 */
	public static boolean isLeapYear(int year){
		//TO DO
		
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	/**
	 * Compare this date to that day.
	 * @return {a negative integer or zero or a positive integer}, depending on whether this date is {before, equal to, after} that date
	 */

	public int compareTo(Date that) {
		//TO DO
		if (this.getYear()==that.getYear() && this.getMonth() <that.getMonth()) {
            return -1;
        } else if (this.getYear()==that.getYear() && this.getMonth()==that.getMonth() && this.getDay()<that.getDay()) {
            return -1;
        } else if (this.getYear()==that.getYear() && this.getMonth()==that.getMonth() && this.getDay()==that.getDay()) {
            return 0;
        } else {
            return 1;
        }
	}

	/**
	 * Return a string representation of this date.
	 * @return the string representation in the format MM/DD/YYYY
	 */
	public String toString(){
		//TO DO
		return this.month+"/"+this.day+"/"+this.year;
	}

	
	/**
	 * 
	 * @return the word representation of the date.
	 * Example: (new Date(12,1,2017)).dateToWords() returns "December One Two Thousand Seventeen" 
	 */
	public String dateToWords() {
		String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
		String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] yearWords = {"Hundred", "Thousand"};
		
		// TO DO 
		return (monthWords[this.getMonth()-1]) +" "+ (this.getDay()<20 && this.getDay()>10 ? numbersBetweenTenAndTwenty[this.getDay()-11]:
			    (this.getDay()>10?multiplesOfTen[this.getDay()/10-1]:"")+(this.getDay()%10>0?(this.getDay()>10?" ":"")+
			    numbersLessThanTen[this.getDay()%10-1]:"")) +" "+(this.getYear()/1000>0?(numbersLessThanTen[this.getYear()/1000-1]+" ")+
			    (yearWords[1]+" "):"")+((this.getYear()%1000>99?(numbersLessThanTen[(this.getYear()%1000)/100-1]+" ")+(yearWords[0]+" "):""))+
				(this.getYear()%100<20 && this.getYear()%100>10 ? numbersBetweenTenAndTwenty[this.getYear()%100-11]:
				(this.getYear()%100>0?multiplesOfTen[(this.getYear()%100)/10-1]:"")+(this.getYear()%10>0?" "+
				numbersLessThanTen[this.getYear()%10-1]+" ":" "));
	}
	
	public int age(){
	    Calendar cal = Calendar.getInstance();
	    int d = cal.get(Calendar.DAY_OF_MONTH);
	    int m = cal.get(Calendar.MONTH);		//starts from 0 to 11
	    int y = cal.get(Calendar.YEAR);
	    
	    int age = 0;
	    // TO DO
	     age= y- getYear();
	    return age;
	}


}