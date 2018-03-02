package mappkg;

public class HexMap 
{
	public int edgelength = 5;//for hexmaps of consistent edge lengths
	public int[] edgelengths = {5,5,7};
	public int numHexNodes;
	
	//this function is used when all sides are the same length 
	public static int getNumHexNodes(int edgelength)
	{
		int count = 0;
		for(int i = 0; i<edgelength-1; i++)
		{
			count+=(edgelength)+i;
			/*counting the columns of the first half of the hexmap, excluding the middle col */
		}
		count*=2;//for the symmetry of the hexmap
		count+=2*(edgelength-1)+1;//for the middle column
		
		return count;
	}
	
	//Ad Hoc polymorphic design for easier use
	//returning the default of the game
	//may have fun fixing this math later
	public static int getNumHexNodes(int[] edgelength)
	{
		return 79;
	}
	
	public HexMap()
	{
		numHexNodes = 79;
	}
}
