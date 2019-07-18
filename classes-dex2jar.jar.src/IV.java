public final class iv
{
  public static int a(long paramLong)
  {
    if (paramLong > 2147483647L) {
      return Integer.MAX_VALUE;
    }
    if (paramLong < -2147483648L) {
      return Integer.MIN_VALUE;
    }
    return (int)paramLong;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/iv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */