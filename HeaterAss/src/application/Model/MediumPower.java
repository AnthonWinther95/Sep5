package application.Model;


public class MediumPower implements HeaterState {

	private static final int POWER = 2;
	
	public void turnUp(Heater heater)
	{
		heater.setPowerState(new HighPower());
		System.out.println("Heater is turned up to the highest level");
	}
	
	public void turnDown(Heater heater)
	{
		heater.setPowerState(new LowPower());
		System.out.println("Heater is turned down to level 2");
	}
		
	public int getPower()
	{
		return POWER;
	}
	}

