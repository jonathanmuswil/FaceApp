import android.graphics.Bitmap;

public final class Qwa$a$c
  extends Qwa.a
{
  private final Bitmap a;
  
  public Qwa$a$c(Bitmap paramBitmap)
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
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.a, ((c)paramObject).a)) {}
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
    localStringBuilder.append("Ready(bitmap=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Qwa$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */