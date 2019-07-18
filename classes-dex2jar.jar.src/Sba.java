public enum sba
{
  private final int f;
  
  private sba(int paramInt)
  {
    this.f = paramInt;
  }
  
  public static sba a(String paramString)
  {
    if ("io.crash.air".equals(paramString)) {
      return c;
    }
    if (paramString != null) {
      return d;
    }
    return a;
  }
  
  public int getId()
  {
    return this.f;
  }
  
  public String toString()
  {
    return Integer.toString(this.f);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */