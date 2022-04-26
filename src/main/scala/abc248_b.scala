import java.util.Scanner

object Main extends App {
    val sc = new Scanner(System.in);

    val a: Long = sc.nextLong;
    val b: Long = sc.nextLong;
    val k: Long = sc.nextLong;

    var res: Long = 0;
    var number: Long = a;
    while (number < b) {
        number *= k;
        res += 1;
    }

    println(res);
}