package Lab5;

import java.util.Arrays;

public class Lab5_65777_FunctionalInterface {
    static int[] data = {28, 58, 8, 77, 48, 39};
    static ArrayProcessor q1NumberOfEvenElement;
    static ArrayProcessor q2IndexOfLargestEvenValue;
    static ArrayProcessor myMedian;

    public static void main(String[] args) {
        q1();
        q2();
        oneline();
}

    static void q1(){
        q1NumberOfEvenElement = (dataArr) -> {
            int sum = 0;
            for (int i : data)
                if(i%2 == 0)
                    sum++;
                return sum;
        };
        System.out.println(q1NumberOfEvenElement.calculate(data));
    }

    static void q2(){
        q2IndexOfLargestEvenValue = (dataArr) -> {
            int idx = 0;
            int maxNum = dataArr[idx];
            for (int i = 1; i < dataArr.length; i++) {
                if (dataArr[i]%2 == 0 && dataArr[i] > maxNum){
                    maxNum = dataArr[i];
                    idx = i;
                }
            }
            return idx;   
        };
        int ans = q2IndexOfLargestEvenValue.calculate(data);
        System.out.println(ans);
    }

    static void oneline(){
        int [] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        //myMedian = (arr) -> { return arr[arr.length/2]; };
        myMedian = (arr) -> arr[arr.length/2];
        System.out.println(myMedian.calculate(tmp));
    }
}
