import io.faceapp.ui.misc.c.a;

public final class gNa$d$b
  extends gNa.d
{
  private final c.a a;
  private final boolean b;
  private final boolean c;
  
  public gNa$d$b(c.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(null);
    this.a = parama;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  public final c.a a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    return this.b;
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.a, ((b)paramObject).a))
        {
          int i;
          if (this.b == ((b)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((b)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label80;
            }
          }
        }
      }
      return false;
    }
    label80:
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
    int j = this.b;
    int k = j;
    int m;
    if (j != 0) {
      m = 1;
    }
    int n = this.c;
    j = n;
    if (n != 0) {
      j = 1;
    }
    return (i * 31 + m) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NetworkError(error=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", isLogged=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", isPro=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gNa$d$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */