final class rx
  implements ay
{
  private static final rx a = new rx();
  
  public static rx a()
  {
    return a;
  }
  
  public final _x a(Class<?> paramClass)
  {
    if (!sx.class.isAssignableFrom(paramClass))
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {
        paramClass = "Unsupported message type: ".concat(paramClass);
      } else {
        paramClass = new String("Unsupported message type: ");
      }
      throw new IllegalArgumentException(paramClass);
    }
    try
    {
      _x local_x = (_x)sx.a(paramClass.asSubclass(sx.class)).a(sx.d.c, null, null);
      return local_x;
    }
    catch (Exception localException)
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {
        paramClass = "Unable to get message info for ".concat(paramClass);
      } else {
        paramClass = new String("Unable to get message info for ");
      }
      throw new RuntimeException(paramClass, localException);
    }
  }
  
  public final boolean b(Class<?> paramClass)
  {
    return sx.class.isAssignableFrom(paramClass);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */