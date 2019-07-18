import java.util.List;

public final class zka
{
  private final String a;
  private final String b;
  private final List<Ika> c;
  
  public zka(String paramString1, String paramString2, List<Ika> paramList)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramList;
  }
  
  public final List<Ika> a()
  {
    return this.c;
  }
  
  public final String b()
  {
    return this.a;
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof zka))
      {
        paramObject = (zka)paramObject;
        if ((oXa.a(this.a, ((zka)paramObject).a)) && (oXa.a(this.b, ((zka)paramObject).b)) && (oXa.a(this.c, ((zka)paramObject).c))) {}
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
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FilterSection(sectionId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", sectionTitle=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", filters=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */