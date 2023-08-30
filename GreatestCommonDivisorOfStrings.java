public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder(str1);

        while (result.length() > 0) {
            if (str1.length() % result.length() == 0 && str2.length() % result.length() == 0) {
                int n = str1.length() / result.length();
                StringBuilder tmp = new StringBuilder();
                for (int i = 0; i < n; i++)
                    tmp.append(result);

                int m = str2.length() / result.length();
                StringBuilder tmp2 = new StringBuilder();
                for (int i = 0; i < m; i++)
                    tmp2.append(result);

                if (tmp.toString().equals(str1) && tmp2.toString().equals(str2))
                    return result.toString();
                else {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }

    public static void main(String... args) {
        GreatestCommonDivisorOfStrings obj = new GreatestCommonDivisorOfStrings();
        // String str1 = "ABCABC";
        // String str2 = "ABC";

        // String str1 = "ABABAB";
        // String str2 = "ABAB";

        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        // String str1 = "AAAAAAAAA";
        // String str2 = "AAACCC";

        // String str1 = "OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO";
        // String str2 = "OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO";

        // String str1 = "LEET";
        // String str2 = "CODE";

        System.out.println(obj.gcdOfStrings(str1, str2));
    }
}
