public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int actualMins){
       return expectedMinutesInOven()-actualMins;
    }

   public int preparationTimeInMinutes(int layers){
       return layers*2;
   }

   public int totalTimeInMinutes(int layers, int actualMins){
       return preparationTimeInMinutes(layers) + actualMins;
   }
}
