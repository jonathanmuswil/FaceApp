final class NRa$c<T1, T2, T3, T4, R>
  implements DRa<Object[], R>
{
  final CRa<T1, T2, T3, T4, R> a;
  
  NRa$c(CRa<T1, T2, T3, T4, R> paramCRa)
  {
    this.a = paramCRa;
  }
  
  public R a(Object[] paramArrayOfObject)
    throws Exception
  {
    if (paramArrayOfObject.length == 4) {
      return (R)this.a.a(paramArrayOfObject[0], paramArrayOfObject[1], paramArrayOfObject[2], paramArrayOfObject[3]);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Array of size 4 expected but got ");
    localStringBuilder.append(paramArrayOfObject.length);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/NRa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */