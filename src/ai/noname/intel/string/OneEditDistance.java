package ai.noname.intel.string;

public class OneEditDistance {

    public boolean isOneEditDistance(String s, String t) {
        int count = 0;
        String longString = s.length() > t.length() ? s : t;
        String shortString = s.length() < t.length() ? s : t;

        if (s.length() == t.length()) {
            longString = s;
            shortString = t;
        }

        if (longString.length() - shortString.length() <= 1 && longString.length() > 0) {

            if (longString.length() == shortString.length()) {

                int i = 0, j = 0;

                while (i < shortString.length()) {
                    if (longString.charAt(i) != shortString.charAt(j)) {
                        count++;
                    }
                    i++;
                    j++;

                }
                if (count == 1)
                    return true;
            } else if (longString.substring(longString.length() > 1 ? 1 : 0).equals(shortString) ||
                    (longString.startsWith(shortString))) {
                return true;
            } else {
                int i = 0;

                while (i <= shortString.length()) {
                    if (longString.charAt(i) != shortString.charAt(i)) {
                        String x = longString.substring(0, Math.max(i, 0)).concat(longString.substring(i + 1));
                        return x.equalsIgnoreCase(shortString);
                    }
                    i++;

                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new OneEditDistance().isOneEditDistance("abcc", "acc"));
    }


    public boolean isOneEditDistanceV2(String s, String t) {

        String longString = s.length() > t.length() ? s : t;
        String shortString = s.length() < t.length() ? s : t;

        if (s.length() == t.length()) {
            longString = s;
            shortString = t;
        }

        if (longString.length() - shortString.length() <= 1 && longString.length() > 0) {
            int i = 0, j = 0;
            int count = 0;
            while (i < shortString.length()) {
                if (longString.charAt(i) != shortString.charAt(j)) {
                    count++;
                    i++;
                } else {
                    i++;
                    j++;
                }

                if (count > 1)
                    return false;

            }

            if (((longString.length() == shortString.length()) && count == 0))
                return false;

            return true;

        }

        return false;
    }
}
