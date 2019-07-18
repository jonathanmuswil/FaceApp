public final class oHa
{
  private final float a;
  private final String b;
  
  public oHa(float paramFloat, String paramString)
  {
    this.a = paramFloat;
    this.b = paramString;
  }
  
  public final String a()
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
      if ((paramObject instanceof oHa))
      {
        paramObject = (oHa)paramObject;
        if ((Float.compare(this.a, ((oHa)paramObject).a) == 0) && (oXa.a(this.b, ((oHa)paramObject).b))) {}
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
    String str = this.b;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProgressModel(progress=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", desc=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */