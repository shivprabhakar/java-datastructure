public class ReversePairOfString {

    //str="abcdef"; "badcfe"
    public String reversePairOfString(String strMain){
        String strReverse="";
        for (int i = 0; i < strMain.length(); i=i+2) {
            strReverse += Character.toString(strMain.charAt(i+1)) + Character.toString(strMain.charAt(i));
        }
        return strReverse;
    }
}
