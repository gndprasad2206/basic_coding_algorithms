//3. Online Store: Create a class called Product that represents a product in an online store, and a class called Store that represents the store. The store class should have methods to add, remove, and display products. You can also create a custom exception called ProductNotFoundException to throw when a product is not found in the store.
import java.util.Scanner;
class Product_1{
  private String name;
  private double price;
  private int quantity;
  /*public Product_1(String name,double price,int quantity){
    this.name=name;
    this.price=price;
    this.quantity=quantity;
  }*/
  public void setName(String name){
    this.name=name;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public void setQuantity(int quantity){
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
class Store extends Product_1{
  Scanner sc=new Scanner(System.in);
  public void addProduct(Product_1 p[]){
    Product_1 newp[]=new Product_1[p.length+1];
    int l=newp.length-1;
    newp[l]=new Product_1();
    for(int i=0;i<p.length;i++){
      newp[i]=p[i];
    }
    System.out.print("Entre name: ");
    newp[l].setName(sc.nextLine());
    System.out.print("Ente Price: ");
    newp[l].setPrice(sc.nextDouble());
    System.out.print("Enter Quantity: ");
    newp[l].setQuantity(sc.nextInt());
    
    for(int i=0;i<newp.length;i++){
      System.out.println();
      System.out.println("Name: "+newp[i].getName());
      System.out.println("Price: "+newp[i].getPrice());
      System.out.println("Qunatity: "+newp[i].getQuantity());
    }
  }
  public void removeProduct(Product_1 p[],int index){
    Product_1 newp[]=new Product_1[p.length-1];
    int k=0;
    for(int i=0;i<p.length;i++){
      if(index==i){
        continue;
      }
      else{
        newp[k++]=p[i];
      }
    }
    for(int j=0;j<newp.length;j++){
      System.out.println();
      System.out.println("Name: "+newp[j].getName());
      System.out.println("Price: "+newp[j].getPrice());
      System.out.println("Qunatity: "+newp[j].getQuantity());
    }
  }
  public void display(Product_1 p[],int index){
    try{
      if(p.length-1<=index){
        throw new ProductNotFoundException("ProductNotFoundException");
      }
      else{
        for(int i=0;i<p.length;i++){
          if(i!=index){
            continue;
          }
          else{
            System.out.println("Name: "+p[i].getName());
            System.out.println("Price: "+p[i].getPrice());
            System.out.println("Qunatity: "+p[i].getQuantity());
          }
        }
      }
    }
    catch(ProductNotFoundException e){
      System.out.println("Exception: "+e.getMessage());
    }
  }
}
class ProductNotFoundException extends Exception{
  public ProductNotFoundException(String str){
    super(str);
  }
}
public class Exception3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the count of products");
    int n=sc.nextInt();
    Product_1 p[]=new Product_1[n];
    for(int i=0;i<p.length;i++){
      p[i]=new Product_1();
      System.out.println("Enter the "+(1+i)+" Details");
      sc.nextLine();
      System.out.print("Enter name: ");
      p[i].setName(sc.nextLine());
      System.out.print("Enter Price: ");
      p[i].setPrice(sc.nextDouble());
      System.out.print("Enter Quantity: ");
      p[i].setQuantity(sc.nextInt());
    }
    System.out.println("1.Add Product\n2.Remove Product\n3.Display Product\nSelect one option");
    int choice=sc.nextInt();
    Store s=new Store();
    switch(choice){
      case 1:
        s.addProduct(p);
        break;
      case 2:
        //Store s=new Store();
        System.out.println("Enter Index value to remove");
        int ind=sc.nextInt();
        s.removeProduct(p,ind);
        break;
      case 3:
        System.out.println("Enter Index value to desplay");
        int index=sc.nextInt();
        s.display(p,index);
        break;
      default:
        System.out.println("Invalid Option");
    }
  }
}