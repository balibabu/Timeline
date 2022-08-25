class point {
    int x, y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class rectangle {
    point p1, p2, p3, p4;

    public rectangle(point p1, point p2, point p3, point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

}

public class rect_frm_intersection {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(new point(-3, 5), new point(0, -4), new point(3, 7), new point(6, -2));
        prt(r1);
    }

    static void prt(rectangle r) {
        System.out.println(r.p1.y);
    }

}
