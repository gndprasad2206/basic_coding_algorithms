//program to illustrate HashMap Demo
import java.util.*;

 

class HashMapDemo1 {
  public static void main(String[] args) {
    HashMap hm = new HashMap();
    hm.put("A", "AAA");
    hm.put(2, "BBB");
    hm.put("C", "CCC");
    hm.put("D", "DDD");
    hm.put("E", "EEE");
    System.out.println(hm); //{A=AAA, B=BBB, C=CCC, D=DDD, E=EEE}
    HashMap hm1 = new HashMap();
    hm1.put("X", "XXX");
    hm1.put("Y", "YYY");
    System.out.println(hm1);//{X=XXX, Y=YYY}
    hm.putAll(hm1);
    System.out.println(hm); //{A=AAA, B=BBB, C=CCC, D=DDD, E=EEE, X=XXX, Y=YYY}
    System.out.println(hm.get(2));//BBB
    System.out.println(hm.remove("E"));//EEE
    System.out.println(hm.size());//6
    System.out.println(hm.isEmpty());//false
    System.out.println(hm.containsKey("D"));//true
    System.out.println(hm.containsValue("DDD"));//true
    System.out.println(hm.keySet());//[A, 2, C, D, X, Y]
    System.out.println(hm.values());//[AAA, BBB, CCC, DDD, XXX, YYY]
    // The method keySet() returns a set of all keys which may be
    // used to retrieve corresponding values.
    Set keys = hm.keySet();
    for (Object k : keys)
      System.out.println(k + "->" + hm.get(k));
    /*A->AAA
      2->BBB
      C->CCC
      D->DDD
      X->XXX
      Y->YYY*/
    // The method entrySet(), on the other hand, returns a set of
    // Map.Entry objects each of which consists of a key and a value.
    Set entries = hm.entrySet();
    for (Object o : entries) {
      Map.Entry e = (Map.Entry) o;
      System.out.println(e.getKey() + "->" + e.getValue());
      /*A->AAA
2->BBB
C->CCC
D->DDD
X->XXX
Y->YYY*/
    }
  }
}

 

/*
* A set of the entries in the map is obtained by calling entrySet( ).
* It returns a Set collection that contains the entries.
* Each entry is held in an object of type Map.Entry. Given a Map.Entry
* object, you can obtain the key by calling getKey( ). To obtain the value,
* call getValue( ). Using
* the entry set, it is easy to cycle through a map, obtaining each entry in
* turn.
*/