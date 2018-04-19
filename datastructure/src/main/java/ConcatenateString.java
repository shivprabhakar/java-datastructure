public class ConcatenateString {

    /**
     * say: String strMain = "12143", int intMain = 0;
     */
    public String concatenate(String str1, String str2){

        String strConcat="";
        try {
            if (str1.equals(null) && str2.equals(null)) {
                return "Str1 and Str2 are null";
            }
            else if(str1.equals(null)){
                return str2;
            }
            else if(str2.equals(null)){
                return str1;
            }
            else {
                if(str1.length()>str2.length()){
                    strConcat = str1;
                    for (int i = 0; i < str2.length(); i++) {
                       strConcat = strConcat + str2.charAt(i);
                    }
                }
                else {
                    strConcat = str2;
                    for (int i = 0; i < str1.length(); i++) {
                       strConcat = strConcat + str1.charAt(i);
                    }
                }
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }

        return strConcat;

    }
}
