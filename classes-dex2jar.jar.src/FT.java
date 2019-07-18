import java.lang.reflect.Constructor;

final class ft
{
  private static final dt a = ;
  private static final dt b = new et();
  
  static dt a()
  {
    return a;
  }
  
  static dt b()
  {
    return b;
  }
  
  private static dt c()
  {
    try
    {
      dt localdt = (dt)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localdt;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */