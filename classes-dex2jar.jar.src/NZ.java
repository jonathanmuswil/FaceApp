final class nz
{
  static int a(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 40);
    localStringBuilder.append(paramString);
    localStringBuilder.append(" cannot be negative but was: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  static void a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      if (paramObject2 != null) {
        return;
      }
      paramObject1 = String.valueOf(paramObject1);
      paramObject2 = new StringBuilder(String.valueOf(paramObject1).length() + 26);
      ((StringBuilder)paramObject2).append("null value in entry: ");
      ((StringBuilder)paramObject2).append((String)paramObject1);
      ((StringBuilder)paramObject2).append("=null");
      throw new NullPointerException(((StringBuilder)paramObject2).toString());
    }
    paramObject1 = String.valueOf(paramObject2);
    paramObject2 = new StringBuilder(String.valueOf(paramObject1).length() + 24);
    ((StringBuilder)paramObject2).append("null key in entry: null=");
    ((StringBuilder)paramObject2).append((String)paramObject1);
    throw new NullPointerException(((StringBuilder)paramObject2).toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */