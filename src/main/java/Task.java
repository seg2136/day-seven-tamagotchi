public class Task{

  private String mDescription; //A variable in each Task object which holds description

  //Task initiator: Specifies that a Task object is created with:
  //Task taskName = new Task("String goes in parameters")
  public Task(String description){
    mDescription = description; //Assign mDescription for this task at Task initialization
  }

  public String getDescription() {
    return mDescription;
  }



}
