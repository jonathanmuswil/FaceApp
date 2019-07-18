package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@yh
public final class va
{
  private BlockingQueue<Ga> a = new ArrayBlockingQueue(100);
  private ExecutorService b;
  private LinkedHashMap<String, String> c = new LinkedHashMap();
  private Map<String, Aa> d = new HashMap();
  private String e;
  private Context f;
  private String g;
  private AtomicBoolean h;
  private File i;
  
  /* Error */
  private final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	com/google/android/gms/internal/ads/va:a	Ljava/util/concurrent/BlockingQueue;
    //   4: invokeinterface 57 1 0
    //   9: checkcast 59	com/google/android/gms/internal/ads/Ga
    //   12: astore_1
    //   13: aload_1
    //   14: invokevirtual 62	com/google/android/gms/internal/ads/Ga:a	()Ljava/lang/String;
    //   17: astore_2
    //   18: aload_2
    //   19: invokestatic 68	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   22: ifne -22 -> 0
    //   25: aload_0
    //   26: aload_0
    //   27: getfield 41	com/google/android/gms/internal/ads/va:c	Ljava/util/LinkedHashMap;
    //   30: aload_1
    //   31: invokevirtual 71	com/google/android/gms/internal/ads/Ga:b	()Ljava/util/Map;
    //   34: invokevirtual 74	com/google/android/gms/internal/ads/va:a	(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    //   37: astore_3
    //   38: aload_0
    //   39: getfield 76	com/google/android/gms/internal/ads/va:e	Ljava/lang/String;
    //   42: invokestatic 82	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   45: invokevirtual 86	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   48: astore_1
    //   49: aload_3
    //   50: invokeinterface 92 1 0
    //   55: invokeinterface 98 1 0
    //   60: astore_3
    //   61: aload_3
    //   62: invokeinterface 104 1 0
    //   67: ifeq +42 -> 109
    //   70: aload_3
    //   71: invokeinterface 107 1 0
    //   76: checkcast 109	java/util/Map$Entry
    //   79: astore 4
    //   81: aload_1
    //   82: aload 4
    //   84: invokeinterface 112 1 0
    //   89: checkcast 114	java/lang/String
    //   92: aload 4
    //   94: invokeinterface 117 1 0
    //   99: checkcast 114	java/lang/String
    //   102: invokevirtual 123	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   105: pop
    //   106: goto -45 -> 61
    //   109: new 125	java/lang/StringBuilder
    //   112: dup
    //   113: aload_1
    //   114: invokevirtual 129	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   117: invokevirtual 132	android/net/Uri:toString	()Ljava/lang/String;
    //   120: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: astore_1
    //   124: aload_1
    //   125: ldc -119
    //   127: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload_1
    //   132: aload_2
    //   133: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_1
    //   138: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: astore 5
    //   143: aload_0
    //   144: getfield 144	com/google/android/gms/internal/ads/va:h	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   147: invokevirtual 149	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   150: ifeq +145 -> 295
    //   153: aload_0
    //   154: getfield 151	com/google/android/gms/internal/ads/va:i	Ljava/io/File;
    //   157: astore 6
    //   159: aload 6
    //   161: ifnull +126 -> 287
    //   164: aconst_null
    //   165: astore 4
    //   167: aconst_null
    //   168: astore_3
    //   169: aload_3
    //   170: astore_2
    //   171: new 153	java/io/FileOutputStream
    //   174: astore_1
    //   175: aload_3
    //   176: astore_2
    //   177: aload_1
    //   178: aload 6
    //   180: iconst_1
    //   181: invokespecial 156	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   184: aload_1
    //   185: aload 5
    //   187: invokevirtual 160	java/lang/String:getBytes	()[B
    //   190: invokevirtual 164	java/io/FileOutputStream:write	([B)V
    //   193: aload_1
    //   194: bipush 10
    //   196: invokevirtual 166	java/io/FileOutputStream:write	(I)V
    //   199: aload_1
    //   200: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   203: goto -203 -> 0
    //   206: astore_2
    //   207: ldc -85
    //   209: aload_2
    //   210: invokestatic 176	com/google/android/gms/internal/ads/Tl:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   213: goto -213 -> 0
    //   216: astore_2
    //   217: aload_1
    //   218: astore_3
    //   219: aload_2
    //   220: astore_1
    //   221: aload_3
    //   222: astore_2
    //   223: goto +44 -> 267
    //   226: astore_3
    //   227: goto +11 -> 238
    //   230: astore_1
    //   231: goto +36 -> 267
    //   234: astore_3
    //   235: aload 4
    //   237: astore_1
    //   238: aload_1
    //   239: astore_2
    //   240: ldc -78
    //   242: aload_3
    //   243: invokestatic 176	com/google/android/gms/internal/ads/Tl:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   246: aload_1
    //   247: ifnull -247 -> 0
    //   250: aload_1
    //   251: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   254: goto -254 -> 0
    //   257: astore_2
    //   258: ldc -85
    //   260: aload_2
    //   261: invokestatic 176	com/google/android/gms/internal/ads/Tl:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   264: goto -264 -> 0
    //   267: aload_2
    //   268: ifnull +17 -> 285
    //   271: aload_2
    //   272: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   275: goto +10 -> 285
    //   278: astore_2
    //   279: ldc -85
    //   281: aload_2
    //   282: invokestatic 176	com/google/android/gms/internal/ads/Tl:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   285: aload_1
    //   286: athrow
    //   287: ldc -76
    //   289: invokestatic 182	com/google/android/gms/internal/ads/Tl:d	(Ljava/lang/String;)V
    //   292: goto -292 -> 0
    //   295: invokestatic 187	com/google/android/gms/ads/internal/k:c	()Lcom/google/android/gms/internal/ads/vk;
    //   298: pop
    //   299: aload_0
    //   300: getfield 189	com/google/android/gms/internal/ads/va:f	Landroid/content/Context;
    //   303: aload_0
    //   304: getfield 191	com/google/android/gms/internal/ads/va:g	Ljava/lang/String;
    //   307: aload 5
    //   309: invokestatic 196	com/google/android/gms/internal/ads/vk:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   312: goto -312 -> 0
    //   315: astore_2
    //   316: ldc -58
    //   318: aload_2
    //   319: invokestatic 176	com/google/android/gms/internal/ads/Tl:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   322: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	323	0	this	va
    //   12	209	1	localObject1	Object
    //   230	1	1	localObject2	Object
    //   237	49	1	localObject3	Object
    //   17	160	2	localObject4	Object
    //   206	4	2	localIOException1	java.io.IOException
    //   216	4	2	localObject5	Object
    //   222	18	2	localObject6	Object
    //   257	15	2	localIOException2	java.io.IOException
    //   278	4	2	localIOException3	java.io.IOException
    //   315	4	2	localInterruptedException	InterruptedException
    //   37	185	3	localObject7	Object
    //   226	1	3	localIOException4	java.io.IOException
    //   234	9	3	localIOException5	java.io.IOException
    //   79	157	4	localEntry	Map.Entry
    //   141	167	5	str	String
    //   157	22	6	localFile	File
    // Exception table:
    //   from	to	target	type
    //   199	203	206	java/io/IOException
    //   184	199	216	finally
    //   184	199	226	java/io/IOException
    //   171	175	230	finally
    //   177	184	230	finally
    //   240	246	230	finally
    //   171	175	234	java/io/IOException
    //   177	184	234	java/io/IOException
    //   250	254	257	java/io/IOException
    //   271	275	278	java/io/IOException
    //   0	18	315	java/lang/InterruptedException
  }
  
  public final Aa a(String paramString)
  {
    paramString = (Aa)this.d.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return Aa.a;
  }
  
  final Map<String, String> a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    paramMap1 = new LinkedHashMap(paramMap1);
    if (paramMap2 == null) {
      return paramMap1;
    }
    paramMap2 = paramMap2.entrySet().iterator();
    while (paramMap2.hasNext())
    {
      Object localObject = (Map.Entry)paramMap2.next();
      String str1 = (String)((Map.Entry)localObject).getKey();
      String str2 = (String)((Map.Entry)localObject).getValue();
      localObject = (String)paramMap1.get(str1);
      paramMap1.put(str1, a(str1).a((String)localObject, str2));
    }
    return paramMap1;
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    this.f = paramContext;
    this.g = paramString1;
    this.e = paramString2;
    this.h = new AtomicBoolean(false);
    paramContext = this.h;
    paramString1 = ra.ga;
    paramContext.set(((Boolean)Kea.e().a(paramString1)).booleanValue());
    if (this.h.get())
    {
      paramContext = Environment.getExternalStorageDirectory();
      if (paramContext != null) {
        this.i = new File(paramContext, "sdk_csi_data.txt");
      }
    }
    paramString1 = paramMap.entrySet().iterator();
    while (paramString1.hasNext())
    {
      paramContext = (Map.Entry)paramString1.next();
      this.c.put((String)paramContext.getKey(), (String)paramContext.getValue());
    }
    this.b = Executors.newSingleThreadExecutor();
    this.b.execute(new wa(this));
    this.d.put("action", Aa.b);
    this.d.put("ad_format", Aa.b);
    this.d.put("e", Aa.c);
  }
  
  public final boolean a(Ga paramGa)
  {
    return this.a.offer(paramGa);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */