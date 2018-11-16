/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorprojecteval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ParkerC
 */
public class Calculator
{    
	private static boolean isRadian = true;
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // comment out either startCalc() or testCalc() (just the method call below) 
				// based on how you want to run the project
        // use this code to drive your interactive calculator
        
        // add a welcome message here
    	System.out.println("Welcome to the calculator program!");
    	
        startCalc();   // you have to write this method below
                        // it should ask the user for input and print
                        // results until the user enters "quit" to stop
        

        // use this to validate your project (the calculator part, anyways)
        //testCalc();  // testCalc will call a calculate(String s) method that you create
                        // as part of your overall project. This method will take the user's
                        // input, and return a String with the appropriate output.
        
        // add a goodbye message here
        System.out.println("Thanks for using this calculator program!");
    	
    }
    
    public static void testCalc() throws FileNotFoundException{
        ArrayList<String> problems = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        // load problems from a file
        File fProblems = new File("problems.txt");
        Scanner sc = new Scanner(fProblems);        
        int count = 0;
        String line = "";
        int problemCount = 0;
        int resultCount = 0;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            if (!line.startsWith("//") && !line.trim().equals("")){        // ignore comments at the beginning
                problems.add(line.substring(3).trim());
                problemCount++;
                if (sc.hasNextLine()){
                    line = sc.nextLine();
                    if (!line.startsWith("//") && !line.trim().equals("")){
                        results.add(line.substring(3).trim());
                        resultCount++;
                    }
                } 
                count++;
            }
        }
        if (problemCount == resultCount){
            // now run the tests
            for (int i=0; i<problemCount; i++){
                String prob = problems.get(i);
                
                String result = calculate(prob);
                
                if (result == null){
                    System.out.println("FAILED test " + i);
                    System.out.println("Expression: " + problems.get(i));
                    System.out.println("Expected result: " + results.get(i));
                    System.out.println("Actual: null String returned from calculate()");
                } else {
                    if (result.equals(results.get(i))){
                        System.out.println("PASSED test " + i);
                    } else {
                        System.out.println("FAILED test " + i);
                        System.out.println("Expression: " + problems.get(i));
                        System.out.println("Expected result: " + results.get(i));
                        System.out.println("Actual: " + result);
                    }
                }
                    
            }
        } else {
            System.out.println("problem file error");
        }    
            
    }
    
    public static void startCalc(){
        // your code here to get user input, and calculate/print results. You'll call
        // the calculate(String s) as part of your code here, which returns a String
        // with the result to print. 
    	
    	//Declare variables
    	Scanner sc = new Scanner(System.in);
		String input = "";
		String orgInput = "";
		//boolean isRadian = false;
		double solution = 0.0;
		
		
		//Ask for user input and evaluate until the user decides to "Quit"
		while (true)
		{
			//Prompt user to enter an expression
			System.out.println("Please enter an expression.");
		
			//Store what the user had entered
			orgInput = sc.nextLine();
			
			//Convert original input from scanner to lower case , so it is easy to compare
			input = orgInput.toLowerCase().trim();
		
			//Check the user entered input for known commands inlcuding exit command
			if (input.equals("quit"))
			{
				//System.out.println("Thanks for using this calculator program!");
				break;
			}
			else if (input.equals("r"))
			{
				System.out.println("You are now in radian mode!");
				isRadian = true;
			}
			else if (input.equals("d"))
			{
				System.out.println("You are now in degree mode!");
				isRadian = false;
			}
			else if (input.equals("help")) //Let the user know what commands can be used.
			{
				System.out.println("This calculator can do many things.\n");
				System.out.println("If you type \"d\" you can use angle measures in degrees and if you type \"d\" you can use angle measures in radians.");
				System.out.println("If you type \"pi\" with a slash in front you can use \"Pi\" and if you type \"e\" with a slash in front you can use \"e\".\n");
				System.out.println("This calculator can do the following two operand operations:");
				System.out.println("Add (+)");
				System.out.println("Subtract (-)");
				System.out.println("Multiply (*)");
				System.out.println("Divide (/)");
				System.out.println("Exponentiate (^)");
				System.out.println("Modulo (%)\n");
				System.out.println("This calculator can do the following one operand operations:");
				System.out.println("Absolute Value (|)");
				System.out.println("Square Root (v)");
				System.out.println("Cube Root (3v)");
				System.out.println("Round to the nearest integer (~)");
				System.out.println("Sine (s)");
				System.out.println("Cosine (c)");
				System.out.println("Tangent (t)");
				System.out.println("Arcsine (as)");
				System.out.println("Arcosine (ac)");
				System.out.println("Arctangent (at)");
				System.out.println("Factorial (!)");
			}
			else
			{
				//Evaluate Expression by calling calculate() method
				//passing the user entered input
				String result = calculate(orgInput);
				
				//Only print the evaluated expression and the result , if calculate() did not return the string "ERROR"
				//The calculate method will return "ERROR" anytime an exception is thrown inside of it.
				if(!result.equals("ERROR"))
				{ 
					//Print the result
					System.out.println(input + " = " + result);
				}
			}
		}
    }
    
    public static String calculate(String s)
    {
        // you add code here to take a String as a parameter, and return a String with the result
    	
		String result = "";
		double solution = 0;
		boolean isError = false;
		
		//Exit the method , if the user entered  "quit" (regardless of the case)
        if(s.toLowerCase().equals("quit"))
        {
        	return s.toLowerCase();
        }
        
        //Scan the user input for tokens that can be used for evaluating the expressions.
		Scanner sc1 = new Scanner(s);
		
		//Check for a number at the beginning
		if (sc1.hasNextDouble())
		{
			try
			{
				solution = twoOptokens(sc1);
				//Convert solution to a String and return it.
				result =  String.valueOf(solution);			
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				result = "ERROR";
			}		
		}
		else
		{
			//Check for designated operator
			String operator = "";
			try
			{
				operator = sc1.next();
			}
			catch (Exception e)
			{
				System.out.println("ERROR: You didn't type anything or the number was too big.");
				isError = true;
				result = "ERROR";
			}
			//Continue only if there are no errors
			if (!isError)
			{
				//Check if the String at the beginning is a desingated operator
				switch (operator)
				{
					case "|":
					case "v":
					case "~":
					case "s":
					case "c":
					case "t":
					case "l":
					case "!":
					case "3v":
					case "as":
					case "ac":
					case "at":
						try 
						{
							//Evaluating one operand expression
							solution = oneOptokens(sc1, operator);
							result = String.valueOf(solution);
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
							result = "ERROR";
						}
						break;
					default:
						Exception e = new Exception("ERROR: The operator specified is invalid or is nonexistant.");
						System.out.println(e.getMessage());
						result = "ERROR";
				}
			}
		}
		return result;
    }
    
    public static double twoOptokens(Scanner sc1) throws Exception
	{
		double num1 = 0;
		String operator = "";
		double num2 = 0;
		String next = "";
		//Check the first number and store if it is a number
		if (sc1.hasNextDouble())
		{
			num1 = sc1.nextDouble();
		}
		else
		{
			throw new Exception("ERROR: The first number is invalid or nonexistant.");
		}
		//Check if there is an operator
		if (sc1.hasNextDouble() || !sc1.hasNext())
		{
			throw new Exception("ERROR: There is not an operator specified.");
		}
		else
		{
			operator = sc1.next();
		}
		//Check if there is a number at the end
		if (sc1.hasNextDouble())
		{
			num2 = sc1.nextDouble();
		}
		else if (operator.equals("!"))
		{
			double num = num1;
			return oneOpEvaluate(operator, num);
		}
		else
		{
			throw new Exception("ERROR: The second number is invalid or nonexistant.");
		}
		//Evaluate the expression
		return twoOpEvaluate(num1, operator, num2);
	}
	public static double oneOptokens(Scanner sc1, String operator) throws Exception
	{
		//Check if there is a number
		double num = 0;
		if (sc1.hasNextDouble())
		{
			num = sc1.nextDouble();
		}
		else
		{
			throw new Exception("ERROR: The number is invalid or nonexistant.");
		}
		//Evaluate the expression
		return oneOpEvaluate(operator, num);
	}
	
	public static double twoOpEvaluate(double num1, String operator, double num2) throws Exception
	{
		double solution = 0;
		//Do different operations based on the operator
		switch (operator)
		{
			case "+":
				solution = num1 + num2;
				break;
			case "-":
				solution = num1 - num2;
				break;
			case "*":
				solution = num1 * num2;
				break;
			case "/":
				solution = num1 / num2;
				break;
			case "%":
				solution = num1 % num2;
				break;
			case "^": 
			{	
				solution = Math.pow(num1, num2);
				break;
			}
			default:
				throw new Exception("ERROR: The operator specified is invalid or nonexistant.");
		}
		//Check for special things
		if (solution > Double.MAX_VALUE) //Is the number too big?
		{
			throw new Exception("ERROR: The answer is too big.");
		}
		else if (Double.isNaN(solution)) //Is the number real?
		{
			throw new Exception("ERROR: The answer is not real.");
		}
		return solution;
	}
	
	public static double oneOpEvaluate(String operator, double num) throws Exception
	{
		double solution = 0;
		//Do different operations based on the operator
		switch (operator)
		{
			case "|":
				solution = Math.abs(num);
				break;
			case "v":
				solution = Math.sqrt(num);
				break;
			case "~":
				solution = Math.round(num);
				break;
			case "s":
				if (isRadian)
				{
					solution = Math.sin(num);
				}
				else
				{
					solution = Math.sin(Math.toRadians(num));
				}
				break;
			case "c":
				if (isRadian)
				{
					solution = Math.cos(num);
				}
				else
				{
					solution = Math.cos(Math.toRadians(num));
				}
				break;
			case "t": 
				if (isRadian)
				{
					solution = Math.tan(num);
				}
				else
				{
					solution = Math.tan(Math.toRadians(num));
				}
				break;
			case "l":
				solution = Math.log10(num);
				break;
			case "3v":
				solution = Math.cbrt(num);
				break;
			case "as":
				if (isRadian)
				{
					solution = Math.asin(num);
				}
				else
				{
					solution = Math.asin(Math.toRadians(num));
				}
			case "ac":
				if (isRadian)
				{
					solution = Math.acos(num);
				}
				else
				{
					solution = Math.acos(Math.toRadians(num));
				}
			case "at":
				if (isRadian)
				{
					solution = Math.atan(num);
				}
				else
				{
					solution = Math.atan(Math.toRadians(num));
				}
			case "!":
				//Check if the number is whole
				if (num % 1 != 0) //If not...
				{
					throw new Exception("ERROR: You can only take the factorial of a whole number.");
				}
				else //if so...
				{
					solution = num;
					//Calculate factorial
					for (double i = num - 1; i > 0; i--)
					{
						solution *= i;
					}
				}
				break;
		}
		//Check for special things
		if (solution > Double.MAX_VALUE) //Is the number too big?
		{
			throw new Exception("ERROR: The answer is too big.");
		}
		else if (Double.isNaN(solution)) //Is the number real?
		{
			throw new Exception("ERROR: The answer is not real.");
		}
		return solution;
	}   
}