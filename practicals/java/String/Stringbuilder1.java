class Stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        //Insert Character at index
        str.insert(1, "a");
        System.out.println(str);
        str.append(" Dhiraj");
        System.out.println(str);
        System.out.println(str.charAt(0));
        str.delete(1,2);
        System.out.println(str);
        System.out.println(str.length());
    }
}