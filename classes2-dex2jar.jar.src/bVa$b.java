final class bVa$b
  implements Comparable<b>
{
  final Runnable a;
  final long b;
  final int c;
  volatile boolean d;
  
  bVa$b(Runnable paramRunnable, Long paramLong, int paramInt)
  {
    this.a = paramRunnable;
    this.b = paramLong.longValue();
    this.c = paramInt;
  }
  
  public int a(b paramb)
  {
    int i = ORa.a(this.b, paramb.b);
    if (i == 0) {
      return ORa.a(this.c, paramb.c);
    }
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bVa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */