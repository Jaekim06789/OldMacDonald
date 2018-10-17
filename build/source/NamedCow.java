class NamedCow extends Cow
{
  protected String myName;

  public NamedCow(String type, String name, String sound){
    myType = type;
    myName = name;
    mySound = sound;
  }

  public NamedCow(){
    myName = "Unnamed Cow.";
    myType = "Unknown Cow";
    mySound = "moo?";
  }
  public String getName(){
    return myName;
  }
}
