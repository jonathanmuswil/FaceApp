import java.lang.reflect.Constructor;

final class us
{
  private static final rs<?> a = new ss();
  private static final rs<?> b = c();
  
  static rs<?> a()
  {
    return a;
  }
  
  static rs<?> b()
  {
    rs localrs = b;
    if (localrs != null) {
      return localrs;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  private static rs<?> c()
  {
    try
    {
      rs localrs = (rs)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localrs;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/us.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */