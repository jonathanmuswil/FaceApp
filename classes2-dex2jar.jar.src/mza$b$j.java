public final class mza$b$j
  extends mza.b
{
  private final pya a;
  private final float b;
  
  public mza$b$j(pya parampya, float paramFloat)
  {
    super(null);
    this.a = parampya;
    this.b = paramFloat;
  }
  
  public final pya a()
  {
    return this.a;
  }
  
  public final float b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof j))
      {
        paramObject = (j)paramObject;
        if ((oXa.a(this.a, ((j)paramObject).a)) && (Float.compare(this.b, ((j)paramObject).b) == 0)) {}
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
    pya localpya = this.a;
    int i;
    if (localpya != null) {
      i = localpya.hashCode();
    } else {
      i = 0;
    }
    return i * 31 + Float.floatToIntBits(this.b);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SetValue(range=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", value=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mza$b$j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */