import java.io.IOException;

final class pbb$d<T>
  extends pbb<T>
{
  private final String a;
  private final Zab<T, String> b;
  
  pbb$d(String paramString, Zab<T, String> paramZab)
  {
    xbb.a(paramString, "name == null");
    this.a = ((String)paramString);
    this.b = paramZab;
  }
  
  void a(rbb paramrbb, T paramT)
    throws IOException
  {
    if (paramT == null) {
      return;
    }
    paramT = (String)this.b.a(paramT);
    if (paramT == null) {
      return;
    }
    paramrbb.a(this.a, paramT);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */