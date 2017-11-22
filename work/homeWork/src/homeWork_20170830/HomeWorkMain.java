package homeWork_20170830;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * È¸¿ø°¡ÀÔ
		 * ÀÌ¸§È®ÀÎ - ÇÑ±Û 4±ÛÀÚ ÀÌÇÏ¸¸ °¡´É
		 * ÁÖ¹Îµî·Ï È®ÀÎ - ¼ıÀÚ - °¡´É
		 * id È®ÀÎ - ¾ËÆÄºª ´ë¼Ò¹®ÀÚ ¼ıÀÚ °¡´É
		 * »ç¿ë°¡´ÉÇÑ ¾ÆÀÌµğÀÎÁö Ã¼Å©
		 * ÀÌ¸ŞÀÏ ÁÖ¼Ò
		 * ºñ¹Ğ¹øÈ£ - !@#$%^&*¿µ¹®¼ıÀÚÇÑ±Û°¡´É
		 * ºñ¹Ğ¹øÈ£ È®ÀÎ
		 * ÀüÈ­¹øÈ£ - ¼ıÀÚ¸¸- °¡´É
		 * ÁÖ¼Ò - ÇÑ±Û ¼ıÀÚ¸¸ °¡´É
		 * °¡ÀÔ°æ·Î - ¼ıÀÚ·Î º¸±â³ª°¨ (1)ÀÎÅÍ³İ (2)Ä£±¸ÃßÃµ (3)½Å¹® (4)±âÅ¸
		 * »çÀÌÆ®¿¡ ¹Ù¶ó´Â Á¡ - ÇÑ±Û¸¸ °¡´É
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		String name = "", countryId = "", nickName = "", select = "", mail = "", pw = "",
				rePw = "", phone = "", address = "", join = "", joinComment = "";
		
		print("-", "ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä*ÇÑ±Û ÀÔ·Â¸¸ °¡´ÉÇÕ´Ï´Ù*");
		nameW:while(true)
		{
			name = sc.nextLine();
			switch(check("[¤¡-¤¾|°¡-ÆR]{3}", name))
			{
				case "true":
					break nameW;
				default :
					print("*", "ÀÔ·ÂÇÑ ÀÌ¸§À» È®ÀÎÇÏ½Ã°í ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}
		
		print("-", "ÁÖ¹Îµî·Ï ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		idW:while(true)
		{
			countryId = sc.nextLine();
			switch(check("[0-9]{6}-[0-9]{7}", countryId))
			{
				case "true":
					break idW;
				default :
					print("*", "ÀÔ·ÂÇÑ ÁÖ¹Îµî·Ï ¹øÈ£¸¦ È®ÀÎÇÏ½Ã°í ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}
		
		print("-", "E-mail ÁÖ¼Ò¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		mailW:while(true)
		{
			mail = sc.nextLine();
			String check = "";
			if(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{3}", mail) == "true" ||
				check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{2}.[a-z]{2}", mail) == "true")
			{
				check = "true";
			} else check = "false";
			
			switch(check)
			{
				case "true":
					break mailW;
				default :
					print("*", "¸ŞÀÏÁÖ¼Ò°¡ ¾ø½À´Ï´Ù. ´Ù½Ã E-mail ÁÖ¼Ò¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}	
		
		print("-", "»ç¿ëÇÏ½Ç ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä*Æ¯¼ö±âÈ£´Â »ç¿ëÇÏ½Ç¼ö ¾ø½À´Ï´Ù*");
		nickNameW:while(true)
		{
			nickName = sc.nextLine();
			switch(check("[0-9a-zA-Z°¡-ÆR]{4,10}", nickName))
			{
				case "true":
					print("*", "ID »ç¿ëÀÌ °¡´ÉÇÕ´Ï´Ù. »ç¿ë : 1, ÀçÀÔ·Â : 2");
					print("#", "»ç¿ëÇÏ½Ç ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
					select = sc.nextLine();
					if(select.equals("1")) break nickNameW;
				default :
					print("*", "ÀÔ·ÂÇÑ ID¸¦ È®ÀÎÇÏ½Ã°í ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}
		
		print("-", "»ç¿ëÇÏ½Ç ºñ¹Ğ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä*Æ¯¼ö±âÈ£ »ç¿ëÀÌ °¡´ÉÇÕ´Ï´Ù!@#$%^&*");
		pwW:while(true)
		{
			pw = sc.nextLine();
			switch(check("[!@#$%^&*|a-zA-Z0-9]*", pw))
			{
				case "true":
					print("*", "ºñ¹Ğ¹øÈ£ È®ÀÎÀ»À§ÇØ ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					rePw = sc.nextLine();
					System.out.println(pw + " : " + rePw);
					if(pw.equals(rePw))
					{
						print("-", "ºñ¹Ğ¹øÈ£°¡ ¼³Á¤µÇ¾ú½À´Ï´Ù");
						break pwW;
					}
					else 
					{
						print("*", "ºñ¹Ğ¹øÈ£°¡ Æ²¸³´Ï´Ù »õ·Î ÀÔ·ÂÇØ ÁÖ¼¼¿ä");
						continue;
					}
				default :
					print("*", "ÀÔ·ÂÇÑ ºñ¹Ğ¹øÈ£¸¦ È®ÀÎÇÏ½Ã°í ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}

		print("-", "ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		phoneW:while(true)
		{
			phone = sc.nextLine();
			switch(check("[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}", phone))
			{
				case "true":
					break phoneW;
				default :
					print("*", "ÀüÈ­¹øÈ£¸¦ È®ÀÎÇÏ½Ã°í ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}
		
		print("-", "ÁÖ¼Ò¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		addresW:while(true)
		{
			address = sc.nextLine();
			switch(check("[°¡-ÆR]*" + " " + "[°¡-ÆR]*" + " " + "[°¡-ÆR]*" + " " + "[0-9]{1,5}-[0-9]{1,5}", address))
			{
				case "true":
					break addresW;
				default :
					print("*", "ÁÖ¼Ò¸¦ È®ÀÎÇÏ½Ã°í ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}
		
		print("-", "°¡ÀÔ °æ·Î¸¦ ¼±ÅÃÇØ ÁÖ¼¼¿ä - (1)ÀÎÅÍ³İ (2)Ä£±¸ÃßÃµ (3)½Å¹® (4)±âÅ¸");
		joinW:while(true)
		{
			join = sc.nextLine();
			switch(check("[0-9]{1}", join))
			{
				case "true":
					break joinW;
				default :
					print("*", "¹øÈ£¸¦ È®ÀÎÇÏ½Ã°í ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
					continue;
			}
		}
		
		print("-", "»çÀÌÆ®¿¡ ¹Ù¶ó´Â Á¡À» ÀÛ¼ºÇØ ÁÖ¼¼¿ä");
		commW:while(true)
		{
			joinComment = sc.nextLine();
			switch(check("[0-9]{1}", join))
			{
				case "true":
					if(joinComment.trim().length() <= 0) print("*", "»çÀÌÆ®¿¡ ¹Ù¶ó´Â Á¡À» ÀÛ¼ºÇØ ÁÖ¼¼¿ä");
					else break commW;
				default :
					print("*", "»çÀÌÆ®¿¡ ¹Ù¶ó´Â Á¡À» ÀÛ¼ºÇØ ÁÖ¼¼¿ä");
					continue;
			}
		}

		print("@", name + "´Ô °¡ÀÔÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù");
		print("^", "          È¸¿øÁ¤º¸               ");
		
		System.out.println("ÀÌ¸§ : " + name + "\nÁÖ¹Î¹øÈ£ : " + name + "\nº°¸í : " + nickName + "\nÀÌ¸ŞÀÏ : " + 
				mail + "\nºñ¹Ğ¹øÈ£ : " + pw + "\nÀüÈ­¹øÈ£ : " + phone + "\nÁÖ¼Ò : " + address);
		
	}
	
	static String check(String pt, String compare)
	{
		String str = Pattern.matches(pt, compare) ? "true" : "false";
		return str;
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
