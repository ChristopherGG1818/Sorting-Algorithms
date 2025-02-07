import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Performance {
    public static void main(String[] args) throws IOException {
        FileWriter writerP = new FileWriter("/Users/christophergarcia/IdeaProjects/Sorting-Algorithms/Sortimes.txt");
        File outputFile = new File("SortingTimes.txt"); // Use CSV format for easier graphing
          int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        Sortingalgorithms[] algorithms = {
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort(),
                new ShellSort(),
                new QuickSort(),
                new MergeSort()
        };

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("Algorithm,Size,Time(ms)"); // CSV Header

            for (Sortingalgorithms sa : algorithms) {
                Tester tester = new Tester(sa);
                writer.println(sa.getClass().getSimpleName());
                writerP.write(sa.getClass().getSimpleName());

                for (int size : sizes) {
                    double avgTime = tester.test(20, size);
                    writer.printf("%s,%d,%.4f%n", sa.getClass().getSimpleName(), size, avgTime);
                    writerP.write("%s,%d,%.4f%n " + sa.getClass().getSimpleName() + " " + size + " " + avgTime);
                }
            }
            writerP.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}