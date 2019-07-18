public final class lxa$b$b
  extends lxa.b
{
  private final float a;
  
  public lxa$b$b(float paramFloat)
  {
    super(null);
    this.a = paramFloat;
  }
  
  public final float a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if (Float.compare(this.a, ((b)paramObject).a) == 0) {}
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
    return Float.floatToIntBits(this.a);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Loading(progress=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */