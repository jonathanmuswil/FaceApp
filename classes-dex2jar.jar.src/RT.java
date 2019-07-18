import java.lang.reflect.Constructor;

final class rt
{
  private static final pt a = ;
  private static final pt b = new qt();
  
  static pt a()
  {
    return a;
  }
  
  static pt b()
  {
    return b;
  }
  
  private static pt c()
  {
    try
    {
      pt localpt = (pt)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localpt;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */