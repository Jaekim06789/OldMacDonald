class Chick implements Animal
{
     //your code here
     private String myType;
     private String mySound;
     private String mySound1;
     private String mySound2;
     private boolean doubley;
     private float var;

     public Chick(String type,String sound){
       myType = type;
       mySound = sound;
       doubley = false;
     }
     public Chick(String type,String sound1,String sound2){
       myType = type;
       mySound1 = sound1;
       mySound2 = sound2;
       doubley = true;
     }
     public Chick(){
       myType = "Unknown Chick";
       mySound = "cluck";
     }
     public String getSound(){
       var = (float)(Math.random());
       if(doubley == true){
         if(var > .5){
           return mySound1;
         }else{
           return mySound2;
         }
       }else{
         return mySound;
       }
     }
     public String getType(){
       return myType;
     }
}
