import java.util.List;

public final class vfa
{
  private final int count;
  private final wfa related_objects;
  private final List<ufa> results;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof vfa))
      {
        paramObject = (vfa)paramObject;
        int i;
        if (this.count == ((vfa)paramObject).count) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.results, ((vfa)paramObject).results)) && (oXa.a(this.related_objects, ((vfa)paramObject).related_objects))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final wfa getRelated_objects()
  {
    return this.related_objects;
  }
  
  public final List<ufa> getResults()
  {
    return this.results;
  }
  
  public int hashCode()
  {
    int i = this.count;
    Object localObject = this.results;
    int j = 0;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    localObject = this.related_objects;
    if (localObject != null) {
      j = ((wfa)localObject).hashCode();
    }
    return (i * 31 + k) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PostsResponse(count=");
    localStringBuilder.append(this.count);
    localStringBuilder.append(", results=");
    localStringBuilder.append(this.results);
    localStringBuilder.append(", related_objects=");
    localStringBuilder.append(this.related_objects);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */