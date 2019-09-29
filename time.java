/* Small program to practice the use of setters and getters
 * this will allow a user to set a time, and then have that time returned 
 */

package time;

public class Time {

	// Defining class fields
	private int hours;
	private int minutes;
	private int seconds;
	
	// Adding a showTime method
	public void showTime() {
		
		System.out.println( "time is: "+ hours +":"+ minutes +":"+ seconds);
		
	} // Closing showTime method
	
	
	// Adding set/get methods for hours class fields
	public void setHour( int hour) {
		hours = hour;
	}
	
	// Adding getter methods
	public int getHour() {
		return hours;
	
	}
	
	
	// Adding set/get methods for minutes class field
	public void setMinute( int min) {
		minutes = min;
		
	}
	
	public int getMinute() {
		return minutes;
		
	}
	
	
	// Adding get/set methods for seconds class field
	public void setSecond( int sec) {
		seconds = sec;
		
	}
	
	public int getSecond() {
		return seconds;
		
	}
} // Closing time class
