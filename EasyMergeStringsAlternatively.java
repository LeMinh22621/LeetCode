public class EasyMergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        if (word1 != null && word1.length() > 0) {
            if (word2 != null && word2.length() > 0) {
                char[] ch1 = word1.toCharArray();
                char[] ch2 = word2.toCharArray();

                for (int i = 0, j = 0; i < ch1.length || j < ch2.length; i++, j++) {
                    if (i < ch1.length && j < ch2.length) {
                        result.append(ch1[i]).append(ch2[j]);
                    } else if (i < word1.length()) {
                        result.append(word1.substring(i));
                        break;
                    } else {
                        result.append(word2.substring(j));
                        break;
                    }
                }
                return result.toString();
            } else {
                return word1;
            }
        } else {
            return word2;
        }
    }

    public static void main (String... args) {
        EasyMergeStringsAlternatively obj = new EasyMergeStringsAlternatively();
        
        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(obj.mergeAlternately(word1, word2));
    }
}
