/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author phamv
 */
public class Phanso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        phanso a = new phanso(5, 6);
        phanso b = new phanso(1, 6);

        //b.cong2ps(a);
        //b.toigianps();
        phanso c = nhan2phanso(a, b);
        c.toigianps();
        c.show();

    }

    static class phanso {

        private int tu;
        private int mau;

        public phanso(int tu, int mau) {

            this.tu = tu;
            this.mau = mau;
        }
        public int UCLN(int a, int b) {
            int k;
            if (a < b) {
                k = a;
                a = b;
                b = k;
            }
            while (a % b != 0) {
                b = a % b;
                a = b;
            }
            return b;
        }

        public void toigianps() {
            int i = UCLN(this.tu, this.mau);
            this.tu = this.tu / i;
            this.mau = this.mau / i;

        }

        public void show() {
            System.out.println(this.tu + "/" + this.mau);
        }

    }

    public static phanso nhan2phanso(phanso a, phanso b) {
        int tu = a.tu * b.tu;
        int mau = a.mau * b.mau;
        phanso c = new phanso(tu, mau);
        return c;
    }

    public static phanso cong2phanso(phanso a, phanso b) {
        int tu = a.tu * b.mau + a.mau * b.tu;
        int mau = a.mau * b.mau;
        phanso c = new phanso(tu, mau);
        return c;
    }

    public static phanso tru2phanso(phanso a, phanso b) {
        int tu = a.tu * b.mau - a.mau * b.tu;
        int mau = a.mau * b.mau;
        phanso c = new phanso(tu, mau);
        return c;
    }

    public static phanso chia2phanso(phanso a, phanso b) {
        int tu = a.tu * b.mau;
        int mau = a.mau * b.tu;
        phanso c = new phanso(tu, mau);
        return c;
    }

}
