public class JedliksToyCar {
    private int distance;
    private int percent = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
      return "Driven "+ distance+" meters";
    }

    public String batteryDisplay() {
       if (percent == 0) {
           return "Battery empty";
       }  
       return "Battery at "+ percent + "%";
    }

    public void drive() {
       if (percent == 0) {
           return;
       }   
        percent -= 1;
        distance += 20;
    }    
}
