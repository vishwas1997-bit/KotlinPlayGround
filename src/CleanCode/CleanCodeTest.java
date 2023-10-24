package CleanCode;

public class CleanCodeTest implements PointInter {
    public static void main(String[] args) {
        Point point = new Point();
//        point.x = 9;
        System.out.println(point.x);

        PointInter pointInter = new PointInter() {
            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }

            @Override
            public void setCartesian(double x, double y) {

            }

            @Override
            public double getR() {
                return 0;
            }

            @Override
            public double getTheta() {
                return 0;
            }

            @Override
            public void setPolar(double r, double theta) {

            }
        };
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public void setCartesian(double x, double y) {

    }

    @Override
    public double getR() {
        return 0;
    }

    @Override
    public double getTheta() {
        return 0;
    }

    @Override
    public void setPolar(double r, double theta) {

    }
}
