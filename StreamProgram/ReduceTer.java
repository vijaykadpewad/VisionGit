package StreamProgram;

import java.util.Arrays;

public class ReduceTer {
    public static void main(String[] args) {
        int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1})
                .reduce(0, (a, b) -> a+b);
        System.out.println(sum);

//Output : 32
    }
}
