import java.util.HashSet;
import java.util.Set;

/**
 * Created by <a href="davidsunjie.sun@gmail.com">jerrysun</a> on 4/30/16.
 */
public class Solutionb {
    static int[] exarray = new int[]{10, 2, 3, 1, 2, 4, -1, 7, 5};

    public static HashSet uniquePair(int[] nums,int target) {

        Set<Set<Integer>> pairSet = new HashSet<Set<Integer>>();

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                Set<Integer> pairint = new HashSet<Integer>();

                pairint.add(nums[i]);
                pairint.add(nums[j]);

                if (((nums[i] + nums[j]) == target)) {
                    pairSet.add(pairint);
                }

            }
        }

        return (HashSet) pairSet;

    }


    public static void main(String[] args) {
        System.out.println(uniquePair(exarray,9));
    }

}
