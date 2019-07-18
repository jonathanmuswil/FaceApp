import java.util.List;

public final class wfa
{
  private final List<gfa> polls;
  private final List<jfa> users;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof wfa))
      {
        paramObject = (wfa)paramObject;
        if ((oXa.a(this.users, ((wfa)paramObject).users)) && (oXa.a(this.polls, ((wfa)paramObject).polls))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final List<gfa> getPolls()
  {
    return this.polls;
  }
  
  public final List<jfa> getUsers()
  {
    return this.users;
  }
  
  public int hashCode()
  {
    List localList = this.users;
    int i = 0;
    int j;
    if (localList != null) {
      j = localList.hashCode();
    } else {
      j = 0;
    }
    localList = this.polls;
    if (localList != null) {
      i = localList.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RelatedObjects(users=");
    localStringBuilder.append(this.users);
    localStringBuilder.append(", polls=");
    localStringBuilder.append(this.polls);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */