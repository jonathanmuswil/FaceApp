import java.util.Properties;

final class _Ua$a
{
  boolean a;
  int b;
  
  void a(Properties paramProperties)
  {
    if (paramProperties.containsKey("rx2.purge-enabled")) {
      this.a = Boolean.parseBoolean(paramProperties.getProperty("rx2.purge-enabled"));
    } else {
      this.a = true;
    }
    if ((this.a) && (paramProperties.containsKey("rx2.purge-period-seconds"))) {
      try
      {
        this.b = Integer.parseInt(paramProperties.getProperty("rx2.purge-period-seconds"));
      }
      catch (NumberFormatException paramProperties)
      {
        this.b = 1;
      }
    } else {
      this.b = 1;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Ua$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */