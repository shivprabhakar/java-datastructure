import org.junit.Test;

public class CallProgram_Test {

    //@Test
    public void callProgram1() {
        ConvertStringToInteger runProgram = new ConvertStringToInteger();
        long intMain = runProgram.convertToInteger("89709789");
        System.out.println("INTMAIN : " +intMain);
    }

    //@Test
    public void callProgram2() {
        ConcatenateString runProgram = new ConcatenateString();
        String strMain = runProgram.concatenate("abc","xvzasd");
        System.out.println("ConcateString : " + strMain);
    }

    //@Test
    public void callProgram3() {
        ConvertSmallToUpperCase runProgram = new ConvertSmallToUpperCase();
        String strMain = runProgram.convertUpperCase("i am a boy");
        System.out.println("UpperCaseString : " + strMain);
    }
    //@Test
    public void callProgram4() {
        AnagramVerification runProgram = new AnagramVerification();
        String strMain = runProgram.Anagram("abcdefm","macbedf ");
        System.out.println("Anagram : " + strMain);
    }

    //@Test
    public void callProgram5() {
        LongestPalindrom runProgram = new LongestPalindrom();
        String strMain = runProgram.longestPalindrom("abcdefmabcbaabaabcdedcba");
        System.out.println("LongestPalindrom : " + strMain);
    }

    //@Test
    public void callProgram6() {
        ReverseNumericValue runProgram = new ReverseNumericValue();
        int intMain = runProgram.reverseNumeric(123456);
        System.out.println("LongestPalindrom : " + intMain);
    }

    //@Test
    public void callProgram7() {
        ReversePairOfString runProgram = new ReversePairOfString();
        String strMain = runProgram.reversePairOfString("abcdef");
        System.out.println("ReversePairOfString : " + strMain);
    }

    @Test
    public void callProgram8() {
        ReverseWordsInAString runProgram = new ReverseWordsInAString();
        String strMain = runProgram.reverseWordInString("my name is shiv");
        System.out.println("ReverseWordsInAString : " + strMain);
    }
}
