import io.faceapp.ui.misc.c.a;

public final class sFa$b$d
  extends sFa.b
{
  private final c.a a;
  
  public sFa$b$d(c.a parama)
  {
    super(null);
    this.a = parama;
  }
  
  public final c.a a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.a, ((d)paramObject).a)) {}
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
    c.a locala = this.a;
    int i;
    if (locala != null) {
      i = locala.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NetworkError(errorModel=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sFa$b$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */