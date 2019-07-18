import java.util.List;

public final class i_a
{
  private static final mab a = mab.b("\"\\");
  private static final mab b = mab.b("\t ,=");
  
  public static int a(String paramString, int paramInt)
  {
    try
    {
      long l = Long.parseLong(paramString);
      if (l > 2147483647L) {
        return Integer.MAX_VALUE;
      }
      if (l < 0L) {
        return 0;
      }
      paramInt = (int)l;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return paramInt;
  }
  
  public static int a(String paramString1, int paramInt, String paramString2)
  {
    while ((paramInt < paramString1.length()) && (paramString2.indexOf(paramString1.charAt(paramInt)) == -1)) {
      paramInt++;
    }
    return paramInt;
  }
  
  public static long a(BZa paramBZa)
  {
    return a(paramBZa.e());
  }
  
  private static long a(String paramString)
  {
    long l1 = -1L;
    if (paramString == null) {
      return -1L;
    }
    try
    {
      l2 = Long.parseLong(paramString);
      return l2;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        long l2 = l1;
      }
    }
  }
  
  public static long a(oZa paramoZa)
  {
    return a(paramoZa.b("Content-Length"));
  }
  
  public static void a(gZa paramgZa, pZa parampZa, oZa paramoZa)
  {
    if (paramgZa == gZa.a) {
      return;
    }
    paramoZa = eZa.a(parampZa, paramoZa);
    if (paramoZa.isEmpty()) {
      return;
    }
    paramgZa.a(parampZa, paramoZa);
  }
  
  public static int b(String paramString, int paramInt)
  {
    while (paramInt < paramString.length())
    {
      int i = paramString.charAt(paramInt);
      if ((i != 32) && (i != 9)) {
        break;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  public static boolean b(BZa paramBZa)
  {
    if (paramBZa.k().e().equals("HEAD")) {
      return false;
    }
    int i = paramBZa.c();
    if (((i < 100) || (i >= 200)) && (i != 204) && (i != 304)) {
      return true;
    }
    return (a(paramBZa) != -1L) || ("chunked".equalsIgnoreCase(paramBZa.b("Transfer-Encoding")));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/i_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */