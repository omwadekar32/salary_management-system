class InvalidAge extends Exception {
    public InvalidAge(String msg) {
        super(msg);
    }
}

class custom {
    public static void main(String[] args) throws InvalidAge {
        int age = 17;
        if (age < 18) {
            throw new InvalidAge("Age is less than 18");
        } else {
            System.out.println("Valid age");
        }
    }
}
