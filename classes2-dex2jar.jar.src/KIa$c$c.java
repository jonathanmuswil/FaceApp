import io.faceapp.ui.photo_picker.item.d;
import java.util.List;

public final class KIa$c$c
  extends KIa.c
{
  private final List<d> a;
  
  public KIa$c$c(List<d> paramList)
  {
    super(null);
    this.a = paramList;
  }
  
  public final List<d> a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if (oXa.a(this.a, ((c)paramObject).a)) {}
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
    List localList = this.a;
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
    localStringBuilder.append("StableCollections(collections=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KIa$c$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */