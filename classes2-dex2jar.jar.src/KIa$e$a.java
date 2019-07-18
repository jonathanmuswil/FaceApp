import java.util.List;

public final class KIa$e$a
  extends KIa.e
{
  private final String c;
  private final int d;
  private final List<KIa.c> e;
  private final List<eoa.c> f;
  private final boolean g;
  
  public KIa$e$a(String paramString, int paramInt, List<? extends KIa.c> paramList, List<eoa.c> paramList1, boolean paramBoolean)
  {
    super(paramString, paramInt, null);
    this.c = paramString;
    this.d = paramInt;
    this.e = paramList;
    this.f = paramList1;
    this.g = paramBoolean;
  }
  
  public final boolean c()
  {
    return this.g;
  }
  
  public final List<KIa.c> d()
  {
    return this.e;
  }
  
  public final List<eoa.c> e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.c, ((a)paramObject).c))
        {
          int i;
          if (this.d == ((a)paramObject).d) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.e, ((a)paramObject).e)) && (oXa.a(this.f, ((a)paramObject).f)))
          {
            if (this.g == ((a)paramObject).g) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label108;
            }
          }
        }
      }
      return false;
    }
    label108:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.c;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    int k = this.d;
    localObject = this.e;
    int m;
    if (localObject != null) {
      m = localObject.hashCode();
    } else {
      m = 0;
    }
    localObject = this.f;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    int n = this.g;
    int i1 = n;
    if (n != 0) {
      i1 = 1;
    }
    return (((j * 31 + k) * 31 + m) * 31 + i) * 31 + i1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content(avatar=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", unreadUpdates=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", photosItems=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", recentPhotos=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", hasMoreRecent=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KIa$e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */