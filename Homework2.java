// AbigailForman
/*
 * First and Last Names
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
	 private String homework2;
	 public Homework2(String args){
		 homework2 = args;
	 }





	/* Write the method uppercase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */
	 //This is some code
	 public String uppercase() {
		 return homework2.toUpperCase();
	 }



	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */
	 public String strip(String args) {
		 args = args.replace(" ", "");
		 args = args.replace("!", "");
		 args = args.replace(".", "");
		 args = args.replace(",", "");
		 return args;
	 }
	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle (5, 10, 15, 20);
		double width = new Rectangle(5, 10, 15, 20).getWidth();
		Rectangle r2 = new Rectangle(5, 10, 15, 20);
		r2.translate(10, 11);
		Rectangle r3 = new Rectangle(5, 10, 15, 20);
		r3.translate(10,11);
		return r3;
	}











	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
		double width = rect.getWidth();
		double height = rect.getHeight();
		double perimeter = width + height;
		return 2*perimeter;
	}

}
