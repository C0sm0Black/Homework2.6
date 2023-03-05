import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("aa", "aa", "bad", "lost", "hope", "hope", "lucky"));

        task1(nums);
        task2(nums);
        task3(words);

    }

    private static void task3(List<String> words) {

        System.out.println("Задача 3");

        if (words.size() == 0) {
            System.out.print("Список пустой!");
        } else {

            Set<String> wordsSet = new LinkedHashSet<>(words);
            List<String> wordsWithoutDuplicate = new ArrayList<>(wordsSet);

            for (String s : wordsWithoutDuplicate) {
                System.out.print(s + " ");
            }

        }

        System.out.println();

    }

    private static void task2(List<Integer> nums) {

        System.out.println("Задача 2");

        if (nums.size() == 0) {
            System.out.print("Список пустой!");
        } else {

            Set<Integer> numsSet = new LinkedHashSet<>(nums);
            List<Integer> numsWithoutDuplicate = new ArrayList<>(numsSet);

            Collections.sort(numsWithoutDuplicate);

            for (Integer num : numsWithoutDuplicate) {

                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }

            }

        }

        System.out.println();

    }

    private static void task1(List<Integer> nums) {

        System.out.println("Задача 1");

        if (nums.size() == 0) {
            System.out.print("Список пустой!");
        }

        for (Integer num : nums) {

            if (num % 2 != 0) {
                System.out.print(num + " ");
            }

        }

        System.out.println();

    }

}