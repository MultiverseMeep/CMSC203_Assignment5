package holidayBonus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
class TwoDimRaggedArrayUtilityStudentTest {

	
	//private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
	double[][] arr;
	File file;
	
	@BeforeEach
	void setUp() throws Exception {
		
		file = new File("C:\\Users\\AlaynaGoss\\eclipse-workspace\\holidayBonus\\src\\holidayBonus\\district5.txt");
		
		arr = TwoDimRaggedArrayUtility.readFile(file);

	}

	@AfterEach
	void tearDown() throws Exception {
	}


	

	
	
	
	
	
	
	@Test
	public void testGetTotal()
	{
		
		assertEquals(1168798.18, ( TwoDimRaggedArrayUtility.getTotal(arr)),1);
		
	}
	
	@Test
	public void testGetAverage()
	{
		
		assertEquals(40303.38, ( TwoDimRaggedArrayUtility.getAverage(arr)),1);
		
	}
	
	@Test
	public void testGetRowTotal()
	{
		
		assertEquals(254936.69, ( TwoDimRaggedArrayUtility.getRowTotal(arr, 0)),1);
		
	}
	
	@Test
	public void testGetColumnTotal()
	{
		
		assertEquals(215418.09, ( TwoDimRaggedArrayUtility.getColumnTotal(arr, 1)),1);
		
	}
	
	@Test
	public void testGetHighestInRow()
	{
		
		assertEquals(54992.97, ( TwoDimRaggedArrayUtility.getHighestInRow(arr, 2)),1);
		
	}
	
	
	
	@Test
	public void testGetLowestInRowIndex()
	{
		
		assertEquals(19546.63, ( TwoDimRaggedArrayUtility.getLowestInRow(arr, 1)),1);
		
	}
	
	@Test
	public void testGetHighestInColumn()
	{
		
		assertEquals(45665.05, ( TwoDimRaggedArrayUtility.getHighestInColumn(arr, 1)),1);
		
	}
	
	@Test
	public void testGetHighestInColumnIndex()
	{
		
		
		assertEquals(0, ( TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, 1)));
	}
	
	@Test
	public void testGetLowestInColumn()
	{
		
		assertEquals(33884.48, ( TwoDimRaggedArrayUtility.getLowestInColumn(arr, 4)),1);
		
	}
	
	@Test
	public void testGetHighestInArray()
	{
		
		assertEquals(89352.68, ( TwoDimRaggedArrayUtility.getHighestInArray(arr)),1);
		
	}
	
	@Test
	public void testGetHighestInRowIndex()
	{
		assertEquals((TwoDimRaggedArrayUtility.getHighestInRowIndex(arr,1)),1);
	}
	
	@Test
	public void testGetLowestInRow()
	{
		assertEquals(19546.63, ( TwoDimRaggedArrayUtility.getLowestInRow(arr,1)),1);
	}
	

	@Test
	public void testGetLowestInArray()
	{
		assertEquals(12536.54, ( TwoDimRaggedArrayUtility.getLowestInArray(arr)),1);
	}
	
	@Test
	public void testGetLowestInColumnIndex()
	{
		assertEquals((TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr,1)),2);
	}
	
	
}
