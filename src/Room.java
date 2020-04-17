class Room {
    double area;
    double temperature;
    boolean airConditioning;
    private final double limitOfTemperature = 15;

    public Room(double area, double temperature, boolean airConditioning) {
        this.area = area;
        this.temperature = temperature;
        this.airConditioning = airConditioning;
    }

    boolean decreaseTemperature(){
        if(airConditioning){
            temperature--;
            return isNotBelowMinimalTemperature();
        }
        return false;
    }

    private boolean isNotBelowMinimalTemperature(){
        if(temperature < limitOfTemperature){
            temperature = limitOfTemperature;
            return false;
        }
        else{
            return true;
        }

    }
}
