package Bai2;

public class MoveablePoint implements Moveable {
    public int x , y , xSpeed , ySpeed ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(int x , int y , int xSpeed , int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "X :  "+ x +" ,Y = "+y + " ,Toc do X : "+xSpeed +" ,Toc do Y : "+ySpeed; 
    }
    @Override
    public void moveDown(){
        System.out.print("Xuong");
    }
    @Override
    public void moveLeft(){
        System.out.print("Trai");
    }
    @Override
    public void moveRight(){
        System.out.print("Phai");
    }
    @Override
    public void moveUp(){
        System.out.print("Len");
    }
}
