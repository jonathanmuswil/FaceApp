import android.graphics.Bitmap;

public final class FDa$b
  extends FDa
{
  private final Bitmap a;
  private final float b;
  
  public FDa$b(Bitmap paramBitmap, float paramFloat)
  {
    super(null);
    this.a = paramBitmap;
    this.b = paramFloat;
  }
  
  public final Bitmap a()
  {
    return this.a;
  }
  
  public final float b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.a, ((b)paramObject).a)) && (Float.compare(this.b, ((b)paramObject).b) == 0)) {}
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
    int i;
    if (localBitmap != null) {
      i = localBitmap.hashCode();
    } else {
      i = 0;
    }
    return i * 31 + Float.floatToIntBits(this.b);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Progress(preview=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", progress=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FDa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */