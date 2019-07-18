final class ks
  extends is
{
  private final byte[] d;
  private final boolean e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j = Integer.MAX_VALUE;
  
  private ks(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    this.d = paramArrayOfByte;
    this.f = (paramInt2 + paramInt1);
    this.h = paramInt1;
    this.i = this.h;
    this.e = paramBoolean;
  }
  
  public final int a()
  {
    return this.h - this.i;
  }
  
  public final int b(int paramInt)
    throws Ks
  {
    if (paramInt >= 0)
    {
      int k = paramInt + a();
      paramInt = this.j;
      if (k <= paramInt)
      {
        this.j = k;
        this.f += this.g;
        int m = this.f;
        k = m - this.i;
        int n = this.j;
        if (k > n)
        {
          this.g = (k - n);
          this.f = (m - this.g);
        }
        else
        {
          this.g = 0;
        }
        return paramInt;
      }
      throw Ks.a();
    }
    throw new Ks("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */