import java.util.HashSet;

public class Array {
    public static void main(String[] args) {

        int[] number = new int[100];
        for (int i = 0; i < 100; i++) {
            number[i] = i + 1;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            if (number[i] % 2 == 0) {
                set.add(number[i]);
            }
        }

            System.out.println(set);
        }
    }

//HashSet хранит элементы в произвольном порядке, но зато быстро ищет.
//Подходит, если порядок не важен, но важна скорость.
//HashSet будет хранить элементы так, как ему удобно.