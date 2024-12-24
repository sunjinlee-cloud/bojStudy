public class quickSortExam {
    public static void main(String[] args) {




    }

    public static void quickSort(int [] a, int lo, int hi) {
        if (lo>hi) {
            return;
        }
    }

    public static int partition(int [] a, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = a[right];

        while(lo<hi) {
            while(a[lo] <pivot && lo<hi) {
                lo++;
            }
            while(pivot<=a[hi] && lo<hi) {
                hi--;
            }
            swap(a, lo, hi);
        }
        swap(a, right, hi);
        return hi;
    }

    public static void swap(int []a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
