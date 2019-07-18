import android.graphics.Bitmap;

public final class hAa$a
{
  private final Bitmap a;
  private final boolean b;
  private final boolean c;
  private final rka d;
  
  public hAa$a(Bitmap paramBitmap, boolean paramBoolean1, boolean paramBoolean2, rka paramrka)
  {
    this.a = paramBitmap;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramrka;
  }
  
  public final boolean a()
  {
    return this.c;
  }
  
  public final rka b()
  {
    return this.d;
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
          if (i != 0)
          {
            if (this.c == ((a)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.d, ((a)paramObject).d))) {
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
    int i1 = this.c;
    k = i1;
    if (i1 != 0) {
      k = 1;
    }
    localObject = this.d;
    if (localObject != null) {
      i = ((rka)localObject).hashCode();
    }
    return ((j * 31 + n) * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EffectsModel(thumb=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", isPro=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", demoMode=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", effectTool=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hAa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */