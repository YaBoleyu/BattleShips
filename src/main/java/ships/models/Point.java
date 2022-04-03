package main.java.ships.models;

public class Point {
    private int x,y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isPointNearCurrent(Point point){
        return point.x == this.whereX() && point.y == this.whereY();
    }

    public int whereX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int whereY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
