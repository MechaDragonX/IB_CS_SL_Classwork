using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwoRockets
{
    class TwoRockets
    {
        static void Main(string[] args)
        {
            tri();
            plusln();
            rec();
            plusln();
            us();
            plusln();
            rec();
            plusln();
            tri();

            Console.ReadLine();
        }
        public static void tri()
        {
            Console.WriteLine("  / \\      / \\");
            Console.WriteLine(" /   \\    /   \\");
		    Console.WriteLine("/     \\  /     \\");
        }
        public static void plusln()
        {
            Console.WriteLine("+------+ +------+");
        }
        public static void rec()
        {
            Console.WriteLine("|      | |      |");
            Console.WriteLine("|      | |      |");
        }
        public static void us()
        {
            Console.WriteLine("|United| |United|");
            Console.WriteLine("|States| |States|");
        }
    }
}