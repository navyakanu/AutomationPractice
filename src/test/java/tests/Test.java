package tests;

class Test {
    static int cube(int x, int z[]) {

        int count = 0;
        for (int i = z.length; x > 0; i--) {

            if ((x % (z[i])) == 0) {


            }

        }

        return count;
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5};
        int result = Test.cube(5, a);


        System.out.println(result);

        //  System.out.print(path);


    }
}