
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length-1] +=1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day: birdsPerDay) {
            if (day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
       
        int numBirds = 0;
          if  (numberOfDays > birdsPerDay.length){
            for (int day : birdsPerDay){
                numBirds += day;
            }
              return numBirds;
        }
        for (int i = 0; i < numberOfDays; i++){
            numBirds += birdsPerDay[i];
        }
        return numBirds;
    }

    public int getBusyDays() {
        int numbers = 0;
        for (int day: birdsPerDay) {
            if (day >= 5) {
                numbers +=1;
            }
        }
        return numbers;
    }
}    
