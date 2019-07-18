import android.util.Property;

public class ya$b
  extends Property<ya, ya.d>
{
  public static final Property<ya, ya.d> a = new b("circularReveal");
  
  private ya$b(String paramString)
  {
    super(ya.d.class, paramString);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ya$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */