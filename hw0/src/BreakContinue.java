public class BreakContinue {
//    For example, suppose we call windowPosSum with the array a = {1, 2, -3, 4, 5, 4}, and n = 3. In this case, we’d:
//
//    Replace a[0] with a[0] + a[1] + a[2] + a[3].
//    Replace a[1] with a[1] + a[2] + a[3] + a[4].
//    Not do anything to a[2] because it’s negative.
//    Replace a[3] with a[3] + a[4] + a[5].
//    Replace a[4] with a[4] + a[5].
//    Not do anything with a[5] because there are no values after a[5].
//    Thus, the result after calling windowPosSum would be {4, 8, -3, 13, 9, 4}.
    public static void windowPosSum(int[] a, int n) {
        for (int j = 0;j<a.length;j++){
            //先遍历一遍0....length-1
            if (a[j]<0){
                continue;
                //小于0跳过
            }else if (a[j]>0){
                //1.当j+n<m.length时，正常j...j+n
                if ((j+n)<a.length-1){
                    for (int i = 1; i<n+1;i++){
                        a[j] +=a[j+i];
                    }
                }//2.当j+n>m.length时刻，j++m.length就行
                else if ((j+n)>a.length-1){
                   for (int z = j;z+1< a.length;z++){
                       //z+1 < a.length是为了避免z+1 out pf index
                       a[j] +=a[z+1];
                    }
                }
            }else if (j == a.length-1){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
