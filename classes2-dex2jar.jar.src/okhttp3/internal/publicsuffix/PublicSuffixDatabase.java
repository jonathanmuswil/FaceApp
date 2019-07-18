package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase
{
  private static final byte[] a = { 42 };
  private static final String[] b = new String[0];
  private static final String[] c = { "*" };
  private static final PublicSuffixDatabase d = new PublicSuffixDatabase();
  private final AtomicBoolean e = new AtomicBoolean(false);
  private final CountDownLatch f = new CountDownLatch(1);
  private byte[] g;
  private byte[] h;
  
  private static String a(byte[] paramArrayOfByte, byte[][] paramArrayOfByte1, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = 0;
    if (j < i)
    {
      for (int k = (j + i) / 2; (k > -1) && (paramArrayOfByte[k] != 10); k--) {}
      int m = k + 1;
      int n;
      for (k = 1;; k++)
      {
        n = m + k;
        if (paramArrayOfByte[n] == 10) {
          break;
        }
      }
      int i1 = n - m;
      int i2 = paramInt;
      int i3 = 0;
      k = 0;
      int i4 = 0;
      for (;;)
      {
        int i5;
        if (i3 != 0)
        {
          i3 = 0;
          i5 = 46;
        }
        else
        {
          i5 = paramArrayOfByte1[i2][k] & 0xFF;
        }
        int i6 = i5 - (paramArrayOfByte[(m + i4)] & 0xFF);
        if (i6 == 0)
        {
          i5 = i4 + 1;
          int i7 = k + 1;
          if (i5 == i1)
          {
            k = i7;
            i4 = i5;
          }
          else
          {
            k = i7;
            i4 = i5;
            if (paramArrayOfByte1[i2].length != i7) {
              continue;
            }
            if (i2 != paramArrayOfByte1.length - 1) {
              break label314;
            }
            i4 = i5;
            k = i7;
          }
        }
        if (i6 < 0)
        {
          label213:
          i = m - 1;
          break;
        }
        if (i6 > 0) {}
        do
        {
          j = n + 1;
          break;
          i4 = i1 - i4;
          k = paramArrayOfByte1[i2].length - k;
          for (;;)
          {
            i2++;
            if (i2 >= paramArrayOfByte1.length) {
              break;
            }
            k += paramArrayOfByte1[i2].length;
          }
          if (k < i4) {
            break label213;
          }
        } while (k > i4);
        return new String(paramArrayOfByte, m, i1, StandardCharsets.UTF_8);
        label314:
        i2++;
        i3 = 1;
        k = -1;
        i4 = i5;
      }
    }
    paramArrayOfByte = null;
    return paramArrayOfByte;
  }
  
  public static PublicSuffixDatabase a()
  {
    return d;
  }
  
  private String[] a(String[] paramArrayOfString)
  {
    boolean bool = this.e.get();
    int i = 0;
    if ((!bool) && (this.e.compareAndSet(false, true))) {
      c();
    } else {
      try
      {
        this.f.await();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
    }
    try
    {
      if (this.g != null)
      {
        byte[][] arrayOfByte = new byte[paramArrayOfString.length][];
        for (int j = 0; j < paramArrayOfString.length; j++) {
          arrayOfByte[j] = paramArrayOfString[j].getBytes(StandardCharsets.UTF_8);
        }
        for (j = 0; j < arrayOfByte.length; j++)
        {
          paramArrayOfString = a(this.g, arrayOfByte, j);
          if (paramArrayOfString != null) {
            break label138;
          }
        }
        paramArrayOfString = null;
        label138:
        if (arrayOfByte.length > 1)
        {
          localObject2 = (byte[][])arrayOfByte.clone();
          for (j = 0; j < localObject2.length - 1; j++)
          {
            localObject2[j] = a;
            localObject1 = a(this.g, (byte[][])localObject2, j);
            if (localObject1 != null) {
              break label206;
            }
          }
        }
        Object localObject1 = null;
        label206:
        if (localObject1 != null) {
          for (j = i; j < arrayOfByte.length - 1; j++)
          {
            localObject2 = a(this.h, arrayOfByte, j);
            if (localObject2 != null) {
              break label254;
            }
          }
        }
        Object localObject2 = null;
        label254:
        if (localObject2 != null)
        {
          paramArrayOfString = new StringBuilder();
          paramArrayOfString.append("!");
          paramArrayOfString.append((String)localObject2);
          return paramArrayOfString.toString().split("\\.");
        }
        if ((paramArrayOfString == null) && (localObject1 == null)) {
          return c;
        }
        if (paramArrayOfString != null) {
          paramArrayOfString = paramArrayOfString.split("\\.");
        } else {
          paramArrayOfString = b;
        }
        if (localObject1 != null) {
          localObject1 = ((String)localObject1).split("\\.");
        } else {
          localObject1 = b;
        }
        if (paramArrayOfString.length <= localObject1.length) {
          paramArrayOfString = (String[])localObject1;
        }
        return paramArrayOfString;
      }
      paramArrayOfString = new java/lang/IllegalStateException;
      paramArrayOfString.<init>("Unable to load publicsuffixes.gz resource from the classpath.");
      throw paramArrayOfString;
    }
    finally {}
  }
  
  /* Error */
  private void b()
    throws java.io.IOException
  {
    // Byte code:
    //   0: ldc 2
    //   2: ldc -121
    //   4: invokevirtual 141	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnonnull +4 -> 13
    //   12: return
    //   13: new 143	qab
    //   16: dup
    //   17: aload_1
    //   18: invokestatic 148	vab:a	(Ljava/io/InputStream;)LEab;
    //   21: invokespecial 151	qab:<init>	(LEab;)V
    //   24: invokestatic 154	vab:a	(LEab;)Llab;
    //   27: astore_2
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_3
    //   31: astore_1
    //   32: aload_2
    //   33: invokeinterface 160 1 0
    //   38: newarray <illegal type>
    //   40: astore 4
    //   42: aload_3
    //   43: astore_1
    //   44: aload_2
    //   45: aload 4
    //   47: invokeinterface 164 2 0
    //   52: aload_3
    //   53: astore_1
    //   54: aload_2
    //   55: invokeinterface 160 1 0
    //   60: newarray <illegal type>
    //   62: astore 5
    //   64: aload_3
    //   65: astore_1
    //   66: aload_2
    //   67: aload 5
    //   69: invokeinterface 164 2 0
    //   74: aload_2
    //   75: ifnull +9 -> 84
    //   78: aload_2
    //   79: invokeinterface 169 1 0
    //   84: aload_0
    //   85: monitorenter
    //   86: aload_0
    //   87: aload 4
    //   89: putfield 88	okhttp3/internal/publicsuffix/PublicSuffixDatabase:g	[B
    //   92: aload_0
    //   93: aload 5
    //   95: putfield 103	okhttp3/internal/publicsuffix/PublicSuffixDatabase:h	[B
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_0
    //   101: getfield 50	okhttp3/internal/publicsuffix/PublicSuffixDatabase:f	Ljava/util/concurrent/CountDownLatch;
    //   104: invokevirtual 172	java/util/concurrent/CountDownLatch:countDown	()V
    //   107: return
    //   108: astore_1
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_1
    //   112: athrow
    //   113: astore_3
    //   114: goto +8 -> 122
    //   117: astore_3
    //   118: aload_3
    //   119: astore_1
    //   120: aload_3
    //   121: athrow
    //   122: aload_2
    //   123: ifnull +31 -> 154
    //   126: aload_1
    //   127: ifnull +21 -> 148
    //   130: aload_2
    //   131: invokeinterface 169 1 0
    //   136: goto +18 -> 154
    //   139: astore_2
    //   140: aload_1
    //   141: aload_2
    //   142: invokevirtual 176	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   145: goto +9 -> 154
    //   148: aload_2
    //   149: invokeinterface 169 1 0
    //   154: aload_3
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	PublicSuffixDatabase
    //   7	59	1	localObject1	Object
    //   108	4	1	localObject2	Object
    //   119	22	1	localObject3	Object
    //   27	104	2	locallab	lab
    //   139	10	2	localThrowable1	Throwable
    //   29	36	3	localObject4	Object
    //   113	1	3	localObject5	Object
    //   117	38	3	localThrowable2	Throwable
    //   40	48	4	arrayOfByte1	byte[]
    //   62	32	5	arrayOfByte2	byte[]
    // Exception table:
    //   from	to	target	type
    //   86	100	108	finally
    //   109	111	108	finally
    //   32	42	113	finally
    //   44	52	113	finally
    //   54	64	113	finally
    //   66	74	113	finally
    //   120	122	113	finally
    //   32	42	117	java/lang/Throwable
    //   44	52	117	java/lang/Throwable
    //   54	64	117	java/lang/Throwable
    //   66	74	117	java/lang/Throwable
    //   130	136	139	java/lang/Throwable
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokespecial 181	okhttp3/internal/publicsuffix/PublicSuffixDatabase:b	()V
    //   6: iload_1
    //   7: ifeq +9 -> 16
    //   10: invokestatic 83	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   13: invokevirtual 86	java/lang/Thread:interrupt	()V
    //   16: return
    //   17: astore_2
    //   18: goto +35 -> 53
    //   21: astore_2
    //   22: invokestatic 186	U_a:a	()LU_a;
    //   25: iconst_5
    //   26: ldc -68
    //   28: aload_2
    //   29: invokevirtual 191	U_a:a	(ILjava/lang/String;Ljava/lang/Throwable;)V
    //   32: iload_1
    //   33: ifeq +9 -> 42
    //   36: invokestatic 83	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   39: invokevirtual 86	java/lang/Thread:interrupt	()V
    //   42: return
    //   43: astore_2
    //   44: invokestatic 194	java/lang/Thread:interrupted	()Z
    //   47: pop
    //   48: iconst_1
    //   49: istore_1
    //   50: goto -48 -> 2
    //   53: iload_1
    //   54: ifeq +9 -> 63
    //   57: invokestatic 83	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   60: invokevirtual 86	java/lang/Thread:interrupt	()V
    //   63: aload_2
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	PublicSuffixDatabase
    //   1	53	1	i	int
    //   17	1	2	localObject	Object
    //   21	8	2	localIOException	java.io.IOException
    //   43	21	2	localInterruptedIOException	java.io.InterruptedIOException
    // Exception table:
    //   from	to	target	type
    //   2	6	17	finally
    //   22	32	17	finally
    //   44	48	17	finally
    //   2	6	21	java/io/IOException
    //   2	6	43	java/io/InterruptedIOException
  }
  
  public String a(String paramString)
  {
    if (paramString != null)
    {
      Object localObject = IDN.toUnicode(paramString).split("\\.");
      String[] arrayOfString = a((String[])localObject);
      if ((localObject.length == arrayOfString.length) && (arrayOfString[0].charAt(0) != '!')) {
        return null;
      }
      int i;
      if (arrayOfString[0].charAt(0) == '!')
      {
        i = localObject.length;
        j = arrayOfString.length;
      }
      else
      {
        i = localObject.length;
        j = arrayOfString.length + 1;
      }
      int j = i - j;
      localObject = new StringBuilder();
      paramString = paramString.split("\\.");
      while (j < paramString.length)
      {
        ((StringBuilder)localObject).append(paramString[j]);
        ((StringBuilder)localObject).append('.');
        j++;
      }
      ((StringBuilder)localObject).deleteCharAt(((StringBuilder)localObject).length() - 1);
      return ((StringBuilder)localObject).toString();
    }
    throw new NullPointerException("domain == null");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/okhttp3/internal/publicsuffix/PublicSuffixDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */