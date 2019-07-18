import java.util.List;

final class Eda$b
{
  public static final Eda.b.a a = new Eda.b.a(null);
  private final String b;
  
  public Eda$b(String paramString)
  {
    this.b = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.b, ((b)paramObject).b)) {}
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
    localStringBuilder.append("OpEditorApiResponseKey(filterIds=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final Eda.b a(List<String> paramList)
    {
      oXa.b(paramList, "filterIds");
      return new Eda.b(mWa.a(paramList, null, null, null, 0, null, null, 63, null));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Eda$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */