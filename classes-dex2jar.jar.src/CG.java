import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

class cg
  implements lg
{
  private final cg.b a = new cg.b();
  private final hg<cg.a, Bitmap> b = new hg();
  
  static String c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("x");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append("], ");
    localStringBuilder.append(paramConfig);
    return localStringBuilder.toString();
  }
  
  private static String d(Bitmap paramBitmap)
  {
    return c(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    paramConfig = this.a.a(paramInt1, paramInt2, paramConfig);
    return (Bitmap)this.b.a(paramConfig);
  }
  
  public void a(Bitmap paramBitmap)
  {
    cg.a locala = this.a.a(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
    this.b.a(locala, paramBitmap);
  }
  
  public int b(Bitmap paramBitmap)
  {
    return Pj.a(paramBitmap);
  }
  
  public String b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return c(paramInt1, paramInt2, paramConfig);
  }
  
  public String c(Bitmap paramBitmap)
  {
    return d(paramBitmap);
  }
  
  public Bitmap removeLast()
  {
    return (Bitmap)this.b.a();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AttributeStrategy:\n  ");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
  
  static class a
    implements mg
  {
    private final cg.b a;
    private int b;
    private int c;
    private Bitmap.Config d;
    
    public a(cg.b paramb)
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
  
  static class b
    extends dg<cg.a>
  {
    protected cg.a a()
    {
      return new cg.a(this);
    }
    
    cg.a a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
    {
      cg.a locala = (cg.a)b();
      locala.a(paramInt1, paramInt2, paramConfig);
      return locala;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */