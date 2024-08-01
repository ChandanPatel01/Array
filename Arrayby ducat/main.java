class main {
    public static void main(String args[]) {
        System.out.println(" Main Method");
        main(new int[]{1, 2, 3});
        main(new char[]{'a', 'b', 'c'});
        main(new double[]{1.1, 2.2, 3.3});
        main(5.5f);
    }
    public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args){
        System.out.println("Overloaded Double array Main Method");
    }
    public static void main(float args){
        System.out.println("Overloaded float Main Method");
    }
}