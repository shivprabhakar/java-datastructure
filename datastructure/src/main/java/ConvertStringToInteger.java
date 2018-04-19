import java.text.BreakIterator;

public class ConvertStringToInteger {

    /**
     * say: String strMain = "12143", int intMain = 0;
     */
    public long convertToInteger(String strMain){

        long intMain = 0;
        try {
            if (strMain.equals(null)) {
                return 0;
            }

            for (int i = 0; i < strMain.length(); i++) {
                if (Character.valueOf(strMain.charAt(i)) >= 48 && Character.valueOf(strMain.charAt(i)) <= 57) {
                    intMain = intMain * 10 + Character.valueOf(strMain.charAt(i)) - 48;
                } else {
                    return 0;
                }
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

        return intMain;

    }
}
