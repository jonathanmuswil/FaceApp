import android.graphics.Bitmap;

public final class GDa$a$d
  extends GDa.a
{
  private final Bitmap a;
  private final nsa.b b;
  
  public GDa$a$d(Bitmap paramBitmap, nsa.b paramb)
  {
    super(null);
    this.a = paramBitmap;
    this.b = paramb;
  }
  
  public final Bitmap a()
  {
    return this.a;
  }
  
  public final nsa.b b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if ((oXa.a(this.a, ((d)paramObject).a)) && (oXa.a(this.b, ((d)paramObject).b))) {}
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
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((nsa.b)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Success(preview=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", sharedImage=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/GDa$a$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */