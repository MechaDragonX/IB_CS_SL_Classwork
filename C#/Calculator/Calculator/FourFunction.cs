using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculator
{
    class FourFunction
    {
        static void Main(string[] args)
        {
            /* 
             * Write a method that accepts a string  that represents an expression containing 2 integers and an operator
             * in the form of "<IntegerA><Operator><IntergerB>" (such as 5+7) and return the result of the expression 
             * in the form of an integer. For example, "5 + 7" should return an integer 12. Negative numbers can be used.
             * If the given expression is invalid, throw ArgumentException.
             * Allowed operators:
             * Addition '+',
             * Subtraction '-',
             * Multiplication '*',
             * Division '/'
             */

            Console.WriteLine(Operate("-1+1"));

            
            Console.ReadLine();
        }
        public static int Operate(string input)
        {
            int num1 = 0;
            int num2 = 0;
            int solution = 0;
            int i;
            int j;
            char operand = '0';
            char[] operands = new char[] { '+', '-', '*', '/' };
            input.Trim();
            for (i = 0; i < input.Length; i++)
            {
                for (j = 0; j < operands.Length; j++)
                {
                    if (input[i] == operands[j])
                    {
                        operand = operands[j];
                        break;
                    }
                }
                if (j == 0)
                {
                    break;
                }
            }
            string[] operation = input.Split(operands);
            num1 = int.Parse(operation[0].Trim());
            num2 = int.Parse(operation[1].Trim());
            switch (operand)
            {
                case '+':
                    {
                        solution = num1 + num2;
                        break;
                    }
                case '-':
                    {
                        solution = num1 - num2;
                        break;
                    }
                case '*':
                    {
                        solution = num1 * num2;
                        break;
                    }
                case '/':
                    {
                        solution = num1 / num2;
                        break;
                    }
            }
            return solution;
        }

        public static void Calculate(String input)
        {
            string[] tokenizedInput = null;

            if (String.IsNullOrEmpty(input))
            {
                throw new ArgumentNullException("input", "Cannot not be null or empty");
            }

            tokenizedInput = input.Split(new char[] { '+', '-', '/', '*' });

            //Now the tokenizedInput.Length must be 3
            //This is because  we expect 2 operands and 1 operator i.e. total of 3 tokens
            //If it is not 3 , then the user did not enter the input correctly.
            if (tokenizedInput.Length != 3)
            {
                throw new ArgumentException("The input was not in the correct format. Please provide the input in the format : < IntegerA >< Operator >< IntergerB > ");
            }

            //Now from the tokenizedInput[] , we can get the left operand , operator and right operand
            //as the be at array index [0] ,[1] and [2] respectively.

            string operand1 = tokenizedInput[0];
            string operand2 = tokenizedInput[1];
            string operatorSymbol = tokenizedInput[2];

            //Now you will need to check if the operand1 and operand2  are indeed numbers !
            //Why?  What if the user entered 5++ or 4*/ or -1-1 , the array lenght

            Console.WriteLine(operand1);
            Console.WriteLine(operand2);
            Console.WriteLine(operatorSymbol);

            Console.ReadKey();

        }
    }

  
}