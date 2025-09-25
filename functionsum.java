class functionsum {

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int add(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {

        functionsum s1 = new functionsum();
        System.out.println(s1.sub(4, 6));
        System.out.println(s1.add(6, 9));
        System.out.println(s1.mul(4, 6));
        System.out.println(s1.div(14, 2));
    }

}