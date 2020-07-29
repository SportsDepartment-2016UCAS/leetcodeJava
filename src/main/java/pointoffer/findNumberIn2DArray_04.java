package pointoffer;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class findNumberIn2DArray_04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int col = matrix[0].length;
        int row = matrix.length;

        int r = row - 1;
        int c = 0;
        int num;

        while (r >= 0 && c <= col-1) {
            num = matrix[r][c];
            if (num == target) {
                return true;
            } else if (num > target) {
                r--;
            } else {
                c++;
            }
        }

        return false;
    }


}
