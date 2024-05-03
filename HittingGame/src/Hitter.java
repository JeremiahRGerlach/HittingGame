public class Hitter 
	{
	private String playerName;
	private int batAvg;
	private int onBaseAvg;
	
	public Hitter(String p, int b, int o)
		{
		playerName = p;
		batAvg = b;
		onBaseAvg = o;
		}
	
	public String getPlayerName()
		{
		return playerName;
		}
	
	public int getBatAvg()
		{
		return batAvg;
		}
	
	public int getOnBaseAvg()
		{
		return onBaseAvg;
		}
	}
