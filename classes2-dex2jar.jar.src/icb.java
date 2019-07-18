import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public final class icb
{
  private static final icb.a[] a = new icb.a[0];
  private static final List<icb.a> b = new ArrayList();
  static volatile icb.a[] c = a;
  private static final icb.a d = new hcb();
  
  public static icb.a a(String paramString)
  {
    icb.a[] arrayOfa = c;
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++) {
      arrayOfa[j].a.set(paramString);
    }
    return d;
  }
  
  public static void a(icb.a parama)
  {
    if (parama != null)
    {
      if (parama != d) {
        synchronized (b)
        {
          b.add(parama);
          c = (icb.a[])b.toArray(new icb.a[b.size()]);
          return;
        }
      }
      throw new IllegalArgumentException("Cannot plant Timber into itself.");
    }
    throw new NullPointerException("tree == null");
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    d.e(paramString, paramVarArgs);
  }
  
  public static void a(Throwable paramThrowable)
  {
    d.a(paramThrowable);
  }
  
  public static abstract class a
  {
    final ThreadLocal<String> a = new ThreadLocal();
    
    private void a(int paramInt, Throwable paramThrowable, String paramString, Object... paramVarArgs)
    {
      String str1 = a();
      if (!a(str1, paramInt)) {
        return;
      }
      String str2 = paramString;
      if (paramString != null)
      {
        str2 = paramString;
        if (paramString.length() == 0) {
          str2 = null;
        }
      }
      if (str2 == null)
      {
        if (paramThrowable == null) {
          return;
        }
        paramVarArgs = b(paramThrowable);
      }
      else
      {
        paramString = str2;
        if (paramVarArgs != null)
        {
          paramString = str2;
          if (paramVarArgs.length > 0) {
            paramString = c(str2, paramVarArgs);
          }
        }
        paramVarArgs = paramString;
        if (paramThrowable != null)
        {
          paramVarArgs = new StringBuilder();
          paramVarArgs.append(paramString);
          paramVarArgs.append("\n");
          paramVarArgs.append(b(paramThrowable));
          paramVarArgs = paramVarArgs.toString();
        }
      }
      a(paramInt, str1, paramVarArgs, paramThrowable);
    }
    
    private String b(Throwable paramThrowable)
    {
      StringWriter localStringWriter = new StringWriter(256);
      PrintWriter localPrintWriter = new PrintWriter(localStringWriter, false);
      paramThrowable.printStackTrace(localPrintWriter);
      localPrintWriter.flush();
      return localStringWriter.toString();
    }
    
    String a()
    {
      String str = (String)this.a.get();
      if (str != null) {
        this.a.remove();
      }
      return str;
    }
    
    protected abstract void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable);
    
    public void a(String paramString, Object... paramVarArgs)
    {
      a(3, null, paramString, paramVarArgs);
    }
    
    public void a(Throwable paramThrowable)
    {
      a(6, paramThrowable, null, new Object[0]);
    }
    
    public void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
    {
      a(6, paramThrowable, paramString, paramVarArgs);
    }
    
    @Deprecated
    protected boolean a(int paramInt)
    {
      return true;
    }
    
    protected boolean a(String paramString, int paramInt)
    {
      return a(paramInt);
    }
    
    public void b(String paramString, Object... paramVarArgs)
    {
      a(6, null, paramString, paramVarArgs);
    }
    
    protected String c(String paramString, Object[] paramArrayOfObject)
    {
      return String.format(paramString, paramArrayOfObject);
    }
    
    public void d(String paramString, Object... paramVarArgs)
    {
      a(4, null, paramString, paramVarArgs);
    }
    
    public void e(String paramString, Object... paramVarArgs)
    {
      a(5, null, paramString, paramVarArgs);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/icb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */