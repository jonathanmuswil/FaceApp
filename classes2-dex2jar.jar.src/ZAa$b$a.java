import android.graphics.Bitmap;

public final class ZAa$b$a
  extends ZAa.b
{
  private final Bitmap a;
  private final Bitmap b;
  
  public ZAa$b$a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    super(null);
    this.a = paramBitmap1;
    this.b = paramBitmap2;
  }
  
  public final Bitmap a()
  {
    return this.a;
  }
  
  public final Bitmap b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    Bitmap localBitmap = this.a;
    int i = 0;
    int j;
    if (localBitmap != null) {
      j = localBitmap.hashCode();
    } else {
      j = 0;
    }
    localBitmap = this.b;
    if (localBitmap != null) {
      i = localBitmap.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AnimatedContent(bitmap1=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", bitmap2=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ZAa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */