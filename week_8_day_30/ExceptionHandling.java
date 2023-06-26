/*class InsufficientFundException extands Exception{
  InsufficientFundException(String msg){
    super(msg);
  }
}
public class ExceptionHandling{
  public static void main(String[] args){
    double balence=10000;
    double withdraw=20000;
    balence-=withdraw;
    try{if(balence<0){
      throw new InsufficientFundException("insufficient balenace");
    }
  }
    else{
      System.out.println("Available balence "+balence);
    }
    catch{
      
    }
  }
}*/