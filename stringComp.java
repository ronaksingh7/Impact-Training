public class stringComp {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println(s==s2);
        System.out.println(s1);
        System.out.println(s.equals(s1));
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("e"));
        System.out.println(s.concat("World"));
        System.out.println(s.length());
        System.out.println(s.contains("l"));
        System.out.println(s.repeat(2));
    }    
}
