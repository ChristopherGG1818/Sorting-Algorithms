public class SelectionSort implements  Sortingalgorithms{
    @Override

    public int[] sorty(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < input.length; j++)
                if (input[j] < input[min_idx])
                    min_idx = j;
            int temp = input[min_idx];
            input[min_idx] = input[i];
            input[i] = temp;
        }
        return input;
    }

}
