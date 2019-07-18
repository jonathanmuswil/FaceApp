import java.net.Proxy.Type;

public final class m_a
{
  public static String a(pZa parampZa)
  {
    String str1 = parampZa.c();
    String str2 = parampZa.e();
    parampZa = str1;
    if (str2 != null)
    {
      parampZa = new StringBuilder();
      parampZa.append(str1);
      parampZa.append('?');
      parampZa.append(str2);
      parampZa = parampZa.toString();
    }
    return parampZa;
  }
  
  public static String a(xZa paramxZa, Proxy.Type paramType)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramxZa.e());
    localStringBuilder.append(' ');
    if (b(paramxZa, paramType)) {
      localStringBuilder.append(paramxZa.g());
    } else {
      localStringBuilder.append(a(paramxZa.g()));
    }
    localStringBuilder.append(" HTTP/1.1");
    return localStringBuilder.toString();
  }
  
  private static boolean b(xZa paramxZa, Proxy.Type paramType)
  {
    boolean bool;
    if ((!paramxZa.d()) && (paramType == Proxy.Type.HTTP)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/m_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */