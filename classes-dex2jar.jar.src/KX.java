import java.lang.reflect.Constructor;

final class kx
{
  private static final ix<?> a = new jx();
  private static final ix<?> b = c();
  
  static ix<?> a()
  {
    return a;
  }
  
  static ix<?> b()
  {
    ix localix = b;
    if (localix != null) {
      return localix;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  private static ix<?> c()
  {
    try
    {
      ix localix = (ix)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localix;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */