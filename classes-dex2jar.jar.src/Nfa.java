public final class nfa
{
  private final hfa poll;
  private final mfa related_objects;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof nfa))
      {
        paramObject = (nfa)paramObject;
        if ((oXa.a(this.poll, ((nfa)paramObject).poll)) && (oXa.a(this.related_objects, ((nfa)paramObject).related_objects))) {}
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
  
  public int hashCode()
  {
    Object localObject = this.poll;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((hfa)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.related_objects;
    if (localObject != null) {
      i = ((mfa)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SinglePollDetailedResponse(poll=");
    localStringBuilder.append(this.poll);
    localStringBuilder.append(", related_objects=");
    localStringBuilder.append(this.related_objects);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */