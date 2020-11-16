package pointoffer;

public class replaceSpace_05 {

    // 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
    public static String replaceSpace(String s) {

        if (s == null) {
            return "";
        }

        // 不用辅助对象
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count ++;
            }
        }

        char[] res = new char[chars.length + 2 * count];
        int i = chars.length - 1;
        int j = res.length - 1;
        while (i < j) {
            if (chars[i] != ' ') {
                res[j] = chars[i];
            } else {
                res[j] = '0';
                res[--j] = '2';
                res[--j] = '%';
            }

            i--;
            j--;

        }

        return new String(res);

    }

    // 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
    public static String replaceSpace2(String s) {

        if (s == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
