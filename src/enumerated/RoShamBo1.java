package enumerated;

import java.util.Random;

public class RoShamBo1 {
    static final int SIZE = 20;
    private static Random random = new Random(47);
    public static Item newItem() {
//        int i = random.nextInt(3);

//        if(i == 0){
//            return new Scissors();
//        } else if (i == 1){
//            return new Paper();
//        } else if (i == 2){
//            return new Rock();
//        } else {
//
//        }
        switch (random.nextInt(3)) {
            default:
            case 0: return new Scissors(); //break;
            case 1: return new Paper();
            case 2: return new Rock();

        }
    }
    public static void match(Item a, Item b) {
        System.out.println(
                a + " vs. " +b+ ": " + a.compete(b)
        );
    }

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            match(newItem(), newItem());
        }
    }
}
