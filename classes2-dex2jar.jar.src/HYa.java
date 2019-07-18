import java.util.Set;

public final class hya
  extends Bza<lya, Set<? extends String>>
{
  private final lya a;
  private final boolean b;
  
  public hya(lya paramlya, boolean paramBoolean)
  {
    this.a = paramlya;
    this.b = paramBoolean;
  }
  
  public Iza<Set<String>> a(boolean paramBoolean)
  {
    return new hya(b(), paramBoolean);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean a(Set<String> paramSet)
  {
    oXa.b(paramSet, "selection");
    return paramSet.contains(b().a().c());
  }
  
  public lya b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof hya))
      {
        paramObject = (hya)paramObject;
        if (oXa.a(b(), ((hya)paramObject).b()))
        {
          int i;
          if (a() == ((hya)paramObject).a()) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label58;
          }
        }
      }
      return false;
    }
    label58:
    return true;
  }
  
  public int hashCode()
  {
    lya locallya = b();
    int i;
    if (locallya != null) {
      i = locallya.hashCode();
    } else {
      i = 0;
    }
    int j = a();
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ToolItem(payload=");
    localStringBuilder.append(b());
    localStringBuilder.append(", selected=");
    localStringBuilder.append(a());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */