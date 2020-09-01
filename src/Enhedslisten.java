import java.util.ArrayList;

abstract class Enhedslisten {

    boolean[] tracks = new boolean[4];
    boolean[] signals = new boolean[6];
    boolean[] switches = new boolean[2];

     public void signal(boolean tr2, boolean tr3, boolean s1, boolean sw1){
         if(tr2 == false || tr3 == false){
             if(tr2 == false){
                 sw1 = true;
                 s1 = true;
             }
             else{
                 sw1 = false;
                 s1 = true;
             }
         }
         else{
             s1 = false;
         }
     }


}
