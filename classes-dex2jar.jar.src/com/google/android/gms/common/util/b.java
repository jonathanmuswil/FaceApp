package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.r;
import java.lang.reflect.Array;
import java.util.Arrays;

public final class b
{
  public static <T> boolean a(T[] paramArrayOfT, T paramT)
  {
    int i;
    if (paramArrayOfT != null) {
      i = paramArrayOfT.length;
    } else {
      i = 0;
    }
    for (int j = 0; j < i; j++) {
      if (r.a(paramArrayOfT[j], paramT)) {
        break label40;
      }
    }
    j = -1;
    label40:
    return j >= 0;
  }
  
  public static <T> T[] a(T[] paramArrayOfT1, T... paramVarArgs)
  {
    if (paramArrayOfT1 == null) {
      return null;
    }
    if ((paramVarArgs != null) && (paramVarArgs.length != 0))
    {
      Object[] arrayOfObject = (Object[])Array.newInstance(paramVarArgs.getClass().getComponentType(), paramArrayOfT1.length);
      int i = paramVarArgs.length;
      int j = 0;
      int m;
      T ?;
      if (i == 1)
      {
        k = paramArrayOfT1.length;
        j = 0;
        for (i = 0;; i = m)
        {
          m = i;
          if (j >= k) {
            break;
          }
          ? = paramArrayOfT1[j];
          m = i;
          if (!r.a(paramVarArgs[0], ?))
          {
            arrayOfObject[i] = ?;
            m = i + 1;
          }
          j++;
        }
      }
      int k = paramArrayOfT1.length;
      for (i = 0;; i = m)
      {
        m = i;
        if (j >= k) {
          break;
        }
        ? = paramArrayOfT1[j];
        m = i;
        if (!a(paramVarArgs, ?))
        {
          arrayOfObject[i] = ?;
          m = i + 1;
        }
        j++;
      }
      if (arrayOfObject == null) {
        return null;
      }
      paramArrayOfT1 = arrayOfObject;
      if (m != arrayOfObject.length) {
        paramArrayOfT1 = Arrays.copyOf(arrayOfObject, m);
      }
      return paramArrayOfT1;
    }
    return Arrays.copyOf(paramArrayOfT1, paramArrayOfT1.length);
  }
  
  public static <T> T[] a(T[]... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {
      return (Object[])Array.newInstance(paramVarArgs.getClass(), 0);
    }
    int i = 0;
    int j = 0;
    while (i < paramVarArgs.length)
    {
      j += paramVarArgs[i].length;
      i++;
    }
    Object[] arrayOfObject = Arrays.copyOf(paramVarArgs[0], j);
    j = paramVarArgs[0].length;
    for (i = 1; i < paramVarArgs.length; i++)
    {
      T[] arrayOfT = paramVarArgs[i];
      System.arraycopy(arrayOfT, 0, arrayOfObject, j, arrayOfT.length);
      j += arrayOfT.length;
    }
    return arrayOfObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */