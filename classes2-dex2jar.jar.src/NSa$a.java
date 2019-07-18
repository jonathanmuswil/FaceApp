public enum nsa$a
{
  public static final nsa.a.a f = new nsa.a.a(null);
  private final int g;
  private final String h;
  
  static
  {
    a locala1 = new a("INSTAGRAM", 0, 0, "com.instagram.android");
    a = locala1;
    a locala2 = new a("FACEBOOK", 1, 1, "com.facebook.katana");
    b = locala2;
    a locala3 = new a("TWITTER", 2, 2, "com.twitter.android");
    c = locala3;
    a locala4 = new a("COMMON", 3, 3, null);
    d = locala4;
    e = new a[] { locala1, locala2, locala3, locala4 };
  }
  
  private nsa$a(int paramInt, String paramString)
  {
    this.g = paramInt;
    this.h = paramString;
  }
  
  public final String a()
  {
    return this.h;
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nsa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */