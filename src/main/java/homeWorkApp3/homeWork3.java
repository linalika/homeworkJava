package homeWorkApp3;

import java.util.Arrays;

import static java.lang.Math.abs;

public class homeWork3 {
    public static void main(String[] args) {
        int[] trainArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] trainArr4 = {1, 2, 3, 4};
        int[] trainArr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] emptyArr = new int[100];
        int[][] matrix = new int[5][5];
        int arrLen = 5;
        int arrValue = 8;
        System.out.println(Arrays.toString(changZeroToOneAndOneToZero(trainArr)));
        System.out.println(Arrays.toString(fillArr(emptyArr)));
        System.out.println(Arrays.toString(multiplyByTwoIfNumberLessSix(trainArr2)));
        printMatrix(filDiagonal(matrix));
        System.out.println(Arrays.toString(createArrAndFillByValue(arrLen, arrValue)));
        findMinAndMax(trainArr2);
        findMinAndMaxByAlgorithm(trainArr2);
        System.out.println((rightSumEqualsLeftSum(trainArr4)));
        System.out.println(Arrays.toString((shiftArr(trainArr4, -2))));

    }

    public static int[] changZeroToOneAndOneToZero(int[] trainArr) {
        for (int i = 0; i < trainArr.length; i++) {
            switch (trainArr[i]) {
                case 1:
                    trainArr[i] = 0;
                    break;
                case 0:
                    trainArr[i] = 1;
                    break;
            }
        }
        return trainArr;
    }

    public static int[] fillArr(int[] arrToFill) {
        int counter = 1;
        for (int i = 0; i < arrToFill.length; i++) {
            arrToFill[i] = counter++;
        }
        return arrToFill;
    }

    public static int[] multiplyByTwoIfNumberLessSix(int[] trainArr2) {
        for (int i = 0; i < trainArr2.length; i++) {
            if (trainArr2[i] < 6) {
                trainArr2[i] = trainArr2[i] * 2;
            }
        }
        return trainArr2;
    }

    public static int[][] filDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[] createArrAndFillByValue(int len, int initialValue) {
        int[] newArr = new int[len];
        Arrays.fill(newArr, initialValue);
        return newArr;
    }

    public static void findMinAndMax(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println(min + " " + max);
    }

    public static void findMinAndMaxByAlgorithm(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        ;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }

        }

        System.out.println(min + " " + max);
    }

    public static boolean rightSumEqualsLeftSum(int[] arr) {
        int counter = 1;
        int sumRight = 0;
        int sumLeft = 0;
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = counter; j < arr.length; j++) {
                sumLeft += arr[j];
            }
            sumRight += arr[i];
            if (sumRight == sumLeft) {
                result = true;
            }
            sumLeft = 0;
            counter++;

        }
        return result;
    }

    public static int[] shiftArr(int[] arr, int n) {
        int arrLen = arr.length;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arrLen - 1];
                for (int j = arrLen - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
        n = abs(n);
        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            for (int j = 0; j < arrLen -1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arrLen-1] = temp;
        }
        return arr;
    }
}
