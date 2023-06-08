class SetterGetter{
  String name;
  int id;
  String gender;
  long mobileNumber;
  public void setName(String name){
    this.name=name;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setGender(String gender){
    this.gender=gender;
  }
  public void setMobileNumber(long mobileNumber){
    this.mobileNumber=mobileNumber;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public String getGender(){
    return gender;
  }
  public long getMobileNumber(){
    return mobileNumber;
  }
}
public class SetterGetterMain{
  public static void main(String[] args){
    SetterGetter obj=new SetterGetter();
    obj.setName("gana");
    obj.setId(232);
    obj.setGender("male");
    obj.setMobileNumber(6303715398l);
    System.out.println("the name is "+obj.getName());
    System.out.println("Id is: "+obj.getId());
    System.out.println("gender is: "+obj.getGender());
    System.out.println("The mobile number is: "+obj.getMobileNumber());
  }
}