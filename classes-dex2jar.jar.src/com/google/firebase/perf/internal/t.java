package com.google.firebase.perf.internal;

import Bv;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import iv;
import java.util.Iterator;
import java.util.List;

final class t
{
  private final Runtime a;
  private final ActivityManager b;
  private final ActivityManager.MemoryInfo c;
  private final String d;
  private final Context e;
  
  t(Context paramContext)
  {
    this(Runtime.getRuntime(), paramContext);
  }
  
  private t(Runtime paramRuntime, Context paramContext)
  {
    this.a = paramRuntime;
    this.e = paramContext;
    this.b = ((ActivityManager)paramContext.getSystemService("activity"));
    this.c = new ActivityManager.MemoryInfo();
    this.b.getMemoryInfo(this.c);
    int i = Process.myPid();
    paramRuntime = this.b.getRunningAppProcesses();
    if (paramRuntime != null)
    {
      paramContext = paramRuntime.iterator();
      while (paramContext.hasNext())
      {
        paramRuntime = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if (paramRuntime.pid == i)
        {
          paramRuntime = paramRuntime.processName;
          break label115;
        }
      }
    }
    paramRuntime = this.e.getPackageName();
    label115:
    this.d = paramRuntime;
  }
  
  /* Error */
  private static int a(String paramString)
  {
    // Byte code:
    //   0: new 104	java/io/BufferedReader
    //   3: astore_1
    //   4: new 106	java/io/FileReader
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokespecial 109	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   13: aload_1
    //   14: aload_2
    //   15: invokespecial 112	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   18: aconst_null
    //   19: astore_3
    //   20: aload_3
    //   21: astore_2
    //   22: aload_1
    //   23: invokevirtual 115	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   26: astore 4
    //   28: aload 4
    //   30: ifnull +75 -> 105
    //   33: aload_3
    //   34: astore_2
    //   35: aload 4
    //   37: ldc 117
    //   39: invokevirtual 123	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   42: ifeq +52 -> 94
    //   45: aload_3
    //   46: astore_2
    //   47: ldc 125
    //   49: invokestatic 131	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   52: aload 4
    //   54: invokevirtual 135	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   57: astore 4
    //   59: aload_3
    //   60: astore_2
    //   61: aload 4
    //   63: invokevirtual 140	java/util/regex/Matcher:find	()Z
    //   66: ifeq +18 -> 84
    //   69: aload_3
    //   70: astore_2
    //   71: aload 4
    //   73: invokevirtual 143	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   76: invokestatic 148	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   79: istore 5
    //   81: goto +6 -> 87
    //   84: iconst_0
    //   85: istore 5
    //   87: aload_1
    //   88: invokevirtual 151	java/io/BufferedReader:close	()V
    //   91: iload 5
    //   93: ireturn
    //   94: aload_3
    //   95: astore_2
    //   96: aload_1
    //   97: invokevirtual 115	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   100: astore 4
    //   102: goto -74 -> 28
    //   105: aload_1
    //   106: invokevirtual 151	java/io/BufferedReader:close	()V
    //   109: goto +194 -> 303
    //   112: astore 4
    //   114: goto +11 -> 125
    //   117: astore 4
    //   119: aload 4
    //   121: astore_2
    //   122: aload 4
    //   124: athrow
    //   125: aload_2
    //   126: ifnull +19 -> 145
    //   129: aload_1
    //   130: invokevirtual 151	java/io/BufferedReader:close	()V
    //   133: goto +16 -> 149
    //   136: astore_3
    //   137: aload_2
    //   138: aload_3
    //   139: invokestatic 156	jv:a	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   142: goto +7 -> 149
    //   145: aload_1
    //   146: invokevirtual 151	java/io/BufferedReader:close	()V
    //   149: aload 4
    //   151: athrow
    //   152: astore_2
    //   153: aload_2
    //   154: invokevirtual 159	java/lang/NumberFormatException:getMessage	()Ljava/lang/String;
    //   157: astore_2
    //   158: new 161	java/lang/StringBuilder
    //   161: dup
    //   162: aload_0
    //   163: invokestatic 165	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   166: invokevirtual 168	java/lang/String:length	()I
    //   169: bipush 25
    //   171: iadd
    //   172: aload_2
    //   173: invokestatic 165	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   176: invokevirtual 168	java/lang/String:length	()I
    //   179: iadd
    //   180: invokespecial 171	java/lang/StringBuilder:<init>	(I)V
    //   183: astore 4
    //   185: aload 4
    //   187: ldc -83
    //   189: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload 4
    //   195: aload_0
    //   196: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: aload 4
    //   202: ldc -77
    //   204: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: aload 4
    //   210: aload_2
    //   211: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: ldc -75
    //   217: aload 4
    //   219: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: invokestatic 190	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   225: pop
    //   226: goto +77 -> 303
    //   229: astore_2
    //   230: aload_2
    //   231: invokevirtual 191	java/io/IOException:getMessage	()Ljava/lang/String;
    //   234: astore_2
    //   235: new 161	java/lang/StringBuilder
    //   238: dup
    //   239: aload_0
    //   240: invokestatic 165	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   243: invokevirtual 168	java/lang/String:length	()I
    //   246: bipush 24
    //   248: iadd
    //   249: aload_2
    //   250: invokestatic 165	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   253: invokevirtual 168	java/lang/String:length	()I
    //   256: iadd
    //   257: invokespecial 171	java/lang/StringBuilder:<init>	(I)V
    //   260: astore 4
    //   262: aload 4
    //   264: ldc -63
    //   266: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: pop
    //   270: aload 4
    //   272: aload_0
    //   273: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: pop
    //   277: aload 4
    //   279: ldc -77
    //   281: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: pop
    //   285: aload 4
    //   287: aload_2
    //   288: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: ldc -75
    //   294: aload 4
    //   296: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokestatic 190	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   302: pop
    //   303: iconst_0
    //   304: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	305	0	paramString	String
    //   3	143	1	localBufferedReader	java.io.BufferedReader
    //   7	131	2	localObject1	Object
    //   152	2	2	localNumberFormatException	NumberFormatException
    //   157	54	2	str1	String
    //   229	2	2	localIOException	java.io.IOException
    //   234	54	2	str2	String
    //   19	76	3	localObject2	Object
    //   136	3	3	localThrowable1	Throwable
    //   26	75	4	localObject3	Object
    //   112	1	4	localObject4	Object
    //   117	33	4	localThrowable2	Throwable
    //   183	112	4	localStringBuilder	StringBuilder
    //   79	13	5	i	int
    // Exception table:
    //   from	to	target	type
    //   22	28	112	finally
    //   35	45	112	finally
    //   47	59	112	finally
    //   61	69	112	finally
    //   71	81	112	finally
    //   96	102	112	finally
    //   122	125	112	finally
    //   22	28	117	java/lang/Throwable
    //   35	45	117	java/lang/Throwable
    //   47	59	117	java/lang/Throwable
    //   61	69	117	java/lang/Throwable
    //   71	81	117	java/lang/Throwable
    //   96	102	117	java/lang/Throwable
    //   129	133	136	java/lang/Throwable
    //   0	18	152	java/lang/NumberFormatException
    //   87	91	152	java/lang/NumberFormatException
    //   105	109	152	java/lang/NumberFormatException
    //   137	142	152	java/lang/NumberFormatException
    //   145	149	152	java/lang/NumberFormatException
    //   149	152	152	java/lang/NumberFormatException
    //   0	18	229	java/io/IOException
    //   87	91	229	java/io/IOException
    //   105	109	229	java/io/IOException
    //   137	142	229	java/io/IOException
    //   145	149	229	java/io/IOException
    //   149	152	229	java/io/IOException
  }
  
  public final String a()
  {
    return this.d;
  }
  
  public final int b()
  {
    return iv.a(Bv.e.a(this.a.maxMemory()));
  }
  
  public final int c()
  {
    return iv.a(Bv.c.a(this.b.getMemoryClass()));
  }
  
  public final int d()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return iv.a(Bv.e.a(this.c.totalMem));
    }
    return a("/proc/meminfo");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */