public final class gNa$d$c
  extends gNa.d
{
  private final float a;
  private final gNa.b b;
  
  public gNa$d$c(float paramFloat, gNa.b paramb)
  {
    super(null);
    this.a = paramFloat;
    this.b = paramb;
  }
  
  public final float a()
  {
    return this.a;
  }
  
  public final gNa.b b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((Float.compare(this.a, ((c)paramObject).a) == 0) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
    int i = Float.floatToIntBits(this.a);
    gNa.b localb = this.b;
    int j;
    if (localb != null) {
      j = localb.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Progress(progress=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", step=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gNa$d$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */