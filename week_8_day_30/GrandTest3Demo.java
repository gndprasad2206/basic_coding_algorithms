//Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.
import java.util.Scanner;
class Book{
  private String title;
  String author;
  private long ISBN;
  private String publisher;
  public void setTitle(String title){
    this.title=title;
  }
  public void setAuthor(String author){
    this.author=author;
  }
  public void setISBN(long isbn){
    ISBN=isbn;
  }
  public void setPublisher(String publisher){
    this.publisher=publisher;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  } 
}
class Author extends Book{
  private String name;
  private String email;
  private int booksList;
  public void setName(){
    name=super.author;
  }
  public void setEmail(String email){
    this.email=email;
  }
  public void setBookList(int list){
    booksList=list;
  }
  public String getName(){
    return name;
  }
  public String getEmail(){
    return email;
  }
  public int addBook(int newList){
    booksList+=newList;
    return booksList;
  }
}
public class GrandTest3Demo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of books");
    int n=sc.nextInt();
    Author library[]=new Author[n];
    for(int i=0;i<library.length;i++){
      library[i]=new Author();
      System.out.println("Enter the "+(1+i)+" Book Details");
      System.out.print("Enter the book title: ");
      sc.nextLine();
      library[i].setTitle(sc.nextLine());
      System.out.print("Enter the Author of book: ");
      library[i].setAuthor(sc.nextLine());
      System.out.print("Enter the ISBN number: ");
      library[i].setISBN(sc.nextLong());
      System.out.print("Enter the publisher name: ");
      sc.nextLine();
      library[i].setPublisher(sc.nextLine());
      library[i].setName();
      System.out.print("Enter the email: ");
      library[i].setEmail(sc.nextLine());
      library[i].setBookList(n);
    }
    System.out.println("******MENU******");
    for(int i=0;i<library.length;i++){
      System.out.println("Options on "+(0+i)+" Book");
      System.out.println("1.Get Title\n2.Get Author\n3.Get name\n4.Get Email\n5.Add Book\nSelect one Option");
      int m=sc.nextInt();
      switch(m){
        case 1:
          System.out.println("Title of the Book is: "+library[i].getTitle());
          break;
        case 2:
          System.out.println("Author of the Book is: "+library[i].getAuthor());
          break;
        case 3:
          System.out.println("Name of the Author is: "+library[i].getName());
          break;
        case 4:
          System.out.println("Email address of the Author is: "+library[i].getEmail());
          break;
        case 5:
          System.out.println("Enter the number of books to be Add");
          int list=sc.nextInt();
          System.out.println("Total Books list After adding new Books: "+library[i].addBook(list));
          break;
        default:
          System.out.println("Invalid option");
      }
    }
  }
}