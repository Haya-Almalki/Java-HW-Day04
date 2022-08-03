public class MyPoint {

    int x=0;
    int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int xy[]= {x,y};
        return xy;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y=y;

    }

    @Override
    public String toString() {
        return "(" +
                 + x +
                "," + y +
                ')';
    }

    public double distance(int x, int y){
        int x1=this.x-x;
        int y1=this.y-y;
        double distance = Math.sqrt(x1*x1 + y1*y1);
        return distance;
    }

    public double distance(MyPoint another){
        int x=this.x-another.x;
        int y=this.y-another.y;


        double distance = Math.sqrt(x*x + y*y);

        return distance;

    }
    public double distance(){
        int x=this.x-0;
        int y=this.y-0;
        double distance = Math.sqrt(x*x + y*y);
        return distance;
    }
}
