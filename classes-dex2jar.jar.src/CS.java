final class cs
  extends gs
{
  private final int e;
  private final int f;
  
  cs(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    _r.b(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public final byte p(int paramInt)
  {
    int i = size();
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0)
      {
        localStringBuilder = new StringBuilder(22);
        localStringBuilder.append("Index < 0: ");
        localStringBuilder.append(paramInt);
        throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder(40);
      localStringBuilder.append("Index > length: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(", ");
      localStringBuilder.append(i);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
    return this.d[(this.e + paramInt)];
  }
  
  protected final int p()
  {
    return this.e;
  }
  
  public final int size()
  {
    return this.f;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */