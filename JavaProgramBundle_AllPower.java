//This is a bundle program. For sample codes, it is enclosed in a switch() field.
//This file will be set as "Read Only". Editing this file may result to malfunction of the program.
//If there are bugs  detected, feel free to debug the program :)

//Programmer : Marc John Benamera // BSIT 1.1 A // STI Tanauan

//This program contains 6 sub-programs

//Last Updated : November 09, 2018 , 12:00 PM
//Link Drop: https://twitch.tv/solarph
//Link Drop: https://youtube.com/@solarph
//Link Drop: https://youtube.com/@solarsbytes
//Link Drop: https://twitch.com/solarph_

import java.util.*;

public class JavaProgramBundle_AllPower
{
	public static void main (String[]args)
	{
		Scanner console = new Scanner(System.in); // General Use Input System
		Scanner console_switch = new Scanner(System.in); // Dedicated for Switch
		Scanner console_ending = new Scanner(System.in); // Dedicated for Ending/ReLooping Phase
		Scanner console_Int = new Scanner(System.in); // For Item A // To avoid glitch with nextInt doubling the print of nextLine
		Random rand = new Random();
		
		boolean startloop_trigger = true; // loop for starting interface
		boolean main_trigger = false; // loop for main module
		boolean submain_trigger_01 = false; // loop for program interface
		boolean submain_trigger_02 = false; // loop for ending or loop restart interface
		boolean switchloop_trigger = false; // loop for switch program
		
		String start_command = "";
		String main_command = "";
		String submain_command = "";
		
		//PROBLEM A INITIALIZER
		int a_randnum_a = 0;
		int a_randnum_b = 0;
		int a_randnum_result = 0;
		int a_randnum_answer = 0;
		
		//PROBLEM B INITIALIZER
		String b_stringcontainer_phrase = "";
		String b_stringcontainer_coc = "";
		int b_lengthscanner = 0;
		int b_lengthcounter = 0;
		int b_matchcounter = 0;
		
		//PROBLEM C INITIALIZER
		String c_stringcontainer_phrase = "";
		String c_stringcontainer_wordchecker = "";
		String c_stringcontainer_reversechecker = "";
		int c_stringlengthscanner = 0;
		int c_stringlengthcounter = 0;
		int c_arraysizecounter = 0;
		int c_temp_startindex = 0;
		int c_temp_endindex = 0;
		int c_palindromecounter = 0;
		
		//PROBLEM D INITIALIZER
		int d_maxarray = 0;
		int d_arraycounter = 0;
		int d_num = 0;
		int d_sum = 0;
		
		//PROBLEM E INITIALIZER
		boolean e_endtrigger = true;
		boolean e_correcttrigger = false;
		String e_continue = "";
		int e_maxtrial = 0;
		int e_randnum = 0;
		int e_guessnum = 0;
		int e_guesscount = 0;
		int e_guesstrialdisplay = 0;
		
		//PROBLEM F INITIALIZER
		boolean f_opvalid = false;
		char f_operator = ' ';
		double f_num = 0;
		double f_res = 0;
		
		//Starting Interface Start
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		while (startloop_trigger == true) // this runs the starting commands...
		{
			System.out.println("Commands available: ");
			System.out.println("!start  -  Starts the whole program.");
			System.out.println("!exit  -  Ends the whole program.");
			System.out.println();
			System.out.print("Enter a command: ");
			start_command = console.nextLine();
			start_command = start_command.trim();
			start_command = start_command.toLowerCase();
			System.out.println();
			System.out.println();
			
			if (start_command.equals("!start"))
			{
				System.out.println("Program Started...");
				System.out.println();
				System.out.println();
				startloop_trigger = false;
				main_trigger = true;
				submain_trigger_01 = true;
			}
			else if (start_command.equals("!exit"))
			{
				System.out.println("Program Stopped... Thank you for using the program!");
				System.out.println();
				System.out.println();
				startloop_trigger = false;
				main_trigger = false;
			}
			else
			{
				System.out.println("Invalid Input. Please try again...");
				System.out.println();
				System.out.println();
				startloop_trigger = true;
			}
		}
		
		// Main Interface Start
		
		while (main_trigger == true) // This runs the whole program in loop...
		{

			while (submain_trigger_01 == true) // This runs the main interface or program selection...
			{
				
				System.out.print("Pick a program (A/B/C/D/E/F): ");
				submain_command = console_switch.nextLine();
				submain_command = submain_command.trim();
				submain_command = submain_command.toUpperCase();
				System.out.println();
				System.out.println();
				
				switch (submain_command) // compilation of programs
				{
					case "A": //Item A
					System.out.println("Program A started...");
					System.out.println();
					System.out.println();
					
					while (true)
					{
						a_randnum_a = rand.nextInt(100);
						a_randnum_b = rand.nextInt(100);
						
						a_randnum_result = a_randnum_a + a_randnum_b;
						System.out.print("What is the sum of " + a_randnum_a + " and " + a_randnum_b + " : ");
						a_randnum_answer = console_Int.nextInt();
						System.out.println();
						
						if (a_randnum_answer == a_randnum_result)
						{
							System.out.println("Your answer is correct!");
							System.out.println(a_randnum_a + " + " + a_randnum_b + " = " + a_randnum_result);
							System.out.println();
						}
						else if (a_randnum_answer == 0)
						{
							System.out.println("'0' intput detected... Ending Program...");
							System.out.println();
							break;
						}
						else
						{
							System.out.println("Your answer is incorrect!");
							System.out.println(a_randnum_a + " + " + a_randnum_b + " = " + a_randnum_result);
							System.out.println();
						}
						
						System.out.println();
						System.out.println();
					}
			
					break;
					case "B": //Item B
					System.out.println("Program B started...");
					System.out.println();
					System.out.println();
					
					while (true)
					{
						System.out.print("Enter a phrase: ");
						b_stringcontainer_phrase = console.nextLine();
						System.out.println();
						
						if (b_stringcontainer_phrase.equals("0"))
						{
							System.out.println("'0' input detected... Ending Program...");
							System.out.println();
							break;
						}
						else if (b_stringcontainer_phrase.length() == 0)
						{
							continue;
						}
						
						System.out.print("Enter a character of choice: ");
						b_stringcontainer_coc = console.nextLine();
						System.out.println();
						
						if (b_stringcontainer_coc.length() == 0)
						{
							continue;
						}
						
						b_lengthscanner = b_stringcontainer_phrase.length();
						
						for (b_lengthcounter = 0; b_lengthcounter < b_lengthscanner; b_lengthcounter++)
						{
							if (b_stringcontainer_phrase.charAt(b_lengthcounter) == b_stringcontainer_coc.charAt(0))
							{
								b_matchcounter++;
							}
						}
						
						System.out.println("The phrase with " + b_lengthcounter + " characters have " + b_matchcounter + " '" + b_stringcontainer_coc + "' characters.");
						
						System.out.println();
						System.out.println();
					}
					
					System.out.println();
					System.out.println();
					
					break;
					case "C": //Item C
					System.out.println("Program C started...");
					System.out.println();
					System.out.println();
					
					while (true)
					{
						
						//re-initialize
						c_palindromecounter = 0;
						//re-initialize
						
						System.out.print("Enter a phrase: ");
						c_stringcontainer_phrase = console.nextLine();
						System.out.println();
						System.out.println();
						
						if (c_stringcontainer_phrase.equals("0"))
						{
							System.out.println("'0' input detected... Ending Program...");
							break;
						}
						else if (c_stringcontainer_phrase.length() <= 2)
						{
							System.out.println("NO PALINDROME WORDS DETECTED!");
							System.out.println();
							System.out.println();
							continue;
						}
						
						c_stringcontainer_phrase = c_stringcontainer_phrase + " >"; // to have the last word detected even without a space at the end
						
						c_stringlengthscanner = c_stringcontainer_phrase.length();
						
						c_temp_startindex = 0; // stores temporary index for start
						c_temp_endindex = 0; // stores temporary index for end
						
						for (c_stringlengthcounter = 0; c_stringlengthcounter < c_stringlengthscanner; c_stringlengthcounter++)
						{
							if (c_stringcontainer_phrase.charAt(c_stringlengthcounter) == ' ')
							{
								c_temp_endindex = c_stringlengthcounter;
								
								c_stringcontainer_wordchecker = c_stringcontainer_phrase.substring(c_temp_startindex, c_temp_endindex);
								
								while (c_temp_startindex < c_temp_endindex)
								{
									c_stringcontainer_reversechecker = c_stringcontainer_phrase.charAt(c_temp_startindex) + c_stringcontainer_reversechecker;
									c_temp_startindex++;
								}
								
								c_stringcontainer_wordchecker = c_stringcontainer_wordchecker.trim();
								c_stringcontainer_reversechecker = c_stringcontainer_reversechecker.trim();
								
								if (c_stringcontainer_wordchecker.length() == 0)
								{
									continue;
								}
								else if (c_stringcontainer_wordchecker.charAt(0) == ' ')
								{
									continue;
								}
								else if (c_stringcontainer_wordchecker.equalsIgnoreCase(c_stringcontainer_reversechecker)) // looks if the words is match
								{
									if (c_stringcontainer_wordchecker.length() >= 3) // a constraint in length // word must be 3 letters and above
									{
										System.out.println("PALIMDROME DETECTED! : " + c_stringcontainer_wordchecker);
										c_palindromecounter++;
									}
								}
								
								c_stringcontainer_reversechecker = ""; // clears the reverse word for match lookup on the next word
							}							
						}
						
						if (c_palindromecounter == 0)
						{
							System.out.println("NO PALINDROME WORDS DETECTED!");
						}
						System.out.println();
						System.out.println();
					}
					
					System.out.println();
					System.out.println();
					
					break;
					case "D": //Item D
					System.out.println("Program D started...");
					System.out.println();
					System.out.println();
					
					//re-initialize
					d_sum = 0;
					//re-initialize
					
					while (true)
					{
						System.out.print("How many numbers do you want to add up? : ");
						d_maxarray = console.nextInt();
						System.out.println();
						
						if (d_maxarray == 0)
						{
							System.out.println("'0' input detected... Ending Program...");
							break;
						} 
						
						int [] d_array_addition = new int[d_maxarray];
						
						for (d_arraycounter = 0; d_arraycounter < d_maxarray; d_arraycounter++)
						{
							System.out.println("Remaining numbers to add: " + (d_maxarray - d_arraycounter));
							System.out.print("Enter a number : ");
							d_num = console.nextInt();
							d_array_addition[d_arraycounter] = d_num;
							System.out.println();
							d_sum = d_sum + d_num;
							
							if (d_arraycounter != d_maxarray-1)
							{
								System.out.println("Current sum: " + d_sum);
								System.out.println();
							}
						}
						System.out.println("Final Sum: " + d_sum);
						System.out.println();
					}
					
					System.out.println();
					System.out.println();
					
					break;
					case "E": //Item E
					System.out.println("Program E started...");
					System.out.println();
					System.out.println();
					
					while (true)
					{
						e_randnum = rand.nextInt(99) + 1;
						e_maxtrial = rand.nextInt(12) + 3;
						e_guesstrialdisplay = e_maxtrial;
						e_correcttrigger = false;
						
						System.out.println("For this guessing game, you have been given " + e_maxtrial + " guesses.");
						System.out.println();
						
						for (e_guesscount = 0; e_guesscount < e_maxtrial; e_guesscount++)
						{
							System.out.print("Enter your guess (1 - 100): ");
							e_guessnum = console_Int.nextInt();
							System.out.println();
							
							if (e_guessnum == 0)
							{
								System.out.println("'0' input detected... Ending Program...");
								System.out.println();
								break;
							}
							else if (e_guessnum == e_randnum)
							{
								System.out.println("You guessed the right number! The number is " + e_randnum + "!");
								System.out.println();
								e_correcttrigger = true;
								break;
							}
							else if (e_guessnum < e_randnum)
							{
								e_guesstrialdisplay--;
								System.out.println("Guess again! You need to make it HIGHER!");
								System.out.println("You have " + e_guesstrialdisplay + " attempts remaining...");
								System.out.println();
							}
							else if (e_guessnum > e_randnum)
							{
								e_guesstrialdisplay--;
								System.out.println("Guess again! You need to make it LOWER!");
								System.out.println("You have " + e_guesstrialdisplay + " attempts remaining...");
								System.out.println();
							}
						}
						
						if (((e_guessnum != 0) && (e_correcttrigger == false)) == true)
						{
							System.out.println("All tries have been used. The correct number is " + e_randnum + "!");
							System.out.println();
							System.out.println("Next Number...");
							System.out.println();
						}
						
						if (e_guessnum == 0)
						{
							break;
						}
					}
					
					System.out.println();
					System.out.println();
					
					break;
					case "F": //Item F
					System.out.println("Program F started...");
					System.out.println();
					System.out.println();
					
					while (true)
					{
						System.out.println("Current Result: " + f_res);
						System.out.println();
						
						f_num = 0;
						
						System.out.print("Enter a number: ");
						f_num = console.nextDouble();
						System.out.println();
						
						if (f_num == 0)
						{	
							System.out.println("'0' input detected... Ending Program...");
							System.out.println();
							break;
						}
						
						f_opvalid = false;
						
						while (f_opvalid == false)
						{
							System.out.print("Enter an operator: ");
							f_operator = console.next().charAt(0);
							System.out.println();
							
							switch (f_operator)
							{
								case '+':
								f_res = f_res + f_num;
								f_opvalid = true;
								break;
								case '-':
								f_res = f_res - f_num;
								f_opvalid = true;
								break;
								case '*':
								f_res = f_res * f_num;
								f_opvalid = true;
								break;
								case '/':
								f_res = f_res / f_num;
								f_opvalid = true;
								break;
								case '=':
								System.out.println("Final Result = " + f_res);
								System.out.println();
								f_opvalid = true;
								break;
								default:
								System.out.println("Invalid operator. Please input a valid input.");
								System.out.println();
								break;
							}
						}
						
						if (f_operator == '=')
						{
							f_res = 0;
						}
					}
					break;
					default:
					System.out.println("Invalid Output... Please enter a valid input.");
					System.out.println();
					break;
				}
				submain_trigger_01 = false;
				submain_trigger_02 = true;
			}
			
			while (submain_trigger_02 == true) // This runs the ending or restart loop phase...
			{
				System.out.println("Commands available: ");
				System.out.println("!restart  -  Starts the whole program.");
				System.out.println("!exit  -  Ends the whole program.");
				System.out.println();
				System.out.print("Enter a command: ");
				main_command = console_ending.nextLine();
				main_command = main_command.trim();
				main_command = main_command.toLowerCase();
				System.out.println();
				System.out.println();
				
				if (main_command.equals("!restart"))
				{
					System.out.println("Program Restarted...");
					System.out.println();
					System.out.println();
					main_trigger = true;
					submain_trigger_01 = true;
					submain_trigger_02 = false;
				}
				else if (main_command.equals("!exit"))
				{
					System.out.println("Program Stopped... Thank you for using the program!");
					System.out.println();
					System.out.println();
					main_trigger = false;
					submain_trigger_01 = false;
					submain_trigger_02 = false;
				}
				else
				{
					System.out.println("Invalid Input. Please try again...");
					System.out.println();
					System.out.println();
					main_trigger = true;
				}
				
			}
		}
	}
}
