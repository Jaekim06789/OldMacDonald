class Cow implements Animal
{
     //your code here
     protected String myType;
     protected String mySound;

     public Cow(String type,String sound){
       myType = type;
       mySound = sound;
     }
     public Cow(){
       myType = "Unknown Cow";
       mySound = "Moo";
     }
     public String getSound(){
       return mySound;
     }
     public String getType(){
       return myType;
     }
}

// class FrenchCow extends Cow
// {
//   FrenchCow(){
//     sSound = "meuh";
//   }
// }
//
// class EnglishCow extends Cow
// {
//   EnglishCow(){
//     sSound = "moo";
//   }
// }
