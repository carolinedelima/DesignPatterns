public class LogicalOperators {

    public boolean and(int x, int y) {
        return x < 5 &&  x < 10;
    }

    public boolean or(int x, int y) {
        return x < 5 || x < 4;
    }

    public boolean not(int x, int y) {
        return !(x < 5 && x < 10);
    }
}
