import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.awt.*;

import static java.awt.Color.BLACK;

public class canvas extends Application {
    Color color=Color.BLACK;
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas=new Canvas(500,500);
        GraphicsContext gc=canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged(e->{
            gc.setFill(color);
            gc.fillOval(e.getX()-2,e.getY()-2,5,5);
        });
        Circle circle1=new Circle(10);
        circle1.setCenterX(100);
        circle1.setCenterY(4);
        circle1.setFill(Color.BLUE);
        circle1.setOnMouseClicked(e->{
            color=Color.BLUE;
            canvas.setOnMouseDragged(m->{
                gc.setFill(color);
                gc.fillOval(m.getX()-2,m.getY()-2,5,5);
            });
        });
        Circle circle2=new Circle(10);
        circle2.setCenterX(100);
        circle2.setCenterY(20);
        circle2.setFill(Color.RED);
        circle2.setOnMouseClicked(e->{
            color=Color.RED;
            canvas.setOnMouseDragged(m->{
                gc.setFill(color);
                gc.fillOval(m.getX()-2,m.getY()-2,5,5);
            });
        });
        Circle circle3=new Circle(10);
        circle3.setCenterX(100);
        circle3.setCenterY(40);
        circle3.setFill(Color.YELLOW);
        circle3.setOnMouseClicked(e->{
            color=Color.YELLOW;
            canvas.setOnMouseDragged(m->{
                gc.setFill(color);
                gc.fillOval(m.getX()-2,m.getY()-2,5,5);
            });
        });
        Circle circle4=new Circle(10);
        circle4.setCenterX(100);
        circle4.setCenterY(60);
        circle4.setFill(Color.GREEN);
        circle4.setOnMouseClicked(e->{
            color=Color.GREEN;
            canvas.setOnMouseDragged(m->{
                gc.setFill(color);
                gc.fillOval(m.getX()-2,m.getY()-2,5,5);
            });
        });
        Rectangle rect=new Rectangle(20,20);
        rect.setX(100);
        rect.setY(80);
        rect.setStroke(Color.BLACK);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);
        rect.setOnMouseClicked(e-> {
                    color = Color.WHITE;
                    canvas.setOnMouseDragged(m -> {
                        gc.setFill(color);
                        gc.fillRect(m.getX() - 2, m.getY() - 2, 10, 10);
                    });
                });


        HBox hbox=new HBox();
        hbox.getChildren().addAll(canvas,circle1,circle2,circle3,circle4,rect);
        Scene scene=new Scene(hbox);
        stage.setScene(scene);
        stage.show();


}
}
