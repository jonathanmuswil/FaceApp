import android.graphics.Bitmap;

public final class Cza$a
  extends Cza
{
  private final mka a;
  private final Bitmap b;
  
  public Cza$a(mka parammka, Bitmap paramBitmap)
  {
    super(null);
    this.a = parammka;
    this.b = paramBitmap;
  }
  
  public String a()
  {
    return this.a.d();
  }
  
  public Bitmap b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.a.e();
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
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((mka)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FolderAdapter(folder=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", thumb=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Cza$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */