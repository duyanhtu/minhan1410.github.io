public class Id1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = new int[] { 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 12, 345, 2, 6,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 12, 345, 2, 6, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 12, 345, 2, 6, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345, 12, 345, 2, 6, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896,
                7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 7896, 345, 345, 345, 345, 345, 345, 345, 345, 345, 345,
                345, 345, 345, 345, 345, 345};
        long s = System.currentTimeMillis();
        System.out.println(findNumbers(nums));
        long f = System.currentTimeMillis();
        System.out.println(f - s + "s");
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if(10<=i && i<=99 || 1000 <=i && i<= 9999 || i==100_000){
                count++;
            }
        }
        return count;
    }
}