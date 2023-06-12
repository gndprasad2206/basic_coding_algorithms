interface AudioPlayer{
  void playAudio();
  void stopAudio();
}
interface VideoPlayer{
  void playVideo();
  void stopVideo();
}
class MultiMediaPlayer implements AudioPlayer,VideoPlayer{
  public void playAudio(){
    System.out.println("Audio Playing.....");
  }
  public void stopAudio(){
    System.out.println("Audio Stoped");
  }
  public void playVideo(){
    System.out.println("Playing video....");
  }
  public void stopVideo(){
    System.out.println("Video stoped");
  }
}
public class InterfaceDemo{
  public static void main(String[] args){
    MultiMediaPlayer play=new MultiMediaPlayer();
    play.playAudio();
    play.stopAudio();
    play.playVideo();
    play.stopVideo();
  }
}