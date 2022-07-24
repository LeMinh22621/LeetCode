public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] arr = new char[s.length()];
        char[] arr2 = new char[t.length()];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (isHad(s.charAt(i))) {

            }
        }
        return false;
    }

    public static void main(String[] args) {
        IsomorphicStrings ob = new IsomorphicStrings();
        System.out.println(ob.isIsomorphic("paper", "title"));
        System.out.println(ob.isIsomorphic("egg", "add"));
        System.out.println(ob.isIsomorphic("foo", "bar"));
    }
}
