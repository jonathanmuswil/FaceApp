import java.util.Date;

public final class sfa
  extends ufa
{
  private final String author_id;
  private final Date created;
  private final tfa data;
  private final int id;
  private final Date updated;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof sfa))
      {
        paramObject = (sfa)paramObject;
        int i;
        if (this.id == ((sfa)paramObject).id) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.author_id, ((sfa)paramObject).author_id)) && (oXa.a(this.created, ((sfa)paramObject).created)) && (oXa.a(this.updated, ((sfa)paramObject).updated)) && (oXa.a(this.data, ((sfa)paramObject).data))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final tfa getData()
  {
    return this.data;
  }
  
  public int hashCode()
  {
    int i = this.id;
    Object localObject = this.author_id;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.created;
    int m;
    if (localObject != null) {
      m = ((Date)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.updated;
    int n;
    if (localObject != null) {
      n = ((Date)localObject).hashCode();
    } else {
      n = 0;
    }
    localObject = this.data;
    if (localObject != null) {
      j = ((tfa)localObject).hashCode();
    }
    return (((i * 31 + k) * 31 + m) * 31 + n) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PollPost(id=");
    localStringBuilder.append(this.id);
    localStringBuilder.append(", author_id=");
    localStringBuilder.append(this.author_id);
    localStringBuilder.append(", created=");
    localStringBuilder.append(this.created);
    localStringBuilder.append(", updated=");
    localStringBuilder.append(this.updated);
    localStringBuilder.append(", data=");
    localStringBuilder.append(this.data);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */