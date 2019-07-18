package com.facebook.internal;

import com.facebook.t.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class t
{
  private static t a;
  private final Map<Integer, Set<Integer>> b;
  private final Map<Integer, Set<Integer>> c;
  private final Map<Integer, Set<Integer>> d;
  private final String e;
  private final String f;
  private final String g;
  
  t(Map<Integer, Set<Integer>> paramMap1, Map<Integer, Set<Integer>> paramMap2, Map<Integer, Set<Integer>> paramMap3, String paramString1, String paramString2, String paramString3)
  {
    this.b = paramMap1;
    this.c = paramMap2;
    this.d = paramMap3;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
  }
  
  public static t a()
  {
    try
    {
      if (a == null) {
        a = b();
      }
      t localt = a;
      return localt;
    }
    finally {}
  }
  
  public static t a(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
      Object localObject7;
      Object localObject8;
      Object localObject9;
      Object localObject10;
      if (localJSONObject == null)
      {
        localObject7 = localObject1;
        localObject8 = localObject2;
        localObject9 = localObject4;
        localObject10 = localObject5;
      }
      else
      {
        String str = localJSONObject.optString("name");
        if (str == null)
        {
          localObject7 = localObject1;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = localObject5;
        }
        else if (str.equalsIgnoreCase("other"))
        {
          localObject9 = localJSONObject.optString("recovery_message", null);
          localObject7 = a(localJSONObject);
          localObject8 = localObject2;
          localObject10 = localObject5;
        }
        else if (str.equalsIgnoreCase("transient"))
        {
          localObject10 = localJSONObject.optString("recovery_message", null);
          localObject8 = a(localJSONObject);
          localObject7 = localObject1;
          localObject9 = localObject4;
        }
        else
        {
          localObject7 = localObject1;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = localObject5;
          if (str.equalsIgnoreCase("login_recoverable"))
          {
            localObject6 = localJSONObject.optString("recovery_message", null);
            localObject3 = a(localJSONObject);
            localObject10 = localObject5;
            localObject9 = localObject4;
            localObject8 = localObject2;
            localObject7 = localObject1;
          }
        }
      }
      i++;
      localObject1 = localObject7;
      localObject2 = localObject8;
      localObject4 = localObject9;
      localObject5 = localObject10;
    }
    return new t((Map)localObject1, (Map)localObject2, (Map)localObject3, (String)localObject4, (String)localObject5, (String)localObject6);
  }
  
  private static Map<Integer, Set<Integer>> a(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray1 = paramJSONObject.optJSONArray("items");
    if (localJSONArray1.length() == 0) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < localJSONArray1.length(); i++)
    {
      paramJSONObject = localJSONArray1.optJSONObject(i);
      if (paramJSONObject != null)
      {
        int j = paramJSONObject.optInt("code");
        if (j != 0)
        {
          JSONArray localJSONArray2 = paramJSONObject.optJSONArray("subcodes");
          if ((localJSONArray2 != null) && (localJSONArray2.length() > 0))
          {
            HashSet localHashSet = new HashSet();
            for (int k = 0;; k++)
            {
              paramJSONObject = localHashSet;
              if (k >= localJSONArray2.length()) {
                break;
              }
              int m = localJSONArray2.optInt(k);
              if (m != 0) {
                localHashSet.add(Integer.valueOf(m));
              }
            }
          }
          paramJSONObject = null;
          localHashMap.put(Integer.valueOf(j), paramJSONObject);
        }
      }
    }
    return localHashMap;
  }
  
  private static t b()
  {
    return new t(null, new q(), new r(), null, null, null);
  }
  
  public t.a a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return t.a.c;
    }
    Object localObject = this.b;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)this.b.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return t.a.b;
      }
    }
    localObject = this.d;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)this.d.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return t.a.a;
      }
    }
    localObject = this.c;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)this.c.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return t.a.c;
      }
    }
    return t.a.b;
  }
  
  public String a(t.a parama)
  {
    int i = s.a[parama.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return null;
        }
        return this.f;
      }
      return this.g;
    }
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */