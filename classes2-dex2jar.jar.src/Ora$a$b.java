public final class Ora$a$b
  extends Ora.a
{
  private final VOa c;
  private final String d;
  
  public Ora$a$b(VOa paramVOa, String paramString)
  {
    super("onboarding", null);
    this.c = paramVOa;
    this.d = paramString;
  }
  
  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("screen=onboarding");
    localStringBuilder.append("&gen=");
    localStringBuilder.append(this.c.getId());
    int i;
    if (this.d.length() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject;
    if (i != 0)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("&subscription=");
      ((StringBuilder)localObject).append(this.d);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final VOa d()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.c, ((b)paramObject).c)) && (oXa.a(this.d, ((b)paramObject).d))) {}
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
    Object localObject = this.c;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Enum)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Onboarding(gender=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", data=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Ora$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */