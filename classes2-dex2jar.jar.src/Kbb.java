import java.io.IOException;

class kbb
  extends oab
{
  kbb(lbb.a parama, Eab paramEab)
  {
    super(paramEab);
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    try
    {
      paramLong = super.b(paramjab, paramLong);
      return paramLong;
    }
    catch (IOException paramjab)
    {
      this.b.c = paramjab;
      throw paramjab;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */