public class Example5{
  public static void main(String[] args){
    int arr[]={10,20,30,40};
    int key=20,k=0;
    int arr1[]=new int[arr.length-1];
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        continue;
      }
      else{
        arr1[k++]=arr[i];
      }
    }
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i]+" ");
    }
  }
}