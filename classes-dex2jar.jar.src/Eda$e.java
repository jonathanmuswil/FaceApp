import java.util.List;

final class Eda$e
{
  public static final Eda.e.a a = new Eda.e.a(null);
  private final String b;
  
  public Eda$e(String paramString)
  {
    this.b = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if (oXa.a(this.b, ((e)paramObject).b)) {}
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
    localStringBuilder.append("OpStylistKey(filterIds=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final Eda.e a(List<String> paramList)
    {
      oXa.b(paramList, "filterIds");
      return new Eda.e(mWa.a(mWa.h(paramList), null, null, null, 0, null, null, 63, null));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Eda$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */