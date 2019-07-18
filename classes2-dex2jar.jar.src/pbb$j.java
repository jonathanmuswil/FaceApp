import java.io.IOException;

final class pbb$j<T>
  extends pbb<T>
{
  private final Zab<T, String> a;
  private final boolean b;
  
  pbb$j(Zab<T, String> paramZab, boolean paramBoolean)
  {
    this.a = paramZab;
    this.b = paramBoolean;
  }
  
  void a(rbb paramrbb, T paramT)
    throws IOException
  {
    if (paramT == null) {
      return;
    }
    paramrbb.c((String)this.a.a(paramT), null, this.b);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */