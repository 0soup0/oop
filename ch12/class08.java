package ch12;
import ch12.pack6.subpack1.Ccircle;
import ch12.pack6.subpack2.CRectangle;
import ch12.pack6.subpack1.subsubpack.CStyle;
public class class08 {
    public static void main(String[] args) {
        Ccircle cir = new Ccircle();
        CRectangle rect = new CRectangle();
        CStyle sty = new CStyle(1);
        cir.show();
        rect.show();
    }
}
