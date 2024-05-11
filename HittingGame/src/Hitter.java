import java.util.ArrayList;


public class Hitter 
	{
	static ArrayList<Hitter> roster = new ArrayList<Hitter>();
	private String name;
	private int batAvg;
	private int onBaseAvg;
	
	public Hitter(String n, int b, int o)
		{
		roster.add(new Hitter ("Aaron Judge", 311, 394));
		roster.add(new Hitter ("Bryce Harper", 286, 390));
		roster.add(new Hitter ("Kyle Tucker", 257, 330));
		
		name = n;
		batAvg = b;
		onBaseAvg = o;
		}
	
	public Hitter()
		{
		
		}
	
	public String getName()
		{
		return name;
		}
	
	public int getBatAvg()
		{
		return batAvg;
		}
	
	public int getOnBaseAvg()
		{
		return onBaseAvg;
		}
	
	public static Hitter createHitter(int chosenHitter)
		{
		Hitter resultHitter = new Hitter();
		
		switch(chosenHitter)
			{
			case 1: chosenHitter = 1;
			resultHitter.name = "Aaron Judge";
			resultHitter.batAvg = 311;
			resultHitter.onBaseAvg = 394;
			break;
			
			case 2: chosenHitter = 2;
			resultHitter.name = "Bryce Harper";
			resultHitter.batAvg = 286;
			resultHitter.onBaseAvg = 390;
			break;
			
			case 3: chosenHitter = 3;
			resultHitter.name = "Kyle Tucker";
			resultHitter.batAvg = 257;
			resultHitter.onBaseAvg = 330;
			break;
			}
		
		return resultHitter;
		}
	}
