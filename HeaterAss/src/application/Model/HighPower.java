package application.Model;

public class HighPower implements HeaterState{
	
	private static final int POWER = 3;
	
	public HighPower(Heater heater)
	{
		Thread t = new Thread(() -> 
		{
			try
			{
				Thread.sleep(10000);
				heater.setPowerState(new MediumPower());
				System.out.println("Cooling down - max heat for too long");
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		});
		t.setDaemon(true);
		t.start();
	}
	
	public void turnUp(Heater heater)
	{
		
	}
	
	public void turnDown(Heater heater)
	{
		heater.setPowerState(new MediumPower());
		System.out.println("Heater turned down to level 2");
	}
		
	public int getPower()
	{
		return POWER;
	}
}

