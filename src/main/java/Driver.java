import src.main.java.Ball;

public class Driver {

    public static void main(String[] args) {
        
        Ball ball = new Ball();
        
        System.out.println("How number of balls: " + ball.getNumberOfBalls());
        
        ball.addBall();
        
        System.out.println("How number of balls: " + ball.getNumberOfBalls());
        
        ball.removeBall();
        
        System.out.println("How number of balls: " + ball.getNumberOfBalls());
        
    }
}
