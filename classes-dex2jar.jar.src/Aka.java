public final class aka
{
  public static final aka.a a = new aka.a(null);
  private final String b;
  private final String c;
  private final String d;
  
  public aka(String paramString1, String paramString2, String paramString3)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final String b()
  {
    return this.d;
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof aka))
      {
        paramObject = (aka)paramObject;
        if ((oXa.a(this.b, ((aka)paramObject).b)) && (oXa.a(this.c, ((aka)paramObject).c)) && (oXa.a(this.d, ((aka)paramObject).d))) {}
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
    String str = this.b;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.c;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.d;
    if (str != null) {
      i = str.hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FacebookUserInfo(accountId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", name=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", avatarUrl=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final aka a(Hea paramHea)
    {
      oXa.b(paramHea, "data");
      return new aka(paramHea.getFacebook_user_id(), paramHea.getName(), paramHea.getProfile_pic());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/aka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */