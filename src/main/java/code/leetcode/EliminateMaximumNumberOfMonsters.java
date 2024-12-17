package code.leetcode;

public class EliminateMaximumNumberOfMonsters {


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int dist[] = {1, 3, 4};
//        int speed[] = {1, 1, 1};
//        int dist[] = {1,1,2,3};
//        int speed[] = {1,1,1,1};
//        int dist[] = {3,2,4};
//        int speed[] = {5,3,2};
        int dist[] = {4, 3, 3, 3, 4};
        int speed[] = {1, 1, 1, 1, 4};
        System.out.println(solution.eliminateMaximum(dist, speed));
    }
}

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int counter = 0;
        for (int i = 0; i < dist.length; i++) {

            int tcounter = 0;
            for (int j = i; j < dist.length; j++) {
                dist[j] = dist[j] - speed[j];
                if (dist[j] <= 0)
                    tcounter++;
            }

            if (tcounter > 1 && i != 0)
                return counter;
            counter++;

        }
        return counter;
    }
}