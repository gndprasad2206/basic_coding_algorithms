
public class FibinocisMain{
  public static void main(String[] args){
    int n=8;
    int feb1=0,feb2=1,feb=0;
    System.out.print(feb1+" "+feb2+" ");
    for(int i=2;i<n;i++){
      feb=feb1+feb2;
      feb1=feb2;
      feb2=feb;
      System.out.print(feb+" ");
    }
  }
}