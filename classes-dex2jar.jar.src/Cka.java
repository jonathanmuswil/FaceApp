public final class cka
{
  public static final cka.a a = new cka.a(null);
  private final String b;
  private final String c;
  
  public cka(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof cka))
      {
        paramObject = (cka)paramObject;
        if ((oXa.a(this.b, ((cka)paramObject).b)) && (oXa.a(this.c, ((cka)paramObject).c))) {}
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
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhoneNumberUserInfo(accountId=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", phoneNumber=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final cka a(Gea paramGea)
    {
      oXa.b(paramGea, "data");
      return new cka(paramGea.getAccount_id(), paramGea.getPhone_number());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */