import java.awt.*;

public class ShapeJ extends Shape {
    public ShapeJ() {
//        super(g, area, origin, length);
        this.shape[0][0] = 4;
        this.shape[0][1] = 0;

        this.shape[1][0] = 4;
        this.shape[1][1] = 1;

        this.shape[2][0] = 5;
        this.shape[2][1] = 1;

        this.shape[3][0] = 6;
        this.shape[3][1] = 1;
//        this.color = new Color(0, 112, 192);
        this.type = ShapeType.J;
    }
}
