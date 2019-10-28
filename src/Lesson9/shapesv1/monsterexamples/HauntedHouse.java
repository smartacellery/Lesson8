package Lesson9.shapesv1.monsterexamples;

public class HauntedHouse {

    public static void main(String[] args) {
        Monster m[] = new Monster[4];

        for (int i = 0; i < m.length; i++) {
            m[i] = i < 2 ? new Zombie("Zombie " + i) : new Vampire("Vampire " + i);
        }

        System.out.println("Here come the monsters!!!!!!!");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].identify());
        }
        System.out.println("And now for the attack!!!!!");

        //let "x" be each Monster in the Moster array "m"
        for (Monster x : m) {
            x.attack();
        }

    }
}
