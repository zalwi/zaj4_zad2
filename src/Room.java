class Room {
    private double area;
    private double temperature;
    private boolean airConditioning;
    private final double limitOfTemperature = 15;

    public Room() {
    }

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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public double getLimitOfTemperature() {
        return limitOfTemperature;
    }
}
