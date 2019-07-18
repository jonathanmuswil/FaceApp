public final class qJa$a$c
  extends qJa.a
{
  private final String a;
  private final Rka b;
  
  public qJa$a$c(String paramString, Rka paramRka)
  {
    super(null);
    this.a = paramString;
    this.b = paramRka;
  }
  
  public final Rka a()
  {
    return this.b;
  }
  
  public final String b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((oXa.a(this.a, ((c)paramObject).a)) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((Rka)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PollVoted(pollId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", newVote=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qJa$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */