public class ReverseNumericValue {

    public int reverseNumeric(int intMain) {
        int intReverse=0;
        //int = 1234;
        //for (int i = Integer.toString(intMain).length() -1; i>0; i++) {
        while(intMain > 0){
            intReverse = intReverse * 10 + intMain % 10;
            intMain = intMain/10;
        }

        return intReverse;
    }
}
