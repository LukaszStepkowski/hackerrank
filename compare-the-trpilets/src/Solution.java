import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> integerList = new ArrayList<>();
        Integer alice = 0;
        Integer bob = 0;
        if (a.get(0) > b.get(0)) {
            alice++;
        } else if (a.get(0) < b.get(0)){
         bob++;
        }
        if (a.get(1) > b.get(1)) {
            alice++;
        } else if (a.get(1) < b.get(1)){
            bob++;
        }
        if (a.get(2) > b.get(2)) {
            alice++;
        } else if (a.get(2) < b.get(2)){
            bob++;
        }
        integerList.add(alice);
        integerList.add(bob);
        return integerList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
