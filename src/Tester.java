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
        return (endTime - startTime) / 1_000_000.0;
    }

    public void test(int iterations, int size) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }
        double averageTime = totalTime / iterations;
        System.out.println("Sorted " + size + " elements in " + averageTime + " ms (avg)");
    }
}