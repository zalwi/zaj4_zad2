class TestRoom {
    public static void main(String[] args) {
        Room room1 = new Room(15, 16, true);
        Room room2 = new Room(15, 16, false);
        Methods method = new Methods();
        //Obniżanie temperatury do 15 i poniżej stopni
        System.out.println("Pokój 1 z klimatyzacją");
        method.changeTempAndShowStatus(room1);
        method.changeTempAndShowStatus(room1);
        method.changeTempAndShowStatus(room1);
        method.changeTempAndShowStatus(room1);

        //Próba zmiany temperatury w pokoju bez klimatyzacji
        System.out.println("\nPokój 2 bez klimatyzacji");
        method.changeTempAndShowStatus(room2);
        method.changeTempAndShowStatus(room2);
    }
}
