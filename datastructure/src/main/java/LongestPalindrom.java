public class LongestPalindrom {

    public String longestPalindrom(String strMain) {
        String longPalindrom = "";

        for (int i = 0; i < strMain.length(); i++) {
            String str = Character.toString(strMain.charAt(i));
            for (int j = i+1; j < strMain.length() ; j++) {
                str += Character.toString(strMain.charAt(j));
                if(isPalindrom(str)){
                    if (longPalindrom.length() < str.length()){
                        longPalindrom = str;
                    }
                }
            }
        }

        return longPalindrom;
    }

    public boolean isPalindrom(String strPal) {
        boolean found = true;
        for (int i = 0; i < strPal.length()/2; i++) {
            if ((strPal.charAt(i)) != strPal.charAt(strPal.length()-1-i)){
                found = false;
                break;
            }
        }

        return found;
    }
}
