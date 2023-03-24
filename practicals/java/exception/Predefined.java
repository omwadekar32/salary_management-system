class Predefined {
    public static void main(String[] args) {
        try {
            int d = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arthmetic Exception " + e);
        }

        try {
            String str = new String("hello");
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Number format Exception" + e);
        }

        try {
            int a[] = new int[2];
            a[3] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of Bounds Exception " + e);
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception " + e);
        }

        try {
            throw new IllegalArgumentException("Invalid argument");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }
}