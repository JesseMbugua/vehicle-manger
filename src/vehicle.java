// Interface for vehicles with start and stop the engines 
interface vehicle{
  void start();
  void stop();
}
//Concrete class extending MyVehicle and implementing its abstract methods
class car extends myvehicle{
  //public variables can be accessed by other classes
  public car(String model, int year){
    super(model, year);
  }

  //Overriding the methods to provide specific behavior for Car
  @Override
  public void start(){
    System.out.println("the " + model + " car has started");
  }
  @Override
  public void stop(){
    System.out.println("the " + model + " car has stopped");
  }
  @Override
  public void uniqueFeature(){
    System.out.println("The " + model + " car has Starlight Headliner");
  }
}


