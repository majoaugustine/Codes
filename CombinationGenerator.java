import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationGenerator {

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 6);
        int r = 2; // Size of combinations

        List<List<Integer>> combinations = generateCombinations(elements, r);

        // Display the generated combinations
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }

        // Display the count of combinations
        System.out.println("Total Combinations: " + combinations.size());
    }

    private static List<List<Integer>> generateCombinations(List<Integer> elements, int r) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsHelper(elements, r, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinationsHelper(List<Integer> elements, int r, int startIndex,
                                                   List<Integer> currentCombination, List<List<Integer>> result) {
        if (r == 0) {
            // Combination of size r reached, add it to the result
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = startIndex; i < elements.size(); i++) {
            currentCombination.add(elements.get(i));
            generateCombinationsHelper(elements, r - 1, i + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
