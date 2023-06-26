//2. Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.
import java.util.Scanner;
class Shapes
  {
    private double radius;
    private double length;
    private double breath;
    private double width;
    private double side1;
    private double side2;
    private double base;
    private double height;
    public void setRadius(double r){
      radius=r;
    }
    public void setLength(double l){
      length=l;
    }
    public void setBreath(double b){
      breath=b;
    }
    public void setWidth(double w){
      width=w;
    }
    public void setSide1(double s1){
      side1=s1;
    }
    public void setSide2(double s2){
      side2=s2;
    }
    public void setBase(double base){
      this.base=base;
    }
    public void setHeight(double h){
      height=h;
    }
    public double getRadius(){
      return radius;
    }
    public double getLength(){
      return length;
    }
    public double getBreath(){
      return breath;
    }
    public double getWidth(){
      return width;
    }
    public double getSide1(){
      return side1;
    }
    public double getSide2(){
      return side2;
    }
    public double getBase(){
      return base;
    }
    public double getHeight(){
      return height;
    }
  }
class Circle_1 extends Shapes{
  Scanner sc=new Scanner(System.in);
  double area=0;
  public void area(){
    System.out.println("Enter radius");
    setRadius(sc.nextDouble());
    double r=getRadius();
    try{
      if(r<0){
        throw new InvalidDimensionsException("InvalidDimensionsException");
      }
      else{
      area=2*3.14*(r*r);
      }
    }catch(InvalidDimensionsException e){
      System.out.println("Exception: "+e.getMessage());
      System.exit(0);
    }
    System.out.println("Area Of circle is:"+area);
  }
  public void perimeter(){
    double perimeter=0;
    System.out.println("Enter radius");
    setRadius(sc.nextDouble());
    double r=getRadius();
    try{
      if(r<0){
        throw new InvalidDimensionsException("InvalidDimensionsException");
      }
      else{
        perimeter=2*3.14*r;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("Exception: "+e.getMessage());
      System.exit(0);
    }
    System.out.println("Perimeter of Circle: "+perimeter);
  }
}
class Rectangle extends Shapes{
  Scanner sc=new Scanner(System.in);
  public void area(){
    double area=0;
    System.out.println("Enter the length");
    setLength(sc.nextDouble());
    System.out.println("Enter the breath");
    setBreath(sc.nextDouble());
    double l=getLength();
    double b=getBreath();
    try{
      if(l<0||b<0){
        throw new InvalidDimensionsException("InvalidDimensionsException");
      }
      else{
        area=l*b;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("Exception: "+e.getMessage());
      System.exit(0);
    }
    System.out.println("Area of the Rectangle"+area);
  }
  public void perimeter(){
    double perimeter=0;
    System.out.print("Enter width: ");
    setWidth(sc.nextDouble());
    System.out.print("Enter Height: ");
    setHeight(sc.nextDouble());
    double w=getWidth();
    double h=getHeight();
    try{
      if(w<0||h<0){
        throw new InvalidDimensionsException("InvalidDimensionsException");
      }
      else{
        perimeter=2*(w+h);
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("Exception: "+e.getMessage());
      System.exit(0);
    }
    System.out.println("Perimeter of the Reactangle: "+perimeter);
  }
}
class Traingle extends Shapes{
  Scanner sc=new Scanner(System.in);
  public void area(){
    double area=0;
    System.out.print("Enter the Base: ");
    setBase(sc.nextDouble());
    System.out.print("Enter the Height: ");
    setHeight(sc.nextDouble());
    double b=getBase();
    double h=getHeight();
    try{
      if(b<0||h<0){
        throw new InvalidDimensionsException("InvalidDimensionsException");
      }
      else{
        area=0.5*b*h;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("Exception: "+e.getMessage());
      System.exit(0);
    }
    System.out.println("Area of the triangle is "+area);
  }
  public void perimeter(){
    double perimeter=0;
    System.out.print("Enter the Side 1: ");
    setSide1(sc.nextDouble());
    System.out.print("Entre the Side 2: ");
    setSide2(sc.nextDouble());
    System.out.print("Enter the Base: ");
    setBase(sc.nextDouble());
    double s1=getSide1();
    double s2=getSide2();
    double b=getBase();
    try{
      if(s1<0||s2<0||b<0){
        throw new InvalidDimensionsException("InvalidDimensionsException");
      }
      else{
        perimeter=s1+b+s2;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("Exception: "+e.getMessage());
      System.exit(0);
    }
    System.out.println("Perimeter of the triangle is: "+perimeter);
  }
}
class InvalidDimensionsException extends Exception{
  public InvalidDimensionsException(String str){
    super(str);
  }
}
public class Exception2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("1.Circle\n2.Traingle\n3.Rectangle\nSelect one Option");
    int n=sc.nextInt();
    switch(n){
      case 1:
        Circle_1 c=new Circle_1();
        System.out.println("1.Area\n2.Perimeter\nSelect any one Operation");
        int m=sc.nextInt();
        switch(m){
          case 1:
            c.area();
            break;
          case 2:
            c.perimeter();
            break;
        }
        break;
      case 2:
        Rectangle r=new Rectangle();
        System.out.println("1.Area\n2.Perimeter\nSelect any one Operation");
        int k=sc.nextInt();
        switch(k){
          case 1:
            r.area();
            break;
          case 2:
            r.perimeter();
            break;
        }
        break;
      case 3:
        Traingle t=new Traingle();
        System.out.println("1.Area\n2.Perimeter\nSelect any one Operation");
        int l=sc.nextInt();
        switch(l){
          case 1:
            t.area();
            break;
          case 2:
            t.perimeter();
            break;
        }
        break;
      default:
        System.out.println("Invalid opition");
    }
  }
}