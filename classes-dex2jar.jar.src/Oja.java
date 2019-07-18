import java.util.List;

public final class oja
{
  private static final oja a = new oja(lja.d.c, nja.b.a());
  public static final oja.a b = new oja.a(null);
  private final lja c;
  private final nja d;
  
  public oja(lja paramlja, nja paramnja)
  {
    this.c = paramlja;
    this.d = paramnja;
  }
  
  public final String a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "separator");
    oXa.b(paramString2, "subSeparator");
    String str = this.c.a(paramString2);
    paramString2 = this.d.a(paramString2);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public final lja b()
  {
    return this.c;
  }
  
  public final boolean c()
  {
    lja locallja = this.c;
    if ((locallja instanceof lja.c)) {
      return true;
    }
    boolean bool1 = oXa.a(locallja, lja.b.c);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (d() != null) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final qja d()
  {
    nja localnja = this.d;
    boolean bool = oXa.a(localnja, nja.b.a());
    qja localqja = null;
    if (!(bool ^ true)) {
      localnja = null;
    }
    if (localnja != null) {
      localqja = localnja.d();
    }
    return localqja;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof oja))
      {
        paramObject = (oja)paramObject;
        if ((oXa.a(this.c, ((oja)paramObject).c)) && (oXa.a(this.d, ((oja)paramObject).d))) {}
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
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      i = ((nja)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    String str;
    if (oXa.a(this.d, nja.b.a())) {
      str = "NoPurchase";
    } else {
      str = this.d.d().f();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProVersionStatus(debugPurchase: ");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", playStorePurchase: ");
    localStringBuilder.append(str);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final oja a()
    {
      return oja.a();
    }
    
    public final oja a(String paramString1, String paramString2, String paramString3)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      oXa.b(paramString3, "subSeparator");
      paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      return new oja(lja.a.a((String)paramString1.get(0), paramString3), nja.b.a((String)paramString1.get(1), paramString3));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */