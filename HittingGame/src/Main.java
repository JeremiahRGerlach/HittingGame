import java.util.ArrayList;
import java.util.Scanner;

public class Main 
	{
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner userInput = new Scanner (System.in);
	static String name;
	static String dummy;
	static int className;
	static int pitcher;
	static int hitter;
	static String [] pitches;
	static ArrayList<Pitcher> bullPen = new ArrayList<Pitcher>();
	static ArrayList<Hitter> roster = new ArrayList<Hitter>();
	static boolean stillPlaying = true;
	static boolean looking = false;
	static int strikeCount = 0;
	static int ballCount = 0;
	static int outs = 0;
	static int bases = 0;
	static int runs = bases / 4; 
	
	public static void main(String args[])
		{
		bullPen.add(new Pitcher ("Trevor Bauer", "Dodgers", "4 Seam Fastball", 416, 498, "Cutter", 215, 486, "Slider", 186, 364, "Curveball", 112, 345, "Sinker", 45, 563, "Changeup", 25, 295));
		bullPen.add(new Pitcher ("Shohei Ohtani", "Angles", "Slider", 385, 203, "4 Seam Fastball", 280, 152, "Splitter", 119, 35, "Curveball", 93, 241, "Cutter", 89, 142, "Changeup", 35, 185));
		bullPen.add(new Pitcher ("Corbin Burns", "Brewers", "Cutter", 555, 205, "Curveball", 184, 163, "Changeup", 98, 115, "Slider", 92, 73, "Sinker", 68, 130, "4 Seam Fastball", 03, 100));
		
		roster.add(new Hitter ("Aaron Judge", 311, 394));
		roster.add(new Hitter ("Bryce Harper", 286, 390));
		roster.add(new Hitter ("Kyle Tucker", 257, 330));
		
		greetUser();
		
		while(stillPlaying)
			{
			stillHitting();
			count();
			playBall();
			}
		}
	
	public static void count()
		{
		System.out.println("The count is " + ballCount + " - " + strikeCount);
		runs();
		}
	
	public static void outs()
		{
		if(strikeCount == 3)
			{
			outs++;
			System.out.println("\nYou struck out\n\nThere are now " + outs + " out(s)");
			ballCount = 0;
			strikeCount = 0;
			}
		}
	
	public static void runs()
		{
		if(ballCount == 4)
			{
			System.out.println("You got walked!");
			ballCount = 0;
			strikeCount = 0;
			bases++;
			}
		}
	
	public static void stillHitting()
		{
		outs();
		if(outs == 3)
			{
			System.out.println("The game is over, you got " + runs + " run(s)!!" );
			stillPlaying = false;
			System.exit(0);
			}
		
		else
			{
			stillPlaying = true;
			}
		}
	
	public static void greetUser()
		{
		System.out.println("Hello, what is your name?");
		name = userStringInput.next();
		play();
		}
	
	public static void pickHitterAndPitcher()
		{
		System.out.println("What pitcher would you like to hit against?\n\n1) Trevor Bauer\n2) Shohei Ohtani\n3) Corbin Burnes");
		pitcher = userIntInput.nextInt();
		System.out.println("What hitter would you like to use?\n\n1) Aaron Judge\n2) Bryce Harper\n3) Kyle Tucker");
		hitter = userIntInput.nextInt();
		System.out.println(bullPen.get(pitcher-1).getName() + " is going to pitch against " + roster.get(hitter-1).getPlayerName());
		System.out.println("Press enter to continue");
		dummy = userInput.nextLine();
		}

	public static void play()
		{
		System.out.println("Hi " + name + ", do you want to play a baseball hitting game? \n\n1) Yes\n2) No");
		int play = userIntInput.nextInt();
		
		if(play == 2)
			{
			System.out.println("Thats ok, maybe next time!");
			System.exit(0);
			}
		else if(play != 1 && play !=2)
			{
			System.out.println("Please pick a number 1 or 2");
			play();
			}
		
		pickHitterAndPitcher();
		}
	
	public static void playBall()
		{
		System.out.println("\nYou can either\n\n1) Swing\n2) Take a Pitch");
		int firstPitch = userIntInput.nextInt();
		if(pitcher == 1 && hitter == 1 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			tbPitch();
			ajSwing();
			}
		
		else if(pitcher == 1 && hitter == 1 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			tbPitch();
			}
		
		if(pitcher == 1 && hitter == 2 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			tbPitch();
			bhSwing();
			}
	
		else if(pitcher == 1 && hitter == 2 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			tbPitch();
			}
		
		if(pitcher == 1 && hitter == 3 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			tbPitch();
			ktSwing();
			}
	
		else if(pitcher == 1 && hitter == 3 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			tbPitch();
			}
		
		if(pitcher == 2 && hitter == 1 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			soPitch();
			ajSwing();
			}
	
		else if(pitcher == 2 && hitter == 1 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			soPitch();
			}
	
		if(pitcher == 2 && hitter == 2 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			soPitch();
			bhSwing();
			}

		else if(pitcher == 2 && hitter == 2 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			soPitch();
			}
	
		if(pitcher == 2 && hitter == 3 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			soPitch();
			ktSwing();
			}

		else if(pitcher == 2 && hitter == 3 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			soPitch();
			}
		
		if(pitcher == 3 && hitter == 1 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			cbPitch();
			ajSwing();
			}
	
		else if(pitcher == 3 && hitter == 1 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			cbPitch();
			}
		
		if(pitcher == 3 && hitter == 2 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			cbPitch();
			bhSwing();
			}
	
		else if(pitcher == 3 && hitter == 2 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");			
			cbPitch();
			}
		
		if(pitcher == 3 && hitter == 3 && firstPitch == 1)
			{
			looking = false;
			System.out.println("\nYou are going to swing!");
			cbPitch();
			ktSwing();
			}
	
		else if(pitcher == 3 && hitter == 3 && firstPitch == 2)
			{
			looking = true;
			System.out.println("\nYou are going to take a pitch!");
			cbPitch();
			}
		}
	
	public static void tbPitch()
		{
		int p1 = bullPen.get(0).getp1Frequency();
        int p2 = p1 + bullPen.get(0).getp2Frequency();
        int p3 = p2 + bullPen.get(0).getp3Frequency();
        int p4 = p3 + bullPen.get(0).getp4Frequency();
        int p5 = p4 + bullPen.get(0).getp5Frequency();
        int p6 = p5 + bullPen.get(0).getp6Frequency();
		
		int pitch = ((int)(Math.random()*1000));
		
		if(pitch >= 0 && pitch <p1)
			{
			System.out.println("\nTrevor Bauer is going to throw a 4 Seam Fastball");
			System.out.println("Press enter to continue");
			dummy = userInput.nextLine();
			tbFastballStrike();
			}
		else if(pitch >= p1 && pitch <p2)
			{
			System.out.println("\nTrevor Bauer is going to throw a cutter");
			System.out.println("Press enter to continue");
			dummy = userInput.nextLine();			
			tbCutterStrike();
			}
			
		else if(pitch >= p2 && pitch <p3)
			{
			System.out.println("\nTrevor Bauer is going to throw a slider");
			System.out.println("Press enter to continue");
			dummy = userInput.nextLine();			
			tbSliderStrike();
			}
		else if(pitch >= p3 && pitch <p4)
			{
			System.out.println("\nTrevor Bauer is going to throw a curveball");
			System.out.println("Press enter to continue");
			dummy = userInput.nextLine();			
			tbCurveballStrike();
			}
		else if(pitch >= p4 && pitch <p5)
			{
			System.out.println("\nTrevor Bauer is going to throw a sinker");
			System.out.println("Press enter to continue");
			dummy = userInput.nextLine();			
			tbSinkerStrike();
			}
		else if(pitch >= p5 && pitch <=p6)
			{
			System.out.println("\nTrevor Bauer is going to throw a changeup");
			System.out.println("Press enter to continue");
			dummy = userInput.nextLine();			
			tbChangeupStrike();
			}
		}
	
	public static void tbFastballStrike()
		{
		int strike = ((int)(Math.random()*1000)); 
		
		if(looking == true)
			{
			if(strike < bullPen.get(0).getp1Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else if(strike > bullPen.get(0).getp1Frequency())
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void tbCutterStrike()
		{
		int strike = ((int)(Math.random()*1000));
		 
		
		if(looking == true)
			{
			if(strike < bullPen.get(0).getp2Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else if(strike > bullPen.get(0).getp1Frequency())
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void tbSliderStrike()
		{
		int strike = ((int)(Math.random()*1000));
		
		if(looking == true)
			{
			if(strike < bullPen.get(0).getp3Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else if(strike > bullPen.get(0).getp1Frequency())
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void tbCurveballStrike()
		{
		int strike = ((int)(Math.random()*1000));
		
		if(looking == true)
			{
			if(strike < bullPen.get(0).getp4Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else if(strike > bullPen.get(0).getp1Frequency())
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void tbSinkerStrike()
		{
		int strike = ((int)(Math.random()*1000));
		
		if(looking == true)
			{
			if(strike < bullPen.get(0).getp5Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else if(strike > bullPen.get(0).getp1Frequency())
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void tbChangeupStrike()
		{
		int strike = ((int)(Math.random()*1000)); 
		
		if(looking == true)
			{
			if(strike < bullPen.get(0).getp6Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else if(strike > bullPen.get(0).getp1Frequency())
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void ajSwing()
		{
		int hit = ((int)(Math.random()*1000));
		
		if(hit < roster.get(0).getBatAvg())
			{
			ajHit();
			}
		
		else
			{
			System.out.println("You swung and missed!!");
			strikeCount++;
			}
		}
	
	public static void ajHit()
		{
		int onBase = ((int)(Math.random()*1000));
		
		if(onBase < roster.get(0).getOnBaseAvg())
			{
			System.out.println("\nYou got a hit!!");
			bases++;
			}
		
		else
			{
			System.out.println("You made contact, but the fielder made a good play and got you out!!");
			outs++;
			System.out.println("\nThere are now " + outs + " out(s)\n");
			}
		
		ballCount = 0;
		strikeCount = 0;
		}
	
	public static void soPitch()
		{
		int p1 = bullPen.get(1).getp1Frequency();
		int p2 = bullPen.get(1).getp1Frequency() + bullPen.get(1).getp2Frequency();
		int p3 = p2 + bullPen.get(1).getp3Frequency();
		int p4 = p3 + bullPen.get(1).getp4Frequency();
		int p5 = p4 + bullPen.get(1).getp5Frequency();
		int p6 = p5 + bullPen.get(1).getp6Frequency();
		
		int pitch = ((int)(Math.random()*1000));
		
		if(pitch >= 0 && pitch <p1)
			{
			System.out.println("Shohei Ohtani is going to throw a slider");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			soSliderStrike();
			}
		else if(pitch >= p1 && pitch <p2)
			{
			System.out.println("Shohei Ohtani is going to throw a fastball");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			soFastballStrike();
			}
			
		else if(pitch >= p2 && pitch <p3)
			{
			System.out.println("Shohei Ohtani is going to throw a splitter");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			soSplitterStrike();
			}
		else if(pitch >= p3 && pitch <p4)
			{
			System.out.println("Shohei Ohtani is going to throw a curveball");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			soCurveballStrike();
			}
		else if(pitch >= p4 && pitch <p5)
			{
			System.out.println("Shohei Ohtani is going to throw a cutter");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			soCutterStrike();
			}
		else if(pitch >= p5 && pitch <p6)
			{
			System.out.println("Shohei Ohtani is going to throw a changeup");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			soChangeupStrike();
			}
		}
	
	public static void soSliderStrike()
		{
		int strike = ((int)(Math.random()*1000));
		
		if(looking == true)
			{
			if(strike < bullPen.get(1).getp1Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void soFastballStrike()
		{
		int strike = ((int)(Math.random()*1000));

		if(looking == true)
			{
			if(strike < bullPen.get(1).getp2Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
		
	public static void soSplitterStrike()
		{
		int strike = ((int)(Math.random()*1000));
				
		if(looking == true)
			{
			if(strike < bullPen.get(1).getp3Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void soCurveballStrike()
		{
		int strike = ((int)(Math.random()*1000));
		
		if(looking == true)
			{
			if(strike < bullPen.get(1).getp4Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void soCutterStrike()
		{
		int strike = ((int)(Math.random()*1000));
				
		if(looking == true)
			{
			if(strike < bullPen.get(1).getp5Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void soChangeupStrike()
		{
		int strike = ((int)(Math.random()*1000));
		
		if(looking == true)
			{
			if(strike < bullPen.get(1).getp6Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void bhSwing()
		{
		int hit = ((int)(Math.random()*1000));
		
		if(hit < roster.get(1).getBatAvg())
			{
			ajHit();
			}
		
		else
			{
			System.out.println("You swung and missed!!");
			strikeCount++;
			}
		}
	
	public static void bhHit()
		{
		int onBase = ((int)Math.random()*1000);
		
		if(onBase < roster.get(1).getOnBaseAvg())
			{
			System.out.println("\nYou got a hit!!");
			bases++;
			}
		
		else
			{
			System.out.println("You made contact, but the fielder made a good play and got you out!!");
			outs++;
			System.out.println("\nThere are now " + outs + " out(s)\n");
			}
	
		ballCount = 0;
		strikeCount = 0;
		}
	
	public static void cbPitch()
		{
		int p1 = bullPen.get(2).getp1Frequency();
		int p2 = bullPen.get(2).getp1Frequency() + bullPen.get(2).getp2Frequency();
		int p3 = p2 + bullPen.get(2).getp3Frequency();
		int p4 = p3 + bullPen.get(2).getp4Frequency();
		int p5 = p4 + bullPen.get(2).getp5Frequency();
		int p6 = p5 + bullPen.get(2).getp6Frequency();
		
		int pitch = ((int)Math.random()*1000);
		
		if(pitch >= 0 && pitch <p1)
			{
			System.out.println("Corbin Burnes is going to throw a cutter");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			cbCutterStrike();
			}
		else if(pitch >= p1 && pitch <p2)
			{
			System.out.println("Shohei Ohtani is going to throw a curveball");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			cbCurveballStrike();
			}
			
		else if(pitch >= p2 && pitch <p3)
			{
			System.out.println("Shohei Ohtani is going to throw a changeup");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			cbChangeupStrike();
			}
		else if(pitch >= p3 && pitch <p4)
			{
			System.out.println("Shohei Ohtani is going to throw a slider");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			cbSliderStrike();
			}
		else if(pitch >= p4 && pitch <p5)
			{
			System.out.println("Shohei Ohtani is going to throw a sinker");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			cbSinkerStrike();
			}
		else if(pitch >= p5 && pitch <p6)
			{
			System.out.println("Shohei Ohtani is going to throw a fastball");
			System.out.println("Press enter to continue");
			dummy = userStringInput.nextLine();			
			cbFastballStrike();
			}
		}
	
	public static void cbCutterStrike()
		{
		int strike = ((int)(Math.random()*1000));
				
		if(looking == true)
			{
			if(strike < bullPen.get(2).getp1Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void cbCurveballStrike()
		{
		int strike = ((int)(Math.random()*1000));
			
		if(looking == true)
			{
			if(strike < bullPen.get(2).getp2Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void cbChangeupStrike()
		{
		int strike = ((int)(Math.random()*1000));
		
		if(looking == true)
			{
			if(strike < bullPen.get(2).getp3Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void cbSliderStrike()
		{
		int strike = ((int)(Math.random()*1000));
				
		if(looking == true)
			{
			if(strike < bullPen.get(2).getp4Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void cbSinkerStrike()
		{
		int strike = ((int)(Math.random()*1000));
				
		if(looking == true)
			{
			if(strike < bullPen.get(2).getp5Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void cbFastballStrike()
		{
		int strike = ((int)(Math.random()*1000));
				
		if(looking == true)
			{
			if(strike < bullPen.get(1).getp6Strike())
				{
				System.out.println("STRIKE!!");
				strikeCount++;
				}
			else
				{
				System.out.println("Ball\nGood Take!");
				ballCount++;
				}
			}
		}
	
	public static void ktSwing()
		{
		int hit = ((int)(Math.random()*1000));
		
		if(hit < roster.get(3).getBatAvg())
			{
			ajHit();
			}
		
		else
			{
			System.out.println("You swung and missed!!");
			strikeCount++;
			}
		}
	
	public static void ktHit()
		{
		int onBase = ((int)(Math.random()*1000));
		
		if(onBase < roster.get(2).getOnBaseAvg())
			{
			System.out.println("\nYou got a hit!!");
			bases++;
			}
		
		else
			{
			System.out.println("You made contact, but the fielder made a good play and got you out!!");
			outs++;
			System.out.println("\nThere are now " + outs + " out(s)\n");
			}
	
		ballCount = 0;
		strikeCount = 0;
		}
	}
