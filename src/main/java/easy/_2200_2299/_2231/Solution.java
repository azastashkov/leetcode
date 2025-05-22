package easy._2200_2299._2231;

public class Solution {
    public int largestInteger(int num) {
        int[] digits = new int[32];
        int i = 31;
        while (num > 0) {
            digits[i--] = num % 10;
            num /= 10;
        }

        int j = 31, k = i + 1;
        while (k < j) {
            if (digits[k] % 2 != 0) {
                k++;
            } else if (digits[j] % 2 != 0) {
                j--;
            } else {
                if (digits[j] > digits[k]) {
                    swap(digits, k, j);
                    k++;
                }
                j--;
            }
        }

        k = i + 1;
        j = 31;
        while (k < j) {
            if (digits[k] % 2 == 0) {
                k++;
            } else if (digits[j] % 2 == 0) {
                j--;
            } else {
                if (digits[j] > digits[k]) {
                    swap(digits, k, j);
                    k++;
                }
                j--;
            }
        }

        int largest = 0, mult = 1;
        j = 31;
        while (digits[j] > 0) {
            largest += digits[j] * mult;
            mult *= 10;
            j--;
        }

        return largest;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}