using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


delegate int genericOperation(int num);
 namespace Delegates
{
    class Program
    {
        static int result = 0;

        static void Main(string[] args)
        {
            genericOperation operation1 = new genericOperation(add);
            genericOperation operation2 = new genericOperation(mul);
            genericOperation operation3 = new genericOperation(subtract);

            operation1(10);
            operation2(2);
            operation3(5);
            Console.ReadKey();
          
        }
        public static int add(int num) {
            result += num;
            Console.WriteLine("after addition result = " + result);
            return result;
        }
        public static  int mul(int num) {
            result *= num;
            Console.WriteLine("after multiplication result = " + result);
            return result;
        }
        public static int subtract(int num) {
            result -= num;
            Console.WriteLine("after subtraction result = " + result);
            return result;
        }
    }
}
