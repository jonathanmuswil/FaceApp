import android.graphics.Bitmap.Config;

final class og$a
  implements mg
{
  private final og.b a;
  int b;
  private Bitmap.Config c;
  
  public og$a(og.b paramb)
  {
    this.a = paramb;
  }
  
  public void a()
  {
    this.a.a(this);
  }
  
  public void a(int paramInt, Bitmap.Config paramConfig)
  {
    this.b = paramInt;
    this.c = paramConfig;
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
        if (Pj.b(this.c, ((a)paramObject).c)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public int hashCode()
  {
    int i = this.b;
    Bitmap.Config localConfig = this.c;
    int j;
    if (localConfig != null) {
      j = localConfig.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    return og.a(this.b, this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/og$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */