public final class qfa
{
  private final gfa poll;
  private final mfa related_objects;
  private final rfa vote;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof qfa))
      {
        paramObject = (qfa)paramObject;
        if ((oXa.a(this.poll, ((qfa)paramObject).poll)) && (oXa.a(this.vote, ((qfa)paramObject).vote)) && (oXa.a(this.related_objects, ((qfa)paramObject).related_objects))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final gfa getPoll()
  {
    return this.poll;
  }
  
  public final mfa getRelated_objects()
  {
    return this.related_objects;
  }
  
  public final rfa getVote()
  {
    return this.vote;
  }
  
  public int hashCode()
  {
    Object localObject = this.poll;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((gfa)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.vote;
    int k;
    if (localObject != null) {
      k = ((rfa)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.related_objects;
    if (localObject != null) {
      i = ((mfa)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SubmitVoteResponse(poll=");
    localStringBuilder.append(this.poll);
    localStringBuilder.append(", vote=");
    localStringBuilder.append(this.vote);
    localStringBuilder.append(", related_objects=");
    localStringBuilder.append(this.related_objects);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */