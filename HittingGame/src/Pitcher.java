import java.util.ArrayList;

public class Pitcher 
	{
	static ArrayList<Pitcher> bullPen = new ArrayList<Pitcher>();
	private String name;
	private String team;
	private String p1Name;
	private int p1Frequency;
	private int p1Strike;
	private String p2Name;
	private int p2Frequency;
	private int p2Strike;
	private String p3Name;
	private int p3Frequency;
	private int p3Strike;
	private String p4Name;
	private int p4Frequency;
	private int p4Strike;
	private String p5Name;
	private int p5Frequency;
	private int p5Strike;
	private String p6Name;
	private int p6Frequency;
	private int p6Strike;
	
	public Pitcher(String n, String t, String p1N, int p1F, int p1S, String p2N, int p2F, int p2S, String p3N, int p3F, int p3S, String p4N, int p4F, int p4S, String p5N, int p5F, int p5S, String p6N, int p6F, int p6S)
		{
		bullPen.add(new Pitcher ("Trevor Bauer", "Dodgers", "4 Seam Fastball", 416, 498, "Cutter", 215, 486, "Slider", 186, 364, "Curveball", 112, 345, "Sinker", 45, 563, "Changeup", 25, 295));
		bullPen.add(new Pitcher ("Shohei Ohtani", "Angles", "Slider", 385, 203, "4 Seam Fastball", 280, 152, "Splitter", 119, 35, "Curveball", 93, 241, "Cutter", 89, 142, "Changeup", 35, 185));
		bullPen.add(new Pitcher ("Corbin Burns", "Brewers", "Cutter", 555, 205, "Curveball", 184, 163, "Changeup", 98, 115, "Slider", 92, 73, "Sinker", 68, 130, "4 Seam Fastball", 03, 100));
		
		name = n;
		team = t;
		p1Name = p1N;
		p1Frequency = p1F;
		p1Strike = p1S;
		p2Name = p2N;
		p2Frequency = p2F;
		p2Strike = p2S;
		p3Name = p3N;
		p3Frequency = p3F;
		p3Strike = p3S;
		p4Name = p4N;
		p4Frequency = p4F;
		p4Strike = p4S;
		p5Name = p5N;
		p5Frequency = p5F;
		p5Strike = p5S;
		p6Name = p6N;
		p6Frequency = p6F;
		p6Strike = p6S;
		}
	
	public Pitcher() 
	{

	}

	public String getName()
		{
		return name;
		}
	
	public String getTeam()
		{
		return team;
		}
	
	public String getp1Name()
		{
		return p1Name;
		}
	
	public int getp1Frequency()
		{
		return p1Frequency;
		}
	
	public int getp1Strike()
		{
		return p1Strike;
		}
	
	public String getp2Name()
		{
		return p2Name;
		}

	public int getp2Frequency()
		{
		return p2Frequency;
		}
	
	public int getp2Strike()
		{
		return p2Strike;
		}
	
	public String getp3Name()
		{
		return p3Name;
		}
	
	public int getp3Frequency()
		{
		return p3Frequency;
		}
	
	public int getp3Strike()
		{
		return p3Strike;
		}
	
	public String getp4Name()
		{
		return p4Name;
		}
	
	public int getp4Frequency()
		{
		return p4Frequency;
		}
	
	public int getp4Strike()
		{
		return p4Strike;
		}
	
	public String getp5Name()
		{
		return p5Name;
		}
	
	public int getp5Frequency()
		{
		return p5Frequency;
		}
		
	public int getp5Strike()
		{
		return p5Strike;
		}
	
	public String getp6Name()
		{
		return p6Name;
		}
	
	public int getp6Frequency()
		{
		return p6Frequency;
		}
	
	public int getp6Strike()
		{
		return p6Strike;
		}
	
	public static Pitcher createPitcher(int chosenPitcher)
		{
		Pitcher resultPitcher = new Pitcher();
		
		switch(chosenPitcher)
			{
			case 1: chosenPitcher = 1;
			resultPitcher.name = "Trevor Bauer";
			resultPitcher.team = "Dodgers";
			resultPitcher.p1Name = "4 Seam Fastball";
			resultPitcher.p1Frequency = 416;
			resultPitcher.p1Strike = 498;
			resultPitcher.p2Name = "Cutter";
			resultPitcher.p2Frequency = 215;
			resultPitcher.p2Strike = 486;
			resultPitcher.p3Name = "Slider";
			resultPitcher.p3Frequency = 186;
			resultPitcher.p3Strike = 364;
			resultPitcher.p4Name = "Curveball";
			resultPitcher.p4Frequency = 112;
			resultPitcher.p4Strike = 345;
			resultPitcher.p5Name = "Sinker";
			resultPitcher.p5Frequency = 45;
			resultPitcher.p5Strike = 563;
			resultPitcher.p6Name = "Changeup";
			resultPitcher.p6Frequency = 25;
			resultPitcher.p6Strike = 295;
			break;
			
			case 2: chosenPitcher = 2;
			resultPitcher.name = "Shohei Ohtani";
			resultPitcher.team = "Dodgers";
			resultPitcher.p1Name = "Slider";
			resultPitcher.p1Frequency = 385;
			resultPitcher.p1Strike = 203;
			resultPitcher.p2Name = "4 Seam Fastball";
			resultPitcher.p2Frequency = 280;
			resultPitcher.p2Strike = 152;
			resultPitcher.p3Name = "Splitter";
			resultPitcher.p3Frequency = 119;
			resultPitcher.p3Strike = 35;
			resultPitcher.p4Name = "Curveball";
			resultPitcher.p4Frequency = 92;
			resultPitcher.p4Strike = 241;
			resultPitcher.p5Name = "Cutter";
			resultPitcher.p5Frequency = 89;
			resultPitcher.p5Strike = 142;
			resultPitcher.p6Name = "Changeup";
			resultPitcher.p6Frequency = 35;
			resultPitcher.p6Strike = 185;
			break;
			
			case 3: chosenPitcher = 3;
			resultPitcher.name = "Corbin Bruns";
			resultPitcher.team = "Dodgers";
			resultPitcher.p1Name = "Cutter";
			resultPitcher.p1Frequency = 555;
			resultPitcher.p1Strike = 205;
			resultPitcher.p2Name = "Curveball";
			resultPitcher.p2Frequency = 184;
			resultPitcher.p2Strike = 163;
			resultPitcher.p3Name = "Changeup";
			resultPitcher.p3Frequency = 98;
			resultPitcher.p3Strike = 115;
			resultPitcher.p4Name = "Slider";
			resultPitcher.p4Frequency = 92;
			resultPitcher.p4Strike = 73;
			resultPitcher.p5Name = "Sinker";
			resultPitcher.p5Frequency = 68;
			resultPitcher.p5Strike = 130;
			resultPitcher.p6Name = "4 Seam Fastball";
			resultPitcher.p6Frequency = 03;
			resultPitcher.p6Strike = 100;
			break;
			
			}
		return resultPitcher;
		}
	
	}
