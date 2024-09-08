class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int count = 0;
        char cur = chars[0];
        for (int i = 0; i < chars.length; i++) {

            if (cur != chars[i]) {
                chars[index++] = cur;
                cur = chars[i];
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 0;
            }
            count++;
        }

         chars[index++] = cur;
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (char c : countStr.toCharArray()) {
                chars[index++] = c;
            }
        }

        return index;
    }
}