public final class Ora$a$c
  extends Ora.a
{
  private final Rja c;
  
  public Ora$a$c(Rja paramRja)
  {
    super("photo_editor", null);
    this.c = paramRja;
  }
  
  public String b()
  {
    return this.c.c();
  }
  
  public final Rja c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.c, ((c)paramObject).c)) {}
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
    Rja localRja = this.c;
    int i;
    if (localRja != null) {
      i = localRja.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotoEditor(imageDesc=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Ora$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */