public class basicString {
    public static void main(String[] args) {
        char arr[] = {'C', 'o', 'd', 'i', 'n', 'g'};
        String str1 = "Coding";
        String str2 = "is fun";
        String str3 = "Ceding";
//        System.out.println(str1.contains("ing"));
//        str1 = str1.concat(str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));
//        //str1+=str2
//        //System.out.println(str1.length());
//        System.out.println(str1);
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(2, 4));
        //System.out.println(str.charAt(2));
        //System.out.println(str.charAt(6));
    }
}