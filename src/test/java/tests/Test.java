package tests;

class Test {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String args[]){
        int result= Test.cube(5);
        System.out.println(result);
    }
}