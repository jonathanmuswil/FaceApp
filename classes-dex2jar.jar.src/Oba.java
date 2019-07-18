import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class oba
{
  private static Boolean a;
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static long c = -1L;
  public static final Comparator<File> d = new nba();
  
  public static int a()
  {
    return oba.a.a().ordinal();
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getResources().getIdentifier(paramString1, paramString2, h(paramContext));
  }
  
  public static int a(Context paramContext, boolean paramBoolean)
  {
    paramContext = e(paramContext);
    if ((paramBoolean) && (paramContext != null))
    {
      if (paramContext.floatValue() >= 99.0D) {
        return 3;
      }
      if (paramContext.floatValue() < 99.0D) {
        return 2;
      }
      return 0;
    }
    return 1;
  }
  
  public static long a(Context paramContext)
  {
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    ((ActivityManager)paramContext.getSystemService("activity")).getMemoryInfo(localMemoryInfo);
    return localMemoryInfo.availMem;
  }
  
  public static long a(String paramString)
  {
    paramString = new StatFs(paramString);
    long l = paramString.getBlockSize();
    return paramString.getBlockCount() * l - l * paramString.getAvailableBlocks();
  }
  
  static long a(String paramString1, String paramString2, int paramInt)
  {
    return Long.parseLong(paramString1.split(paramString2)[0].trim()) * paramInt;
  }
  
  public static ActivityManager.RunningAppProcessInfo a(String paramString, Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext != null)
    {
      Iterator localIterator = paramContext.iterator();
      while (localIterator.hasNext())
      {
        paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if (paramContext.processName.equals(paramString)) {
          return paramContext;
        }
      }
    }
    paramString = null;
    return paramString;
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "?";
    case 7: 
      return "A";
    case 6: 
      return "E";
    case 5: 
      return "W";
    case 4: 
      return "I";
    case 3: 
      return "D";
    }
    return "V";
  }
  
  /* Error */
  public static String a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 190	java/io/File:exists	()Z
    //   4: istore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: aconst_null
    //   8: astore 4
    //   10: iload_2
    //   11: ifeq +203 -> 214
    //   14: new 192	java/io/BufferedReader
    //   17: astore 5
    //   19: new 194	java/io/FileReader
    //   22: astore_3
    //   23: aload_3
    //   24: aload_0
    //   25: invokespecial 197	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   28: aload 5
    //   30: aload_3
    //   31: sipush 1024
    //   34: invokespecial 200	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   37: aload 5
    //   39: astore_3
    //   40: aload 5
    //   42: invokevirtual 203	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   45: astore 6
    //   47: aload 5
    //   49: astore 7
    //   51: aload 4
    //   53: astore_3
    //   54: aload 6
    //   56: ifnull +52 -> 108
    //   59: aload 5
    //   61: astore_3
    //   62: ldc -51
    //   64: invokestatic 211	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   67: aload 6
    //   69: iconst_2
    //   70: invokevirtual 214	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;I)[Ljava/lang/String;
    //   73: astore 7
    //   75: aload 5
    //   77: astore_3
    //   78: aload 7
    //   80: arraylength
    //   81: iconst_1
    //   82: if_icmple -45 -> 37
    //   85: aload 5
    //   87: astore_3
    //   88: aload 7
    //   90: iconst_0
    //   91: aaload
    //   92: aload_1
    //   93: invokevirtual 167	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   96: ifeq -59 -> 37
    //   99: aload 7
    //   101: iconst_1
    //   102: aaload
    //   103: astore_3
    //   104: aload 5
    //   106: astore 7
    //   108: aload 7
    //   110: ldc -40
    //   112: invokestatic 219	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   115: goto +99 -> 214
    //   118: astore_3
    //   119: aload 5
    //   121: astore_1
    //   122: aload_3
    //   123: astore 5
    //   125: goto +13 -> 138
    //   128: astore_0
    //   129: aconst_null
    //   130: astore_3
    //   131: goto +75 -> 206
    //   134: astore 5
    //   136: aconst_null
    //   137: astore_1
    //   138: aload_1
    //   139: astore_3
    //   140: invokestatic 224	Naa:e	()LXaa;
    //   143: astore 6
    //   145: aload_1
    //   146: astore_3
    //   147: new 226	java/lang/StringBuilder
    //   150: astore 7
    //   152: aload_1
    //   153: astore_3
    //   154: aload 7
    //   156: invokespecial 227	java/lang/StringBuilder:<init>	()V
    //   159: aload_1
    //   160: astore_3
    //   161: aload 7
    //   163: ldc -27
    //   165: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: pop
    //   169: aload_1
    //   170: astore_3
    //   171: aload 7
    //   173: aload_0
    //   174: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload_1
    //   179: astore_3
    //   180: aload 6
    //   182: ldc -18
    //   184: aload 7
    //   186: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: aload 5
    //   191: invokeinterface 246 4 0
    //   196: aload_1
    //   197: astore 7
    //   199: aload 4
    //   201: astore_3
    //   202: goto -94 -> 108
    //   205: astore_0
    //   206: aload_3
    //   207: ldc -40
    //   209: invokestatic 219	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   212: aload_0
    //   213: athrow
    //   214: aload_3
    //   215: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramFile	File
    //   0	216	1	paramString	String
    //   4	7	2	bool	boolean
    //   6	98	3	localObject1	Object
    //   118	5	3	localException1	Exception
    //   130	85	3	localObject2	Object
    //   8	192	4	localObject3	Object
    //   17	107	5	localObject4	Object
    //   134	56	5	localException2	Exception
    //   45	136	6	localObject5	Object
    //   49	149	7	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   40	47	118	java/lang/Exception
    //   62	75	118	java/lang/Exception
    //   78	85	118	java/lang/Exception
    //   88	99	118	java/lang/Exception
    //   14	37	128	finally
    //   14	37	134	java/lang/Exception
    //   40	47	205	finally
    //   62	75	205	finally
    //   78	85	205	finally
    //   88	99	205	finally
    //   140	145	205	finally
    //   147	152	205	finally
    //   154	159	205	finally
    //   161	169	205	finally
    //   171	178	205	finally
    //   180	196	205	finally
  }
  
  public static String a(InputStream paramInputStream)
  {
    return a(paramInputStream, "SHA-1");
  }
  
  private static String a(InputStream paramInputStream, String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
      paramString = new byte['Ѐ'];
      for (;;)
      {
        int i = paramInputStream.read(paramString);
        if (i == -1) {
          break;
        }
        localMessageDigest.update(paramString, 0, i);
      }
      paramInputStream = a(localMessageDigest.digest());
      return paramInputStream;
    }
    catch (Exception paramInputStream)
    {
      Naa.e().b("Fabric", "Could not calculate hash for app icon.", paramInputStream);
    }
    return "";
  }
  
  private static String a(String paramString1, String paramString2)
  {
    return a(paramString1.getBytes(), paramString2);
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[paramArrayOfByte.length * 2];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      int k = i * 2;
      char[] arrayOfChar2 = b;
      arrayOfChar1[k] = ((char)arrayOfChar2[(j >>> 4)]);
      arrayOfChar1[(k + 1)] = ((char)arrayOfChar2[(j & 0xF)]);
    }
    return new String(arrayOfChar1);
  }
  
  private static String a(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      localObject = MessageDigest.getInstance(paramString);
      ((MessageDigest)localObject).update(paramArrayOfByte);
      return a(((MessageDigest)localObject).digest());
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      paramArrayOfByte = Naa.e();
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Could not create hashing algorithm: ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(", returning empty string.");
      paramArrayOfByte.b("Fabric", ((StringBuilder)localObject).toString(), localNoSuchAlgorithmException);
    }
    return "";
  }
  
  public static String a(String... paramVarArgs)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramVarArgs != null) {
      if (paramVarArgs.length == 0)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = new ArrayList();
        int i = paramVarArgs.length;
        for (int j = 0; j < i; j++)
        {
          String str = paramVarArgs[j];
          if (str != null) {
            ((List)localObject2).add(str.replace("-", "").toLowerCase(Locale.US));
          }
        }
        Collections.sort((List)localObject2);
        paramVarArgs = new StringBuilder();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          paramVarArgs.append((String)((Iterator)localObject2).next());
        }
        paramVarArgs = paramVarArgs.toString();
        localObject2 = localObject1;
        if (paramVarArgs.length() > 0) {
          localObject2 = c(paramVarArgs);
        }
      }
    }
    return (String)localObject2;
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    if (k(paramContext)) {
      Naa.e().a(paramInt, "Fabric", paramString2);
    }
  }
  
  public static void a(Context paramContext, String paramString, Throwable paramThrowable)
  {
    if (k(paramContext)) {
      Naa.e().b("Fabric", paramString);
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      try
      {
        paramCloseable.close();
      }
      catch (RuntimeException paramCloseable)
      {
        throw paramCloseable;
      }
      return;
    }
    catch (Exception paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static void a(Closeable paramCloseable, String paramString)
  {
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
      }
      catch (IOException paramCloseable)
      {
        Naa.e().b("Fabric", paramString, paramCloseable);
      }
    }
  }
  
  public static void a(Flushable paramFlushable, String paramString)
  {
    if (paramFlushable != null) {
      try
      {
        paramFlushable.flush();
      }
      catch (IOException paramFlushable)
      {
        Naa.e().b("Fabric", paramString, paramFlushable);
      }
    }
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream, byte[] paramArrayOfByte)
    throws IOException
  {
    for (;;)
    {
      int i = paramInputStream.read(paramArrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(paramArrayOfByte, 0, i);
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool;
    if (paramContext.checkCallingOrSelfPermission(paramString) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramContext != null)
    {
      Resources localResources = paramContext.getResources();
      if (localResources != null)
      {
        int i = a(paramContext, paramString, "bool");
        if (i > 0) {
          return localResources.getBoolean(i);
        }
        i = a(paramContext, paramString, "string");
        if (i > 0) {
          return Boolean.parseBoolean(paramContext.getString(i));
        }
      }
    }
    return paramBoolean;
  }
  
  public static long b()
  {
    try
    {
      if (c == -1L)
      {
        long l1 = 0L;
        Object localObject1 = new java/io/File;
        ((File)localObject1).<init>("/proc/meminfo");
        localObject1 = a((File)localObject1, "MemTotal");
        l2 = l1;
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          localObject1 = ((String)localObject1).toUpperCase(Locale.US);
          try
          {
            if (((String)localObject1).endsWith("KB"))
            {
              l2 = a((String)localObject1, "KB", 1024);
            }
            else if (((String)localObject1).endsWith("MB"))
            {
              l2 = a((String)localObject1, "MB", 1048576);
            }
            else if (((String)localObject1).endsWith("GB"))
            {
              l2 = a((String)localObject1, "GB", 1073741824);
            }
            else
            {
              localObject3 = Naa.e();
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append("Unexpected meminfo format while computing RAM: ");
              ((StringBuilder)localObject4).append((String)localObject1);
              ((Xaa)localObject3).d("Fabric", ((StringBuilder)localObject4).toString());
              l2 = l1;
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            Object localObject4 = Naa.e();
            Object localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("Unexpected meminfo format while computing RAM: ");
            ((StringBuilder)localObject3).append((String)localObject1);
            ((Xaa)localObject4).b("Fabric", ((StringBuilder)localObject3).toString(), localNumberFormatException);
            l2 = l1;
          }
        }
        c = l2;
      }
      long l2 = c;
      return l2;
    }
    finally {}
  }
  
  public static String b(int paramInt)
  {
    if (paramInt >= 0) {
      return String.format(Locale.US, "%1$10s", new Object[] { Integer.valueOf(paramInt) }).replace(' ', '0');
    }
    throw new IllegalArgumentException("value must be zero or greater");
  }
  
  public static String b(Context paramContext, String paramString)
  {
    int i = a(paramContext, paramString, "string");
    if (i > 0) {
      return paramContext.getString(i);
    }
    return "";
  }
  
  public static String b(InputStream paramInputStream)
    throws IOException
  {
    paramInputStream = new Scanner(paramInputStream).useDelimiter("\\A");
    if (paramInputStream.hasNext()) {
      paramInputStream = paramInputStream.next();
    } else {
      paramInputStream = "";
    }
    return paramInputStream;
  }
  
  @SuppressLint({"MissingPermission"})
  public static boolean b(Context paramContext)
  {
    boolean bool1 = a(paramContext, "android.permission.ACCESS_NETWORK_STATE");
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnectedOrConnecting())) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  public static boolean b(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.length() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  /* Error */
  public static String c(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 63	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   6: aload_0
    //   7: invokestatic 488	oba:d	(Landroid/content/Context;)I
    //   10: invokevirtual 492	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   13: astore_2
    //   14: aload_2
    //   15: astore_0
    //   16: aload_2
    //   17: invokestatic 494	oba:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   20: astore_3
    //   21: aload_2
    //   22: astore_0
    //   23: aload_3
    //   24: invokestatic 496	oba:b	(Ljava/lang/String;)Z
    //   27: istore 4
    //   29: iload 4
    //   31: ifeq +8 -> 39
    //   34: aload_1
    //   35: astore_0
    //   36: goto +5 -> 41
    //   39: aload_3
    //   40: astore_0
    //   41: aload_2
    //   42: ldc_w 498
    //   45: invokestatic 219	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   48: aload_0
    //   49: areturn
    //   50: astore_1
    //   51: goto +12 -> 63
    //   54: astore_2
    //   55: aconst_null
    //   56: astore_0
    //   57: goto +74 -> 131
    //   60: astore_1
    //   61: aconst_null
    //   62: astore_2
    //   63: aload_2
    //   64: astore_0
    //   65: invokestatic 224	Naa:e	()LXaa;
    //   68: astore_3
    //   69: aload_2
    //   70: astore_0
    //   71: new 226	java/lang/StringBuilder
    //   74: astore 5
    //   76: aload_2
    //   77: astore_0
    //   78: aload 5
    //   80: invokespecial 227	java/lang/StringBuilder:<init>	()V
    //   83: aload_2
    //   84: astore_0
    //   85: aload 5
    //   87: ldc_w 500
    //   90: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_2
    //   95: astore_0
    //   96: aload 5
    //   98: aload_1
    //   99: invokevirtual 503	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   102: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_2
    //   107: astore_0
    //   108: aload_3
    //   109: ldc -18
    //   111: aload 5
    //   113: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: invokeinterface 505 3 0
    //   121: aload_2
    //   122: ldc_w 498
    //   125: invokestatic 219	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   128: aconst_null
    //   129: areturn
    //   130: astore_2
    //   131: aload_0
    //   132: ldc_w 498
    //   135: invokestatic 219	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   138: aload_2
    //   139: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	paramContext	Context
    //   1	34	1	localObject1	Object
    //   50	1	1	localException1	Exception
    //   60	39	1	localException2	Exception
    //   13	29	2	localInputStream	InputStream
    //   54	1	2	localObject2	Object
    //   62	60	2	localCloseable	Closeable
    //   130	9	2	localObject3	Object
    //   20	89	3	localObject4	Object
    //   27	3	4	bool	boolean
    //   74	38	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   16	21	50	java/lang/Exception
    //   23	29	50	java/lang/Exception
    //   2	14	54	finally
    //   2	14	60	java/lang/Exception
    //   16	21	130	finally
    //   23	29	130	finally
    //   65	69	130	finally
    //   71	76	130	finally
    //   78	83	130	finally
    //   85	94	130	finally
    //   96	106	130	finally
    //   108	121	130	finally
  }
  
  public static String c(String paramString)
  {
    return a(paramString, "SHA-1");
  }
  
  public static void c(Context paramContext, String paramString)
  {
    if (k(paramContext)) {
      Naa.e().d("Fabric", paramString);
    }
  }
  
  public static boolean c()
  {
    boolean bool;
    if ((!Debug.isDebuggerConnected()) && (!Debug.waitingForDebugger())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static int d(Context paramContext)
  {
    return paramContext.getApplicationContext().getApplicationInfo().icon;
  }
  
  public static String d(String paramString)
  {
    return a(paramString, "SHA-256");
  }
  
  public static Float e(Context paramContext)
  {
    paramContext = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    if (paramContext == null) {
      return null;
    }
    int i = paramContext.getIntExtra("level", -1);
    int j = paramContext.getIntExtra("scale", -1);
    return Float.valueOf(i / j);
  }
  
  public static int f(Context paramContext)
  {
    if (l(paramContext)) {
      i = 1;
    } else {
      i = 0;
    }
    int j = i;
    if (m(paramContext)) {
      j = i | 0x2;
    }
    int i = j;
    if (c()) {
      i = j | 0x4;
    }
    return i;
  }
  
  public static boolean g(Context paramContext)
  {
    boolean bool1 = l(paramContext);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (((SensorManager)paramContext.getSystemService("sensor")).getDefaultSensor(8) != null) {
      bool2 = true;
    }
    return bool2;
  }
  
  public static String h(Context paramContext)
  {
    int i = paramContext.getApplicationContext().getApplicationInfo().icon;
    if (i > 0) {
      try
      {
        String str = paramContext.getResources().getResourcePackageName(i);
        paramContext = str;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        paramContext = paramContext.getPackageName();
      }
    } else {
      paramContext = paramContext.getPackageName();
    }
    return paramContext;
  }
  
  public static SharedPreferences i(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.crashlytics.prefs", 0);
  }
  
  public static boolean j(Context paramContext)
  {
    boolean bool;
    if ((paramContext.getApplicationInfo().flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean k(Context paramContext)
  {
    if (a == null) {
      a = Boolean.valueOf(a(paramContext, "com.crashlytics.Trace", false));
    }
    return a.booleanValue();
  }
  
  public static boolean l(Context paramContext)
  {
    paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    boolean bool;
    if ((!"sdk".equals(Build.PRODUCT)) && (!"google_sdk".equals(Build.PRODUCT)) && (paramContext != null)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean m(Context paramContext)
  {
    boolean bool = l(paramContext);
    paramContext = Build.TAGS;
    if ((!bool) && (paramContext != null) && (paramContext.contains("test-keys"))) {
      return true;
    }
    if (new File("/system/app/Superuser.apk").exists()) {
      return true;
    }
    paramContext = new File("/system/xbin/su");
    return (!bool) && (paramContext.exists());
  }
  
  public static String n(Context paramContext)
  {
    int i = a(paramContext, "io.fabric.android.build_id", "string");
    int j = i;
    if (i == 0) {
      j = a(paramContext, "com.crashlytics.android.build_id", "string");
    }
    if (j != 0)
    {
      paramContext = paramContext.getResources().getString(j);
      Xaa localXaa = Naa.e();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Build ID is: ");
      localStringBuilder.append(paramContext);
      localXaa.d("Fabric", localStringBuilder.toString());
    }
    else
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static String o(Context paramContext)
  {
    int i = a(paramContext, "com.google.firebase.crashlytics.unity_version", "string");
    if (i != 0)
    {
      paramContext = paramContext.getResources().getString(i);
      Xaa localXaa = Naa.e();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unity Editor version is: ");
      localStringBuilder.append(paramContext);
      localXaa.d("Fabric", localStringBuilder.toString());
    }
    else
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  static enum a
  {
    private static final Map<String, a> k;
    
    static
    {
      k = new HashMap(4);
      k.put("armeabi-v7a", g);
      k.put("armeabi", f);
      k.put("arm64-v8a", j);
      k.put("x86", a);
    }
    
    private a() {}
    
    static a a()
    {
      Object localObject = Build.CPU_ABI;
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        Naa.e().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
        return h;
      }
      localObject = ((String)localObject).toLowerCase(Locale.US);
      a locala = (a)k.get(localObject);
      localObject = locala;
      if (locala == null) {
        localObject = h;
      }
      return (a)localObject;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */