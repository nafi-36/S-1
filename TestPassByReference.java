class TestPassByReference {
    
    String xyz = "abcde";
    public static void main(String[] args) {

        TestPassByReference tpbr = new TestPassByReference();
        tpbr.yangKedua();

        // int a = 10;
        // int b = a;

        // System.out.println("Before");
        // System.out.println("Value dari A " + a);
        // System.out.println("Value dari B " + b);

        // a = 11;

        // System.out.println("After");
        // System.out.println("Value dari A " + a);
        // System.out.println("Value dari B " + b);

    }

    void yangKedua() {
        String abc = useThis(xyz);
        System.out.println("xyz " + xyz);
        System.out.println("abc " + abc);
    }

    String useThis(String penampung) {
        String def = penampung;
        // return abc;
        return def;
    }

}

// class TestPassByReference {
//     String xyz = "abcde";

//     public static void main(String[] args) {
//         TestPassByReference tpbr = new TestPassByReference();
//         tpbr.yangKedua();
//     }

//     void yangKedua() {
//         String abc = useThis(xyz);
//         System.out.println("xyz " + xyz);
//         System.out.println("abc " + abc);
//     }

//     void useThis(String penampung) {
//         String def = penampung;
//         return def;
//     }
// }

