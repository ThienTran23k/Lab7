package Bai2;

public class MoveableCircle implements Moveable {
    public int radius;
    public MoveablePoint center;
    
    public MoveableCircle(MoveablePoint moveablePoint, int radius){
        this.center = moveablePoint;
        this.radius = radius;
    }
    public String toString(){
        return "MoveDown , MoveLeft , MoveRight , MoveUp" ;
    }
    @Override
    public void moveDown(){
        System.out.print("Di Chuyen Xuong");
    }
    @Override
    public void moveLeft(){
        System.out.print("Di Chuyen Trai");
    }
    @Override
    public void moveRight(){
        System.out.print("Di Chuyen Phai");
    }
    @Override
    public void moveUp(){
        System.out.print("Di Chuyen Len");
    }


}
