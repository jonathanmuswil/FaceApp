public final class t_a
{
  public static final mab a = mab.b(":");
  public static final mab b = mab.b(":status");
  public static final mab c = mab.b(":method");
  public static final mab d = mab.b(":path");
  public static final mab e = mab.b(":scheme");
  public static final mab f = mab.b(":authority");
  public final mab g;
  public final mab h;
  final int i;
  
  public t_a(String paramString1, String paramString2)
  {
    this(mab.b(paramString1), mab.b(paramString2));
  }
  
  public t_a(mab parammab, String paramString)
  {
    this(parammab, mab.b(paramString));
  }
  
  public t_a(mab parammab1, mab parammab2)
  {
    this.g = parammab1;
    this.h = parammab2;
    this.i = (parammab1.e() + 32 + parammab2.e());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof t_a;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (t_a)paramObject;
      bool3 = bool2;
      if (this.g.equals(((t_a)paramObject).g))
      {
        bool3 = bool2;
        if (this.h.equals(((t_a)paramObject).h)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public int hashCode()
  {
    return (527 + this.g.hashCode()) * 31 + this.h.hashCode();
  }
  
  public String toString()
  {
    return LZa.a("%s: %s", new Object[] { this.g.h(), this.h.h() });
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/t_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */