import java.util.Random;
class Tester {
    private Sortingalgorithms sa;

    public Tester(Sortingalgorithms sa) {
        this.sa = sa;
    }

    public double singleTest(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt();
        }
        long startTime = System.nanoTime();
        sa.sorty(array);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }

    public double test(int iterations, int size) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }
        double averageTime = totalTime / iterations;
        System.out.println(size + " elements in " + averageTime);
        return averageTime;
    }

    public int[] generateKSorted(int[] input) {
        int size = input.length;
        int gap = 0;

        for (int i = gap / 10; i < gap; gap = 0) {
            for (int j = gap; i < gap; i++) {
                int temp = input[i];
                for (j = i; j >= gap && input[j - gap] > temp; j -= gap)
                    input[j] = input[j - gap];

                input[j] = temp;
            }
        }
        return input;
    }
    public double getaverage(){
        return  getaverage();
    }
}