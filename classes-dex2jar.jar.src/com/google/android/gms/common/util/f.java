package com.google.android.gms.common.util;

import gd;
import id;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f
{
  @Deprecated
  public static <T> List<T> a()
  {
    return Collections.emptyList();
  }
  
  @Deprecated
  public static <T> List<T> a(T paramT)
  {
    return Collections.singletonList(paramT);
  }
  
  @Deprecated
  public static <T> List<T> a(T... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      if (i != 1) {
        return Collections.unmodifiableList(Arrays.asList(paramVarArgs));
      }
      return a(paramVarArgs[0]);
    }
    return a();
  }
  
  public static <K, V> Map<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3)
  {
    Map localMap = b(3, false);
    localMap.put(paramK1, paramV1);
    localMap.put(paramK2, paramV2);
    localMap.put(paramK3, paramV3);
    return Collections.unmodifiableMap(localMap);
  }
  
  public static <K, V> Map<K, V> a(K[] paramArrayOfK, V[] paramArrayOfV)
  {
    if (paramArrayOfK.length == paramArrayOfV.length)
    {
      i = paramArrayOfK.length;
      if (i != 0)
      {
        j = 0;
        if (i != 1)
        {
          Map localMap = b(paramArrayOfK.length, false);
          while (j < paramArrayOfK.length)
          {
            localMap.put(paramArrayOfK[j], paramArrayOfV[j]);
            j++;
          }
          return Collections.unmodifiableMap(localMap);
        }
        return Collections.singletonMap(paramArrayOfK[0], paramArrayOfV[0]);
      }
      return Collections.emptyMap();
    }
    int j = paramArrayOfK.length;
    int i = paramArrayOfV.length;
    paramArrayOfK = new StringBuilder(66);
    paramArrayOfK.append("Key and values array lengths not equal: ");
    paramArrayOfK.append(j);
    paramArrayOfK.append(" != ");
    paramArrayOfK.append(i);
    throw new IllegalArgumentException(paramArrayOfK.toString());
  }
  
  private static <T> Set<T> a(int paramInt, boolean paramBoolean)
  {
    float f;
    if (paramBoolean) {
      f = 0.75F;
    } else {
      f = 1.0F;
    }
    int i;
    if (paramBoolean) {
      i = 128;
    } else {
      i = 256;
    }
    if (paramInt <= i) {
      return new id(paramInt);
    }
    return new HashSet(paramInt, f);
  }
  
  @Deprecated
  public static <T> Set<T> a(T paramT1, T paramT2, T paramT3)
  {
    Set localSet = a(3, false);
    localSet.add(paramT1);
    localSet.add(paramT2);
    localSet.add(paramT3);
    return Collections.unmodifiableSet(localSet);
  }
  
  private static <K, V> Map<K, V> b(int paramInt, boolean paramBoolean)
  {
    if (paramInt <= 256) {
      return new gd(paramInt);
    }
    return new HashMap(paramInt, 1.0F);
  }
  
  @Deprecated
  public static <T> Set<T> b(T... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              localObject1 = a(paramVarArgs.length, false);
              Collections.addAll((Collection)localObject1, paramVarArgs);
              return Collections.unmodifiableSet((Set)localObject1);
            }
            T ? = paramVarArgs[0];
            localObject1 = paramVarArgs[1];
            localObject2 = paramVarArgs[2];
            paramVarArgs = paramVarArgs[3];
            Set localSet = a(4, false);
            localSet.add(?);
            localSet.add(localObject1);
            localSet.add(localObject2);
            localSet.add(paramVarArgs);
            return Collections.unmodifiableSet(localSet);
          }
          return a(paramVarArgs[0], paramVarArgs[1], paramVarArgs[2]);
        }
        Object localObject1 = paramVarArgs[0];
        paramVarArgs = paramVarArgs[1];
        Object localObject2 = a(2, false);
        ((Set)localObject2).add(localObject1);
        ((Set)localObject2).add(paramVarArgs);
        return Collections.unmodifiableSet((Set)localObject2);
      }
      return Collections.singleton(paramVarArgs[0]);
    }
    return Collections.emptySet();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */