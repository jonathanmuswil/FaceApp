import android.net.Uri;

public final class NKa$b$a
  extends NKa.b
{
  private final Uri a;
  private final APa b;
  private final boolean c;
  private final boolean d;
  
  public NKa$b$a(Uri paramUri, APa paramAPa, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(null);
    this.a = paramUri;
    this.b = paramAPa;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
  }
  
  public final APa a()
  {
    return this.b;
  }
  
  public final Uri b()
  {
    return this.a;
  }
  
  public final boolean c()
  {
    return this.d;
  }
  
  public final boolean d()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)))
        {
          int i;
          if (this.c == ((a)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.d == ((a)paramObject).d) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label94;
            }
          }
        }
      }
      return false;
    }
    label94:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Uri)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((APa)localObject).hashCode();
    }
    int k = this.c;
    int m = k;
    int n;
    if (k != 0) {
      n = 1;
    }
    int i1 = this.d;
    k = i1;
    if (i1 != 0) {
      k = 1;
    }
    return ((j * 31 + i) * 31 + n) * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content(imageUri=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", imageSize=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", isSaveSuccess=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", showAd=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/NKa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */