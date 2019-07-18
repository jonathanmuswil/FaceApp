import android.graphics.Bitmap;

public final class Cza$b
  extends Cza
{
  private final rka a;
  private final Bitmap b;
  
  public Cza$b(rka paramrka, Bitmap paramBitmap)
  {
    super(null);
    this.a = paramrka;
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
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b))) {}
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
      j = ((rka)localObject).hashCode();
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
    localStringBuilder.append("ToolAdapter(tool=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", thumb=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Cza$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */