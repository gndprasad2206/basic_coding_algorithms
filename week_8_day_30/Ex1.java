public class Ex1{
  public static void main(String[] args){
    int arr[]=new int[3];
    arr[0]=232;
    arr[1]=522;
    arr[2]=646;
    for(int i=0;i<3;i++){
      int num=arr[i],rev=0,digit=0;
      System.out.println(num);
      while(num>0){
        digit=num%10;
        //System.out.println(digit);
        rev=rev*10+digit;
        num=num/10;
        }
      //System.out.println(rev);
        if(rev==arr[i]){
        System.out.println(arr[i]);
      }
    }
  }
}