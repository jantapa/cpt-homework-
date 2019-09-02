
public class Bicycle implements Vehicle{

	private int speed;
	private int gear;

	public Bicycle()
	{
		this.speed=speed;
		this.gear=gear;

	}
	public Bicycle(int speed,int gear)
	{
		this.speed=speed;
		this.gear=gear;
		
	}

	public void setSpeed(int speed)
	{
		this.speed=speed;
	}

	public int getSpeed()-
	{
		return this.speed;

	}

	public void setGear(int gear)
	{
		this.gear=gear;
	}

	public int getGear()
	{
		return this.gear;
	}
    
    @Override

	public String toString()
	{
		String answer2;

		answer2 = "Now Speed = "+this.speed+ "   Gear Now = "+this.gear;

		return answer2;

	}

    @Override
	public void changeGear(int toGear)
	{
		if(this.gear == 0)
			{

                 this.gear=1;

			}

			else
			{
                  this.gear=toGear;
			}

	}

    @Override
	public void speedUp(int increaseSpeed)
	{
		 int answer;

		answer = this.speed+increaseSpeed;

		if (answer > 120 ) {

			System.out.println("Decrease Speed !!!!!!!");

			this.speed = this.speed+increaseSpeed;
			
		}

		else
		{
			this.speed= this.speed+increaseSpeed;
		}
	}

     @Override
    public void applyBrakes(int decreaseSpeed)
    {
    	

     this.speed= this.speed-decreaseSpeed;

    }

}