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
        phanso  a=  new phanso(5,6);
        phanso b =new phanso(1,6);
        b.cong2ps(a);
        b.toigianps();
        
        
        
        b.show();
        
        
    }
     static class  phanso
    {
        private int tu;
        private int mau;
        public  phanso(int tu, int mau)
        {
            
            this.tu=tu;
            this.mau=mau;
        }

        public void setTu(int tu) {
            this.tu = tu;
        }

        public void setMau(int mau) {
            this.mau = mau;
        }

        public int getTu() {
            return tu;
        }

        public int getMau() {
            return mau;
        }
        public int UCLN(int a, int b)
        {
           
            while(a%b!=0)
            {
                b=a%b;
                a=b;
            }
            return b;
        }
        public void cong2ps(phanso a)
        {
            this.tu=this.tu*a.mau+this.mau*a.tu;
            this.mau=this.mau*a.mau;
            
            
            
        }
        public void tru2ps(phanso a)
        {
            this.tu=this.tu*a.mau-this.mau*a.tu;
            this.mau=this.mau*a.mau;
            
        }
        public void nhan2ps(phanso a)
        {
            this.tu=this.tu*a.tu;
            this.mau=this.mau*a.mau;
           
            
        }
        public void chia2ps(phanso a)
        {
            this.tu=this.tu*a.mau;
            this.mau=this.mau*a.tu;
        }
        public void toigianps()
        {
            int i= UCLN(this.tu,this.mau);
           this.tu=this.tu/i;
            this.mau=this.mau/i;
           
        }
        
        
        
        public void show()
        {
            System.out.println(getTu()+"/"+getMau());
        }
        
        
        
    }
    
        
                    
    
}
