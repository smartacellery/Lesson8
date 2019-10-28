package Lesson8.SamplePrograms;

public class Zoo {

    public static void main(String[] args) {
        int size = 0;
        Animal zoo[] = new Animal[10];
        zoo[0] = new Animal("Elephant", 2000);
        zoo[1] = new Animal("Tiger", 450);
        zoo[2] = new Animal("Owl", 25);

        int logicSize = 3;//logical size
        for (int i = 0; i < size; i++) {
            System.out.println(zoo[i]);

        }
        System.out.println("We just got a a baby giraffe");
        zoo[size] = new Animal("Giraffe", 100);
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(zoo[i]);
        }
        System.out.println("A year has gone by animals have grown");
        for (int i = 0; i < size; i++) {
            zoo[i].grow();
            System.out.println(zoo[i]);
        }
        System.out.println("Here comes the snake ray gun!");
        snakeRayGun(zoo, size);
    }

    public static void snakeRayGun(Animal x[], int ls) {
        for (int i = 0; i < ls; i++) {
            x[i].setName("Snake");
        }
    }

}
