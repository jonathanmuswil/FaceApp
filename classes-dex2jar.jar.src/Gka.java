import java.util.List;

public final class gka
{
  private static final gka a = new gka("", -1L);
  public static final gka.a b = new gka.a(null);
  private final String c;
  private final long d;
  
  public gka(String paramString, long paramLong)
  {
    this.c = paramString;
    this.d = paramLong;
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c);
    localStringBuilder.append(paramString);
    localStringBuilder.append(this.d);
    return localStringBuilder.toString();
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final gka c()
  {
    return new gka(this.c, -1L);
  }
  
  public final boolean d()
  {
    int i = this.c.length();
    boolean bool = true;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) || (this.d <= System.currentTimeMillis())) {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UserToken(isValid=");
    localStringBuilder.append(d());
    localStringBuilder.append(", token=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", validUntil=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final gka a()
    {
      return gka.a();
    }
    
    public final gka a(Rea paramRea)
    {
      oXa.b(paramRea, "data");
      Object localObject = Uma.qa.k().get();
      oXa.a(localObject, "AppPreferences.debugTokenLifetime30Sec.get()");
      long l;
      if (((Boolean)localObject).booleanValue()) {
        l = 30L;
      } else {
        l = Long.parseLong(paramRea.getUser_token_lifetime());
      }
      return new gka(paramRea.getUser_token(), System.currentTimeMillis() + l * 'Ϩ');
    }
    
    public final gka a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      return new gka((String)paramString1.get(0), Long.parseLong((String)paramString1.get(1)));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */