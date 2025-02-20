import java.util.*;

public class Q6_CheckSetsEqual {

    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() != set2.size()) {
            return false;
        }

        for (Integer element : set1) {
            if (!set2.contains(element)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.printf("Set1: %s\n", set1);
        System.out.printf("Set2: %s\n", set2);

        boolean result = areSetsEqual(set1, set2);

        System.out.println("Are the two sets equal? " + result);
    }
}
