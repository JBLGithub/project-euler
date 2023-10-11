class Problem2 {

    public static void main(String[] args){

        int sum1 = 1;
        int sum2 = 2;
        int fibNum = 3;

        int sum = 2;

        while(fibNum < 4000000){

            sum1 = sum2;
            sum2 = fibNum;

            fibNum = sum1 + sum2;

            if(fibNum%2 == 0){

                sum += fibNum;

            }

        }

        System.out.println(sum);

    }

}