public final class vBa
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private final float e;
  
  public vBa(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.e = paramFloat5;
  }
  
  public final float a()
  {
    return this.c;
  }
  
  public final float b()
  {
    return this.a;
  }
  
  public final float c()
  {
    return this.b;
  }
  
  public final float d()
  {
    return this.d;
  }
  
  public final float e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof vBa))
      {
        paramObject = (vBa)paramObject;
        if ((Float.compare(this.a, ((vBa)paramObject).a) == 0) && (Float.compare(this.b, ((vBa)paramObject).b) == 0) && (Float.compare(this.c, ((vBa)paramObject).c) == 0) && (Float.compare(this.d, ((vBa)paramObject).d) == 0) && (Float.compare(this.e, ((vBa)paramObject).e) == 0)) {}
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
    return (((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d)) * 31 + Float.floatToIntBits(this.e);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdjustParams(contrast=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", saturation=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", brightness=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", temperature=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", vignette=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */