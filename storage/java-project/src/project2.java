import javax.swing.JOptionPane;

public class project2 {

	public static void main(String[] args) {
		int n = 0;
		do
		{
			Player player = new Player();
			display("What is your name?", "name", player);
			display("All right then, " + player.name() + ", let's get started.", "plain", player);
			display("You are on a plane. Suddenly, the plane's engine explodes.", "plain", player);
			Object[] options1 = {"(1) Cry", "(2) Grab a parachute and jump"};
			display("What do you do?", "question", player, options1);
			while (player.response() != 1 && player.response() != 2)
			{
				display("Invalid response.\nWhat do you do?\n\n(1) Cry \n\n(2) Grab a parachute and jump", "error", player);
			}
			if (player.response() == 1) 
			{
				display("Your crying attracts the attention of a flight attendant,\nwho puts a parachute on you and kicks you off the plane.", "plain", player);
				display("You take off the parachute and see a forest.", "plain", player);
				Object[] options2 = {"(1) Explore", "(2) Go for a swim"};
				display("What do you do?", "question", player, options2);
				if (player.response() == 2)
				{
					display("You wade into the warm ocean water. You sure are having fun!", "plain", player);
					display("Eventually you get tired and go back on shore.", "plain", player);
					display("The sun is setting and you're cold.", "plain", player);
					display("You sure are bad at planning ahead.", "plain", player);
					Object[] options3 = {"(1) Cover yourself with sand and go to sleep", "(2) Try to find shelter in the forest"};
					display("What now?", "question", player, options3);
					if (player.response() == 2)
					{
						display("You go into the forest and find a comfy rock to sleep on.", "plain", player);
						display("You cover yourself with ferns and close your eyes.", "plain", player);
						display("You wake up the next day. Your stomach grumbles.", "plain", player);
						Object[] options4 = {"(1)Sleep to conserve energy", "(2) Eat those weird looking berries"};
						display("What do you do?", "question", player, options4);
						if(player.response() == 2)
						{
							display("Those berries taste real good.", "plain", player);
							display("Wow, you just found a food source. Good job!", "plain", player);
							display("You are no longer hungry.", "plain", player);
							Object[] options5 = {"(1)Try to make a shelter", "(2)Look for more food"};
							display("What do you want to do?", "question", player, options5);
							if(player.response() == 1)
							{
								display("You spend the rest of the day collecting material for your house.", "plain", player);
								display("However, it is too dark to keep building your house at night.", "plain", player);
								Object[] options6 = {"(1)Try anyway", "(2) Go to sleep on your cold rock again"};
								display("What do you do?", "question", player, options6);
								if(player.response() == 1)
								{
									display("You build the frame for your shelter.", "plain", player);
									display("You try to lift a heavy chunk of wood.", "plain", player);
									display("You drop it on your foot.", "plain", player);
									display("Now your foot is hurt, bozo.", "plain", player);
									Object[] options7 = {"(1)Try to keep working", "(2) Make a splint"};
									display("What do you do?", "question", player, options7);
									if(player.response() == 2)
									{
										display("You succesfully splint your foot.", "plain", player);
										display("You go to sleep in your half-finished shelter.", "plain", player);
										display("You wake up. Your foot does not hurt as much anymore.", "plain", player);
										display("You finish building your house.", "plain", player);
										Object[] options8 = {"(1)Eat some berries", "(2)Try to make a boat"};
										display("What now?", "question", player, options8);
										if(player.response() == 1)
										{
											display("Those berries taste really good.", "plain", player);
											display("You decide you're never going to make it off the island on your own.", "plain", player);
											display("That means you need to survive until rescuers arrive.", "plain", player);
											Object[] options9 = {"(1)Continue making your house", "(2)Eat A L L the berries"};
											display("What do you do to survive?", "question", player, options9);
											if(player.response() == 2)
											{
												display("You eat all the Y U M M Y berries.", "plain", player);
												display("Those berries energize and uplift you.", "plain", player);
												Object[] options10 = {"(1)Make weapons", "(2)Make some friends"};
												display("Now that you are fully awake, what do you want to do?", "question", player, options10);
												if(player.response() == 2)
												{
													display("You explore the forest and look for some friends.", "plain", player);
													display("You encounter a baby pig.", "plain", player);
													Object[] options11 = {"(1)Pet it", "(2)Give it some berries"};
													display("What do you do?", "question", player, options11);
													if(player.response() == 2)
													{
														display("The pig eats all the Y U M M Y berries.", "plain", player);
														display("The pig now follows you around.", "plain", player);
														display("You just made a friend! What's his name?", "friendName", player);
														Object[] options12 = {"(1)Train your friend to fight", "(2)Go play in the ocean"};
														display("What do you want to do with " + player.friendsName() + "?", "question", player, options12);
														if(player.response() == 2)
														{
															display("You and " + player.friendsName() + " go into the ocean.", "plain", player);
															display("You have fun until the sun sets.", "plain", player);
															display("You and your " + player.friendsName() + " head back to your shelter.", "plain", player);
															display("You go to sleep with " + player.friendsName() + ".", "plain", player);
															display("You wake up the next day and eat berries with " + player.friendsName() + ".", "plain", player);
															Object[] options13 = {"(1)Spell out 'Help!' on the beach", "(2)Learn how to make fire"};
															display("What now?", "question", player, options13);
															if(player.response() == 1)
															{
																display("You go to the beach with some rocks.", "plain", player);
																display("You spend a couple hours arranging the rocks in the perfect position.", "plain", player);
																display("Now people can see that you need help. Congrats!", "plain", player);
																Object[] options14 = {"(1)Lay around and do nothing", "(2)Find something to eat other than berries"};
																display("You have some time to kill before nightfall. What do you do?", "question", player, options14);
																if(player.response() == 1)
																{
																	display("You sit on the beach and relax in the sun.", "plain", player);
																	display("Eventually you get hot and crawl into the shade.", "plain", player);
																	display("You are so bored, you go to sleep early.", "plain", player);
																	display("You wake up the next day to the sound of a helicopter.", "plain", player);
																	display("A man drops down from a rope ladder and walks toward you...", "plain", player);
																	Object[] options15 = {"(1) Snoop Dogg", "(2) The Babadook"};
																	display("Who is it?!", "question", player, options15);
																	if(player.response() == 1)
																	{
																		display("You ask Snoop Dogg if he is here to help.", "plain", player);
																		display("He replies 'Fo shizzle, go watch some televizzle.", "plain", player);
																		display("He brings you and " + player.friendsName() + " back to the mainland and you live happily ever after.", "plain", player);
																	}
																	else
																	{
																		display("Why would you choose the Babadook?", "plain", player);
																		display("Well guess what?", "question", player);
																		display("You died!", "death", player);
																	}
																}
																else
																{
																	display("You find a new type of berry.", "plain", player);
																	display("You pop them into your mouth and fall unconscious.", "plain", player);
																	display("They were poisonous.", "warning", player);
																	display("You died!", "death", player);
																}
															}	
															else
															{
																display("You smack some rocks together, which creates sparks.", "plain", player);
																display("Those sparks spread to the dead plants on the forest floor.", "plain", player);
																display("The entire island is set on fire!", "warning", player);
																display("You died!", "death", player);
															}
														}
														else
														{
															display("You put a pointy rock in " + player.friendsName() + "'s mouth.", "plain", player);
															display(player.friendsName() + " stabs you and steals your berries.", "warning", player);
															display("You died!", "death", player);
														}
													}
													else
													{
														display("As you pet the pig, a shadow falls over you.", "plain", player);
														display("It's the pig's mom!", "plain", player);
														display("She eats you!", "warning", player);
														display("You died!", "death", player);
													}
												}
												else
												{
													display("You need weapons to survive. You pick up some sticks and shiny rocks.", "plain", player);
													display("The rock shines some light into the eye of a giant bird .", "plain", player);
													display("The giant bird swoops down and eats you!", "warning", player);
													display("You died!", "death", player);													
												}
											}
											else
											{
												display("You try to put a roof over your head.", "plain", player);
												display("You go inside your house and survey your work.", "plain", player);
												display("The roof collapses over your head!", "warning", player);
												display("You died!", "death", player);
											}
										}
										else
										{
											display("You get some wood for your boat.", "plain", player);
											display("You realize that you do not know how to build a boat.", "plain", player);
											display("You sit down and start crying.", "plain", player);
											display("A wild boar appeared!", "warning", player);
											display("You died!", "death", player);
										}
									}
									else
									{
										display("Your foot hurts, but you don't care.", "plain", player);
										display("You raise a slab of stone over your head.", "plain", player);
										display("Your foot gives out and you drop the rock on your head.", "warning", player);
										display("You died!", "death", player);
									}
								}
								else
								{
									display("You lay down on your rock.", "plain", player);
									display("During the night, a giant bird grabs you.", "plain", player);
									display("You get eaten.", "warning", player);
									display("You died!", "death", player);
								}
							}
							else
							{
								display("You find a couple of coconut trees and try to climb them.", "plain", player);
								display("Suddenly, a coconut falls on your head.", "warning", player);
								display("You died!", "death", player);
							}
						}
						else
						{
							display("You wake up a few hours later.", "plain", player);
							display("You are so hungry you can barely move.", "warning", player);
							display("You lay on your rock until a wild boar eats you.", "warning", player);
							display("You died!", "death", player);
						}
					}
					else
					{
						display("That sand feels nice.", "plain", player);
						display("A giant crab apppears and eats you.", "warning", player);
						display("You died!", "death", player);
					}
				}
				else
				{
					display("While you are exploring, you find a wild boar.", "plain", player);
					display("It kills you.", "death", player);
				}
			}
			else
			{
				display("You leap out of the burning plane.", "plain", player);
				display("Unfortunately, your parachute doesn't open.", "warning", player);
				display("You died!", "death", player);
			}
			Object[] optionsRetry = {"(1) Yes", "(2)No"};
			display("Would you like to play again?", "question", player, optionsRetry);
			if (player.response() == 2)
			{
				display("Thank you for playing!", "plain", player);
				n = 1;
			}	
		} while(n == 0);
	}
	public static void display(String message, String responseType, Player player)
	{
		if (responseType.equals("plain"))
		{
			JOptionPane.showMessageDialog(null, message, "Survival Island", JOptionPane.PLAIN_MESSAGE);
		}
		else if(responseType.equals("name"))
		{
			player.setName(JOptionPane.showInputDialog(null, message, "Survival Island", JOptionPane.QUESTION_MESSAGE));
		}
		else if(responseType.equals("friendName"))
		{
			player.setFriend(JOptionPane.showInputDialog(null, message, "Survival Island", JOptionPane.QUESTION_MESSAGE));
		}
		else if(responseType.equals("question"))
		{
			JOptionPane.showMessageDialog(null, message, "Survival Island", JOptionPane.QUESTION_MESSAGE);
		}
		else if(responseType.equals("death"))
		{
			JOptionPane.showMessageDialog(null, message, "Survival Island", JOptionPane.ERROR_MESSAGE);
		}
		else if(responseType.equals("warning"))
		{
			JOptionPane.showMessageDialog(null, message, "Survival Island", JOptionPane.WARNING_MESSAGE);
		}
	}
	public static void display(String message, String responseType, Player player, Object[] options)
	{
		if(responseType.equals("question"))
		{
			int answer = JOptionPane.showOptionDialog(null, message, "Survival Island", JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
			player.setResponse(answer + 1);
		}
	}
}

class Player {
	private int lives;
	private int days;
	private String name;
	private String friendsName;
	private int response;

	/***
	 * Constructor for the Player class
	 */
	public Player()
	{
		lives = 3;
		days = 0; 
		name = "";
		friendsName = "";
	}
	/***
	 * Removes lives
	 */
	public void removeLife()
	{
		lives -= 1;
	}
	
	/***
	 * Tests if the player is 'alive'
	 * @return if the player's lives is above 0
	 */
	public boolean isAlive()
	{
		return (lives < 0);
	}
	
	/***
	 * Adds a day if the player survives a day
	 */
	public void addDay()
	{
		days += 1;
	}
	/***
	 * Gives the amount of days the player has survived
	 * @return the amount of days
	 */
	public int day()
	{
		return days;
	}
	
	/***
	 * Sets the player's name
	 * @param name the input
	 */
	public void setName(String x)
	{
		name = x;
	}
	
	/***
	 * Gives the player's name
	 * @return the player's name
	 */
	public String name()
	{
		return name;
	}
	
	/***
	 * Sets the name of the player's friend
	 * @param name the input
	 */
	public void setFriend(String name)
	{
		friendsName = name;
	}
	
	/***
	 * Gives the name of the player's friend
	 * @return the name of the player's friend
	 */
	public String friendsName()
	{
		return friendsName;
	}
	
	public int response()
	{
		return response;
	}
	
	public void setResponse(int a)
	{
		response = a;
	}
}
