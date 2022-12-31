package ch12;
import ch12.pack9.sub1.CSphere;
import ch12.pack9.sub2.CTrapezoid;
public class class09 {
    public static void main(String[] args) {
        CSphere sp = new CSphere(2);
        CTrapezoid tra = new CTrapezoid(2, 3, 4);
        sp.show();
        tra.show();
    }
}
