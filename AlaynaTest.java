package holidayBonus;

import java.io.File;
import java.io.IOException;

public class AlaynaTest {

	public static void main(String[] args) throws IOException{

		//double[][] arr = {{2.0, 1.0, 4.0, 3.7}, {2.5, 1.2, 5.7, 8.22, 4.87, 5.32}, {8.1, 9.1}};

		File file = new File("C:\\Users\\AlaynaGoss\\eclipse-workspace\\holidayBonus\\src\\holidayBonus\\district5.txt");
		
		double[][] arr = TwoDimRaggedArrayUtility.readFile(file);
		
		System.out.println(TwoDimRaggedArrayUtility.getAverage(arr));
		
		
		
	//	System.out.println(TwoDimRaggedArrayUtility.getColumnTotal(arr, 3));
//		
//		System.out.println(arr[0][2]);
//		
//		double[][] bonusArr = HolidayBonus.calculateHolidayBonus(arr);
//		
//		
//		for (double[] row : bonusArr)
//		{
//			for(double element : row)
//			{
//				
//				System.out.print(element + " ");
//				
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println("Total value of all bonuses: " + HolidayBonus.calculateTotalHolidayBonus(arr));
//		
//		
		
		
		
		
		
		
		
		
		
//		for (double[] row : arr)
//		{
//			for(double element : row)
//			{
//				
//				System.out.print(element + " ");
//				
//			}
//			System.out.println();
//		}
		
	//	File writeFile = new File("C:\\Users\\AlaynaGoss\\eclipse-workspace\\holidayBonus\\src\\holidayBonus\\test.txt");
		
		//TwoDimRaggedArrayUtility.writeToFile(arr, writeFile);
		
		
		
		
		/*
		int index = 1;
		
		System.out.println("Array total: " + TwoDimRaggedArrayUtility.getTotal(arr));
		System.out.println("Array average: " + TwoDimRaggedArrayUtility.getAverage(arr));
		
		
		
		
		
		System.out.println("Row total: " + TwoDimRaggedArrayUtility.getRowTotal(arr, index));
		System.out.println("Highest in row: " + TwoDimRaggedArrayUtility.getHighestInRow(arr, index));
		System.out.println("highest in row index: " + TwoDimRaggedArrayUtility.getHighestInRowIndex(arr, index));
		System.out.println("lowest in row: " + TwoDimRaggedArrayUtility.getLowestInRow(arr, index));
		System.out.println("lowest in row index: " + TwoDimRaggedArrayUtility.getLowestInRowIndex(arr, index));
		
	
		
		
		System.out.println("column total: " + TwoDimRaggedArrayUtility.getColumnTotal(arr, index));
		System.out.println("highest in column: " + TwoDimRaggedArrayUtility.getHighestInColumn(arr, index));
		System.out.println("highest in column index:  " + TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, index));
		System.out.println("lowest in column: " + TwoDimRaggedArrayUtility.getLowestInColumn(arr, index));
		System.out.println("lowest in column index: " + TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr, index));

		System.out.println("highest in array: " + TwoDimRaggedArrayUtility.getHighestInArray(arr));
		System.out.println("lowest in array: " + TwoDimRaggedArrayUtility.getLowestInArray(arr));
		*/
	}
}
