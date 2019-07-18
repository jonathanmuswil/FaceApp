import java.io.PrintStream;
import java.lang.reflect.Field;

public final class jv
{
  private static final kv a;
  private static final int b;
  
  static
  {
    int i = 1;
    Integer localInteger;
    try
    {
      localInteger = a();
      if (localInteger != null) {}
      try
      {
        Object localObject;
        if (localInteger.intValue() >= 19)
        {
          localObject = new ov;
          ((ov)localObject).<init>();
        }
        else if ((Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true))
        {
          localObject = new nv();
        }
        else
        {
          localObject = new jv.a();
        }
      }
      catch (Throwable localThrowable1) {}
      localPrintStream = System.err;
    }
    catch (Throwable localThrowable2)
    {
      localInteger = null;
    }
    PrintStream localPrintStream;
    String str = jv.a.class.getName();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 133);
    localStringBuilder.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
    localStringBuilder.append(str);
    localStringBuilder.append("will be used. The error is: ");
    localPrintStream.println(localStringBuilder.toString());
    localThrowable2.printStackTrace(System.err);
    jv.a locala = new jv.a();
    a = locala;
    if (localInteger != null) {
      i = localInteger.intValue();
    }
    b = i;
  }
  
  private static Integer a()
  {
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      return localInteger;
    }
    catch (Exception localException)
    {
      System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
      localException.printStackTrace(System.err);
    }
    return null;
  }
  
  public static void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    a.a(paramThrowable1, paramThrowable2);
  }
  
  static final class a
    extends kv
  {
    public final void a(Throwable paramThrowable1, Throwable paramThrowable2) {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */