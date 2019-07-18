import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.support.design.widget.K;
import android.util.Property;

public abstract interface ya
  extends wa.a
{
  public abstract void a();
  
  public abstract void b();
  
  public abstract int getCircularRevealScrimColor();
  
  public abstract ya.d getRevealInfo();
  
  public abstract void setCircularRevealOverlayDrawable(Drawable paramDrawable);
  
  public abstract void setCircularRevealScrimColor(int paramInt);
  
  public abstract void setRevealInfo(ya.d paramd);
  
  public static class a
    implements TypeEvaluator<ya.d>
  {
    public static final TypeEvaluator<ya.d> a = new a();
    private final ya.d b = new ya.d(null);
    
    public ya.d a(float paramFloat, ya.d paramd1, ya.d paramd2)
    {
      this.b.a(K.a(paramd1.a, paramd2.a, paramFloat), K.a(paramd1.b, paramd2.b, paramFloat), K.a(paramd1.c, paramd2.c, paramFloat));
      return this.b;
    }
  }
  
  public static class b
    extends Property<ya, ya.d>
  {
    public static final Property<ya, ya.d> a = new b("circularReveal");
    
    private b(String paramString)
    {
      super(paramString);
    }
    
    public ya.d a(ya paramya)
    {
      return paramya.getRevealInfo();
    }
    
    public void a(ya paramya, ya.d paramd)
    {
      paramya.setRevealInfo(paramd);
    }
  }
  
  public static class c
    extends Property<ya, Integer>
  {
    public static final Property<ya, Integer> a = new c("circularRevealScrimColor");
    
    private c(String paramString)
    {
      super(paramString);
    }
    
    public Integer a(ya paramya)
    {
      return Integer.valueOf(paramya.getCircularRevealScrimColor());
    }
    
    public void a(ya paramya, Integer paramInteger)
    {
      paramya.setCircularRevealScrimColor(paramInteger.intValue());
    }
  }
  
  public static class d
  {
    public float a;
    public float b;
    public float c;
    
    private d() {}
    
    public d(float paramFloat1, float paramFloat2, float paramFloat3)
    {
      this.a = paramFloat1;
      this.b = paramFloat2;
      this.c = paramFloat3;
    }
    
    public void a(float paramFloat1, float paramFloat2, float paramFloat3)
    {
      this.a = paramFloat1;
      this.b = paramFloat2;
      this.c = paramFloat3;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */