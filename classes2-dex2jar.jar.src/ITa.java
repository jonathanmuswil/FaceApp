import android.graphics.Typeface;

public final class ita
{
  private static final Typeface a;
  private static final Typeface b;
  private static final Typeface c = a;
  public static final ita d = new ita();
  
  static
  {
    Typeface localTypeface = Typeface.create("sans-serif-medium", 0);
    oXa.a(localTypeface, "Typeface.create(\"sans-se…medium\", Typeface.NORMAL)");
    a = localTypeface;
    localTypeface = Typeface.DEFAULT;
    oXa.a(localTypeface, "Typeface.DEFAULT");
    b = localTypeface;
  }
  
  public final Typeface a()
  {
    return a;
  }
  
  public final Typeface b()
  {
    return b;
  }
  
  public final Typeface c()
  {
    return c;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ita.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */