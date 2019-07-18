import android.graphics.PointF;

public final class mza$b$i
  extends mza.b
{
  private final PointF a;
  
  public mza$b$i(PointF paramPointF)
  {
    super(null);
    this.a = paramPointF;
  }
  
  public final PointF a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof i))
      {
        paramObject = (i)paramObject;
        if (oXa.a(this.a, ((i)paramObject).a)) {}
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
    PointF localPointF = this.a;
    int i;
    if (localPointF != null) {
      i = localPointF.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SetLightSource(source=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mza$b$i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */