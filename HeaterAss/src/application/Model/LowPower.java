package application.Model;

public class LowPower implements HeaterState {

private static final int POWER = 1;
	
	public void turnUp(Heater heater)
	{
		heater.setPowerState(new MediumPower());
		System.out.println("Heater is turned up to level 2");
	}

	public void turnDown(Heater heater)
	{
		heater.setPowerState(new OffState());
		System.out.println("Heater is turned off");
	}
	
	public int getPower()
	{
		return POWER;
	}
}
