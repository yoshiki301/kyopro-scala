import java.util.Scanner

object Main extends App {
    val sc = new Scanner(System.in);

    val s: String = sc.next;
    val check: String = "0123456789";
    for (c <- check) {
        if (!s.contains(c)) {
            println(c);
            sys.exit(0);
        }
    }
}