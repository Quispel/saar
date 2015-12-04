/**
 * 
 */
package saar.agents;

import saar.Message;
import sim.engine.SimState;
import sim.util.Bag;

/**
 * @author QuispelL
 *
 */
public class Medium extends Agent {
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Properties and constructors
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	/**
	 * 
	 */
	public Medium() {
		// TODO Auto-generated constructor stub
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Behavior  
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	public void step(SimState state) 
	{
		super.step(state);
		
		processMessages();
		sendMessages();
	}
	
	/**
	 * 
	 * @param message
	 */
	public void processMessage(Message message)
	{
		switch ( message.getPerformative() )
		{
			case "":
				
				break;
			default:
				// TODO: handle unknown performative
				System.out.println("Unknown Performative in Message !!!");
				break;
		}
	}
	
	
}
