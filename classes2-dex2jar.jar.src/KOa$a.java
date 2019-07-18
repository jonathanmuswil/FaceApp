final class KOa$a
{
  private long a;
  private final long b;
  
  public KOa$a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public final boolean a()
  {
    long l1 = System.currentTimeMillis();
    long l2 = this.b;
    long l3 = l1 - this.a;
    if ((1L <= l3) && (l2 >= l3)) {
      return true;
    }
    this.a = l1;
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/KOa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */