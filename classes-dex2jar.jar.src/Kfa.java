import java.util.List;

public final class kfa
{
  private final int count;
  private final hfa poll;
  private final mfa related_objects;
  private final List<rfa> results;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof kfa))
      {
        paramObject = (kfa)paramObject;
        int i;
        if (this.count == ((kfa)paramObject).count) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.results, ((kfa)paramObject).results)) && (oXa.a(this.poll, ((kfa)paramObject).poll)) && (oXa.a(this.related_objects, ((kfa)paramObject).related_objects))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final hfa getPoll()
  {
    return this.poll;
  }
  
  public final mfa getRelated_objects()
  {
    return this.related_objects;
  }
  
  public final List<rfa> getResults()
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
    localObject = this.poll;
    int m;
    if (localObject != null) {
      m = ((hfa)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.related_objects;
    if (localObject != null) {
      j = ((mfa)localObject).hashCode();
    }
    return ((i * 31 + k) * 31 + m) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PollVotesResponse(count=");
    localStringBuilder.append(this.count);
    localStringBuilder.append(", results=");
    localStringBuilder.append(this.results);
    localStringBuilder.append(", poll=");
    localStringBuilder.append(this.poll);
    localStringBuilder.append(", related_objects=");
    localStringBuilder.append(this.related_objects);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */