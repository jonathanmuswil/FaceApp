import java.util.List;

public final class fka
{
  public static final fka.a a = new fka.a(null);
  private final dka b;
  private final gka c;
  
  public fka(dka paramdka, gka paramgka)
  {
    this.b = paramdka;
    this.c = paramgka;
  }
  
  public final fka a(dka paramdka, gka paramgka)
  {
    oXa.b(paramdka, "user");
    oXa.b(paramgka, "token");
    return new fka(paramdka, paramgka);
  }
  
  public final gka a()
  {
    return this.c;
  }
  
  public final String a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "separator");
    oXa.b(paramString2, "subSeparator");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b.a(paramString2));
    localStringBuilder.append(paramString1);
    localStringBuilder.append(this.c.a(paramString2));
    return localStringBuilder.toString();
  }
  
  public final dka b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof fka))
      {
        paramObject = (fka)paramObject;
        if ((oXa.a(this.b, ((fka)paramObject).b)) && (oXa.a(this.c, ((fka)paramObject).c))) {}
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
    Object localObject = this.b;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((dka)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UserCredentials(user=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", token=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final fka a(Rea paramRea)
    {
      oXa.b(paramRea, "data");
      Object localObject = paramRea.getUser();
      if (localObject != null)
      {
        localObject = dka.b.a((Qea)localObject);
        if (localObject != null) {}
      }
      else
      {
        localObject = dka.b.a();
      }
      return new fka((dka)localObject, gka.b.a(paramRea));
    }
    
    public final fka a(String paramString1, String paramString2, String paramString3)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      oXa.b(paramString3, "subSeparator");
      paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      return new fka(dka.b.a((String)paramString1.get(0), paramString3), gka.b.a((String)paramString1.get(1), paramString3));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */