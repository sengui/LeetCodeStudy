package array.easy;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int firstCost = cost[0];
        int secondCost = cost[1];
        int temp;

        for (int i = 2; i < cost.length; i++) {
            temp = secondCost;
            secondCost = Math.min(firstCost, secondCost) + cost[i];
            firstCost = temp;
        }
        return Math.min(firstCost, secondCost);
    }
}
