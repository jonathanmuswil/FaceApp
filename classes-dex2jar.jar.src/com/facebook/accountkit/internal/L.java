package com.facebook.accountkit.internal;

import Vm.a;
import Wm;
import bn;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

final class l
{
  private static final a a = new a(200, 299, null);
  private final HttpURLConnection b;
  private final m c;
  private final String d;
  private final f e;
  private final JSONArray f;
  private final JSONObject g;
  
  public l(f paramf, HttpURLConnection paramHttpURLConnection, m paramm)
  {
    this(paramf, paramHttpURLConnection, null, null, null, paramm);
  }
  
  private l(f paramf, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject, JSONArray paramJSONArray, m paramm)
  {
    this.e = paramf;
    this.b = paramHttpURLConnection;
    this.d = paramString;
    this.g = paramJSONObject;
    this.f = paramJSONArray;
    this.c = paramm;
  }
  
  private static l a(f paramf, HttpURLConnection paramHttpURLConnection, Object paramObject)
  {
    Object localObject = paramObject;
    try
    {
      if ((paramObject instanceof JSONObject))
      {
        localObject = (JSONObject)paramObject;
        paramObject = a((JSONObject)localObject);
        if (paramObject != null) {
          return new l(paramf, paramHttpURLConnection, (m)paramObject);
        }
        paramObject = va.a((JSONObject)localObject, "body");
        if ((paramObject instanceof JSONObject)) {
          return new l(paramf, paramHttpURLConnection, paramObject.toString(), (JSONObject)paramObject, null, null);
        }
        if ((paramObject instanceof JSONArray)) {
          return new l(paramf, paramHttpURLConnection, paramObject.toString(), null, (JSONArray)paramObject, null);
        }
        localObject = JSONObject.NULL;
      }
      if (localObject == JSONObject.NULL) {
        return new l(paramf, paramHttpURLConnection, localObject.toString(), null, null, null);
      }
      paramObject = new Wm;
      ((Wm)paramObject).<init>(Vm.a.d, O.l, localObject.getClass().getSimpleName());
      throw ((Throwable)paramObject);
    }
    catch (JSONException paramObject) {}
    return new l(paramf, paramHttpURLConnection, new m(new Wm(Vm.a.d, O.k, (Throwable)paramObject)));
  }
  
