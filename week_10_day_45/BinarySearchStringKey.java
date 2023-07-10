import java.util.Scanner;
import java.util.Arrays;
class BinarySearch{
  public int binSearch(String words[],String key,int n){
    int low=0,high=n-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(words[mid].equalsIgnoreCase(key)){
        return mid;
      }
      else{
        int val=key.compareTo(words[mid]);
        if(val>0){
          low=mid+1;
        }
        else{
          high=mid-1;
        }
      }
    }
    return -1;
  }
}
public class BinarySearchStringKey{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    System.out.println("Enter key value ");
    String key=sc.nextLine();
    String words[]=str.split(" ");
    Arrays.sort(words);
    int n=words.length;
    BinarySearch bi=new BinarySearch();
    int result=bi.binSearch(words,key,n);
    //System.out.println(check);
    if(result!=-1){
      System.out.println("The key element "+key+" is found in index of "+result);
    }
    else{
      System.out.println(key+" is not found");
    }
  }
}