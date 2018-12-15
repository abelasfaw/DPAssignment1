using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VirtualOverride
{
    class Program
    {
        static void Main(string[] args)
        {
        }

        class Shape
        {
            int numberOfSides;
            string shapeName;
            public Shape(int numberOfSides, string shapeName)
            {
                this.numberOfSides = numberOfSides;
                this.shapeName = shapeName;
            }
            public virtual string getShapeName()
            {
                return this.shapeName;
            }
            public virtual int getNumberOfSides()
            {
                return this.numberOfSides;
            }
        }
        class Rectangle : Shape {
            public Rectangle( ) :base(4 , "Rectangle"){
                
            }
            public override string getShapeName()
            {
                return "Rectangle";
            }
            public override int getNumberOfSides()
            {
                return 4;
            }
        }
        class Triangle : Shape {
            public Triangle() : base(3, "triangle") {
            }
            public override string getShapeName()
            {
                return "Triangle";
            }
            public override int getNumberOfSides()
            {
                return 3;
            }

        }

    }
}