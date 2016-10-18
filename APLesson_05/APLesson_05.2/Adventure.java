import java.util.Scanner;
public class Adventure
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("You are in a room that is pitch black.");
		game();
	}
	public static void game()
	{
		System.out.println("Do you: \nA. Scream \nB. Clap \nC.Go to sleep \nD.Sit down");
		String answer1 = kb.next();
		if(answer1.equals("A"))
		{
			System.out.println("Your scream echoes, but louder. Something screams back. You are suddenly on fire. You die."); System.exit(0);
		}
		else if(answer1.equals("B"))
		{
			System.out.println("Floodlights turn on. They were clap-on lights. Good job.");
			System.out.println("You see 4 doors numbered 1-4. Which do you go through?");
			int answer2 = kb.nextInt();
			if (answer2 == 1)
			{
				System.out.println("Another very dark room. The door closes and locks behind you. \nDo you: \nA. Clap again \nB. Feel around \nC.Scream \nD.Cry ");
				String answer3 = kb.next();
				if (answer3.equals("A"))
				{
					System.out.println("At first, nothing happens. Then, you are struck by an enormous force. Blood. You drown."); System.exit(0);
				}
				else if (answer3.equals("B"))
				{
					System.out.println("You feel something very soft. A puppy! You win."); System.exit(0);
				}
				else if (answer3.equals("C"))
				{
					System.out.println("Your scream echoes, but louder. Something screams back. You are suddenly on fire. You die."); System.exit(0);
				}
				else if (answer3.equals("D"))
				{
					System.out.println("You drown in your own tears."); System.exit(0);
				}
			}
			else if (answer2 == 2)
			{
				System.out.println("There are cats everywhere. This would be awesome, but you are allergic. Your face swells up and you can barely see.");
				System.out.println("Do you: \nA. Take an antihistamine \nB. Hug the cats \nC. Yell at the cats \nD. Eat a cat ");
				String answer4 = kb.next();
				if (answer4.equals("A"))
				{
					System.out.println("Your allergic reaction subsides. You can pet the cats now. You win."); System.exit(0);
				}
				else if (answer4.equals("B"))
				{
					System.out.println("You are allergic you idiot. Your throat closes completely and you suffocate."); System.exit(0);
				}
				else if (answer4.equals("C"))
				{
					System.out.println("The cats are not amused. They scratch you to pieces."); System.exit(0);
				}
				else if (answer4.equals("D"))
				{
					System.out.println("Why would do that. That's just weird. You die of rabies."); System.exit(0);
				}
			}
			else if (answer2 == 3)
			{
				System.out.println("There is a lot of fire. Like A LOT. You die instantly."); System.exit(0);
			}
			else if (answer2 == 4)
			{
				System.out.println("It's just an empty room. The door closes behind you and disappears. There are no more doors or windows.");
			}
			else
			{
				System.out.println("You are an idiot that can't type a number so you die."); System.exit(0);
			}
	
		}
		else if(answer1.equals("C"))
		{
			System.out.println("You wake up 2 hours later. It's still dark. Nothing has changed. ");
			game();
		}
		else if(answer1.equals("D"))
		{
			System.out.println("A trap door opens underneath you. You plummet to your death."); System.exit(0);
		}
		else
		{
			System.out.println("Enter A, B, C, or D.");
			game();
			
		}
	}
}
