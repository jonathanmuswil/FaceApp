public enum pJa
{
  public static final pJa.a d = new pJa.a(null);
  
  static
  {
    pJa localpJa1 = new pJa("MY_STYLES", 0);
    a = localpJa1;
    pJa localpJa2 = new pJa("FEED", 1);
    b = localpJa2;
    c = new pJa[] { localpJa1, localpJa2 };
  }
  
  private pJa() {}
  
  public final int a()
  {
    return ordinal();
  }
  
  public static final class a
  {
    public final pJa a(int paramInt)
    {
      return pJa.values()[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pJa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */