import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class bv
{
  private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
  private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
  private static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
  private static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
  private static final AtomicBoolean e = new AtomicBoolean();
  private static HashMap<String, String> f;
  private static final HashMap<String, Boolean> g = new HashMap();
  private static final HashMap<String, Integer> h = new HashMap();
  private static final HashMap<String, Long> i = new HashMap();
  private static final HashMap<String, Float> j = new HashMap();
  private static Object k;
  private static boolean l;
  private static String[] m = new String[0];
  
  /* Error */
  public static String a(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 86	bv:f	Ljava/util/HashMap;
    //   6: ifnonnull +61 -> 67
    //   9: getstatic 66	bv:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   12: iconst_0
    //   13: invokevirtual 90	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   16: new 68	java/util/HashMap
    //   19: astore_2
    //   20: aload_2
    //   21: invokespecial 69	java/util/HashMap:<init>	()V
    //   24: aload_2
    //   25: putstatic 86	bv:f	Ljava/util/HashMap;
    //   28: new 4	java/lang/Object
    //   31: astore_2
    //   32: aload_2
    //   33: invokespecial 83	java/lang/Object:<init>	()V
    //   36: aload_2
    //   37: putstatic 92	bv:k	Ljava/lang/Object;
    //   40: iconst_0
    //   41: putstatic 94	bv:l	Z
    //   44: getstatic 41	bv:a	Landroid/net/Uri;
    //   47: astore_2
    //   48: new 96	Cv
    //   51: astore_3
    //   52: aload_3
    //   53: aconst_null
    //   54: invokespecial 99	Cv:<init>	(Landroid/os/Handler;)V
    //   57: aload_0
    //   58: aload_2
    //   59: iconst_1
    //   60: aload_3
    //   61: invokevirtual 105	android/content/ContentResolver:registerContentObserver	(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V
    //   64: goto +59 -> 123
    //   67: getstatic 66	bv:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   70: iconst_0
    //   71: invokevirtual 109	java/util/concurrent/atomic/AtomicBoolean:getAndSet	(Z)Z
    //   74: ifeq +49 -> 123
    //   77: getstatic 86	bv:f	Ljava/util/HashMap;
    //   80: invokevirtual 112	java/util/HashMap:clear	()V
    //   83: getstatic 71	bv:g	Ljava/util/HashMap;
    //   86: invokevirtual 112	java/util/HashMap:clear	()V
    //   89: getstatic 73	bv:h	Ljava/util/HashMap;
    //   92: invokevirtual 112	java/util/HashMap:clear	()V
    //   95: getstatic 75	bv:i	Ljava/util/HashMap;
    //   98: invokevirtual 112	java/util/HashMap:clear	()V
    //   101: getstatic 77	bv:j	Ljava/util/HashMap;
    //   104: invokevirtual 112	java/util/HashMap:clear	()V
    //   107: new 4	java/lang/Object
    //   110: astore_2
    //   111: aload_2
    //   112: invokespecial 83	java/lang/Object:<init>	()V
    //   115: aload_2
    //   116: putstatic 92	bv:k	Ljava/lang/Object;
    //   119: iconst_0
    //   120: putstatic 94	bv:l	Z
    //   123: getstatic 92	bv:k	Ljava/lang/Object;
    //   126: astore 4
    //   128: getstatic 86	bv:f	Ljava/util/HashMap;
    //   131: aload_1
    //   132: invokevirtual 116	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   135: ifeq +28 -> 163
    //   138: getstatic 86	bv:f	Ljava/util/HashMap;
    //   141: aload_1
    //   142: invokevirtual 120	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   145: checkcast 79	java/lang/String
    //   148: astore_0
    //   149: aload_0
    //   150: ifnull +6 -> 156
    //   153: goto +5 -> 158
    //   156: aconst_null
    //   157: astore_0
    //   158: ldc 2
    //   160: monitorexit
    //   161: aload_0
    //   162: areturn
    //   163: getstatic 81	bv:m	[Ljava/lang/String;
    //   166: astore_2
    //   167: aload_2
    //   168: arraylength
    //   169: istore 5
    //   171: iconst_0
    //   172: istore 6
    //   174: iload 6
    //   176: iload 5
    //   178: if_icmpge +94 -> 272
    //   181: aload_1
    //   182: aload_2
    //   183: iload 6
    //   185: aaload
    //   186: invokevirtual 124	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   189: ifeq +77 -> 266
    //   192: getstatic 94	bv:l	Z
    //   195: ifeq +12 -> 207
    //   198: getstatic 86	bv:f	Ljava/util/HashMap;
    //   201: invokevirtual 128	java/util/HashMap:isEmpty	()Z
    //   204: ifeq +57 -> 261
    //   207: getstatic 81	bv:m	[Ljava/lang/String;
    //   210: astore_2
    //   211: getstatic 86	bv:f	Ljava/util/HashMap;
    //   214: aload_0
    //   215: aload_2
    //   216: invokestatic 131	bv:a	(Landroid/content/ContentResolver;[Ljava/lang/String;)Ljava/util/Map;
    //   219: invokevirtual 135	java/util/HashMap:putAll	(Ljava/util/Map;)V
    //   222: iconst_1
    //   223: putstatic 94	bv:l	Z
    //   226: getstatic 86	bv:f	Ljava/util/HashMap;
    //   229: aload_1
    //   230: invokevirtual 116	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   233: ifeq +28 -> 261
    //   236: getstatic 86	bv:f	Ljava/util/HashMap;
    //   239: aload_1
    //   240: invokevirtual 120	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   243: checkcast 79	java/lang/String
    //   246: astore_0
    //   247: aload_0
    //   248: ifnull +6 -> 254
    //   251: goto +5 -> 256
    //   254: aconst_null
    //   255: astore_0
    //   256: ldc 2
    //   258: monitorexit
    //   259: aload_0
    //   260: areturn
    //   261: ldc 2
    //   263: monitorexit
    //   264: aconst_null
    //   265: areturn
    //   266: iinc 6 1
    //   269: goto -95 -> 174
    //   272: ldc 2
    //   274: monitorexit
    //   275: aload_0
    //   276: getstatic 41	bv:a	Landroid/net/Uri;
    //   279: aconst_null
    //   280: aconst_null
    //   281: iconst_1
    //   282: anewarray 79	java/lang/String
    //   285: dup
    //   286: iconst_0
    //   287: aload_1
    //   288: aastore
    //   289: aconst_null
    //   290: invokevirtual 139	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   293: astore_3
    //   294: aload_3
    //   295: ifnonnull +15 -> 310
    //   298: aload_3
    //   299: ifnull +9 -> 308
    //   302: aload_3
    //   303: invokeinterface 144 1 0
    //   308: aconst_null
    //   309: areturn
    //   310: aload_3
    //   311: invokeinterface 147 1 0
    //   316: ifne +22 -> 338
    //   319: aload 4
    //   321: aload_1
    //   322: aconst_null
    //   323: invokestatic 150	bv:a	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   326: aload_3
    //   327: ifnull +9 -> 336
    //   330: aload_3
    //   331: invokeinterface 144 1 0
    //   336: aconst_null
    //   337: areturn
    //   338: aload_3
    //   339: iconst_1
    //   340: invokeinterface 154 2 0
    //   345: astore_2
    //   346: aload_2
    //   347: astore_0
    //   348: aload_2
    //   349: ifnull +15 -> 364
    //   352: aload_2
    //   353: astore_0
    //   354: aload_2
    //   355: aconst_null
    //   356: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   359: ifeq +5 -> 364
    //   362: aconst_null
    //   363: astore_0
    //   364: aload 4
    //   366: aload_1
    //   367: aload_0
    //   368: invokestatic 150	bv:a	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   371: aload_0
    //   372: ifnull +6 -> 378
    //   375: goto +5 -> 380
    //   378: aconst_null
    //   379: astore_0
    //   380: aload_3
    //   381: ifnull +9 -> 390
    //   384: aload_3
    //   385: invokeinterface 144 1 0
    //   390: aload_0
    //   391: areturn
    //   392: astore_0
    //   393: aload_3
    //   394: ifnull +9 -> 403
    //   397: aload_3
    //   398: invokeinterface 144 1 0
    //   403: aload_0
    //   404: athrow
    //   405: astore_0
    //   406: ldc 2
    //   408: monitorexit
    //   409: aload_0
    //   410: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	411	0	paramContentResolver	ContentResolver
    //   0	411	1	paramString1	String
    //   0	411	2	paramString2	String
    //   51	347	3	localObject1	Object
    //   126	239	4	localObject2	Object
    //   169	10	5	n	int
    //   172	95	6	i1	int
    // Exception table:
    //   from	to	target	type
    //   310	326	392	finally
    //   338	346	392	finally
    //   354	362	392	finally
    //   364	371	392	finally
    //   3	64	405	finally
    //   67	123	405	finally
    //   123	149	405	finally
    //   158	161	405	finally
    //   163	171	405	finally
    //   181	207	405	finally
    //   207	247	405	finally
    //   256	259	405	finally
    //   261	264	405	finally
    //   272	275	405	finally
    //   406	409	405	finally
  }
  
  private static Map<String, String> a(ContentResolver paramContentResolver, String... paramVarArgs)
  {
    paramContentResolver = paramContentResolver.query(b, null, null, paramVarArgs, null);
    paramVarArgs = new TreeMap();
    if (paramContentResolver == null) {
      return paramVarArgs;
    }
    try
    {
      while (paramContentResolver.moveToNext()) {
        paramVarArgs.put(paramContentResolver.getString(0), paramContentResolver.getString(1));
      }
      return paramVarArgs;
    }
    finally
    {
      paramContentResolver.close();
    }
  }
  
  private static void a(Object paramObject, String paramString1, String paramString2)
  {
    try
    {
      if (paramObject == k) {
        f.put(paramString1, paramString2);
      }
      return;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */