package Lab5;

import java.util.Arrays;

import Lab5.ArrayProcessor;

public class Practice {
    static int[] data = {28, 58, 8, 77, 48, 39};
    static ArrayProcessor q1Lambda;
    static ArrayProcessor q2Lambda;
    static ArrayProcessor q3Lambda;

    public static void main(String[] args) {
        // System.out.println(q1(data));
        // System.out.println(q2(data));
        // System.out.println(q3(data));

        q1Lambda = (arr) -> {
            int sum = 0;
            for (int i : arr) {
                if (i%2 == 0) sum++;
            }
            return sum;
        };

        // System.out.println(q1Lambda.calculate(data));

        q2Lambda = (arr) -> {
            int idx = -1;
            int maxNum = arr[0];
            for (int i = 0; i < arr.length; i++){
                if(arr[i]%2 == 0 && arr[i] > maxNum){
                    maxNum = arr[i];
                    idx = i;
                }
            }
            return idx; 
        };
        // System.out.println(q2Lambda.calculate(data));

        int[] tmp = data.clone();
        Arrays.sort(tmp);
        q3Lambda = (arr) -> arr[arr.length / 2];
        System.out.println(q3Lambda.calculate(tmp));

    }

    public static int q1(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i%2 == 0){
                sum++;
            }
        }
        return sum;
    }

    public static int q2(int[] arr) {
        int idx = -1;
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0 && arr[i] > maxNum){
                maxNum = arr[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int q3(int[] arr) {
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        return tmp[tmp.length / 2];
    }
}
