import android.graphics.Bitmap;
import java.io.File;

public abstract class _Aa
{
  public static final _Aa.a a = new _Aa.a(null);
  private final String b;
  private final boolean c;
  
  private _Aa(String paramString, boolean paramBoolean)
  {
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  public abstract Bitmap a();
  
  public boolean b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public static final class a
  {
    public final _Aa a(Bitmap paramBitmap, String paramString, boolean paramBoolean)
    {
      oXa.b(paramBitmap, "source");
      oXa.b(paramString, "cacheKey");
      return new _Aa.b(paramBitmap, paramString, paramBoolean);
    }
    
    public final _Aa a(File paramFile, String paramString, boolean paramBoolean)
    {
      oXa.b(paramFile, "source");
      oXa.b(paramString, "cacheKey");
      return new _Aa.c(paramFile, paramString, paramBoolean);
    }
  }
  
  public static final class b
    extends _Aa
  {
    private final Bitmap d;
    private final String e;
    private final boolean f;
    
    public b(Bitmap paramBitmap, String paramString, boolean paramBoolean)
    {
      super(paramBoolean, null);
      this.d = paramBitmap;
      this.e = paramString;
      this.f = paramBoolean;
    }
    
    public Bitmap a()
    {
      return this.d;
    }
    
    public boolean b()
    {
      return this.f;
    }
    
    public String c()
    {
      return this.e;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.d, ((b)paramObject).d)) && (oXa.a(c(), ((b)paramObject).c())))
          {
            int i;
            if (b() == ((b)paramObject).b()) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label72;
            }
          }
        }
        return false;
      }
      label72:
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.d;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = c();
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      int k = b();
      int m = k;
      if (k != 0) {
        m = 1;
      }
      return (j * 31 + i) * 31 + m;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FromBitmap(bitmap=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", cacheKey=");
      localStringBuilder.append(c());
      localStringBuilder.append(", cacheHit=");
      localStringBuilder.append(b());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends _Aa
  {
    private final File d;
    private final String e;
    private final boolean f;
    
    public c(File paramFile, String paramString, boolean paramBoolean)
    {
      super(paramBoolean, null);
      this.d = paramFile;
      this.e = paramString;
      this.f = paramBoolean;
    }
    
    public Bitmap a()
    {
      return cBa.d.a(this.d);
    }
    
    public boolean b()
    {
      return this.f;
    }
    
    public String c()
    {
      return this.e;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if ((oXa.a(this.d, ((c)paramObject).d)) && (oXa.a(c(), ((c)paramObject).c())))
          {
            int i;
            if (b() == ((c)paramObject).b()) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label72;
            }
          }
        }
        return false;
      }
      label72:
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.d;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((File)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = c();
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      int k = b();
      int m = k;
      if (k != 0) {
        m = 1;
      }
      return (j * 31 + i) * 31 + m;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FromSource(source=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", cacheKey=");
      localStringBuilder.append(c());
      localStringBuilder.append(", cacheHit=");
      localStringBuilder.append(b());
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends _Aa
  {
    public static final d d = new d();
    
    private d()
    {
      super(false, null);
    }
    
    public Bitmap a()
    {
      throw new VVa(null, 1, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */