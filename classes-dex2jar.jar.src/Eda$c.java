import java.util.List;

final class Eda$c
{
  public static final Eda.c.a a = new Eda.c.a(null);
  private final String b;
  private final boolean c;
  
  public Eda$c(String paramString, boolean paramBoolean)
  {
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.b, ((c)paramObject).b))
        {
          int i;
          if (this.c == ((c)paramObject).c) {
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
    String str = this.b;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    int j = this.c;
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OpEditorKey(filterIds=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", highRes=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final Eda.c a(List<String> paramList, boolean paramBoolean)
    {
      oXa.b(paramList, "filterIds");
      return new Eda.c(mWa.a(paramList, null, null, null, 0, null, null, 63, null), paramBoolean);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Eda$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */