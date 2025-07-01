package GreedyApproach;
import java.util.*;
public class ActivitySelectionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        int ans = 1;
        for (int i = 0; i < intervals.length; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int last = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= last) {
                ans++;
                last = intervals[i][1];
            }
        }

        System.out.println(ans);
    }
}
