
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
	public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: " + Arrays.toString(array));

        
        shuffleArray(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    public static void shuffleArray(Integer[] array) {
        
        List<Integer> list = Arrays.asList(array);
       
        Collections.shuffle(list);
        
        list.toArray(array);
    }

}

