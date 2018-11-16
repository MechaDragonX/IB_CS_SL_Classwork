package io;

import java.io.*;
import java.util.*;

public class fileio
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("C:\\Users\\ragha\\OneDrive\\eclipse\\Classwork\\src\\io\\text.txt");
		// filez(f);
		readFile(f);
	}
	public static void filez(File f) throws FileNotFoundException
	{
		try
		{
			Scanner input = new Scanner(f);
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.getClass());
		}
		if (f.exists())
		{
			System.out.println("Yay!");
		}
	}
	public static int readFile(File f)
	{
		X
		return 0;
	}
}
