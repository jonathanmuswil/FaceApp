public final class Rva$e$a
  extends Rva.e
{
  private final float a;
  
  public Rva$e$a(float paramFloat)
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
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (Float.compare(this.a, ((a)paramObject).a) == 0) {}
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Rva$e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */