package mappkg;
/*
 * Author: Austin Bailey
 * Date Begun: 3/1/2018
 */
public class HexNode 
{
	//Actor currnentActor //cant implement yet actors isnt finished
	private boolean m_isLava;
	private HexNode[] m_neighbors;//indexed from top going clockwise-always size 6;
	//gets the character that represents the hexnode
	char getRepresentChar()
	{
		//this will change when it gets more complicated - L for lava @ for actor
		//special letters for demons etc
		return '0';
	}
	//returns if the field is traversable or not, should be flase if currentActor != Null or isLava
	boolean traversable()
	{
		return true;
	}
	
	public HexNode()
	{
		m_isLava = false;
		
	}
}
