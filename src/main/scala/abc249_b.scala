import scala.collection.mutable
import java.util.Scanner

object Main extends App {
    val sc = new Scanner(System.in);

    val s = sc.next;
    var upper: Set[Char] = Set();
    var lower: Set[Char] = Set();

    for (c <- s) {
        if (c.isUpper) {
            upper += c;
        } else {
            lower += c;
        }
    }

    if (
        (upper.size > 0) &&
        (lower.size > 0) &&
        (upper.size + lower.size == s.size)
    ) {
        println("Yes");
    } else {
        println("No");
    }
}