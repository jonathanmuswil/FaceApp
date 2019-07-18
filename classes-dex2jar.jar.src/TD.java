public class td
{
  public static int a(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    throw new IllegalArgumentException();
  }
  
  public static <T> T a(T paramT)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException();
  }
  
  public static <T> T a(T paramT, Object paramObject)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(String.valueOf(paramObject));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */