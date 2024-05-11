import java.util.Scanner;

public class Main 
	{
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner userInput = new Scanner (System.in);
	static String name;
	static String dummy;
	static int className;
	static int chosenPitcher;
	static int chosenHitter;
	static String [] pitches;
	static boolean stillPlaying = true;
	static boolean looking = false;
	static int strikeCount = 0;
	static int ballCount = 0;
	static int outs = 0;
	static int bases = 0;
	static int runs = bases / 4;
	static Pitcher pitcher;
	static Hitter hitter;
	static String beingThrown = "";
	static int strikeFrequency = 0;
	
	public static void main(String args[])
		{
		greetUser();

		while(stillPlaying)
			{
			stillHitting();
			count();
			swingOrTake();
			}
		}
	
	
	public static void count()
		{
		System.out.println("The \ncount is " + ballCount + " - " + strikeCount);
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
	
	public static void swingOrTake()
		{
		System.out.println("You can either \n\n1)Swing \n2)Take a pitch");
		int swingOrTake = userIntInput.nextInt();
		if(swingOrTake == 1)
			{
			pitchThrown(pitcher);
			swing(hitter);
			}
		
		else if(swingOrTake == 2)
			{
			pitchThrown(pitcher);
			Strike(strikeFrequency);
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
		
		else
			pickPitcherandHitter();
		}
	
	public static void pickPitcherandHitter()
		{
		System.out.println("What pitcher would you like to hit against?\n\n1) Trevor Bauer\n2) Shohei Ohtani\n3) Corbin Burnes");
		int chosenPitcher = userIntInput.nextInt();
		pitcher = Pitcher.createPitcher(chosenPitcher);
		System.out.println("What hitter would you like to use?\n\n1) Aaron Judge\n2) Bryce Harper\n3) Kyle Tucker");
		int chosenHitter = userIntInput.nextInt();
		hitter = Hitter.createHitter(chosenHitter);
		System.out.println(pitcher.getName() + " is going to pitch against " + hitter.getName());
		System.out.println("Press enter to continue");
		dummy = userInput.nextLine();
		}
	
	public static int pitchThrown(Pitcher pitcher)
		{
		int p1 = pitcher.getp1Frequency();
		int p2 = p1 + pitcher.getp2Frequency();
		int p3 = p2 + pitcher.getp3Frequency();
		int p4 = p3 + pitcher.getp4Frequency();
		int p5 = p4 + pitcher.getp5Frequency();
		int p6 = p5 + pitcher.getp6Frequency();
		
		int pitchThrown = ((int)(Math.random()*1000));
		
	
		if(pitchThrown >= 0 && pitchThrown <p1)
			{
			beingThrown = pitcher.getp1Name();
			strikeFrequency = pitcher.getp1Strike();
			}
		
		else if(pitchThrown >= p1 && pitchThrown <p2)
			{
			beingThrown = pitcher.getp2Name();
			strikeFrequency = pitcher.getp2Strike();
			}
			
		else if(pitchThrown >= p2 && pitchThrown <p3)
			{
			beingThrown = pitcher.getp3Name();
			strikeFrequency = pitcher.getp3Strike();
			}
		
		else if(pitchThrown >= p3 && pitchThrown <p4)
			{
			beingThrown = pitcher.getp4Name();
			strikeFrequency = pitcher.getp4Strike();
			}
		
		else if(pitchThrown >= p4 && pitchThrown <p5)
			{
			beingThrown = pitcher.getp5Name();
			strikeFrequency = pitcher.getp5Strike();
			}
		
		else if(pitchThrown >= p5 && pitchThrown <=p6)
			{
			beingThrown = pitcher.getp6Name();
			strikeFrequency = pitcher.getp6Strike();
			}

		System.out.println(pitcher.getName() + " is going to throw a " + beingThrown);
		System.out.println("\nPress enter to continue");
		dummy = userInput.nextLine();
		return strikeFrequency;
		}
	
	public static boolean Strike (int strikeFrequency)
		{
		boolean Strike = false;
		int isStrike = ((int)(Math.random()*1000));

		if(isStrike < strikeFrequency)
			{
			Strike = true;
			System.out.println("The " + beingThrown + " was a strike!");
			strikeCount++;
			}
		
		else 
			{
			System.out.println("The " + beingThrown + " was a ball");
			ballCount++;
			}
			
		
		return Strike;
		}
	
	public static void swing(Hitter hitter)
		{
		int madeContact = ((int)(Math.random()*1000));
		
		if(madeContact <= hitter.getBatAvg())
			{
			System.out.println("You made contact with the ball");
			System.out.println("Press enter to see if you made it on base!!");
			dummy = userInput.nextLine();
			getOnBase(hitter);
			}
		
		else
			{
			System.out.println("You swung and missed!!");
			strikeCount++;
			}
		}
	
	public static void getOnBase(Hitter hitter)
		{
		int getOnBase = ((int)(Math.random()*1000));
		
		if(getOnBase <= hitter.getOnBaseAvg())
			{
			System.out.println("You got on base!!");
			}
		
		else
			{
			System.out.println("The defence made a good play and got you out!");
			outs++;
			}
		
		ballCount = 0;
		strikeCount = 0;
		}


	}
