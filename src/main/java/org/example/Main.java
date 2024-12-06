
    package org.example;

    public class Main {
        public static boolean xyzMiddle(String str) {
            int len = str.length();
            if (len < 3) return false;
            int midStart = (len - 3) / 2;
            int midEnd = midStart + 1;
            return (str.substring(midStart, midStart + 3).equals("xyz")) ||
                    (midEnd < len - 2 && str.substring(midEnd, midEnd + 3).equals("xyz"));
        }

        public static void main(String[] args) {
            System.out.println(xyzMiddle("AAxyzBB"));
            System.out.println(xyzMiddle("AxyzBB"));
            System.out.println(xyzMiddle("AxyzBBB"));


        }
    }