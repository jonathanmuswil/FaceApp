public abstract class pba
{
  private final String a;
  private final String b;
  
  public pba(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public static class a
    extends pba
  {
    public a(String paramString1, String paramString2)
    {
      super(paramString2);
    }
  }
  
  public static class b
    extends pba
  {
    public b(String paramString1, String paramString2)
    {
      super(paramString2);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */