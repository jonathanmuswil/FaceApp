package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class y
{
  private boolean a;
  private String b;
  private boolean c;
  private boolean d;
  private int e;
  private EnumSet<O> f;
  private Map<String, Map<String, a>> g;
  private boolean h;
  private t i;
  private String j;
  private String k;
  private boolean l;
  private boolean m;
  private String n;
  private JSONArray o;
  private boolean p;
  private boolean q;
  
  public y(boolean paramBoolean1, String paramString1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, EnumSet<O> paramEnumSet, Map<String, Map<String, a>> paramMap, boolean paramBoolean4, t paramt, String paramString2, String paramString3, boolean paramBoolean5, boolean paramBoolean6, JSONArray paramJSONArray, String paramString4, boolean paramBoolean7, boolean paramBoolean8)
  {
    this.a = paramBoolean1;
    this.b = paramString1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
    this.g = paramMap;
    this.i = paramt;
    this.e = paramInt;
    this.h = paramBoolean4;
    this.f = paramEnumSet;
    this.j = paramString2;
    this.k = paramString3;
    this.l = paramBoolean5;
    this.m = paramBoolean6;
    this.o = paramJSONArray;
    this.n = paramString4;
    this.p = paramBoolean7;
    this.q = paramBoolean8;
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public boolean b()
  {
    return this.m;
  }
  
  public boolean c()
  {
    return this.q;
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public t e()
  {
    return this.i;
  }
  
  public JSONArray f()
  {
    return this.o;
  }
  
  public boolean g()
  {
    return this.l;
  }
  
  public String h()
  {
    return this.n;
  }
  
  public int i()
  {
    return this.e;
  }
  
  public EnumSet<O> j()
  {
    return this.f;
  }
  
  public boolean k()
  {
    return this.a;
  }
  
  public static class a
  {
    private String a;
    private String b;
    private Uri c;
    private int[] d;
    
    private a(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
    {
      this.a = paramString1;
      this.b = paramString2;
      this.c = paramUri;
      this.d = paramArrayOfInt;
    }
    
    public static a a(JSONObject paramJSONObject)
    {
      String str1 = paramJSONObject.optString("name");
      boolean bool = S.b(str1);
      Uri localUri = null;
      if (bool) {
        return null;
      }
      Object localObject = str1.split("\\|");
      if (localObject.length != 2) {
        return null;
      }
      str1 = localObject[0];
      localObject = localObject[1];
      if ((!S.b(str1)) && (!S.b((String)localObject)))
      {
        String str2 = paramJSONObject.optString("url");
        if (!S.b(str2)) {
          localUri = Uri.parse(str2);
        }
        return new a(str1, (String)localObject, localUri, a(paramJSONObject.optJSONArray("versions")));
      }
      return null;
    }
    
    private static int[] a(JSONArray paramJSONArray)
    {
      if (paramJSONArray != null)
      {
        int i = paramJSONArray.length();
        int[] arrayOfInt1 = new int[i];
        for (int j = 0;; j++)
        {
          Object localObject = arrayOfInt1;
          if (j >= i) {
            break;
          }
          int k = -1;
          int m = paramJSONArray.optInt(j, -1);
          if (m == -1)
          {
            localObject = paramJSONArray.optString(j);
            if (!S.b((String)localObject)) {
              try
              {
                m = Integer.parseInt((String)localObject);
                k = m;
              }
              catch (NumberFormatException localNumberFormatException)
              {
                S.a("FacebookSDK", localNumberFormatException);
              }
            }
          }
          k = m;
          arrayOfInt1[j] = k;
        }
      }
      int[] arrayOfInt2 = null;
      return arrayOfInt2;
    }
    
    public String a()
    {
      return this.a;
    }
    
    public String b()
    {
      return this.b;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */