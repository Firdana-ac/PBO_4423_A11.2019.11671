//Muhammad Naufal Firdana Trisya
//A11.2019.11671
//A11.4423

package praktikum4.Matrix;


public class Main1 {
    public static void main(String[] args) {
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix D = new Matrix(d);
        D.show();
        System.out.println("\n");

        // a. Membuat Matrix random A
        System.out.println("a) Matrix A Random MxN");
        Matrix A = Matrix.random(3, 3);
        A.show();
        System.out.println("\n");


        // b. Transpose dari Matrix A(B)
        System.out.println("b) Transpose dari Matrix A (B)");
        A.swap(1, 1);
        A.show();
        System.out.println("\n");
        System.out.println("Hasil Transpose : ");
        Matrix B = A.transpose();
        B.show();
        System.out.println("\n");


        // c. Matrix identitas (C)
        System.out.println("c) Matrix Identitas C ");
        Matrix C = Matrix.identity(3);
        C.show();
        System.out.println("\n");


        // d. Pertambahan Matrix A + B
        System.out.println("d) Matrix A + B");
        A.plus(B).show();
        System.out.println("\n");


        // e. Perkalian Matrix A x B
        System.out.println("e) Matrix A * B");
        B.times(A).show();
        System.out.println("\n");
        // shouldn't be equal since AB != BA in general
        System.out.println("shouldn't be equal since AB != BA in general");
        System.out.println(A.times(B).eq(B.times(A)));
        System.out.println("\n");

    }
}
