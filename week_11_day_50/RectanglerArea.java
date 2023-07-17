/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
by creating a class named 'Rectangle' with a method named 'Area' 
which returns the area and length and breadth passed as parameters to its constructor.*/
class Rectangler6{
  private double width;
  private double length;
  public Rectangler6(double width,double length){
    this.width=width;
    this.length=length;
  }
  public double rectangleArea(Rectangler6 obj){
    return (obj.width*obj.length);
  }
}
public class RectanglerArea{
  public static void main(String[] args){
    Rectangler6 r1=new Rectangler6(4,5);
    Rectangler6 r2=new Rectangler6(5,8);
    System.out.println("Area Of First Rectangle "+r1.rectangleArea(r1));
    System.out.println("Area Of Second Rectangle "+r2.rectangleArea(r2));
  }
}