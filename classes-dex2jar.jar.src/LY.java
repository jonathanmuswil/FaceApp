import java.lang.reflect.Constructor;

final class ly
{
  private static final jy a = ;
  private static final jy b = new ky();
  
  static jy a()
  {
    return a;
  }
  
  static jy b()
  {
    return b;
  }
  
  private static jy c()
  {
    try
    {
      jy localjy = (jy)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localjy;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */