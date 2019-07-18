public final class dx
{
  public static int a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return paramInt1;
    }
    Object localObject;
    if (paramInt1 >= 0)
    {
      if (paramInt2 < 0)
      {
        localObject = new StringBuilder(26);
        ((StringBuilder)localObject).append("negative size: ");
        ((StringBuilder)localObject).append(paramInt2);
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      localObject = Ex.a("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    else
    {
      localObject = Ex.a("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
    }
    throw new IndexOutOfBoundsException((String)localObject);
  }
  
  public static <T> T a(T paramT)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException();
  }
  
  private static String a(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return Ex.a("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return Ex.a("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    paramString = new StringBuilder(26);
    paramString.append("negative size: ");
    paramString.append(paramInt2);
    throw new IllegalArgumentException(paramString.toString());
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    String str;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        str = Ex.a("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = a(paramInt2, paramInt3, "end index");
      }
    }
    else {
      str = a(paramInt1, paramInt3, "start index");
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(a(paramInt1, paramInt2, "index"));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */