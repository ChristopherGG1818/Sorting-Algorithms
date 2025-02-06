interface Sortingalgorithms {
    int[] sorty(int[] input);
}
class BubbleSort implements Sortingalgorithms {
    public int[] sorty(int[] input) {
        int n = input.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
        return input;
    }
}

class InsertionSort implements Sortingalgorithms {
    public int[] sorty(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
        return input;
    }
}

class SelectionSort implements Sortingalgorithms {
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
class ShellSort implements Sortingalgorithms {
    public int[] sorty(int[] input) {
        int n = input.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = input[i];
                int j;
                for (j = i; j >= gap && input[j - gap] > temp; j -= gap)
                    input[j] = input[j - gap];
                input[j] = temp;
            }
        }
        return input;
    }
}

class QuickSort implements Sortingalgorithms {
    public int[] sorty(int[] input) {
        quickSort(input, 0, input.length - 1);
        return input;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class MergeSort implements Sortingalgorithms {
    public int[] sorty(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}