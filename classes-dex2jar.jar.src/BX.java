final class bx
  extends _w
{
  private final byte[] d;
  private final boolean e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j = Integer.MAX_VALUE;
  
  private bx(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
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
  
  public final int a(int paramInt)
    throws Bx
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
      throw new Bx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    throw new Bx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */