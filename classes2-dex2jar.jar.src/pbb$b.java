import java.io.IOException;

final class pbb$b<T>
  extends pbb<T>
{
  private final String a;
  private final Zab<T, String> b;
  private final boolean c;
  
  pbb$b(String paramString, Zab<T, String> paramZab, boolean paramBoolean)
  {
    xbb.a(paramString, "name == null");
    this.a = ((String)paramString);
    this.b = paramZab;
    this.c = paramBoolean;
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
    paramrbb.a(this.a, paramT, this.c);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */