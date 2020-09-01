import java.util.ArrayList;

abstract class Enhedslisten {

    boolean[] tracks = new boolean[4];
    boolean[] signals = new boolean[6];
    boolean[] switches = new boolean[2];

     public boolean signal(boolean tr2, boolean tr3, boolean s2, boolean sw1){
         if(tr2 == false || tr3 == false){
             if(tr2 == false){
                 sw1 = true;
                 s2 = true;
             }
             else{
                 s2 = false;

             }

         }
     }

}
