import android.util.Property;

public class ya$c
  extends Property<ya, Integer>
{
  public static final Property<ya, Integer> a = new c("circularRevealScrimColor");
  
  private ya$c(String paramString)
  {
    super(Integer.class, paramString);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ya$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */