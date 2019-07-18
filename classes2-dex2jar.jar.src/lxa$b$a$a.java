import android.net.Uri;

public final class lxa$b$a$a
  extends lxa.b.a
{
  private final Eka d;
  private final lxa.d e;
  private final boolean f;
  private final Uri g;
  private final APa h;
  private final boolean i;
  private final APa j;
  
  public lxa$b$a$a(Eka paramEka, lxa.d paramd, boolean paramBoolean1, Uri paramUri, APa paramAPa1, boolean paramBoolean2, APa paramAPa2)
  {
    super(paramEka, paramd, paramBoolean1, null);
    this.d = paramEka;
    this.e = paramd;
    this.f = paramBoolean1;
    this.g = paramUri;
    this.h = paramAPa1;
    this.i = paramBoolean2;
    this.j = paramAPa2;
  }
  
  public final boolean d()
  {
    return this.i;
  }
  
  public final APa e()
  {
    return this.h;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)))
        {
          int k;
          if (this.f == ((a)paramObject).f) {
            k = 1;
          } else {
            k = 0;
          }
          if ((k != 0) && (oXa.a(this.g, ((a)paramObject).g)) && (oXa.a(this.h, ((a)paramObject).h)))
          {
            if (this.i == ((a)paramObject).i) {
              k = 1;
            } else {
              k = 0;
            }
            if ((k != 0) && (oXa.a(this.j, ((a)paramObject).j))) {
              break label136;
            }
          }
        }
      }
      return false;
    }
    label136:
    return true;
  }
  
  public final Uri f()
  {
    return this.g;
  }
  
  public final APa g()
  {
    return this.j;
  }
  
  public int hashCode()
  {
    Object localObject = this.d;
    int k = 0;
    int m;
    if (localObject != null) {
      m = ((Eka)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.e;
    int n;
    if (localObject != null) {
      n = localObject.hashCode();
    } else {
      n = 0;
    }
    int i1 = this.f;
    int i3 = i1;
    if (i1 != 0) {
      i3 = 1;
    }
    localObject = this.g;
    int i2;
    if (localObject != null) {
      i2 = ((Uri)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = this.h;
    int i4;
    if (localObject != null) {
      i4 = ((APa)localObject).hashCode();
    } else {
      i4 = 0;
    }
    int i5 = this.i;
    int i6 = i5;
    if (i5 != 0) {
      i6 = 1;
    }
    localObject = this.j;
    if (localObject != null) {
      k = ((APa)localObject).hashCode();
    }
    return (((((m * 31 + n) * 31 + i3) * 31 + i2) * 31 + i4) * 31 + i6) * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ContentAfter(f=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", sO=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", bI=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", imageUri=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", imageSize=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", hasBeforeState=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(", viewSize=");
    localStringBuilder.append(this.j);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$b$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */