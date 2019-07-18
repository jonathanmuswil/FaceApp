public final class Eua$c$a
  extends Eua.c
{
  private final boolean a;
  private final boolean b;
  
  public Eua$c$a(boolean paramBoolean1, boolean paramBoolean2)
  {
    super(null);
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }
  
  public final boolean a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i;
        if (this.a == ((a)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label66;
          }
        }
      }
      return false;
    }
    label66:
    return true;
  }
  
  public int hashCode()
  {
    int i = this.a;
    int j = 1;
    boolean bool = i;
    if (i != 0) {
      bool = true;
    }
    i = this.b;
    if (i == 0) {
      j = i;
    }
    return bool * true + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Camera(flashAvailable=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", flashEnabled=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Eua$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */