import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        task1(nums);
        task2(nums);

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