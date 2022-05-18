package Rodent;

public class Rodents {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Gerbil();
        rodents[0].getMyLooks();
        rodents[0].getRunSpeed();
        rodents[1] = new Hamster();
        rodents[1].getMyLooks();
        rodents[1].getRunSpeed();
        rodents[2] = new Mouse();
        rodents[2].getMyLooks();
        rodents[2].getRunSpeed();
    }
}
