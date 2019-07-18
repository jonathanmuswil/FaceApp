import java.util.Date;

public final class rfa
{
  private final String choice;
  private final String comment;
  private final Date created;
  private final int id;
  private final String user_id;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof rfa))
      {
        paramObject = (rfa)paramObject;
        int i;
        if (this.id == ((rfa)paramObject).id) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.user_id, ((rfa)paramObject).user_id)) && (oXa.a(this.choice, ((rfa)paramObject).choice)) && (oXa.a(this.comment, ((rfa)paramObject).comment)) && (oXa.a(this.created, ((rfa)paramObject).created))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final String getChoice()
  {
    return this.choice;
  }
  
  public final String getComment()
  {
    return this.comment;
  }
  
  public final Date getCreated()
  {
    return this.created;
  }
  
  public final int getId()
  {
    return this.id;
  }
  
  public final String getUser_id()
  {
    return this.user_id;
  }
  
  public int hashCode()
  {
    int i = this.id;
    Object localObject = this.user_id;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.choice;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.comment;
    int n;
    if (localObject != null) {
      n = ((String)localObject).hashCode();
    } else {
      n = 0;
    }
    localObject = this.created;
    if (localObject != null) {
      j = ((Date)localObject).hashCode();
    }
    return (((i * 31 + k) * 31 + m) * 31 + n) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Vote(id=");
    localStringBuilder.append(this.id);
    localStringBuilder.append(", user_id=");
    localStringBuilder.append(this.user_id);
    localStringBuilder.append(", choice=");
    localStringBuilder.append(this.choice);
    localStringBuilder.append(", comment=");
    localStringBuilder.append(this.comment);
    localStringBuilder.append(", created=");
    localStringBuilder.append(this.created);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */