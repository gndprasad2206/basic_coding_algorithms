interface Gaming{
  String gameName="PUBG";
  int rank=1;
  void topGame();
  void startGame();
  void batteryLow();
}
class Develop implements Gaming{
  public void topGame(){
    System.out.println("Top game in India\n"+gameName+"\nRank is "+rank);
  }
  public void startGame(){
    System.out.println("Game Started........");
  }
  public void batteryLow(){
    System.out.println("Opss!!\nBattery Low Please charge the phone ");
  }
}
public class InterfaceDemo1{
  public static void main(String[] args){
    Develop game=new Develop();
    game.topGame();
    game.startGame();
    game.batteryLow();
  }
}