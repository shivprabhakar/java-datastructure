public class ReverseWordsInAString {

    //str="my name is shiv" ; "ym eman si vihs"
    public String reverseWordInString(String strMain){
        String strReverse = "";
        String[] strArr = strMain.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            strReverse+= reverseWord(strArr[i]);
            if(i < strArr.length - 1){
                strReverse+=" ";
            }
        }
        return strReverse;
    }

    public String reverseWord (String str){
        String reverse="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse+= str.charAt(i);
        }
        return reverse;
    }
}
