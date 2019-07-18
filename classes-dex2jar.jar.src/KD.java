public class kd
{
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("null");
    }
    else
    {
      String str1 = paramObject.getClass().getSimpleName();
      String str2;
      if (str1 != null)
      {
        str2 = str1;
        if (str1.length() > 0) {}
      }
      else
      {
        str1 = paramObject.getClass().getName();
        int i = str1.lastIndexOf('.');
        str2 = str1;
        if (i > 0) {
          str2 = str1.substring(i + 1);
        }
      }
      paramStringBuilder.append(str2);
      paramStringBuilder.append('{');
      paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */