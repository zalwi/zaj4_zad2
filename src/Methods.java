class Methods {
    void changeTempAndShowStatus(Room room){
        System.out.println("Aktualna temperatura: " + room.getTemperature() + "C");
        System.out.println("Próba obniżenia temperatury: " + room.decreaseTemperature());
    }
}
