package mappkg;

import java.util.TreeMap;

public class HexMap 
{
	public int edgelength = 5;//for hexmaps of consistent edge lengths
	public int[] edgelengths = {5,5,7};
	public int numHexNodes;
//	public HexNode[][] m_upHexNodes;
//	public HexNode[][] m_upRightHexNodes;
//	public HexNode[][] m_downRightHexNodes;
	
	public TreeMap m_nodes;
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
	
	/*
	 * this  constructor develops a protoexample of sidelength seven for testing purposes
	 */
	public HexMap(boolean simple)
	{
		if (simple==false)
		{
			//return HexMap();
			return;
		}
		/*
		 * Generate a simple '7' hexmap, with one center hexagon with 6 adjacent hexagons
		 * the 0 0 0 hexagon is left bottom
		 * The cube coordinates from https://www.redblobgames.com/grids/hexagons/ are used
		 * The hexmap is meant to be used for easy indexing (and indexing with nonnatural numbers)
		 * The problem is that there are 27 possible HexNodes created and only 7 of them actually exist...
		 */
		m_nodes=new TreeMap();
		for(int i = 0; i<=2; i++)//0<=x<=2 on Hexmap
		{
			m_nodes.put(i, new TreeMap());
			for(int j = -1; j<=1; j++)//-1<=y<=1 on Hexmap
			{
				((TreeMap) m_nodes.get(i)).put(i,new TreeMap());
				for(int k = -2; k<=0; k++)//-2<=z<=0
				{
					((TreeMap) ((TreeMap) m_nodes.get(i)).get(j)).put(k,new HexNode(i,j,k));
				}
			}
		}
		
	}
}
