package com.facebook.accountkit.internal;

import Rm;
import Sm;
import Vm.a;
import Wm;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Bundle;
import bn;
import cn;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class u
{
  private static final String a = "com.facebook.accountkit.internal.u";
  private static final Object b = new Object();
  private static String c;
  private static boolean d;
  private static final Map<g, f> e = new ConcurrentHashMap();
  private static final Executor f = new ThreadPoolExecutor(1, 4, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), new o(), new p());
  private final Context g;
  private final g h;
  
  u(Context paramContext, String paramString)
  {
    Object localObject = Sm.f();
    if ((localObject != null) && ((paramString == null) || (paramString.equals(((Rm)localObject).m()))))
    {
      this.h = new g((Rm)localObject);
    }
    else
    {
      localObject = paramString;
      if (paramString == null) {
        localObject = va.c();
      }
      this.h = new g(null, (String)localObject);
    }
    this.g = paramContext;
    d();
  }
  
  private j a(g paramg, f paramf, d paramd)
  {
    f localf = new f(null, String.format("%s/events", new Object[] { paramg.b }), null, false, L.b);
    int i = paramf.a(localf);
    if (i == 0) {
      return null;
    }
    paramd.a += i;
    return new j(localf, new t(this, paramg, localf, paramf, paramd));
  }
  
  private f a(g paramg)
  {
    f localf1 = (f)e.get(paramg);
    f localf2 = localf1;
    if (localf1 == null) {
      synchronized (b)
      {
        localf1 = (f)e.get(paramg);
        localf2 = localf1;
        if (localf1 == null)
        {
          localf2 = new com/facebook/accountkit/internal/u$f;
          localf2.<init>(this.g, a(this.g));
          e.put(paramg, localf2);
        }
      }
    }
    return localf2;
  }
  
  private static String a(Context paramContext)
  {
    if (c == null) {
      synchronized (b)
      {
        if (c == null)
        {
          paramContext = paramContext.getSharedPreferences("com.facebook.accountkit.sdk.appEventPreferences", 0);
          c = paramContext.getString("anonymousAppDeviceGUID", null);
          if (c == null)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("XZ");
            localStringBuilder.append(UUID.randomUUID().toString());
            c = localStringBuilder.toString();
            paramContext.edit().putString("anonymousAppDeviceGUID", c).apply();
          }
        }
      }
    }
    return c;
  }
  
  private void a(b paramb)
  {
    f.execute(new s(this, paramb));
  }
  
  private void a(b paramb, Set<g> paramSet)
  {
    d locald = new d(null);
    ArrayList localArrayList = new ArrayList();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      Object localObject = (g)paramSet.next();
      f localf = a((g)localObject);
      if (localf != null)
      {
        localObject = a((g)localObject, localf, locald);
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      v.a(bn.d, a, "Flushing %d events due to %s.", new Object[] { Integer.valueOf(locald.a), paramb.toString() });
      paramb = localArrayList.iterator();
      while (paramb.hasNext()) {
        ((j)paramb.next()).executeOnExecutor(f, new Void[0]);
      }
    }
  }
  
  private void a(g paramg, f paramf, l paraml, f paramf1, d paramd)
  {
    m localm;
    if (paraml == null) {
      localm = null;
    } else {
      localm = paraml.a();
    }
    Object localObject = c.a;
    boolean bool = true;
    String str2;
    if (localm != null)
    {
      if (localm.a() == -1)
      {
        paraml = c.c;
        str2 = "Failed: No Connectivity";
      }
      else
      {
        str2 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] { paraml.toString(), localm.toString() });
        paraml = c.b;
      }
    }
    else
    {
      str2 = "Success";
      paraml = (l)localObject;
    }
    if (Sm.j().a(bn.d))
    {
      String str3 = (String)paramf.g();
      String str1;
      try
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>(str3);
        localObject = ((JSONArray)localObject).toString(2);
      }
      catch (JSONException localJSONException)
      {
        str1 = "<Can't encode events for debug logging>";
      }
      v.a(bn.d, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] { paramf.f().toString(), str2, str1 });
    }
    if (localm == null) {
      bool = false;
    }
    paramf1.a(bool);
    if (paraml == c.c) {
      e.a(this.g, paramg, paramf1);
    }
    if ((paraml != c.a) && (paramd.b != c.c)) {
      paramd.b = paraml;
    }
  }
  
  private void b()
  {
    synchronized (b)
    {
      if (c() > 30) {
        a(b.e);
      }
      return;
    }
  }
  
  private void b(b arg1)
  {
    synchronized (b)
    {
      if (d) {
        return;
      }
      d = true;
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>(e.keySet());
      try
      {
        a(???, localHashSet);
      }
      catch (Exception ???)
      {
        va.a(a, "Caught unexpected exception while flushing: ", ???);
      }
      synchronized (b)
      {
        d = false;
        return;
      }
    }
  }
  
  private static int c()
  {
    Object localObject1 = b;
    int i = 0;
    try
    {
      Iterator localIterator = e.values().iterator();
      while (localIterator.hasNext()) {
        i += ((f)localIterator.next()).a();
      }
      return i;
    }
    finally {}
  }
  
  private void d()
  {
    r localr = new r(this);
    va.b().scheduleAtFixedRate(localr, 0L, 15L, TimeUnit.SECONDS);
  }
  
  void a(String paramString, Double paramDouble, Bundle paramBundle)
  {
    paramString = new a(paramString, paramDouble, paramBundle, true);
    f.execute(new q(this, paramString));
  }
  
  private static class a
    implements Serializable
  {
    private static final HashSet<String> a = new HashSet();
    final boolean b;
    final JSONObject c;
    
    a(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean)
    {
      this.b = paramBoolean;
      Object localObject1 = null;
      try
      {
        a(paramString);
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        ((JSONObject)localObject2).put("_eventName", paramString);
        ((JSONObject)localObject2).put("_logTime", System.currentTimeMillis() / 1000L);
        if (paramDouble != null) {
          ((JSONObject)localObject2).put("_valueToSum", paramDouble.doubleValue());
        }
        if (paramBoolean) {
          ((JSONObject)localObject2).put("_implicitlyLogged", "1");
        }
        if (paramBundle != null)
        {
          Object localObject3 = paramBundle.keySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            paramDouble = (String)((Iterator)localObject3).next();
            a(paramDouble);
            paramString = paramBundle.get(paramDouble);
            if ((!(paramString instanceof String)) && (!(paramString instanceof Number)))
            {
              localObject3 = new Wm;
              localObject2 = Vm.a.f;
              paramBundle = new com/facebook/accountkit/internal/O;
              paramBundle.<init>(O.B, new Object[] { paramString, paramDouble });
              ((Wm)localObject3).<init>((Vm.a)localObject2, paramBundle);
              throw ((Throwable)localObject3);
            }
            ((JSONObject)localObject2).put(paramDouble, paramString.toString());
          }
        }
        if (!paramBoolean) {
          v.a(bn.d, "AppEvents", "Created app event '%s'", new Object[] { ((JSONObject)localObject2).toString() });
        }
        paramString = (String)localObject2;
      }
      catch (Wm paramString)
      {
        v.a(bn.d, "AppEvents", "Invalid app event name or parameter:", new Object[] { paramString.toString() });
        paramString = (String)localObject1;
      }
      catch (JSONException paramString)
      {
        v.a(bn.d, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] { paramString.toString() });
        paramString = (String)localObject1;
      }
      this.c = paramString;
    }
    
    private a(String paramString, boolean paramBoolean)
      throws JSONException
    {
      this.c = new JSONObject(paramString);
      this.b = paramBoolean;
    }
    
    private void a(String paramString)
      throws Wm
    {
      if ((paramString != null) && (paramString.length() != 0) && (paramString.length() <= 40)) {
        synchronized (a)
        {
          boolean bool = a.contains(paramString);
          if (!bool)
          {
            if (paramString.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
              synchronized (a)
              {
                a.add(paramString);
              }
            }
            throw new Wm(Vm.a.d, new O(O.B, new Object[] { paramString }));
          }
          return;
        }
      }
      ??? = paramString;
      if (paramString == null) {
        ??? = "<None Provided>";
      }
      throw new Wm(Vm.a.d, new O(O.B, new Object[] { ???, Integer.valueOf(40) }));
    }
    
    private Object writeReplace()
    {
      return new a(this.c.toString(), this.b, null);
    }
    
    public String toString()
    {
      return String.format("\"%s\", implicit: %b, json: %s", new Object[] { this.c.optString("_eventName"), Boolean.valueOf(this.b), this.c.toString() });
    }
    
    private static class a
      implements Serializable
    {
      private final boolean a;
      private final String b;
      
      private a(String paramString, boolean paramBoolean)
      {
        this.b = paramString;
        this.a = paramBoolean;
      }
      
      private Object readResolve()
        throws JSONException
      {
        return new u.a(this.b, this.a, null);
      }
    }
  }
  
  private static enum b
  {
    private b() {}
  }
  
  private static enum c
  {
    private c() {}
  }
  
  private static class d
  {
    int a = 0;
    public u.c b = u.c.a;
  }
  
  private static class e
  {
    private static final Object a = new Object();
    private final Context b;
    private HashMap<u.g, List<u.a>> c = new HashMap();
    
    private e(Context paramContext)
    {
      this.b = paramContext;
    }
    
    static e a(Context paramContext)
    {
      synchronized (a)
      {
        e locale = new com/facebook/accountkit/internal/u$e;
        locale.<init>(paramContext);
        locale.a();
        return locale;
      }
    }
    
    /* Error */
    private void a()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_1
      //   2: aconst_null
      //   3: astore_2
      //   4: aconst_null
      //   5: astore_3
      //   6: aload_3
      //   7: astore 4
      //   9: aload_1
      //   10: astore 5
      //   12: aload_2
      //   13: astore 6
      //   15: new 41	java/io/BufferedInputStream
      //   18: astore 7
      //   20: aload_3
      //   21: astore 4
      //   23: aload_1
      //   24: astore 5
      //   26: aload_2
      //   27: astore 6
      //   29: aload 7
      //   31: aload_0
      //   32: getfield 30	com/facebook/accountkit/internal/u$e:b	Landroid/content/Context;
      //   35: ldc 43
      //   37: invokevirtual 49	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
      //   40: invokespecial 52	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
      //   43: new 54	java/io/ObjectInputStream
      //   46: astore_3
      //   47: aload_3
      //   48: aload 7
      //   50: invokespecial 55	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
      //   53: aload_3
      //   54: astore 4
      //   56: aload_3
      //   57: astore 5
      //   59: aload_3
      //   60: astore 6
      //   62: aload_3
      //   63: invokevirtual 59	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
      //   66: checkcast 25	java/util/HashMap
      //   69: astore 7
      //   71: aload_3
      //   72: astore 4
      //   74: aload_3
      //   75: astore 5
      //   77: aload_3
      //   78: astore 6
      //   80: aload_0
      //   81: getfield 30	com/facebook/accountkit/internal/u$e:b	Landroid/content/Context;
      //   84: ldc 43
      //   86: invokevirtual 63	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
      //   89: invokevirtual 69	java/io/File:delete	()Z
      //   92: ifne +21 -> 113
      //   95: aload_3
      //   96: astore 4
      //   98: aload_3
      //   99: astore 5
      //   101: aload_3
      //   102: astore 6
      //   104: invokestatic 72	com/facebook/accountkit/internal/u:a	()Ljava/lang/String;
      //   107: ldc 74
      //   109: invokestatic 80	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
      //   112: pop
      //   113: aload_3
      //   114: astore 4
      //   116: aload_3
      //   117: astore 5
      //   119: aload_3
      //   120: astore 6
      //   122: aload_0
      //   123: aload 7
      //   125: putfield 28	com/facebook/accountkit/internal/u$e:c	Ljava/util/HashMap;
      //   128: goto +113 -> 241
      //   131: astore_3
      //   132: aload 7
      //   134: astore 4
      //   136: goto +98 -> 234
      //   139: astore 4
      //   141: aload 7
      //   143: astore_3
      //   144: aload 4
      //   146: astore 7
      //   148: goto +20 -> 168
      //   151: astore 4
      //   153: aload 7
      //   155: astore_3
      //   156: goto +85 -> 241
      //   159: astore_3
      //   160: goto +74 -> 234
      //   163: astore 7
      //   165: aload 5
      //   167: astore_3
      //   168: aload_3
      //   169: astore 4
      //   171: invokestatic 72	com/facebook/accountkit/internal/u:a	()Ljava/lang/String;
      //   174: astore 6
      //   176: aload_3
      //   177: astore 4
      //   179: new 82	java/lang/StringBuilder
      //   182: astore 5
      //   184: aload_3
      //   185: astore 4
      //   187: aload 5
      //   189: invokespecial 83	java/lang/StringBuilder:<init>	()V
      //   192: aload_3
      //   193: astore 4
      //   195: aload 5
      //   197: ldc 85
      //   199: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   202: pop
      //   203: aload_3
      //   204: astore 4
      //   206: aload 5
      //   208: aload 7
      //   210: invokevirtual 92	java/lang/Exception:toString	()Ljava/lang/String;
      //   213: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   216: pop
      //   217: aload_3
      //   218: astore 4
      //   220: aload 6
      //   222: aload 5
      //   224: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   227: invokestatic 80	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
      //   230: pop
      //   231: goto +10 -> 241
      //   234: aload 4
      //   236: invokestatic 98	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
      //   239: aload_3
      //   240: athrow
      //   241: aload_3
      //   242: invokestatic 98	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
      //   245: return
      //   246: astore 4
      //   248: aload 6
      //   250: astore_3
      //   251: goto -10 -> 241
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	254	0	this	e
      //   1	23	1	localObject1	Object
      //   3	24	2	localObject2	Object
      //   5	115	3	localObjectInputStream	java.io.ObjectInputStream
      //   131	1	3	localObject3	Object
      //   143	13	3	localObject4	Object
      //   159	1	3	localObject5	Object
      //   167	84	3	localObject6	Object
      //   7	128	4	localObject7	Object
      //   139	6	4	localException1	Exception
      //   151	1	4	localFileNotFoundException1	java.io.FileNotFoundException
      //   169	66	4	localObject8	Object
      //   246	1	4	localFileNotFoundException2	java.io.FileNotFoundException
      //   10	213	5	localObject9	Object
      //   13	236	6	localObject10	Object
      //   18	136	7	localObject11	Object
      //   163	46	7	localException2	Exception
      // Exception table:
      //   from	to	target	type
      //   43	53	131	finally
      //   43	53	139	java/lang/Exception
      //   43	53	151	java/io/FileNotFoundException
      //   15	20	159	finally
      //   29	43	159	finally
      //   62	71	159	finally
      //   80	95	159	finally
      //   104	113	159	finally
      //   122	128	159	finally
      //   171	176	159	finally
      //   179	184	159	finally
      //   187	192	159	finally
      //   195	203	159	finally
      //   206	217	159	finally
      //   220	231	159	finally
      //   15	20	163	java/lang/Exception
      //   29	43	163	java/lang/Exception
      //   62	71	163	java/lang/Exception
      //   80	95	163	java/lang/Exception
      //   104	113	163	java/lang/Exception
      //   122	128	163	java/lang/Exception
      //   15	20	246	java/io/FileNotFoundException
      //   29	43	246	java/io/FileNotFoundException
      //   62	71	246	java/io/FileNotFoundException
      //   80	95	246	java/io/FileNotFoundException
      //   104	113	246	java/io/FileNotFoundException
      //   122	128	246	java/io/FileNotFoundException
    }
    
    static void a(Context paramContext, u.g paramg, u.f arg2)
    {
      List localList = ???.b();
      if (localList.size() == 0) {
        return;
      }
      synchronized (a)
      {
        paramContext = a(paramContext);
        paramContext.a(paramg, localList);
        paramContext.b();
        return;
      }
    }
    
    /* Error */
    private void b()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_1
      //   2: aconst_null
      //   3: astore_2
      //   4: aload_0
      //   5: getfield 30	com/facebook/accountkit/internal/u$e:b	Landroid/content/Context;
      //   8: ldc 43
      //   10: iconst_0
      //   11: invokevirtual 121	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
      //   14: astore_3
      //   15: aload_3
      //   16: astore_2
      //   17: aload_3
      //   18: astore_1
      //   19: new 123	java/io/BufferedOutputStream
      //   22: astore 4
      //   24: aload_3
      //   25: astore_2
      //   26: aload_3
      //   27: astore_1
      //   28: aload 4
      //   30: aload_3
      //   31: invokespecial 126	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   34: new 128	java/io/ObjectOutputStream
      //   37: astore_3
      //   38: aload_3
      //   39: aload 4
      //   41: invokespecial 129	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   44: aload_3
      //   45: astore_2
      //   46: aload_3
      //   47: astore_1
      //   48: aload_3
      //   49: aload_0
      //   50: getfield 28	com/facebook/accountkit/internal/u$e:c	Ljava/util/HashMap;
      //   53: invokevirtual 133	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
      //   56: aload_3
      //   57: astore_1
      //   58: aload_1
      //   59: invokestatic 98	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
      //   62: goto +81 -> 143
      //   65: astore_1
      //   66: aload 4
      //   68: astore_2
      //   69: goto +75 -> 144
      //   72: astore_3
      //   73: aload 4
      //   75: astore_1
      //   76: goto +8 -> 84
      //   79: astore_1
      //   80: goto +64 -> 144
      //   83: astore_3
      //   84: aload_1
      //   85: astore_2
      //   86: invokestatic 72	com/facebook/accountkit/internal/u:a	()Ljava/lang/String;
      //   89: astore 4
      //   91: aload_1
      //   92: astore_2
      //   93: new 82	java/lang/StringBuilder
      //   96: astore 5
      //   98: aload_1
      //   99: astore_2
      //   100: aload 5
      //   102: invokespecial 83	java/lang/StringBuilder:<init>	()V
      //   105: aload_1
      //   106: astore_2
      //   107: aload 5
      //   109: ldc 85
      //   111: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   114: pop
      //   115: aload_1
      //   116: astore_2
      //   117: aload 5
      //   119: aload_3
      //   120: invokevirtual 92	java/lang/Exception:toString	()Ljava/lang/String;
      //   123: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   126: pop
      //   127: aload_1
      //   128: astore_2
      //   129: aload 4
      //   131: aload 5
      //   133: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   136: invokestatic 80	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
      //   139: pop
      //   140: goto -82 -> 58
      //   143: return
      //   144: aload_2
      //   145: invokestatic 98	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
      //   148: aload_1
      //   149: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	150	0	this	e
      //   1	58	1	localObject1	Object
      //   65	1	1	localObject2	Object
      //   75	1	1	localObject3	Object
      //   79	70	1	localObject4	Object
      //   3	142	2	localObject5	Object
      //   14	43	3	localObject6	Object
      //   72	1	3	localException1	Exception
      //   83	37	3	localException2	Exception
      //   22	108	4	localObject7	Object
      //   96	36	5	localStringBuilder	StringBuilder
      // Exception table:
      //   from	to	target	type
      //   34	44	65	finally
      //   34	44	72	java/lang/Exception
      //   4	15	79	finally
      //   19	24	79	finally
      //   28	34	79	finally
      //   48	56	79	finally
      //   86	91	79	finally
      //   93	98	79	finally
      //   100	105	79	finally
      //   107	115	79	finally
      //   117	127	79	finally
      //   129	140	79	finally
      //   4	15	83	java/lang/Exception
      //   19	24	83	java/lang/Exception
      //   28	34	83	java/lang/Exception
      //   48	56	83	java/lang/Exception
    }
    
    void a(u.g paramg, List<u.a> paramList)
    {
      if (!this.c.containsKey(paramg)) {
        this.c.put(paramg, new ArrayList());
      }
      ((List)this.c.get(paramg)).addAll(paramList);
    }
  }
  
  private static class f
  {
    private List<u.a> a = new ArrayList();
    private final String b;
    private final Context c;
    private final List<u.a> d = new ArrayList();
    private int e;
    
    f(Context paramContext, String paramString)
    {
      this.c = paramContext;
      this.b = paramString;
    }
    
    private byte[] a(String paramString)
    {
      try
      {
        paramString = paramString.getBytes("UTF-8");
      }
      catch (UnsupportedEncodingException paramString)
      {
        va.a("Encoding exception: ", paramString);
        paramString = null;
      }
      return paramString;
    }
    
    int a()
    {
      try
      {
        int i = this.a.size();
        return i;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    int a(f paramf)
    {
      try
      {
        int i = this.e;
        this.d.addAll(this.a);
        this.a.clear();
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        Object localObject1 = this.d.iterator();
        while (((Iterator)localObject1).hasNext()) {
          localJSONArray.put(((u.a)((Iterator)localObject1).next()).c);
        }
        if (localJSONArray.length() == 0) {
          return 0;
        }
        try
        {
          localObject3 = c();
          localObject1 = localObject3;
          if (this.e > 0)
          {
            ((JSONObject)localObject3).put("num_skipped_events", i);
            localObject1 = localObject3;
          }
        }
        catch (JSONException localJSONException)
        {
          localObject2 = new JSONObject();
        }
        paramf.a((JSONObject)localObject2);
        Object localObject3 = paramf.e();
        Object localObject2 = localObject3;
        if (localObject3 == null) {
          localObject2 = new Bundle();
        }
        localObject3 = localJSONArray.toString();
        if (localObject3 != null)
        {
          ((Bundle)localObject2).putByteArray("events_file", a((String)localObject3));
          paramf.c(localObject3);
        }
        paramf.a((Bundle)localObject2);
        return localJSONArray.length();
      }
      finally {}
    }
    
    void a(u.a parama)
    {
      try
      {
        if (this.a.size() + this.d.size() >= 1000) {
          this.e += 1;
        } else {
          this.a.add(parama);
        }
        return;
      }
      finally {}
    }
    
    void a(boolean paramBoolean)
    {
      if (paramBoolean) {}
      try
      {
        this.a.addAll(this.d);
        this.d.clear();
        this.e = 0;
        return;
      }
      finally {}
    }
    
    List<u.a> b()
    {
      try
      {
        List localList = this.a;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        this.a = localArrayList;
        return localList;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public JSONObject c()
      throws JSONException
    {
      JSONObject localJSONObject = new JSONObject();
      va.b(localJSONObject, this.b);
      try
      {
        va.a(localJSONObject, this.c);
      }
      catch (Exception localException)
      {
        v.a(bn.d, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] { localException.toString() });
      }
      return localJSONObject;
    }
  }
  
  private static class g
    implements Serializable
  {
    private final String a;
    public final String b;
    
    g(Rm paramRm)
    {
      this(paramRm.o(), Sm.c());
    }
    
    g(String paramString1, String paramString2)
    {
      String str = paramString1;
      if (va.e(paramString1)) {
        str = null;
      }
      this.a = str;
      this.b = paramString2;
    }
    
    private Object writeReplace()
    {
      return new a(this.a, this.b, null);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof g;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (g)paramObject;
      bool1 = bool2;
      if (va.a(((g)paramObject).a, this.a))
      {
        bool1 = bool2;
        if (va.a(((g)paramObject).b, this.b)) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return va.a(this.a) ^ va.a(this.b);
    }
    
    private static class a
      implements Serializable
    {
      private final String a;
      private final String b;
      
      private a(String paramString1, String paramString2)
      {
        this.a = paramString1;
        this.b = paramString2;
      }
      
      private Object readResolve()
      {
        return new u.g(this.a, this.b);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */