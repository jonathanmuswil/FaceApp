public abstract class oxa
{
  public abstract int a();
  
  public abstract String b();
  
  public static class a
    extends oxa
  {
    private final int a;
    private final int b;
    
    public a(int paramInt1, int paramInt2)
    {
      super();
      this.a = paramInt1;
      this.b = paramInt2;
    }
    
    public int a()
    {
      return 2131230981;
    }
    
    public String b()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(c());
      localStringBuilder.append(" : ");
      localStringBuilder.append(d());
      return localStringBuilder.toString();
    }
    
    public int c()
    {
      return this.a;
    }
    
    public int d()
    {
      return this.b;
    }
    
    public String e()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(c());
      localStringBuilder.append(" : ");
      localStringBuilder.append(d());
      return localStringBuilder.toString();
    }
  }
  
  public static class b
    extends oxa.a
  {
    private final int c;
    private final int d;
    
    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.c = paramInt1;
      this.d = paramInt2;
    }
    
    public int a()
    {
      return 2131230981;
    }
    
    public String b()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(c());
      localStringBuilder.append(':');
      localStringBuilder.append(d());
      return localStringBuilder.toString();
    }
    
    public int c()
    {
      return this.c;
    }
    
    public int d()
    {
      return this.d;
    }
  }
  
  public static final class c
    extends oxa
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
    
    public int a()
    {
      return 2131230980;
    }
    
    public String b()
    {
      return "";
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */