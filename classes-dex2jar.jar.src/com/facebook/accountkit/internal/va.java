package com.facebook.accountkit.internal;

import Sm;
import Vm;
import Vm.a;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.Patterns;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jn;
import oT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import qT;
import vT;

public final class va
{
  private static final String a = "com.facebook.accountkit.internal.va";
  private static final ScheduledThreadPoolExecutor b = new ScheduledThreadPoolExecutor(1);
  private static long c = -1L;
  private static String d = "NoCarrier";
  private static String e = "";
  private static int f = 0;
  private static long g = -1L;
  private static long h = -1L;
  
  /* Error */
  static int a(java.io.InputStream paramInputStream, java.io.OutputStream paramOutputStream)
    throws IOException
  {
    // Byte code:
    //   0: new 54	java/io/BufferedInputStream
    //   3: astore_2
    //   4: aload_2
    //   5: aload_0
    //   6: invokespecial 57	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   9: sipush 8192
    //   12: newarray <illegal type>
    //   14: astore_3
    //   15: iconst_0
    //   16: istore 4
    //   18: aload_2
    //   19: aload_3
    //   20: invokevirtual 61	java/io/BufferedInputStream:read	([B)I
    //   23: istore 5
    //   25: iload 5
    //   27: iconst_m1
    //   28: if_icmpeq +21 -> 49
    //   31: aload_1
    //   32: aload_3
    //   33: iconst_0
    //   34: iload 5
    //   36: invokevirtual 67	java/io/OutputStream:write	([BII)V
    //   39: iload 4
    //   41: iload 5
    //   43: iadd
    //   44: istore 4
    //   46: goto -28 -> 18
    //   49: aload_2
    //   50: invokevirtual 70	java/io/BufferedInputStream:close	()V
    //   53: aload_0
    //   54: ifnull +7 -> 61
    //   57: aload_0
    //   58: invokevirtual 73	java/io/InputStream:close	()V
    //   61: iload 4
    //   63: ireturn
    //   64: astore_3
    //   65: aload_2
    //   66: astore_1
    //   67: goto +6 -> 73
    //   70: astore_3
    //   71: aconst_null
    //   72: astore_1
    //   73: aload_1
    //   74: ifnull +7 -> 81
    //   77: aload_1
    //   78: invokevirtual 70	java/io/BufferedInputStream:close	()V
    //   81: aload_0
    //   82: ifnull +7 -> 89
    //   85: aload_0
    //   86: invokevirtual 73	java/io/InputStream:close	()V
    //   89: aload_3
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	paramInputStream	java.io.InputStream
    //   0	91	1	paramOutputStream	java.io.OutputStream
    //   3	63	2	localBufferedInputStream	java.io.BufferedInputStream
    //   14	19	3	arrayOfByte	byte[]
    //   64	1	3	localObject1	Object
    //   70	20	3	localObject2	Object
    //   16	46	4	i	int
    //   23	21	5	j	int
    // Exception table:
    //   from	to	target	type
    //   9	15	64	finally
    //   18	25	64	finally
    //   31	39	64	finally
    //   0	9	70	finally
  }
  
  public static int a(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return i;
  }
  
  private static long a(double paramDouble)
  {
    return Math.round(paramDouble / 1.073741824E9D);
  }
  
  static Pair<Vm, O> a(m paramm)
  {
    int i = paramm.a();
    if (paramm.f() == 1550001) {
      i = 605;
    }
    O localO = new O(i, paramm.b(), paramm.g());
    i = paramm.a();
    if (i != 100)
    {
      if (i != 101)
      {
        if (i != 15003) {
          switch (i)
          {
          default: 
            paramm = new Vm(Vm.a.b, localO);
            break;
          case 1948003: 
            paramm = new Vm(Vm.a.b, localO);
            break;
          case 1948002: 
            paramm = new Vm(Vm.a.f, localO);
            break;
          case 1948001: 
            paramm = new Vm(Vm.a.c, localO);
            break;
          }
        } else {
          paramm = new Vm(Vm.a.f, localO);
        }
      }
      else {
        paramm = new Vm(Vm.a.a, localO);
      }
    }
    else {
      paramm = new Vm(Vm.a.f, localO);
    }
    return new Pair(paramm, localO);
  }
  
