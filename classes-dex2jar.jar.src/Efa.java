public final class efa
{
  private final String filter_id;
  private final String image_id;
  private final int query_id;
  
  public efa(int paramInt, String paramString1, String paramString2)
  {
    this.query_id = paramInt;
    this.image_id = paramString1;
    this.filter_id = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof efa))
      {
        paramObject = (efa)paramObject;
        int i;
        if (this.query_id == ((efa)paramObject).query_id) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.image_id, ((efa)paramObject).image_id)) && (oXa.a(this.filter_id, ((efa)paramObject).filter_id))) {}
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
    int i = this.query_id;
    String str = this.image_id;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.filter_id;
    if (str != null) {
      j = str.hashCode();
    }
    return (i * 31 + k) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotoSavedFeedback(query_id=");
    localStringBuilder.append(this.query_id);
    localStringBuilder.append(", image_id=");
    localStringBuilder.append(this.image_id);
    localStringBuilder.append(", filter_id=");
    localStringBuilder.append(this.filter_id);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/efa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */