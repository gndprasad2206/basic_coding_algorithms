//Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.
import java.util.Scanner;
class Product{
  private String name;
  private double price;
  private int quantity;
  void setName(String name){
    this.name=name;
  }
  void setPrice(double price){
    this.price=price;
  }
  void setQuantity(int quantity){
    this.quantity=quantity;
  }
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }
}
class PointOfSale extends Product{
  private int listOfProduct;
  void setListOfProduct(int list){
    listOfProduct=list;
  }
  public void addProduct(PointOfSale list[]){
    Scanner sc=new Scanner(System.in);
    PointOfSale add[]=new PointOfSale[list.length+1];
    int length=add.length-1;
    add[length]=new PointOfSale();
    System.out.print("Name of Product: ");
    add[length].setName(sc.nextLine());
    System.out.print("Price of Product: ");
    add[length].setPrice(sc.nextDouble());
    System.out.print("Quantity of Product: ");
    add[length].setQuantity(sc.nextInt());
    for(int i=0;i<list.length;i++){
      add[i]=list[i];
    }
    System.out.println(" product details After Adding new Product");
    for(int i=0;i<add.length;i++){
      System.out.println("Name of the Product "+add[i].getName());
      System.out.println("Price of the Product "+add[i].getPrice());
      System.out.println("quantity of the product "+add[i].getQuantity());
      System.out.println();
    }
  }
  public void removeProduct(PointOfSale list[],int index){
    PointOfSale product[]=new PointOfSale[list.length-1];
    int k=0;
    for(int i=0;i<list.length;i++){
      if(i==index){
        continue;
      }
      product[k++]=list[i];
    }
    System.out.println("Products list After Removing");
    for(int i=0;i<product.length;i++){
      System.out.println("Name of the Product "+product[i].getName());
      System.out.println("Price  of the Product "+product[i].getPrice());
      System.out.println("Quantity of the Product "+product[i].getQuantity());
      System.out.println();
    }
    System.out.println("List of products After remove "+(listOfProduct-1));
  }
  public double getTotalCost(PointOfSale list[]){
    double totalCost=0;
    for(int i=0;i<list.length;i++){
      totalCost=totalCost+list[i].getPrice();
    }
    return totalCost;
  }
}
public class GrandTest3Ex{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number of Products");
    int n=sc.nextInt();
    PointOfSale list[]=new PointOfSale[n];
    for(int i=0;i<list.length;i++){
      list[i]=new PointOfSale();
      list[i].setListOfProduct(n);
      System.out.println();
      System.out.println("Enter the "+(1+i)+" Product Details");
      System.out.print("Name of the product: ");
      sc.nextLine();
      list[i].setName(sc.nextLine());
      System.out.print("Price of the Product: ");
      list[i].setPrice(sc.nextDouble());
      System.out.print("Quantity of the product: ");
      list[i].setQuantity(sc.nextInt());
    }
    System.out.println("********MANU********");
    int c=0;
    for(int i=0;i<list.length;i++){
      if(c==1)
        break;
      System.out.println("options on "+(1+i)+" Product");
      System.out.println("1.Get Name\n2.Get Price\n3.Get Quantity\n4.Remove Product\n5.Add product\n6.Get Total Cost");
      System.out.println("Select one option");
      int m=sc.nextInt();
      switch(m){
        case 1:
          System.out.println("Name of the Product is: "+list[i].getName());
          break;
        case 2:
          System.out.println("Price of the Product: "+list[i].getPrice());
          break;
        case 3:
          System.out.println("Quantity of the product is :"+list[i].getQuantity());
          break;
        case 4:
          System.out.println("Enter the product index to remove");
          int index=sc.nextInt();
          list[i].removeProduct(list,index);
          break;
        case 5:
          list[i].addProduct(list);
          break;
        case 6:
          System.out.println("Total cost of the products "+list[i].getTotalCost(list));
          c++;
          break;
        default:
          System.out.println("Invalid Option");
      }
    }
  }
}