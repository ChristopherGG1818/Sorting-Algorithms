class Performance {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        Sortingalgorithms[] algorithms = {
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort(),
                new ShellSort(),
                new QuickSort(),
                new MergeSort()
        };
        for (Sortingalgorithms sa : algorithms) {
            Tester tester = new Tester(sa);
            System.out.println( sa.getClass().getSimpleName());
            for (int size : sizes) {
                tester.test(20, size);
            }
        }
    }
}