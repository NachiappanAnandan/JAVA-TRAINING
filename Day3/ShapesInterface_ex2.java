package Day3;



public class ShapesInterface_ex2 {
    public static void main(String[] args) {
        Shapes s1 = new Square(4);
        Shapes s2 = new Sphere(8);
        Shapes s3 = new Circle(11);
        Shapes s4 = new Cuboid(16);

        s1.Calculate();//square
        s2.Calculate();//sphere
        s3.Calculate();//circle
        s4.Calculate();//cuboid

    }
}


//  interfaces

/**
 * Innerex2
 */
interface CalcArea {
    public void perimeter();
    public void area();


}

interface CalcVolume{
    public void surfaceArea();
    public void volume();
}

/* 
 * Circle
 * Square
 * Triangle
 * Sphere
 * Cuboid
 */

 abstract class Shapes {
    public abstract void Calculate();
 }


 class Circle extends Shapes implements CalcArea {
    int r;
    Circle(int r){
        this.r = r;
    }
    public void area(){
        System.out.println("Area of Circle is "+3.14*r*r);
    }
    public void perimeter(){
        System.out.println("Perimeter of Circle is "+2*3.14*r);
    }

    @Override
    public void Calculate() {
        System.out.println("CIRCLE");
        area();
        perimeter();
    }
 }

 class Square extends Shapes implements CalcArea{
    int a;
    Square(int a){
        this.a = a;
    }
    public void area(){
        System.out.println("Area of square is "+a*a);
    }
    public void perimeter(){
        System.out.println("Perimeter of Square is "+4*a);
    }
    @Override
    public void Calculate() {
        System.out.println("SQUARE");
        area();
        perimeter();
    }
 }


 class Triangle extends Shapes implements CalcArea{
    int a,b,c;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b= b;
        this.c=c;

    }
    public void area(){
        System.out.println("Area of Triangle is "+(a+b+c)/2);
    }
    public void perimeter(){
        System.out.println("Perimeter of Triangle is "+a+b+c);
    }
    @Override
    public void Calculate() {
        System.out.println("TRIANGLE");
        area();
        perimeter();
    }
 }


 class Sphere extends Shapes implements CalcArea,CalcVolume{
    int r;
    Sphere(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("Area of Sphere is "+3.14*r*r);
    }
    public void perimeter(){
        System.out.println("Perimeter of Sphere is "+2*3.14*r);
    }
    public void surfaceArea(){
        System.out.println("Surface Area of Sphere is "+4*3.14*r*r);
    }
    public void volume(){
        System.out.println("Volume of Sphere is "+(4/3)*3.14*r*r*r);
    }
    @Override
    public void Calculate() {
        System.out.println("SPHERE");
        area();
        perimeter();
        surfaceArea();
        volume();
    }
 }


 class Cuboid extends Shapes implements CalcArea,CalcVolume{
    int a;
    Cuboid(int a){
        this.a =a;
    }
    public void area(){
        System.out.println("Area of Cuboid is "+a*a);
    }
    public void perimeter(){
        System.out.println("Perimeter of Cuboid is "+4*a);
    }
    public void surfaceArea(){
        System.out.println("Surface Area of Cuboid is "+6*a*a);
    }
    public void volume(){
        System.out.println("Volume of Cuboid is "+a*a*a);
    }
    @Override
    public void Calculate() {
        System.out.println("CUBOID");
        area();
        perimeter();
        surfaceArea();
        volume();
    }
 }