  private static l a(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection, f paramf)
    throws Wm, JSONException, IOException
  {
    paramInputStream = va.a(paramInputStream);
    v.a(bn.a, "AccountKitGraphResponse", "Response:\n%s\n", new Object[] { paramInputStream });
    paramInputStream = new JSONTokener(paramInputStream).nextValue();
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("body", paramInputStream);
      int i;
      if (paramHttpURLConnection != null) {
        i = paramHttpURLConnection.getResponseCode();
      } else {
        i = 200;
      }
      localJSONObject.put("code", i);
      return a(paramf, paramHttpURLConnection, localJSONObject);
    }
    catch (IOException paramInputStream) {}catch (JSONException paramInputStream) {}
    return new l(paramf, paramHttpURLConnection, new m(new Wm(Vm.a.d, O.k, paramInputStream)));
  }
  
  /* Error */
  static l a(HttpURLConnection paramHttpURLConnection, f paramf)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: aconst_null
    //   8: astore 5
    //   10: aconst_null
    //   11: astore 6
    //   13: aload 6
    //   15: astore 7
    //   17: aload_2
    //   18: astore 8
    //   20: aload_3
    //   21: astore 9
    //   23: aload 4
    //   25: astore 10
    //   27: aload 5
    //   29: astore 11
    //   31: aload_0
    //   32: invokevirtual 152	java/net/HttpURLConnection:getResponseCode	()I
    //   35: sipush 400
    //   38: if_icmplt +30 -> 68
    //   41: aload 6
    //   43: astore 7
    //   45: aload_2
    //   46: astore 8
    //   48: aload_3
    //   49: astore 9
    //   51: aload 4
    //   53: astore 10
    //   55: aload 5
    //   57: astore 11
    //   59: aload_0
    //   60: invokevirtual 167	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   63: astore 6
    //   65: goto +27 -> 92
    //   68: aload 6
    //   70: astore 7
    //   72: aload_2
    //   73: astore 8
    //   75: aload_3
    //   76: astore 9
    //   78: aload 4
    //   80: astore 10
    //   82: aload 5
    //   84: astore 11
    //   86: aload_0
    //   87: invokevirtual 170	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   90: astore 6
    //   92: aload 6
    //   94: astore 7
    //   96: aload 6
    //   98: astore 8
    //   100: aload 6
    //   102: astore 9
    //   104: aload 6
    //   106: astore 10
    //   108: aload 6
    //   110: astore 11
    //   112: aload 6
    //   114: aload_0
    //   115: aload_1
    //   116: invokestatic 172	com/facebook/accountkit/internal/l:a	(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/accountkit/internal/f;)Lcom/facebook/accountkit/internal/l;
    //   119: astore_2
    //   120: aload 6
    //   122: invokestatic 175	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   125: aload_2
    //   126: areturn
    //   127: astore_0
    //   128: goto +184 -> 312
    //   131: astore 11
    //   133: aload 8
    //   135: astore 6
    //   137: goto +18 -> 155
    //   140: astore 11
    //   142: aload 9
    //   144: astore 6
    //   146: goto +9 -> 155
    //   149: astore 11
    //   151: aload 10
    //   153: astore 6
    //   155: aload 6
    //   157: astore 7
    //   159: getstatic 123	bn:a	Lbn;
    //   162: ldc 125
    //   164: ldc -79
    //   166: iconst_1
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload 11
    //   174: aastore
    //   175: invokestatic 132	com/facebook/accountkit/internal/v:a	(Lbn;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload 6
    //   180: astore 7
    //   182: new 103	com/facebook/accountkit/internal/m
    //   185: astore 10
    //   187: aload 6
    //   189: astore 7
    //   191: new 78	Wm
    //   194: astore 9
    //   196: aload 6
    //   198: astore 7
    //   200: aload 9
    //   202: getstatic 179	Vm$a:b	LVm$a;
    //   205: aload 11
    //   207: invokespecial 182	Wm:<init>	(LVm$a;Ljava/lang/Throwable;)V
    //   210: aload 6
    //   212: astore 7
    //   214: aload 10
    //   216: aload 9
    //   218: invokespecial 112	com/facebook/accountkit/internal/m:<init>	(LWm;)V
    //   221: aload 6
    //   223: astore 7
    //   225: new 2	com/facebook/accountkit/internal/l
    //   228: dup
    //   229: aload_1
    //   230: aload_0
    //   231: aload 10
    //   233: invokespecial 59	com/facebook/accountkit/internal/l:<init>	(Lcom/facebook/accountkit/internal/f;Ljava/net/HttpURLConnection;Lcom/facebook/accountkit/internal/m;)V
    //   236: astore_0
    //   237: aload 6
    //   239: invokestatic 175	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   242: aload_0
    //   243: areturn
    //   244: astore 10
    //   246: aload 11
    //   248: astore 7
    //   250: getstatic 123	bn:a	Lbn;
    //   253: ldc 125
    //   255: ldc -79
    //   257: iconst_1
    //   258: anewarray 4	java/lang/Object
    //   261: dup
    //   262: iconst_0
    //   263: aload 10
    //   265: aastore
    //   266: invokestatic 132	com/facebook/accountkit/internal/v:a	(Lbn;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: aload 11
    //   271: astore 7
    //   273: new 103	com/facebook/accountkit/internal/m
    //   276: astore 6
    //   278: aload 11
    //   280: astore 7
    //   282: aload 6
    //   284: aload 10
    //   286: invokespecial 112	com/facebook/accountkit/internal/m:<init>	(LWm;)V
    //   289: aload 11
    //   291: astore 7
    //   293: new 2	com/facebook/accountkit/internal/l
    //   296: dup
    //   297: aload_1
    //   298: aload_0
    //   299: aload 6
    //   301: invokespecial 59	com/facebook/accountkit/internal/l:<init>	(Lcom/facebook/accountkit/internal/f;Ljava/net/HttpURLConnection;Lcom/facebook/accountkit/internal/m;)V
    //   304: astore_0
    //   305: aload 11
    //   307: invokestatic 175	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   310: aload_0
    //   311: areturn
    //   312: aload 7
    //   314: invokestatic 175	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   317: aload_0
    //   318: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	319	0	paramHttpURLConnection	HttpURLConnection
    //   0	319	1	paramf	f
    //   1	125	2	locall	l
    //   3	73	3	localObject1	Object
    //   5	74	4	localObject2	Object
    //   8	75	5	localObject3	Object
    //   11	289	6	localObject4	Object
    //   15	298	7	localObject5	Object
    //   18	116	8	localObject6	Object
    //   21	196	9	localObject7	Object
    //   25	207	10	localObject8	Object
    //   244	41	10	localWm	Wm
    //   29	82	11	localObject9	Object
    //   131	1	11	localSecurityException	SecurityException
    //   140	1	11	localIOException	IOException
    //   149	157	11	localJSONException	JSONException
    // Exception table:
    //   from	to	target	type
    //   31	41	127	finally
    //   59	65	127	finally
    //   86	92	127	finally
    //   112	120	127	finally
    //   159	178	127	finally
    //   182	187	127	finally
    //   191	196	127	finally
    //   200	210	127	finally
    //   214	221	127	finally
    //   225	237	127	finally
    //   250	269	127	finally
    //   273	278	127	finally
    //   282	289	127	finally
    //   293	305	127	finally
    //   31	41	131	java/lang/SecurityException
    //   59	65	131	java/lang/SecurityException
    //   86	92	131	java/lang/SecurityException
    //   112	120	131	java/lang/SecurityException
    //   31	41	140	java/io/IOException
    //   59	65	140	java/io/IOException
    //   86	92	140	java/io/IOException
    //   112	120	140	java/io/IOException
    //   31	41	149	org/json/JSONException
    //   59	65	149	org/json/JSONException
    //   86	92	149	org/json/JSONException
    //   112	120	149	org/json/JSONException
    //   31	41	244	Wm
    //   59	65	244	Wm
    //   86	92	244	Wm
    //   112	120	244	Wm
  }
  
  private static m a(JSONObject paramJSONObject)
  {
    try
    {
      if (paramJSONObject.has("code"))
      {
        int i = paramJSONObject.getInt("code");
        paramJSONObject = va.a(paramJSONObject, "body");
        if ((paramJSONObject != null) && ((paramJSONObject instanceof JSONObject)))
        {
          Object localObject1 = (JSONObject)paramJSONObject;
          boolean bool = ((JSONObject)localObject1).has("error");
          int j = 1;
          int k = -1;
          Object localObject2;
          int m;
          if (bool)
          {
            JSONObject localJSONObject = (JSONObject)va.a((JSONObject)localObject1, "error");
            paramJSONObject = localJSONObject.optString("type", null);
            localObject2 = localJSONObject.optString("message", null);
            localObject1 = localJSONObject.optString("error_user_msg");
            m = localJSONObject.optInt("code", -1);
            k = localJSONObject.optInt("error_subcode", -1);
          }
          else
          {
            bool = ((JSONObject)localObject1).has("error_code");
            if ((!bool) && (!((JSONObject)localObject1).has("error_msg")) && (!((JSONObject)localObject1).has("error_reason")))
            {
              paramJSONObject = null;
              localObject2 = paramJSONObject;
              localObject1 = localObject2;
              m = -1;
              j = 0;
            }
            else
            {
              paramJSONObject = ((JSONObject)localObject1).optString("error_reason", null);
              localObject2 = ((JSONObject)localObject1).optString("error_msg", null);
              m = ((JSONObject)localObject1).optInt("error_code", -1);
              localObject1 = null;
            }
          }
          if (j != 0) {
            return new m(i, m, k, paramJSONObject, (String)localObject2, (String)localObject1, null);
          }
        }
        if (!a.a(i))
        {
          paramJSONObject = new m(i, -1, -1, null, null, null, null);
          return paramJSONObject;
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return null;
  }
  
  public m a()
  {
    return this.c;
  }
  
  public JSONObject b()
  {
    return this.g;
  }
  
  public String toString()
  {
    String str;
    try
    {
      Object localObject = Locale.US;
      int i;
      if (this.b != null) {
        i = this.b.getResponseCode();
      } else {
        i = 200;
      }
      localObject = String.format((Locale)localObject, "%d", new Object[] { Integer.valueOf(i) });
    }
    catch (IOException localIOException)
    {
      str = "unknown";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{Response:  responseCode: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", responseObject: ");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", error: ");
    localStringBuilder.append(this.c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  private static final class a
  {
    private final int a;
    private final int b;
    
    private a(int paramInt1, int paramInt2)
    {
      this.b = paramInt1;
      this.a = paramInt2;
    }
    
    public boolean a(int paramInt)
    {
      boolean bool;
      if ((this.b <= paramInt) && (paramInt <= this.a)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */