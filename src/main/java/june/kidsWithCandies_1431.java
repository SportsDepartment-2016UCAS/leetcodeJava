package june;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // 1.找到数组中的最大值
        if (candies.length < 1) {
            return null;
        }

        int max = candies[0];
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        
        // 2.判断每个数组与最大值的差值，若差值 <extraCandies,则为false
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (max - candy > extraCandies) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;

    }
}
