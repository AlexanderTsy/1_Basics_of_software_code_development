package by.jonline.basics01.linear;

public class Task6 {
	// Линейные программы. Задание 6.
	// Для данной области составить линейную программу, которая печатает
	// true, если точка с координатами (x,y) принадлежит закрашенной области,
	// и false - в противном случае
	
	//Lets store the region as two-dimensional array where 0 represents blank cells and 1 represents painted cells
	//User data is supposed to be entered via the keyboard. Incorrect input is rejected, then user is prompted to try again.
	byte[][] region= {
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0},//0
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0},//1
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0},//2
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//3
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//4
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//5
			{0,0,0,0,1,1, 1,1,0,0,0,0,0,0},//6
			
			{0,0,1,1,1,1, 1,1,1,1,0,0,0,0},//7
			{0,0,1,1,1,1, 1,1,1,1,0,0,0,0},//8
			{0,0,1,1,1,1, 1,1,1,1,0,0,0,0},//9
			{0,0,0,0,0,0, 0,0,0,0,0,0,0,0} //10
			};

	public static void main(String[] args) {
		

	}

}
