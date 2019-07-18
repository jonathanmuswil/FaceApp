public enum zu
  implements Hs
{
  private static final Is<zu> f = new Du();
  private final int h;
  
  private zu(int paramInt)
  {
    this.h = paramInt;
  }
  
  public static zu a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
              return null;
            }
            return e;
          }
          return d;
        }
        return c;
      }
      return b;
    }
    return a;
  }
  
  public final int m()
  {
    return this.h;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */