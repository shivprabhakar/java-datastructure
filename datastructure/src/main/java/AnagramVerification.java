import java.util.Arrays;

public class AnagramVerification {

    public String Anagram(String str1, String str2){
        String str = "Not Anagram!!";
        System.out.println("str1:" + str1 + "  ::  str2: " + str2);
        if(str1.trim().length()== str2.trim().length()) {
            str1 = sortArray(str1.trim());
            str2 = sortArray(str2.trim());
            if(str1.equals(str2)){
                str = "Anagram!!";
            }
        }
        else {
            str = "Not Anagram!!";
        }
        return str;
    }

    public String sortArray(String str){
        String strSort = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        strSort = Arrays.toString(arr);
        return strSort;
    }
}
