package mappkg;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHexMap 
{
	
	/*
	 * Tests that for a hexmap of size 1 the correct corresponding size is returned
	 */
	@Test
	public void testGetNumHexNodes1()
	{
		assertEquals(HexMap.getNumHexNodes(1),1);
	}
	
	/*
	 * Tests that for a Hexmap of size 2 the correct result is returned
	 */
	@Test
	public void testGetNumHexNodes2()
	{
		assertEquals(HexMap.getNumHexNodes(2),7);
	}
	
	/*
	 * Tests that for a Hexmap of size 3 the correct result is returned
	 */
	@Test
	public void testGetNumHexNodes3()
	{
		assertEquals(HexMap.getNumHexNodes(3),19);
	}
}
