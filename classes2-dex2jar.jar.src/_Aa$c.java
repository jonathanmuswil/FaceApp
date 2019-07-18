import android.graphics.Bitmap;
import java.io.File;

public final class _Aa$c
  extends _Aa
{
  private final File d;
  private final String e;
  private final boolean f;
  
  public _Aa$c(File paramFile, String paramString, boolean paramBoolean)
  {
    super(paramString, paramBoolean, null);
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Aa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */