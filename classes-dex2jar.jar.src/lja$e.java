public enum lja$e
{
  public static final lja.e.a e = new lja.e.a(null);
  private final int f;
  
  static
  {
    e locale1 = new e("UNDEFINED", 0, 0);
    a = locale1;
    e locale2 = new e("FREE", 1, 1);
    b = locale2;
    e locale3 = new e("PRO", 2, 2);
    c = locale3;
    d = new e[] { locale1, locale2, locale3 };
  }
  
  private lja$e(int paramInt)
  {
    this.f = paramInt;
  }
  
  public final int getId()
  {
    return this.f;
  }
  
  public String toString()
  {
    int i = mja.a[ordinal()];
    String str;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          str = "Pro";
        } else {
          throw new UVa();
        }
      }
      else {
        str = "Free";
      }
    }
    else {
      str = "Undefined";
    }
    return str;
  }
  
  public static final class a
  {
    public final lja.e a(int paramInt)
    {
      for (locale : )
      {
        int k;
        if (locale.getId() == paramInt) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0) {
          break label57;
        }
      }
      lja.e locale = null;
      label57:
      return locale;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lja$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */