import com.bumptech.glide.load.l;

final class Zi$a<T>
{
  private final Class<T> a;
  final l<T> b;
  
  Zi$a(Class<T> paramClass, l<T> paraml)
  {
    this.a = paramClass;
    this.b = paraml;
  }
  
  boolean a(Class<?> paramClass)
  {
    return this.a.isAssignableFrom(paramClass);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zi$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */