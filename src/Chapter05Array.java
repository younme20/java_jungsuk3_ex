import java.util.Arrays;

public class Chapter05Array {

    public static void main(String args[]) {
        //[5-1]
        int[] arr[];
        int[] arr2 = {1, 2, 3,};
        int[] arr3 = new int[5];
        //  int[] arr4 = new int[5]{1,2,3,4,5}; //괄호안에 값의 개수에 의해 배열의 길이가 자동으로 결정되기떄문에  배열의 길이는 안적어도 됨
        //  int arr6[5]; //생성자안에 배열길이를 입력했기때문에 에러
        int[] arr7[] = new int[3][];

        //[5-2]

        int[][] arr8 = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30}
        };

        //System.out.println("arr8[3].lenght는?: " + arr8[3].length);

        //[5-3]
        int[] arr9 = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int n : arr9) {
            sum += n;
        }
        //System.out.println("배열에 담긴 총합은?: " + sum);

        //[5-4]

        int[][] arr10 = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int total = 0;
        float average = 0;
        int avgnum = 0;
            /*
            (1) . 알맞은 코드를 넣어 완성하시오
            */
        for (int[] k : arr10) {
            avgnum += k.length;
            for (int j : k) {
                total += j;
            }
        }
        average = (float) total / avgnum;

       // System.out.println("total=" + total);
       // System.out.println("average=" + average);

        //[5-5]

        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];
        // ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length); //랜덤숫자, 배열의 인덱스
            int tmp = 0; //임시저장할 변수

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;

        }

       // Arrays.stream(ballArr).forEach(System.out::println);

        /*
        (1) . 알맞은 코드를 넣어 완성하시오
        */

        // ballArr 3 ball3 . 배열 의 앞에서 개의 수를 배열 로 복사한다
        /* (2) */
        for (int i2 = 0; i2 < ball3.length; i2++) {
            ball3[i2] = ballArr[i2];
            //System.out.print(ball3[i2]);
        }

        //[5-6]
        // . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
        int[] coinUnit = {500, 100, 50, 10};
        int money = 2680;
        System.out.println("money=" + money);
        for (int i = 0; i < coinUnit.length; i++) {
        /*
        (1) . 알맞은 코드를 넣어 완성하시오
        */
            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
            //System.out.println(money%coinUnit[i]);
            money -= (money/coinUnit[i])*coinUnit[i];
        }





    }


}
