class Point {
    int x,y;
    static int count = 0; //1
    private Point(int x, int y) {
        this.x=x;
        this.y=y;
        count++;
    }

    public static Point getInstance(int x,int y) {
        if (count < 2) {
            return new Point(x,y);
        } else {
            return null;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Point p1 = Point.getInstance(5,4);
        //Point p1 = new Point(5,4);

        Point p2 = Point.getInstance(5,4);

        System.out.println(p1.x + " " + p1.y);
        System.out.println(p2.x + " " + p2.y);

        Point p3 = Point.getInstance(1,2);

        System.out.println(p3.x + " " + p3.y);


        //x=5;
        //setX(5);

    }
}
