public class ConvertSmallToUpperCase {

    public String convertUpperCase(String strMain){
        //int len = strMain.length();
        //char[] chMain = new char[len];
        String strNew="";

//        for (int i = 0; i < strMain.length(); i++) {
//            //if(strMain.charAt(i)=='a'||strMain.charAt(i)=='e'||strMain.charAt(i)=='i'||strMain.charAt(i)=='o'||strMain.charAt(i)=='u'){
//            if(strMain.charAt(i) >= 97 && strMain.charAt(i) <= 122){
//                strNew = strNew + (char)(strMain.charAt(i)-32);
//            }
//            else{
//                strNew = strNew + strMain.charAt(i);
//            }
//        }

        //make every vowels upper case
        for (int i = 0; i < strMain.length(); i++) {
            if(strMain.charAt(i)=='a'||strMain.charAt(i)=='e'||strMain.charAt(i)=='i'||strMain.charAt(i)=='o'||strMain.charAt(i)=='u'){
                strNew = strNew + (char)(strMain.charAt(i)-32);
            }
            else{
                strNew = strNew + strMain.charAt(i);
            }
        }

        return strNew;
    }
}
