package homeWork_20170830;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWorkMain2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * х╦©Ь╟║ют
		 * юл╦╖х╝юн - гя╠ш 4╠шюз юлго╦╦ ╟║╢и
		 * аж╧н╣Н╥о х╝юн - ╪Щюз - ╟║╢и
		 * id х╝юн - ╬кфд╨╙ ╢К╪р╧╝юз ╪Щюз ╟║╢и
		 * ╩Г©К╟║╢игя ╬фюл╣ПюнаЖ ц╪е╘
		 * юл╦чюо аж╪р
		 * ╨Я╧п╧Ьхё - !@#$%^&*©╣╧╝╪Щюзгя╠ш╟║╢и
		 * ╨Я╧п╧Ьхё х╝юн
		 * юЭх╜╧Ьхё - ╪Щюз╦╦- ╟║╢и
		 * аж╪р - гя╠ш ╪Щюз╦╦ ╟║╢и
		 * ╟║ют╟Ф╥н - ╪Щюз╥н ╨╦╠БЁ╙╟╗ (1)юнемЁщ (2)дё╠╦цъц╣ (3)╫е╧╝ (4)╠Бе╦
		 * ╩Гюлф╝©║ ╧ы╤С╢б а║ - гя╠ш╦╦ ╟║╢и
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try 
			{
				print("-", "юл╦╖ю╩ ют╥бго╪╪©Д*гя╠ш ют╥б╦╦ ╟║╢игу╢о╢ы*");
				String name = sc.nextLine();
				if(!check("[╓║-╓╬|╟║-фR]{3}", name))
				{
					throw new Exception("ют╥бгя юл╦╖ю╩ х╝юнго╫ц╟М ╢ы╫ц ют╥бго╪╪©Д");
				}
				
				print("-", "аж╧н╣Н╥о ╧Ьхё╦╕ ют╥бго╪╪©Д");
				String countryId = sc.nextLine();
				if(!check("[0-9]{6}-[0-9]{7}", countryId))
				{
					throw new Exception("ют╥бгя аж╧н╣Н╥о ╧Ьхё╦╕ х╝юнго╫ц╟М ╢ы╫ц ют╥бго╪╪©Д");
				}
				
				
				print("-", "╩Г©Кго╫г ID╦╕ ют╥бго╪╪©Д*ф╞╪Ж╠Бхё╢б ╩Г©Кго╫г╪Ж ╬Ь╫ю╢о╢ы*");
				String nickName = sc.nextLine();
				if(!check("[0-9a-zA-Z╟║-фR]{4,10}", nickName))
				{
					throw new Exception("ют╥бгя ID╦╕ х╝юнго╫ц╟М ╢ы╫ц ют╥бго╪╪©Д");
				} else 
				{
					print("*", "ID ╩Г©Кюл ╟║╢игу╢о╢ы. ╩Г©К : 1, юГют╥б : 2");
					String select = sc.nextLine();
					if(select == "1") print("#", "╩Г©Кго╫г ╨Я╧п╧Ьхё╦╕ ют╥бго╪╪©Д");
					else continue;
				}
				
				print("-", "E-mail аж╪р╦╕ ют╥бго╪╪©Д");
				String mail = sc.nextLine();
				if(!(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{3}", mail)) ||
					(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{2}.[a-z]{2}", mail)))
				{
					throw new Exception("╦чюоаж╪р╟║ ╬Ь╫ю╢о╢ы. ╢ы╫ц E-mail аж╪р╦╕ ют╥бго╪╪©Д");
				}
				
				print("-", "╩Г©Кго╫г ╨Я╧п╧Ьхё╦╕ ют╥бго╪╪©Д*ф╞╪Ж╠Бхё ╩Г©Кюл ╟║╢игу╢о╢ы!@#$%^&*");
				String pw = sc.nextLine();
				if(!check("[!@#$%^&*|a-zA-Z0-9]*", pw))
				{
					throw new Exception("ют╥бгя ╨Я╧п╧Ьхё╦╕ х╝юнго╫ц╟М ╢ы╫ц ют╥бго╪╪©Д");
				} else 
				{
					print("*", "╨Я╧п╧Ьхё х╝юню╩ю╖гь ╢ы╫ц ют╥бго╪╪©Д");
					String rePw= sc.nextLine();
					if(pw.equals(rePw)) print("-", "╨Я╧п╧Ьхё╟║ ╪Ёа╓╣г╬З╫ю╢о╢ы");
					else 
					{
						print("*", "╨Я╧п╧Ьхё╟║ ф╡╦Ё╢о╢ы ╩У╥н ют╥бгь аж╪╪©Д");
						continue;
					}
				}
				
				print("-", "юЭх╜╧Ьхё╦╕ ют╥бго╪╪©Д");
				String phone = sc.nextLine();
				if(!check("[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}", phone))
				{
					throw new Exception("юЭх╜╧Ьхё╦╕ х╝юнго╫ц╟М ╢ы╫ц ют╥бго╪╪©Д");
				}
				
				
				print("-", "аж╪р╦╕ ют╥бго╪╪©Д");
				String address = sc.nextLine();
				if(!check("[╟║-фR]*" + " " + "[╟║-фR]*" + " " + "[╟║-фR]*" + " " + "[0-9]{1,5}-[0-9]{1,5}", address))
				{
					throw new Exception("аж╪р╦╕ х╝юнго╫ц╟М ╢ы╫ц ют╥бго╪╪©Д");
				} 
				
				print("-", "╟║ют ╟Ф╥н╦╕ ╪╠ецгь аж╪╪©Д - (1)юнемЁщ (2)дё╠╦цъц╣ (3)╫е╧╝ (4)╠Бе╦");
				String join = sc.nextLine();
				if(!check("[0-9]{1}", join))
				{
					throw new Exception("╧Ьхё╦╕ х╝юнго╫ц╟М ╢ы╫ц ют╥бго╪╪©Д");
				} 
				
				print("-", "╩Гюлф╝©║ ╧ы╤С╢б а║ю╩ юш╪╨гь аж╪╪©Д");
				String joinComment = sc.nextLine();
				if(joinComment.trim().length() <= 0)
				{
					print("*", "╩Гюлф╝©║ ╧ы╤С╢б а║ю╩ юш╪╨гь аж╪╪©Д");
				} 
				
				print("@", name + "╢т©║ ╟║ютюл ©о╥А╣г╬З╫ю╢о╢ы");
				
				break;
			} catch (Exception e) 
			{
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}

	}
	
	static Boolean check(String pt, String compare)
	{
		return Pattern.matches(pt, compare);
	}
	
	static void print(String value1, String value2)
	{
		int len = value2.length() + 8;
		for (int i = 0; i < 3; i++) 
		{
			if(i == 1) System.out.print(value2);
			else 
			{
				for (int j = 0; j < len; j++) 
				{
					System.out.print(value1);
				}
			}
			System.out.println();
		}
	}

}
