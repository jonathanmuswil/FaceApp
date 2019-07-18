final class NRa$a<T1, T2, R>
  implements DRa<Object[], R>
{
  final wRa<? super T1, ? super T2, ? extends R> a;
  
  NRa$a(wRa<? super T1, ? super T2, ? extends R> paramwRa)
  {
    this.a = paramwRa;
  }
  
  public R a(Object[] paramArrayOfObject)
    throws Exception
  {
    if (paramArrayOfObject.length == 2) {
      return (R)this.a.apply(paramArrayOfObject[0], paramArrayOfObject[1]);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Array of size 2 expected but got ");
    localStringBuilder.append(paramArrayOfObject.length);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/NRa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */