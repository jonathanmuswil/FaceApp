import java.util.List;

public final class WHa$b$b
  extends WHa.b
{
  private final List<HHa.b> d;
  
  public WHa$b$b(List<? extends HHa.b> paramList)
  {
    super(paramList, null, false, null);
    this.d = paramList;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (oXa.a(this.d, ((b)paramObject).d)) {}
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
    List localList = this.d;
    int i;
    if (localList != null) {
      i = localList.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NoPurchase(tutorialPages=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WHa$b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */