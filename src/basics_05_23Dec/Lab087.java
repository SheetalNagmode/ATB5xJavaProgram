package src.basics_05_23Dec;

public class Lab087 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            if (i%2 == 0){
                System.out.println("Value Even of " + i);
                continue;
            }
            System.out.println("Value Odd of "+ i);
        }

    }
}
