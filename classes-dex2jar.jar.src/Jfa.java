public final class jfa
{
  private final String first_name;
  private final String id;
  private final String last_name;
  private final String profile_pic;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof jfa))
      {
        paramObject = (jfa)paramObject;
        if ((oXa.a(this.id, ((jfa)paramObject).id)) && (oXa.a(this.first_name, ((jfa)paramObject).first_name)) && (oXa.a(this.last_name, ((jfa)paramObject).last_name)) && (oXa.a(this.profile_pic, ((jfa)paramObject).profile_pic))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final String getFirst_name()
  {
    return this.first_name;
  }
  
  public final String getId()
  {
    return this.id;
  }
  
  public final String getLast_name()
  {
    return this.last_name;
  }
  
  public final String getProfile_pic()
  {
    return this.profile_pic;
  }
  
  public int hashCode()
  {
    String str = this.id;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.first_name;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.last_name;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = this.profile_pic;
    if (str != null) {
      i = str.hashCode();
    }
    return ((j * 31 + k) * 31 + m) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PollUser(id=");
    localStringBuilder.append(this.id);
    localStringBuilder.append(", first_name=");
    localStringBuilder.append(this.first_name);
    localStringBuilder.append(", last_name=");
    localStringBuilder.append(this.last_name);
    localStringBuilder.append(", profile_pic=");
    localStringBuilder.append(this.profile_pic);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */