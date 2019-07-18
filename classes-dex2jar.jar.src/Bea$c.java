import java.util.List;

public final class Bea$c
  extends Bea
{
  private final QVa f;
  private final String g;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(c.class), "hostsServiceCustom", "getHostsServiceCustom()Lio/faceapp/api/services/FAHostsServiceCustom;");
    vXa.a(localrXa);
    e = new XXa[] { localrXa };
  }
  
  public Bea$c(String paramString)
  {
    super((String)localObject1, (String)localObject2, localStringBuilder.toString(), null);
    this.g = paramString;
    this.f = RVa.a(Cea.b);
  }
  
  private final gia e()
  {
    QVa localQVa = this.f;
    XXa localXXa = e[0];
    return (gia)localQVa.getValue();
  }
  
  public XQa<List<bfa>> b()
  {
    return e().a(this.g);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.g, ((c)paramObject).g)) {}
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
    String str = this.g;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Custom(serverId=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Bea$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */