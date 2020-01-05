public class n {
    public static void main(String[] args) {
        System.out.println(isPermutation("abcd","dcba"));
        System.out.println(isPermutation("",""));
        System.out.println(isPermutation("hgjb","hgjb"));
        System.out.println(isPermutation("adcb","dcba"));

        System.out.println("\n");

        System.out.println(isPermutation("","dcba"));
        System.out.println(isPermutation("adcb",""));
        System.out.println(isPermutation("adbii","adcba"));
        System.out.println(isPermutation("adcb","adsadsdcba"));

    }

    public static Boolean isPermutation(String txt1, String txt2) {
        if (txt1.length() != txt2.length()) {
            return false;
        }
        int[] table = new int[128];
        for (int i=0; i < txt1.length(); i++) {
            table[txt1.charAt(i)]++;
        }
        
        for (int i=0; i < txt2.length(); i++) {
            table[txt2.charAt(i)]--;
            if (table[txt2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}
   