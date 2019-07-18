public final class xfa<T>
{
  public static final xfa.a Companion = new xfa.a(null);
  private final float progress;
  private final T result;
  
  public xfa(float paramFloat, T paramT)
  {
    this.progress = paramFloat;
    this.result = paramT;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof xfa))
      {
        paramObject = (xfa)paramObject;
        if ((Float.compare(this.progress, ((xfa)paramObject).progress) == 0) && (oXa.a(this.result, ((xfa)paramObject).result))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final float getProgress()
  {
    return this.progress;
  }
  
  public int hashCode()
  {
    int i = Float.floatToIntBits(this.progress);
    Object localObject = this.result;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public final boolean isReady()
  {
    boolean bool;
    if (this.result != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final T result()
  {
    Object localObject = this.result;
    if (localObject != null) {
      return (T)localObject;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProgressResult(progress=");
    localStringBuilder.append(this.progress);
    localStringBuilder.append(", result=");
    localStringBuilder.append(this.result);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final <T> xfa<T> asProgress(float paramFloat)
    {
      return new xfa(paramFloat, null);
    }
    
    public final <T> xfa<T> asResult(T paramT)
    {
      oXa.b(paramT, "result");
      return new xfa(1.0F, paramT);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */