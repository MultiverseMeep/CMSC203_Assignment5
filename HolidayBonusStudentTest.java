package holidayBonus;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusStudentTest {

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
	void testCalculateHolidayBonus() {

		double[] bonus = {14000, 8000, 10000, 12000, 14000, 12000};
		
		double[] testArray = HolidayBonus.calculateHolidayBonus(arr);
		
		//These two loops change the format of the method so that it can be read with JUnit
		int k = 0;
		for(int i = 0; i < testArray.length; i++)
		{
			if(testArray[i] != 0)
			{
				k++;
			}
		}
		
		double[] newArr = new double[k];
		
		for(int i = 0; i < testArray.length; i++)
		{
			if(testArray[i] != 0)
			{
				newArr[i] = testArray[i];
			}
		}
		
		
		
		
		for(int i = 0; i < newArr.length; i++)
		{
			if(newArr[i] != bonus[i])
			{
				//If any elements of the array are not equal, output false
				assertEquals(false, 1);
			}
		}
		
		//If all elements of the array are equal, output true
		assertEquals(1, 1);
		
		
	}
	
	@Test
	void testCalculateTotalHolidayBonus() {

	
		
		assertEquals(HolidayBonus.calculateTotalHolidayBonus(arr), 70000);
		
		
	}

}
