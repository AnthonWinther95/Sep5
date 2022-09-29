package application.Model;


public class Heater {

	private HeaterState currentState = new OffState();
	
	public void turnUp()
	{
		System.out.println( "Heater turned up" );
		
		currentState.turnUp(this);
	}
	
	public void turnDown()
	{
		System.out.println( "Heater turned down" );
		
		currentState.turnDown(this);
	}
	
	public void getPower() 
	{
		System.out.println("Current power level is: " + currentState.getPower());
	}
	
	void setPowerState (HeaterState state)
	{
		currentState = state;
	}
	
	
}