  static Object a(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    paramString = paramJSONObject.opt(paramString);
    paramJSONObject = paramString;
    if (paramString != null)
    {
      paramJSONObject = paramString;
      if ((paramString instanceof String)) {
        paramJSONObject = new JSONTokener((String)paramString).nextValue();
      }
    }
    return paramJSONObject;
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      String str = paramContext.getSimCountryIso();
      if ((str != null) && (str.length() == 2)) {
        return str.toLowerCase(Locale.US);
      }
      if (paramContext.getPhoneType() != 2)
      {
        paramContext = paramContext.getNetworkCountryIso();
        if ((paramContext != null) && (paramContext.length() == 2))
        {
          paramContext = paramContext.toLowerCase(Locale.US);
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  /* Error */
  static String a(java.io.InputStream paramInputStream)
    throws IOException
  {
    // Byte code:
    //   0: new 54	java/io/BufferedInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 57	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   9: new 185	java/io/InputStreamReader
    //   12: astore_2
    //   13: aload_2
    //   14: aload_1
    //   15: invokespecial 186	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   18: new 188	java/lang/StringBuilder
    //   21: astore_3
    //   22: aload_3
    //   23: invokespecial 190	java/lang/StringBuilder:<init>	()V
    //   26: sipush 2048
    //   29: newarray <illegal type>
    //   31: astore_0
    //   32: aload_2
    //   33: aload_0
    //   34: invokevirtual 193	java/io/InputStreamReader:read	([C)I
    //   37: istore 4
    //   39: iload 4
    //   41: iconst_m1
    //   42: if_icmpeq +15 -> 57
    //   45: aload_3
    //   46: aload_0
    //   47: iconst_0
    //   48: iload 4
    //   50: invokevirtual 197	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: goto -22 -> 32
    //   57: aload_3
    //   58: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: astore_0
    //   62: aload_1
    //   63: invokestatic 203	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   66: aload_2
    //   67: invokestatic 203	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   70: aload_0
    //   71: areturn
    //   72: astore_0
    //   73: goto +14 -> 87
    //   76: astore_0
    //   77: aconst_null
    //   78: astore_2
    //   79: goto +8 -> 87
    //   82: astore_0
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: astore_2
    //   87: aload_1
    //   88: invokestatic 203	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   91: aload_2
    //   92: invokestatic 203	com/facebook/accountkit/internal/va:a	(Ljava/io/Closeable;)V
    //   95: aload_0
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	paramInputStream	java.io.InputStream
    //   3	85	1	localBufferedInputStream	java.io.BufferedInputStream
    //   12	80	2	localObject	Object
    //   21	37	3	localStringBuilder	StringBuilder
    //   37	12	4	i	int
    // Exception table:
    //   from	to	target	type
    //   18	32	72	finally
    //   32	39	72	finally
    //   45	54	72	finally
    //   57	62	72	finally
    //   9	18	76	finally
    //   0	9	82	finally
  }
  
  public static String a(String paramString)
  {
    if (e(paramString)) {
      return "";
    }
    return paramString.replaceAll("[^\\d]", "");
  }
  
  private static String a(MessageDigest paramMessageDigest, byte[] paramArrayOfByte)
  {
    paramMessageDigest.update(paramArrayOfByte);
    paramMessageDigest = paramMessageDigest.digest();
    paramArrayOfByte = new StringBuilder();
    int i = paramMessageDigest.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramMessageDigest[j];
      paramArrayOfByte.append(Integer.toHexString(k >> 4 & 0xF));
      paramArrayOfByte.append(Integer.toHexString(k & 0xF));
    }
    return paramArrayOfByte.toString();
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      return a(localMessageDigest, paramArrayOfByte);
    }
    catch (NoSuchAlgorithmException paramArrayOfByte) {}
    return null;
  }
  
  public static jn a(vT paramvT)
  {
    if ((paramvT != null) && (qT.a().c(paramvT))) {
      return new jn(String.valueOf(paramvT.b()), String.valueOf(paramvT.e()), qT.a().b(paramvT));
    }
    return null;
  }
  
  static void a()
  {
    if (!Looper.getMainLooper().equals(Looper.myLooper())) {
      Log.w(a, "This method should be called from the UI thread");
    }
  }
  
  static void a(Bundle paramBundle, String paramString1, String paramString2)
  {
    if ((paramBundle != null) && (paramString1 != null) && (paramString2 != null)) {
      paramBundle.putString(paramString1, paramString2);
    }
  }
  
  static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  static void a(String paramString, Exception paramException)
  {
    if ((paramString != null) && (paramException != null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramException.getClass().getSimpleName());
      localStringBuilder.append(": ");
      localStringBuilder.append(paramException.getMessage());
      Log.d(paramString, localStringBuilder.toString());
    }
  }
  
  static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (!e(paramString1)) {
      Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  static void a(URLConnection paramURLConnection)
  {
    if ((paramURLConnection instanceof HttpURLConnection)) {
      ((HttpURLConnection)paramURLConnection).disconnect();
    }
  }
  
  static void a(JSONObject paramJSONObject, Context paramContext)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put("a2");
    j(paramContext);
    Object localObject1 = paramContext.getPackageName();
    int i = -1;
    int j = i;
    Object localObject3;
    try
    {
      Object localObject2 = paramContext.getPackageManager().getPackageInfo((String)localObject1, 0);
      j = i;
      i = ((PackageInfo)localObject2).versionCode;
      j = i;
      localObject2 = ((PackageInfo)localObject2).versionName;
      j = i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject3 = "";
    }
    localJSONArray.put(localObject1);
    localJSONArray.put(j);
    localJSONArray.put(localObject3);
    localJSONArray.put(Build.VERSION.RELEASE);
    localJSONArray.put(Build.MODEL);
    Object localObject4;
    try
    {
      localObject3 = paramContext.getResources().getConfiguration().locale;
    }
    catch (Exception localException)
    {
      localObject4 = Locale.getDefault();
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(((Locale)localObject4).getLanguage());
    ((StringBuilder)localObject1).append("_");
    ((StringBuilder)localObject1).append(((Locale)localObject4).getCountry());
    localJSONArray.put(((StringBuilder)localObject1).toString());
    localJSONArray.put(e);
    localJSONArray.put(d);
    double d1 = 0.0D;
    for (;;)
    {
      try
      {
        paramContext = (WindowManager)paramContext.getSystemService("window");
        if (paramContext != null)
        {
          paramContext = paramContext.getDefaultDisplay();
          localObject4 = new android/util/DisplayMetrics;
          ((DisplayMetrics)localObject4).<init>();
          paramContext.getMetrics((DisplayMetrics)localObject4);
          j = ((DisplayMetrics)localObject4).widthPixels;
        }
      }
      catch (Exception paramContext)
      {
        float f1;
        continue;
      }
      try
      {
        i = ((DisplayMetrics)localObject4).heightPixels;
      }
      catch (Exception paramContext)
      {
        continue;
      }
      try
      {
        f1 = ((DisplayMetrics)localObject4).density;
        d1 = f1;
      }
      catch (Exception paramContext) {}
    }
    j = 0;
    i = 0;
    localJSONArray.put(j);
    localJSONArray.put(i);
    localJSONArray.put(String.format(Locale.ENGLISH, "%.2f", new Object[] { Double.valueOf(d1) }));
    localJSONArray.put(h());
    localJSONArray.put(h);
    localJSONArray.put(c);
    paramJSONObject.put("extinfo", localJSONArray.toString());
  }
  
  private static boolean a(Context paramContext, String paramString)
  {
    boolean bool = false;
    try
    {
      int i = android.support.v4.content.m.a(paramContext, paramString);
      if (i == 0) {
        bool = true;
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return bool;
  }
  
  static boolean a(O paramO)
  {
    boolean bool;
    if ((paramO != null) && (paramO.getCode() == 15003)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static <T> boolean a(T paramT1, T paramT2)
  {
    if (paramT1 == null)
    {
      boolean bool;
      if (paramT2 == null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    return paramT1.equals(paramT2);
  }
  
  public static List<String> b(Context paramContext)
  {
    if (c(paramContext))
    {
      ArrayList localArrayList = new ArrayList();
      for (paramContext : AccountManager.get(paramContext).getAccounts()) {
        if ((!e(paramContext.name)) && (Patterns.EMAIL_ADDRESS.matcher(paramContext.name).matches()) && (!localArrayList.contains(paramContext.name))) {
          localArrayList.add(paramContext.name);
        }
      }
      return localArrayList;
    }
    return null;
  }
  
  static ScheduledThreadPoolExecutor b()
  {
    return b;
  }
  
  public static vT b(String paramString)
  {
    if (e(paramString)) {
      return null;
    }
    Object localObject = paramString;
    if (!paramString.startsWith("+"))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("+");
      ((StringBuilder)localObject).append(paramString);
      localObject = ((StringBuilder)localObject).toString();
    }
    try
    {
      paramString = qT.a().a((CharSequence)localObject, "");
      return paramString;
    }
    catch (oT paramString) {}
    return null;
  }
  
  static void b(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    paramJSONObject.put("anon_id", paramString);
  }
  
  static boolean b(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != null) && (paramObject1.equals(paramObject2))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  static String c()
  {
    return Sm.c();
  }
  
  public static jn c(String paramString)
  {
    return a(b(paramString));
  }
  
  static boolean c(Context paramContext)
  {
    return a(paramContext, "android.permission.GET_ACCOUNTS");
  }
  
  public static String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ak");
    localStringBuilder.append(Sm.c());
    localStringBuilder.append("://authorize");
    return localStringBuilder.toString();
  }
  
  /* Error */
  public static String d(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 207	com/facebook/accountkit/internal/va:e	(Ljava/lang/String;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: astore_1
    //   11: aload_0
    //   12: ldc_w 530
    //   15: invokevirtual 533	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   18: ifeq +9 -> 27
    //   21: aload_0
    //   22: iconst_1
    //   23: invokevirtual 561	java/lang/String:substring	(I)Ljava/lang/String;
    //   26: astore_1
    //   27: new 188	java/lang/StringBuilder
    //   30: astore_2
    //   31: aload_2
    //   32: aload_1
    //   33: invokevirtual 166	java/lang/String:length	()I
    //   36: invokespecial 562	java/lang/StringBuilder:<init>	(I)V
    //   39: iconst_0
    //   40: istore_3
    //   41: aconst_null
    //   42: astore_0
    //   43: aload_0
    //   44: astore 4
    //   46: aload_0
    //   47: astore 5
    //   49: iload_3
    //   50: aload_1
    //   51: invokevirtual 166	java/lang/String:length	()I
    //   54: if_icmpge +72 -> 126
    //   57: aload_0
    //   58: astore 4
    //   60: aload_0
    //   61: ifnonnull +65 -> 126
    //   64: aload_0
    //   65: astore 5
    //   67: aload_2
    //   68: aload_1
    //   69: iload_3
    //   70: invokevirtual 566	java/lang/String:charAt	(I)C
    //   73: invokevirtual 569	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload_0
    //   78: astore 5
    //   80: invokestatic 250	qT:a	()LqT;
    //   83: aload_2
    //   84: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokestatic 572	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   90: invokevirtual 575	java/lang/Integer:intValue	()I
    //   93: invokevirtual 577	qT:b	(I)Ljava/lang/String;
    //   96: astore_0
    //   97: aload_0
    //   98: astore 5
    //   100: aload_0
    //   101: ldc_w 579
    //   104: invokevirtual 580	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   107: istore 6
    //   109: iload 6
    //   111: ifeq +5 -> 116
    //   114: aconst_null
    //   115: astore_0
    //   116: iinc 3 1
    //   119: goto -76 -> 43
    //   122: astore_0
    //   123: aconst_null
    //   124: astore 4
    //   126: aload 4
    //   128: areturn
    //   129: astore_0
    //   130: aload 5
    //   132: astore 4
    //   134: goto -8 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	paramString	String
    //   10	59	1	str1	String
    //   30	54	2	localStringBuilder	StringBuilder
    //   40	77	3	i	int
    //   44	89	4	localObject	Object
    //   47	84	5	str2	String
    //   107	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   27	39	122	java/lang/NumberFormatException
    //   49	57	129	java/lang/NumberFormatException
    //   67	77	129	java/lang/NumberFormatException
    //   80	97	129	java/lang/NumberFormatException
    //   100	109	129	java/lang/NumberFormatException
  }
  
  public static boolean d(Context paramContext)
  {
    boolean bool;
    if (e.a().c(paramContext) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Executor e()
  {
    return Sm.i();
  }
  
  static boolean e(Context paramContext)
  {
    return a(paramContext, "android.permission.READ_PHONE_STATE");
  }
  
  public static boolean e(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.length() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean f()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  public static boolean f(Context paramContext)
  {
    return a(paramContext, "android.permission.RECEIVE_SMS");
  }
  
  private static void g()
  {
    try
    {
      if (f())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        c = localStatFs.getAvailableBlocks() * localStatFs.getBlockSize();
      }
      c = a(c);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  static boolean g(Context paramContext)
  {
    boolean bool = false;
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo.flags;
      if ((i & 0x2) != 0) {
        bool = true;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return bool;
  }
  
  private static int h()
  {
    int i = f;
    if (i > 0) {
      return i;
    }
    try
    {
      File localFile = new java/io/File;
      localFile.<init>("/sys/devices/system/cpu/");
      ua localua = new com/facebook/accountkit/internal/ua;
      localua.<init>();
      f = localFile.listFiles(localua).length;
      if (f <= 0) {
        f = Math.max(Runtime.getRuntime().availableProcessors(), 1);
      }
      return f;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  @SuppressLint({"HardwareIds"})
  public static String h(Context paramContext)
  {
    if (e(paramContext))
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null) {
        return paramContext.getLine1Number();
      }
    }
    return null;
  }
  
  private static void i()
  {
    try
    {
      TimeZone localTimeZone = TimeZone.getDefault();
      Date localDate = new java/util/Date;
      localDate.<init>();
      e = localTimeZone.getDisplayName(localTimeZone.inDaylightTime(localDate), 0);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static void i(Context paramContext)
  {
    if (d.equals("NoCarrier")) {}
    try
    {
      d = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  private static void j()
  {
    try
    {
      if (f())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        h = localStatFs.getBlockCount() * localStatFs.getBlockSize();
      }
      h = a(h);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static void j(Context paramContext)
  {
    if ((g == -1L) || (System.currentTimeMillis() - g >= 1800000L))
    {
      g = System.currentTimeMillis();
      i();
      i(paramContext);
      j();
      g();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */