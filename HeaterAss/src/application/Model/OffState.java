package application.Model;


public class OffState implements HeaterState {

	private static final int POWER = 0;
	
	public void turnUp (Heater heater)
	{
		heater.setPowerState( new LowPower());
		System.out.println("Heater turned to level 1");
	}
	
	public void turnDown ( Heater heater )
	{
		System.out.println("Power is turned off");
	}

	@Override
	public int getPower() 
	{
		return POWER;
	}
}
