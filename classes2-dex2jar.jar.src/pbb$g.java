import java.io.IOException;

final class pbb$g<T>
  extends pbb<T>
{
  private final String a;
  private final Zab<T, String> b;
  private final boolean c;
  
  pbb$g(String paramString, Zab<T, String> paramZab, boolean paramBoolean)
  {
    xbb.a(paramString, "name == null");
    this.a = ((String)paramString);
    this.b = paramZab;
    this.c = paramBoolean;
  }
  
  void a(rbb paramrbb, T paramT)
    throws IOException
  {
    if (paramT != null)
    {
      paramrbb.b(this.a, (String)this.b.a(paramT), this.c);
      return;
    }
    paramrbb = new StringBuilder();
    paramrbb.append("Path parameter \"");
    paramrbb.append(this.a);
    paramrbb.append("\" value must not be null.");
    throw new IllegalArgumentException(paramrbb.toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */