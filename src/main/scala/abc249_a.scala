import scala.math._
import java.util.Scanner

object Main extends App {
    val sc = new Scanner(System.in);

    val a = sc.nextInt;
    val b = sc.nextInt;
    val c = sc.nextInt;
    val d = sc.nextInt;
    val e = sc.nextInt;
    val f = sc.nextInt;
    val x = sc.nextInt;

    var takahashi: Int = 0;
    var aoki: Int = 0;
    var takahashi_t: Int = x;
    var aoki_t: Int = x;

    while (takahashi_t >= 0) {
        val t = min(takahashi_t, a);
        takahashi += t * b;
        takahashi_t -= t;
        takahashi_t -= c;
    }

    while (aoki_t >= 0) {
        val t = min(aoki_t, d);
        aoki += t * e;
        aoki_t -= t;
        aoki_t -= f;
    }

    if (takahashi > aoki) {
        println("Takahashi");
    } else if (aoki > takahashi) {
        println("Aoki");
    } else {
        println("Draw");
    }
}