import java.util.List;

public final class pda
{
  private static final pda a = new pda(VOa.a, "");
  public static final pda.a b = new pda.a(null);
  private final VOa c;
  private final String d;
  
  public pda(VOa paramVOa, String paramString)
  {
    this.c = paramVOa;
    this.d = paramString;
  }
  
  public final String a(String paramString)
  {
    oXa.b(paramString, "separator");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c.getId());
    localStringBuilder.append(paramString);
    localStringBuilder.append(this.d);
    return localStringBuilder.toString();
  }
  
  public final String b()
  {
    return this.d;
  }
  
  public final VOa c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof pda))
      {
        paramObject = (pda)paramObject;
        if ((oXa.a(this.c, ((pda)paramObject).c)) && (oXa.a(this.d, ((pda)paramObject).d))) {}
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
    localStringBuilder.append("ReferrerInfo(gender=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", data=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final pda a()
    {
      return pda.a();
    }
    
    public final pda a(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      return new pda(VOa.e.a((String)paramString1.get(0)), (String)paramString1.get(1));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */