/* Small program to practice the use of setters and getters
 * this will allow a user to set a time, and then have that time returned 
 */

package time;
 

public class TimeTester {

	// Adding main method
	public static void main( String[] args) {
		
		Time time = new Time();
		
		time.setHour( 12);
		time.setMinute( 36);
		time.setSecond( 01);
		
		time.showTime();
		
	} // Closing main method
} // Closing TimeMain class
