public class Tamagotchi{

  private String mName;
  private int mFoodLevel;
  private int mSleepLevel;
  private int mActivityLevel;

  //A variable in each Task object which holds description

  //Task initiator: Specifies that a Task object is created with:
  //Task taskName = new Task("String goes in parameters")
  public Tamagotchi(String name){
    mName = name; //Assign mDescription for this task at Task initialization
    mFoodLevel = 10;
    mSleepLevel = 10;
    mActivityLevel = 10;
  }

  public String getName() {
    return mName;
  }

  public int getFoodLevel() {
    return mFoodLevel;
  }

  public int getSleepLevel() {
    return mSleepLevel;
  }

  public int getActivityLevel() {
    return mActivityLevel;
  }

  public void timePasses() {
    mFoodLevel--;
    mSleepLevel--;
    mActivityLevel--;
  }

  public boolean isAlive() {
    if ((mFoodLevel <= 3) && (mSleepLevel <= 3) && (mActivityLevel <= 3)){
      return false;
    }
    else if ((mFoodLevel == 0) || (mSleepLevel == 0) || (mActivityLevel == 0)) {
      return false;
    }
    else if (mFoodLevel >= 13) {
      return false;
    }
    else if ((mActivityLevel > 7) && (mSleepLevel < 3)) {
      return false;
    } else {
      return true;
    }
  }

  public String lifeStatus() {
    if (isAlive()) {
      return "April is still alive!";
    }
    else {
      return "You are a terrible owner! April has been placed in another home, aka Heaven.";
    }
  }


}
