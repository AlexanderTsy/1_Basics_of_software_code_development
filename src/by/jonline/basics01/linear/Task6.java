package by.jonline.basics01.linear;

import java.util.Scanner;

public class Task6 {
	// Линейные программы. Задание 6.
	// Для данной области составить линейную программу, которая печатает
	// true, если точка с координатами (x,y) принадлежит закрашенной области,
	// и false - в противном случае
	
	// Let's store the region as two-dimensional array where 0's represent blank cells and 1's represent painted cells 
	private static byte[][] region= {	 //row Y
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0},//0 6
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0},//1 5 
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0},//2 4
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//3 3 
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//4 2 
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//5 1 
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//6 0
			
			{0,0,1,1,1,1, 1,1,1,1,0,0,0,0},//7 -1
			{0,0,1,1,1,1, 1,1,1,1,0,0,0,0},//8 -2
			{0,0,1,1,1,1, 1,1,1,1,0,0,0,0},//9 -3
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0} //10 -4
		//  -6-5-4-3-2-1  0 1 2 3 4 5 6 7 X
		//	 0 1 2 3 4 5  6 7 8 9 10 11 12 13 column
			};
	// Since array element is accessed by [row][column] it's necessary to convert units.
	// X is related to [column] number with offset
	// Y is related to negative [row] number with offset.
	// Square with coordinates (-6,7) is stored in region[0][0]
	// Square with coordinates (-6,6) is stored in region[1][0], same X means same [column], Y-1 means [row+1]
	// Square with coordinates (0,0) is stored in region[6][6]
	private static byte xOffset = 6;
	private static byte yOffset = 6;

	public static void main(String[] args) {
		// User data is supposed to be entered via the keyboard. Incorrect input is rejected, then user is prompted to try again.
		byte x;
		byte y;
		String input;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		// prompting to enter comma separated coordinates
		System.out.println("Checking if region is filled.\r\nEnter x,y coordinates");
		
		input = scanner.next();
		try {
			x = Byte.parseByte(input.split("\\,")[0]);
			y = Byte.parseByte(input.split("\\,")[1]);
			// write result to System.out
			System.out.println(checkRegion(x, y));
		} catch (NumberFormatException numExc) {
			System.err.println("Entered coordinates are not integer numbers! You have entered: "+input);
		}
		catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static boolean checkRegion(byte x, byte y) throws IllegalArgumentException {
		/** This method converts (x,y) coordinates to [row][column]
		* @param  x  coordinate
		* @param  y  coordinate
		* @return  returns true if cell is filled
		* @throws IllegalArgumentException if user input is out of bounds.
		*/
		if ( (x+xOffset)<0 || (x+xOffset)>region[0].length) throw new IllegalArgumentException("X is out of bounds");
		if ( (-y+yOffset)<0 || (-y+yOffset)>region.length) throw new IllegalArgumentException("Y is out of bounds"); 
		int row = -y + yOffset;
		int column = x + xOffset; 
		return region[row][column]!=0;
		
	}

}
