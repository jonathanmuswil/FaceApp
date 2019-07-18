final class NRa$b<T1, T2, T3, R>
  implements DRa<Object[], R>
{
  final BRa<T1, T2, T3, R> a;
  
  NRa$b(BRa<T1, T2, T3, R> paramBRa)
  {
    this.a = paramBRa;
  }
  
  public R a(Object[] paramArrayOfObject)
    throws Exception
  {
    if (paramArrayOfObject.length == 3) {
      return (R)this.a.a(paramArrayOfObject[0], paramArrayOfObject[1], paramArrayOfObject[2]);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Array of size 3 expected but got ");
    localStringBuilder.append(paramArrayOfObject.length);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/NRa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */