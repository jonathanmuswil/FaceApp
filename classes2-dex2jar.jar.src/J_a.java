public final class j_a
{
  public static boolean a(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("POST")) && (!paramString.equals("PATCH")) && (!paramString.equals("PUT")) && (!paramString.equals("DELETE")) && (!paramString.equals("MOVE"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean b(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("GET")) && (!paramString.equals("HEAD"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c(String paramString)
  {
    return paramString.equals("PROPFIND") ^ true;
  }
  
  public static boolean d(String paramString)
  {
    return paramString.equals("PROPFIND");
  }
  
  public static boolean e(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("POST")) && (!paramString.equals("PUT")) && (!paramString.equals("PATCH")) && (!paramString.equals("PROPPATCH")) && (!paramString.equals("REPORT"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/j_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */