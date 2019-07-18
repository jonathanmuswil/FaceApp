import android.graphics.Bitmap;

public final class rCa$a$b
  extends rCa.a
{
  private final Bitmap a;
  
  public rCa$a$b(Bitmap paramBitmap)
  {
    super(null);
    this.a = paramBitmap;
  }
  
  public final Bitmap a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.a, ((b)paramObject).a)) {}
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
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Origin(bitmap=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rCa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */