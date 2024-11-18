package holidayBonus;

import java.io.File;  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Creates a rectangular plot that has methods overlaps, encompasses, and toString
 * Due: 10/28/2024
 * Platform/compiler: Eclipse/Java
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Alayna Goss
*/
public class TwoDimRaggedArrayUtility {
	

	/*
	 * This method reads the file into a 2D arraylist (because the size of the document is unknown, it was easier to do it this way)
	 * The method then converts the 2D arraylist into a 2D array of the correct size to return.
	 * This will then be used throughout the entire program
	 * 
	 */
	public static double[][] readFile(File bonusFile) throws FileNotFoundException
	{
		ArrayList<String> strArr = new ArrayList<String> ();
		@SuppressWarnings("unused")
		ArrayList<Double> doubleArr = new ArrayList<Double> ();
		//String[] strArr = new String[6];
		
		ArrayList<ArrayList<Double>> parsedArr = new ArrayList<ArrayList<Double>>();
		
		
		try {
			//File bonusFile = new File(filename);
			Scanner fileReader = new Scanner(bonusFile);
			
			while(fileReader.hasNextLine())
			{
				strArr.add(fileReader.nextLine());
		
			}
			fileReader.close();
		
		
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found");
			return null;
		}
		
		
		for(int i = 0; i < strArr.size(); i++)
		{
			parsedArr.add(new ArrayList<Double>());
			String [] tokens = strArr.get(i).split(" ");
			for (String token: tokens)
			{
										
				parsedArr.get(i).add(Double.parseDouble(token));
				
			}
	
		}
			
		
		double[][] returnArr = new double[parsedArr.size()][];
		
		for(int i = 0; i < parsedArr.size(); i++)
			{
			
				ArrayList<Double> row = parsedArr.get(i);
				returnArr[i] = new double[row.size()];
				
				
			
			
				for(int k = 0; k < row.size(); k++)
				{
					returnArr[i][k] = row.get(k);
				}
			}
		
		
//		 Test code to check values
//		for (double[] row : returnArr)
//		{
//			for(double element : row)
//			{
//				
//				System.out.print(element + " ");
//				
//			}
//			System.out.println();
//		}
		

		return returnArr;
	}
	
	/*
	 * Writes a 2D array into a format that can be read by readFile
	 */
	public static void writeToFile(double[][] arr, File filename) throws IOException
	{
		
		PrintWriter fileWriter = new PrintWriter(filename);
		
		
		for (double[] row : arr)
		{
			for(double element : row)
			{
				
				fileWriter.print(String.valueOf(element) + " ");
				
			}
			fileWriter.print("\n");
		}
		
		fileWriter.close();
		
	}

	/*
	 * Gets the total value of the sum of all elements in the array
	 */
	public static double getTotal(double[][] arr)
	{
		
		double temp = 0;


		for (double[] row : arr)
		{
			for(double element : row)
			{
				temp += element;
			}
		}
		
		
	
		return temp;
	}
	
	/*
	 * Sum of all elements in the array divided by total number of elements
	 */
	public static double getAverage(double[][] arr)
	{
		
		double temp = 0;
		double count = 0;

		for (double[] row : arr)
		{
			for(double element : row)
			{
				temp += element;
				count++;
			}
		}
		
		
		
		return temp/count;
	}
	
	/*
	 * Returns the sum of all elements of row index
	 */
	public static double getRowTotal(double[][] arr, int index)
	{
		double temp = 0;
		
		for (double element: arr[index])
		{
			temp += element;
		}
		
		return temp;
	}
	
	/*
	 * Returns highest value in row index
	 */
	public static double getHighestInRow(double[][] arr, int index)
	{
		double temp = -9999;
		
		
		for (double element: arr[index])
		{
			
			if(element > temp)
			{
				temp = element;
			}
		}
		
		return temp;
	}
	
	/*
	 * Returns the index of the highest value in the row
	 */
	public static int getHighestInRowIndex(double[][] arr, int index)
	{
		double temp = -9999;
		int i = 0;
		int k = 0;
		
		for (double element: arr[index])
		{
			i++;
			if(element > temp)
			{
				temp = element;
				k = i;
			}
		}
		
		System.out.println(k);
		
		return k-1;
	}
	
	/*
	 * Returns the lowest value in the specified row
	 */
	public static double getLowestInRow(double[][] arr, int index)
	{
		double temp = 999999;
		
		
		for (double element: arr[index])
		{
			
			if(element < temp)
			{
				temp = element;
			}
		}
		
		return temp;
	}
	
	/*
	 * Returns the index of the lowest value of the row
	 */
	public static int getLowestInRowIndex(double[][] arr, int index)
	{
		double temp = arr[index][0];
		
		int k = 0;
		
		 for (int i = 0; i < arr[index].length; i++) 
		 {
	        if (arr[index][i] < temp) 
	        {
	            temp = arr[index][i];
	            k = i;
	        }
		}
		
	
		return k;
	}
	
	/*
	 * Returns the sum of the values of the specified column
	 */
	public static double getColumnTotal(double[][] arr, int index)
	{
		
		double temp = 0;
	
		
		
		for(int row = 0; row < arr.length; row++)
		{
			
			
			if(index < arr[row].length)
			{
				temp += arr[row][index];
				//System.out.println("i: " + arr[row][index]);
			}
			
			
			
			
		}
		
		
		return temp;
	}
	
	/*
	 * Returns the highest value of the specified column
	 */
	public static double getHighestInColumn(double[][] arr, int index)
	{
		double temp = -9999;
		
		
		for (int row = 0; row < arr.length; row++)
		{
			
			if(index < arr[row].length)
			{
				if(arr[row][index] > temp)
				{
					temp = arr[row][index];
				}
			}
		}
		
		return temp;
	}
	
	/*
	 * Returns the index of the highest value of the specified column
	 */
	public static int getHighestInColumnIndex(double[][] arr, int index)
	{
		double temp = -9999;
		
		int k = -1;
		
		for (int row = 0; row < arr.length; row++)
		{
			if (index < arr[row].length) 
			{
			
				if(arr[row][index] > temp)
				{
					temp = arr[row][index];
					k = row;
				}
			}
		}
		
		
		
		
		
		return k;
	}
	
	/*
	 * Returns the lowest value of the specified column
	 */
	public static double getLowestInColumn(double[][] arr, int index)
	{
		double temp = 9999999;
		
		
		for (int row = 0; row < arr.length; row++)
		{
			if(index < arr[row].length)
			{
				
			
				if(arr[row][index] < temp)
				{
					temp = arr[row][index];
				}
			}
		}
		
		return temp;
	}
	
	/*
	 * Returns the index of the lowest value of the specified column
	 */
	public static int getLowestInColumnIndex(double[][] arr, int index)
	{
		double temp = 999999;
		
		int k = 0;
		
		for (int row = 0; row < arr.length; row++)
		{
			
			if(arr[row][index] < temp)
			{
				temp = arr[row][index];
				k = row;
			}
		}
		
		return k;
	}
	
	/*
	 * Returns the highest value of the entire array
	 */
	public static double getHighestInArray(double[][] arr)
	{
		
		double temp = -999;
		

		for (double[] row : arr)
		{
			for(double element : row)
			{
				if (element > temp)
				{
				temp = element;
				}
			}
		}

		return temp;
	}
	
	/*
	 * Returns the lowest value of the entire array
	 */
	public static double getLowestInArray(double[][] arr)
	{
		
		double temp = 999999;
		

		for (double[] row : arr)
		{
			for(double element : row)
			{
				if (element < temp)
				{
				temp = element;
				}
			}
		}

		return temp;
	}
	
}
