/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 23 April 2026
 */

public class Coercion {
    public static void main(String[] args) {
        int d = 65;
        char e = (char) d;
        double f = e;
        System.out.println("Nilai d = " + d);
        System.out.println("Nilai e = " + e);
        System.out.println("Nilai f = " + f);
        System.out.println();

        int a = 21;
        double b = a;
        int c = (int) b;
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println();

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Nilai X = " + X);
        System.out.println("Nilai Y = " + Y);
        System.out.println("Nilai S = " + S);
        System.out.println("Nilai Z = " + Z);
        System.out.println();

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Nilai P = " + P);
        System.out.println("Nilai Q = " + Q);
        System.out.println("Nilai R = " + R);
        System.out.println("Nilai D = " + D);
        System.out.println();

        Integer A = Integer.parseInt(S);
        System.out.println("Nilai A = " + A);

        String T = A.toString();
        System.out.println("Nilai T = " + T);
    }
}
