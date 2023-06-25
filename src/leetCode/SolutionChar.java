package leetCode;

public class SolutionChar {
    public static void main(String[] args) {
        char[] chars ={'a','a','a','b','b','a','a'};

        System.out.println(compress(chars));
    }

        public static int compress(char[] chars) {
            int res = 0;
            char[] compressed = new char[chars.length];
            for (int i = 0; i < chars.length; ) {
                int groupLength = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] == chars[i]) groupLength++;
                }
                compressed[res++] = chars[i];
                if (groupLength > 1) {
                    for (char c : Integer.toString(groupLength).toCharArray()) {
                        chars[res++] = c;
                    }
                }
                i += groupLength;
            }
            return res;
        }
    }

