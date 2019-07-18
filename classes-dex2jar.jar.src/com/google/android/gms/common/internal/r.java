package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class r
{
  public static int a(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static a a(Object paramObject)
  {
    return new a(paramObject, null);
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static final class a
  {
    private final List<String> a;
    private final Object b;
    
    private a(Object paramObject)
    {
      t.a(paramObject);
      this.b = paramObject;
      this.a = new ArrayList();
    }
    
    public final a a(String paramString, Object paramObject)
    {
      List localList = this.a;
      t.a(paramString);
      paramString = (String)paramString;
      String str = String.valueOf(paramObject);
      paramObject = new StringBuilder(String.valueOf(paramString).length() + 1 + String.valueOf(str).length());
      ((StringBuilder)paramObject).append(paramString);
      ((StringBuilder)paramObject).append("=");
      ((StringBuilder)paramObject).append(str);
      localList.add(((StringBuilder)paramObject).toString());
      return this;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100);
      localStringBuilder.append(this.b.getClass().getSimpleName());
      localStringBuilder.append('{');
      int i = this.a.size();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append((String)this.a.get(j));
        if (j < i - 1) {
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */