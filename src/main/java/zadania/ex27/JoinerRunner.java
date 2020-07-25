package zadania.ex27;

public class JoinerRunner {
    public static void main(String[] args) {
        Joiner<String> stringJoiner = new Joiner<String>("-#-");
        String join = stringJoiner.join("aaaa", "bbbb", "cccc", "dddd");
        System.out.println(join);

        Joiner<Integer> integerJoiner = new Joiner<Integer>("-#-");
        String join2 = integerJoiner.join(1,2,3,4,5);
        System.out.println(join2);

    }
}
