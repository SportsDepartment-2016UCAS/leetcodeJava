package everyday;

import java.util.HashMap;
import java.util.Map;

public class ConstructFromPrePost_889 {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        int n = preorder.length;

        Map<Integer, Integer> postMap = new HashMap<>(n);
        for (int i = 0; i < preorder.length; i ++) {
            postMap.put(postorder[i], i);
        }

        return dfs(preorder, postMap, 0, n - 1, 0);
    }

    private TreeNode dfs(int[] preorder, Map<Integer, Integer> postMap, int preBegin, int preEnd, int postBegin) {

        if (preBegin > preEnd) {
            return null;
        }

        TreeNode rootNode = new TreeNode(preorder[preBegin]);
        if (preBegin < preEnd) {
            // 说明还有子节点,则左节点的值就是前序的下一个值
            int left = preorder[preBegin + 1];
            // 左节点子树的个数等于此左节点所在后序遍历的下标 - 后序遍历的起点下标 + 1
            int leftCount = postMap.get(left) - postBegin + 1;
            rootNode.left = dfs(preorder, postMap, preBegin + 1, preBegin + leftCount, postBegin);
            rootNode.right = dfs(preorder, postMap, preBegin + leftCount + 1, preEnd, postBegin + leftCount);
        }
        return rootNode;
    }

//        int leftCount = 0;
//        if (preBegin < preEnd) {
//            leftCount = postMap.get(preorder[preBegin + 1]) - postBegin + 1;
//        }
//
//        return new TreeNode(preorder[preBegin],
//                dfs(preorder, postMap,
//                        preBegin + 1, preBegin + leftCount, postBegin),
//                dfs(preorder, postMap,
//                        preBegin + leftCount + 1, preEnd, postBegin + leftCount));
//    }


//    private int indexOfValue(int[] arrays, int value) {
//        for (int i = 0; i < arrays.length; i++) {
//            if (value == arrays[i]) {
//                return i;
//            }
//        }
//
//        return 0;
//    }
//
//    if (preorder.length == 0 || postorder.length == 0) {
//        return new TreeNode();
//    }
//
//    int i = 0;
//    int j = 0;
//
//    TreeNode leftNode = new TreeNode(postorder[j], null, null);
//    int i1 = indexOfValue(preorder, leftNode.val);
//
//    TreeNode parentNode;
//    // 判断当前节点在后续遍历中的下一个是否和前序遍历的下一个相同
//        if (preorder[i1++] == postorder[++j]) {
//        // 如果相同，说明当前节点有右侧兄弟节点
//        TreeNode rightNode = new TreeNode(postorder[i1], null, null);
//        // 后序遍历的下一个节点就是父节点
//        parentNode = new TreeNode(postorder[++i1], leftNode, rightNode);
//    } else {
//        // 如果不相同，说明当前节点没有右侧兄弟节点，则后续遍历的下一个节点就是父节点
//        parentNode = new TreeNode(postorder[++i1], leftNode, null);
//    }
//
//        return parentNode;
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}