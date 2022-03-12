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


        //[5-7]
        //System.out.println("args "+args);
//        if(args.length!=1) {
//            System.out.println("USAGE: java Exercise5_7 3120");
//            System.exit(0);
//        }
        // . . 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
        //int money2 = Integer.parseInt(args[0]);
        int money2 = 1360;
        System.out.println("money="+money2);
        int[] coinUnit2 = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
        for(int i=0;i<coinUnit2.length;i++) {
            int coinNum = 0;
        /* (1) . 아래의 로직에 맞게 코드를 작성하시오
        1. (money) (coinNum) . 금액 을 동전단위로 나눠서 필요한 동전의 개수 를 구한다
        2. coin coinNum . 배열 에서 만큼의 동전을 뺀다
        ( coin .) 만일 충분한 동전이 없다면 배열 에 있는 만큼만 뺀다
        3. (coinNum) . 금액에서 동전의 개수 와 동전단위를 곱한 값을 뺀다
        */
            if(money2 > 0){
                coinNum = money2 / coinUnit2[i];
                money2 -=coinUnit2[i]*coinNum;
                coin[i] -=coinNum;
                System.out.println(coinUnit2[i]+"원 : "+coin[i]);
            }
        }
        if(money2 > 0) {
            System.out.println("거스름돈이 부족합니다");
            System.exit(0); // . 프로그램을 종료한다
        }
        System.out.println("=남은 동전의 개수=");
        for(int i=0;i<coinUnit2.length;i++) {
            System.out.println(coinUnit2[i]+"원 :"+coin[i]);
        }






    }


}
