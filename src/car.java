//abstract class provides common behaviors for all vehicles like honking and fueling
abstract class myvehicle implements vehicle{
  public String model;
  public int year;
  public myvehicle(String model, int releaseDate){
   this.model = model;
   this.year = year;
  }
  public void fueling(){
   System.out.println("The " + model + " is fueling");
  }
  public void honking(){
   System.out.println("The " + model + " is honking");
  }

  public String getModel(){
   return model;
  }
  public int getYear(){
   return year;
  }
  //Abstract method unique to each type of vehicle
  abstract void uniqueFeature();
 }