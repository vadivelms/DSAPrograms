package epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> numsAry = new ArrayList<>(Arrays.asList(2, 3, 6, 8, 32, 55));
        System.out.println(numsAry);
      
        numsAry = numsAry.stream().map(n -> n % 2 == 0 ? n + 3 : n).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numsAry);

    }
}
