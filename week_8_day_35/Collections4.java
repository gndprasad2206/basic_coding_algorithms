import java.util.ArrayList;
class Book_1{
  private String title;
  private double price;
  private String author;
  public Book_1(String title,double price,String author){
    this.title=title;
    this.price=price;
    this.author=author;
  }
  public String getTitle(){
    return title;
  }
  public double getPrice(){
    return price;
  }
  public String getAuthor(){
    return author;
  }
}
public class Collections4{
  public static void main(String[] args){
    ArrayList<Book_1> obj=new ArrayList<Book_1>();
    Book_1 b1=new Book_1("Nature",500.0,"Prasad");
    Book_1 b2=new Book_1("City",600.21,"Ravi");
    Book_1 b3=new Book_1("Explore",800,"Pavan");
    obj.add(b1);
    obj.add(b2);
    obj.add(b3);
    System.out.println("Books Details");
    for(Book_1 b:obj){
      System.out.println("The title: "+b.getTitle());
      System.out.println("Price :"+b.getPrice());
      System.out.println("Author  is :"+b.getAuthor());
    }
  }
}