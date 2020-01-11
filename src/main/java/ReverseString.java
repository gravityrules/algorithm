public class ReverseString {

    public static String reverseString(String str){
        if (str == null)
            return null;
        String[] strArray = str.split("");
        StringBuilder builder = new StringBuilder();
        for(int i=strArray.length-1; i>=0;i--){
            builder.append(strArray[i]);
        }
        return builder.toString();
    }
}
