import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;

class vc
  extends Bc
{
  private File a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("/proc/self/fd/");
      localStringBuilder.append(paramParcelFileDescriptor.getFd());
      paramParcelFileDescriptor = Os.readlink(localStringBuilder.toString());
      if (OsConstants.S_ISREG(Os.stat(paramParcelFileDescriptor).st_mode))
      {
        paramParcelFileDescriptor = new File(paramParcelFileDescriptor);
        return paramParcelFileDescriptor;
      }
    }
    catch (ErrnoException paramParcelFileDescriptor)
    {
      for (;;) {}
    }
    return null;
  }
  
  /* Error */
  public android.graphics.Typeface a(android.content.Context paramContext, android.os.CancellationSignal paramCancellationSignal, Vc.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: aload_3
    //   10: iload 4
    //   12: invokevirtual 70	Bc:a	([LVc$b;I)LVc$b;
    //   15: astore_3
    //   16: aload_1
    //   17: invokevirtual 76	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore 5
    //   22: aload 5
    //   24: aload_3
    //   25: invokevirtual 82	Vc$b:c	()Landroid/net/Uri;
    //   28: ldc 84
    //   30: aload_2
    //   31: invokevirtual 90	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   34: astore_3
    //   35: aload_0
    //   36: aload_3
    //   37: invokespecial 92	vc:a	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   40: astore_2
    //   41: aload_2
    //   42: ifnull +28 -> 70
    //   45: aload_2
    //   46: invokevirtual 96	java/io/File:canRead	()Z
    //   49: ifne +6 -> 55
    //   52: goto +18 -> 70
    //   55: aload_2
    //   56: invokestatic 102	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   59: astore_1
    //   60: aload_3
    //   61: ifnull +7 -> 68
    //   64: aload_3
    //   65: invokevirtual 105	android/os/ParcelFileDescriptor:close	()V
    //   68: aload_1
    //   69: areturn
    //   70: new 107	java/io/FileInputStream
    //   73: astore 5
    //   75: aload 5
    //   77: aload_3
    //   78: invokevirtual 111	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   81: invokespecial 114	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   84: aload_0
    //   85: aload_1
    //   86: aload 5
    //   88: invokespecial 117	Bc:a	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   91: astore_1
    //   92: aload 5
    //   94: invokevirtual 118	java/io/FileInputStream:close	()V
    //   97: aload_3
    //   98: ifnull +7 -> 105
    //   101: aload_3
    //   102: invokevirtual 105	android/os/ParcelFileDescriptor:close	()V
    //   105: aload_1
    //   106: areturn
    //   107: astore_1
    //   108: aconst_null
    //   109: astore_2
    //   110: goto +7 -> 117
    //   113: astore_2
    //   114: aload_2
    //   115: athrow
    //   116: astore_1
    //   117: aload_2
    //   118: ifnull +22 -> 140
    //   121: aload 5
    //   123: invokevirtual 118	java/io/FileInputStream:close	()V
    //   126: goto +19 -> 145
    //   129: astore 5
    //   131: aload_2
    //   132: aload 5
    //   134: invokevirtual 122	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   137: goto +8 -> 145
    //   140: aload 5
    //   142: invokevirtual 118	java/io/FileInputStream:close	()V
    //   145: aload_1
    //   146: athrow
    //   147: astore_1
    //   148: aconst_null
    //   149: astore_2
    //   150: goto +7 -> 157
    //   153: astore_2
    //   154: aload_2
    //   155: athrow
    //   156: astore_1
    //   157: aload_3
    //   158: ifnull +27 -> 185
    //   161: aload_2
    //   162: ifnull +19 -> 181
    //   165: aload_3
    //   166: invokevirtual 105	android/os/ParcelFileDescriptor:close	()V
    //   169: goto +16 -> 185
    //   172: astore_3
    //   173: aload_2
    //   174: aload_3
    //   175: invokevirtual 122	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   178: goto +7 -> 185
    //   181: aload_3
    //   182: invokevirtual 105	android/os/ParcelFileDescriptor:close	()V
    //   185: aload_1
    //   186: athrow
    //   187: astore_1
    //   188: aconst_null
    //   189: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	vc
    //   0	190	1	paramContext	android.content.Context
    //   0	190	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	190	3	paramArrayOfb	Vc.b[]
    //   0	190	4	paramInt	int
    //   20	102	5	localObject	Object
    //   129	12	5	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   84	92	107	finally
    //   84	92	113	java/lang/Throwable
    //   114	116	116	finally
    //   121	126	129	java/lang/Throwable
    //   35	41	147	finally
    //   45	52	147	finally
    //   55	60	147	finally
    //   70	84	147	finally
    //   92	97	147	finally
    //   121	126	147	finally
    //   131	137	147	finally
    //   140	145	147	finally
    //   145	147	147	finally
    //   35	41	153	java/lang/Throwable
    //   45	52	153	java/lang/Throwable
    //   55	60	153	java/lang/Throwable
    //   70	84	153	java/lang/Throwable
    //   92	97	153	java/lang/Throwable
    //   131	137	153	java/lang/Throwable
    //   140	145	153	java/lang/Throwable
    //   145	147	153	java/lang/Throwable
    //   154	156	156	finally
    //   165	169	172	java/lang/Throwable
    //   22	35	187	java/io/IOException
    //   64	68	187	java/io/IOException
    //   101	105	187	java/io/IOException
    //   173	178	187	java/io/IOException
    //   181	185	187	java/io/IOException
    //   185	187	187	java/io/IOException
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */