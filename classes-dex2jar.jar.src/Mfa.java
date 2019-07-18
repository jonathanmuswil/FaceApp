import java.util.List;

public final class mfa
{
  private final List<jfa> users;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof mfa))
      {
        paramObject = (mfa)paramObject;
        if (oXa.a(this.users, ((mfa)paramObject).users)) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final List<jfa> getUsers()
  {
    return this.users;
  }
  
  public int hashCode()
  {
    List localList = this.users;
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
    localStringBuilder.append("RelatedObjects(users=");
    localStringBuilder.append(this.users);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */