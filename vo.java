/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	boolean isVowel=false;
		  Scanner scanner=new Scanner(System.in);
		  char ch=scanner.next().charAt(0);
		  scanner.close(); 
		  switch(ch) 
		  {
		  	case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : case 'A' : case 'E' : case 'I' : case 'O' : case 'U' : isVowel = true;
		  	} 
		  	if(isVowel == true)
		  		System.out.println("Vowel");
		  	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		  			System.out.println("Consonant"); 
		  	else System.out.println("invalid");	// your code goes here
	}
}
