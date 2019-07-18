import android.graphics.Bitmap.Config;

class cg$a
  implements mg
{
  private final cg.b a;
  private int b;
  private int c;
  private Bitmap.Config d;
  
  public cg$a(cg.b paramb)
  {
    this.a = paramb;
  }
  
  public void a()
  {
    this.a.a(this);
  }
  
  public void a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramConfig;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (a)paramObject;
      bool3 = bool2;
      if (this.b == ((a)paramObject).b)
      {
        bool3 = bool2;
        if (this.c == ((a)paramObject).c)
        {
          bool3 = bool2;
          if (this.d == ((a)paramObject).d) {
            bool3 = true;
          }
        }
      }
    }
    return bool3;
  }
  
  public int hashCode()
  {
    int i = this.b;
    int j = this.c;
    Bitmap.Config localConfig = this.d;
    int k;
    if (localConfig != null) {
      k = localConfig.hashCode();
    } else {
      k = 0;
    }
    return (i * 31 + j) * 31 + k;
  }
  
  public String toString()
  {
    return cg.c(this.b, this.c, this.d);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cg$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */