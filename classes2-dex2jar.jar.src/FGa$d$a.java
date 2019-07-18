import java.util.List;

public final class FGa$d$a
  extends FGa.d
{
  private final List<FGa.b> a;
  private final Boolean b;
  
  public FGa$d$a(List<? extends FGa.b> paramList, Boolean paramBoolean)
  {
    super(null);
    this.a = paramList;
    this.b = paramBoolean;
  }
  
  public final Boolean a()
  {
    return this.b;
  }
  
  public final List<FGa.b> b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((Boolean)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AllFilled(parts=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", createdJustNow=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FGa$d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */