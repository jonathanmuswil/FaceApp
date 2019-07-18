public class bda
{
  public final Lca a;
  public final Xca b;
  public final Wca c;
  public final Uca d;
  public final Ica e;
  public final Nca f;
  public final long g;
  public final int h;
  public final int i;
  
  public bda(long paramLong, Lca paramLca, Xca paramXca, Wca paramWca, Uca paramUca, Ica paramIca, Nca paramNca, int paramInt1, int paramInt2)
  {
    this.g = paramLong;
    this.a = paramLca;
    this.b = paramXca;
    this.c = paramWca;
    this.d = paramUca;
    this.h = paramInt1;
    this.i = paramInt2;
    this.e = paramIca;
    this.f = paramNca;
  }
  
  public boolean a(long paramLong)
  {
    boolean bool;
    if (this.g < paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */