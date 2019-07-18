import android.graphics.Bitmap;

public final class KAa$a
{
  private final Bitmap a;
  private final boolean b;
  private final rka c;
  private final boolean d;
  
  public KAa$a(Bitmap paramBitmap, boolean paramBoolean1, rka paramrka, boolean paramBoolean2)
  {
    this.a = paramBitmap;
    this.b = paramBoolean1;
    this.c = paramrka;
    this.d = paramBoolean2;
  }
  
  public final boolean a()
  {
    return this.d;
  }
  
  public final rka b()
  {
    return this.c;
  }
  
  public final Bitmap c()
  {
    return this.a;
  }
  
  public final boolean d()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.a, ((a)paramObject).a))
        {
          int i;
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((a)paramObject).c)))
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
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    int k = this.b;
    int m = k;
    int n;
    if (k != 0) {
      n = 1;
    }
    localObject = this.c;
    if (localObject != null) {
      i = ((rka)localObject).hashCode();
    }
    int i1 = this.d;
    k = i1;
    if (i1 != 0) {
      k = 1;
    }
    return ((j * 31 + n) * 31 + i) * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CatalogModel(thumb=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", isPro=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", overlayTool=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", demoMode=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KAa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */