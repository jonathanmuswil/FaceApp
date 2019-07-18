import android.graphics.Bitmap;

public final class lxa$b$a$b
  extends lxa.b.a
{
  private final Eka d;
  private final lxa.d e;
  private final Bitmap f;
  private final APa g;
  private final Float h;
  
  public lxa$b$a$b(Eka paramEka, lxa.d paramd, Bitmap paramBitmap, APa paramAPa, Float paramFloat)
  {
    super(paramEka, paramd, true, null);
    this.d = paramEka;
    this.e = paramd;
    this.f = paramBitmap;
    this.g = paramAPa;
    this.h = paramFloat;
  }
  
  public final Bitmap d()
  {
    return this.f;
  }
  
  public final Float e()
  {
    return this.h;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.d, ((b)paramObject).d)) && (oXa.a(this.e, ((b)paramObject).e)) && (oXa.a(this.f, ((b)paramObject).f)) && (oXa.a(this.g, ((b)paramObject).g)) && (oXa.a(this.h, ((b)paramObject).h))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final APa f()
  {
    return this.g;
  }
  
  public int hashCode()
  {
    Object localObject = this.d;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Eka)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.e;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    localObject = this.f;
    int m;
    if (localObject != null) {
      m = localObject.hashCode();
    } else {
      m = 0;
    }
    localObject = this.g;
    int n;
    if (localObject != null) {
      n = ((APa)localObject).hashCode();
    } else {
      n = 0;
    }
    localObject = this.h;
    if (localObject != null) {
      i = ((Float)localObject).hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ContentBefore(f=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", sO=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", bitmap=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", viewDimenRatio=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", progress=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$b$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */