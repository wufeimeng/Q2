package pp99;

interface CShape               // 定義介面 CShape
{
   final double PI=3.14;        //final 可省略
   public abstract void show(); //public abstract 可省略
}

class CCircle implementation CShape
{
   double radius;
   public CCircle(double r)  
   {
     radius=r;
   }
   public void show()         
   {
     System.out.println("面積＝"+PI*radius*radius);
   }
}
class CRectangle implements CShape 
{
   int width,height;
   public CRectangle(int w,int h)  
   {
      width=w;
      height=h;
   }
   public void show()
   {
      System.out.println("area="+width*height);
   }
}
public class t03
{
   public static void main(String args[])
   {
      CShape shap01,shap02;    
      shap01=new CRectangle(5,10);
      shap01.show();         

      shap02=new CCircle(2.0);
      shap02.show();       
   }
}