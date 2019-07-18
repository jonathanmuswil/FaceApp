import java.util.List;

public final class bfa
{
  public static final bfa.a Companion = new bfa.a(null);
  private String host;
  private int port;
  private int weight;
  
  public bfa(String paramString, int paramInt1, int paramInt2)
  {
    this.host = paramString;
    this.port = paramInt1;
    this.weight = paramInt2;
  }
  
  public final String component1()
  {
    return this.host;
  }
  
  public final int component2()
  {
    return this.port;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof bfa))
      {
        paramObject = (bfa)paramObject;
        if (oXa.a(this.host, ((bfa)paramObject).host))
        {
          int i;
          if (this.port == ((bfa)paramObject).port) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.weight == ((bfa)paramObject).weight) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label80;
            }
          }
        }
      }
      return false;
    }
    label80:
    return true;
  }
  
  public final String getHost()
  {
    return this.host;
  }
  
  public final int getPort()
  {
    return this.port;
  }
  
  public final int getWeight()
  {
    return this.weight;
  }
  
  public int hashCode()
  {
    String str = this.host;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return (i * 31 + this.port) * 31 + this.weight;
  }
  
  public final String serialize(String paramString)
  {
    oXa.b(paramString, "separator");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.host);
    localStringBuilder.append(paramString);
    localStringBuilder.append(this.port);
    localStringBuilder.append(paramString);
    localStringBuilder.append(this.weight);
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Host(host=");
    localStringBuilder.append(this.host);
    localStringBuilder.append(", port=");
    localStringBuilder.append(this.port);
    localStringBuilder.append(", weight=");
    localStringBuilder.append(this.weight);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final bfa deserialize(String paramString1, String paramString2)
    {
      oXa.b(paramString1, "serialized");
      oXa.b(paramString2, "separator");
      paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
      return new bfa((String)paramString1.get(0), Integer.parseInt((String)paramString1.get(1)), Integer.parseInt((String)paramString1.get(2)));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */