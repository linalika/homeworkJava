package homeWorkApp3;

import java.util.Arrays;

public class homeWork3 {
    public static void main(String[] args) {
        int[] trainArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changZeroToOneAndOneToZero(trainArr)));
    }

    public static int[] changZeroToOneAndOneToZero(int[] trainArr){
        for(int i=0; i< trainArr.length; i++){
            switch (trainArr[i]){
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

}
