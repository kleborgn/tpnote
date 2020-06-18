public class Hours {
    private int h;
    private int m;
    private int s;

    public Hours(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString() {
        return this.h + "h " + this.m + "min " + this.s + "s";
    }
}