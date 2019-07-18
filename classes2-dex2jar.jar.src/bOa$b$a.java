public final class bOa$b$a
  extends bOa.b
{
  private final float a;
  private final float b;
  
  public bOa$b$a(float paramFloat1, float paramFloat2)
  {
    super(null);
    this.a = paramFloat1;
    this.b = paramFloat2;
  }
  
  public final float a()
  {
    return this.b;
  }
  
  public final float b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((Float.compare(this.a, ((a)paramObject).a) == 0) && (Float.compare(this.b, ((a)paramObject).b) == 0)) {}
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
    return Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Crop(wScroll=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", hScroll=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bOa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */