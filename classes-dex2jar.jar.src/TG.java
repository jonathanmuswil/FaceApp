import android.util.Log;
import com.bumptech.glide.load.g;
import java.io.File;
import java.io.IOException;

public class tg
  implements pg
{
  private final Ag a;
  private final File b;
  private final long c;
  private final rg d = new rg();
  private Ne e;
  
  @Deprecated
  protected tg(File paramFile, long paramLong)
  {
    this.b = paramFile;
    this.c = paramLong;
    this.a = new Ag();
  }
  
  private Ne a()
    throws IOException
  {
    try
    {
      if (this.e == null) {
        this.e = Ne.a(this.b, 1, 1, this.c);
      }
      Ne localNe = this.e;
      return localNe;
    }
    finally {}
  }
  
  public static pg a(File paramFile, long paramLong)
  {
    return new tg(paramFile, paramLong);
  }
  
  public File a(g paramg)
  {
    Object localObject = this.a.a(paramg);
    if (Log.isLoggable("DiskLruCacheWrapper", 2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Get: Obtained: ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" for for Key: ");
      localStringBuilder.append(paramg);
      Log.v("DiskLruCacheWrapper", localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = null;
    try
    {
      localObject = a().c((String)localObject);
      paramg = localStringBuilder;
      if (localObject != null) {
        paramg = ((Ne.d)localObject).a(0);
      }
    }
    catch (IOException localIOException)
    {
      paramg = localStringBuilder;
      if (Log.isLoggable("DiskLruCacheWrapper", 5))
      {
        Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", localIOException);
        paramg = localStringBuilder;
      }
    }
    return paramg;
  }
  
  /* Error */
  public void a(g paramg, pg.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	tg:a	LAg;
    //   4: aload_1
    //   5: invokevirtual 56	Ag:a	(Lcom/bumptech/glide/load/g;)Ljava/lang/String;
    //   8: astore_3
    //   9: aload_0
    //   10: getfield 27	tg:d	Lrg;
    //   13: aload_3
    //   14: invokevirtual 106	rg:a	(Ljava/lang/String;)V
    //   17: ldc 58
    //   19: iconst_2
    //   20: invokestatic 64	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   23: ifeq +54 -> 77
    //   26: new 66	java/lang/StringBuilder
    //   29: astore 4
    //   31: aload 4
    //   33: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   36: aload 4
    //   38: ldc 108
    //   40: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload 4
    //   46: aload_3
    //   47: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload 4
    //   53: ldc 75
    //   55: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload 4
    //   61: aload_1
    //   62: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: ldc 58
    //   68: aload 4
    //   70: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokestatic 86	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   76: pop
    //   77: aload_0
    //   78: invokespecial 88	tg:a	()LNe;
    //   81: astore_1
    //   82: aload_1
    //   83: aload_3
    //   84: invokevirtual 91	Ne:c	(Ljava/lang/String;)LNe$d;
    //   87: astore 4
    //   89: aload 4
    //   91: ifnull +12 -> 103
    //   94: aload_0
    //   95: getfield 27	tg:d	Lrg;
    //   98: aload_3
    //   99: invokevirtual 110	rg:b	(Ljava/lang/String;)V
    //   102: return
    //   103: aload_1
    //   104: aload_3
    //   105: invokevirtual 113	Ne:b	(Ljava/lang/String;)LNe$b;
    //   108: astore_1
    //   109: aload_1
    //   110: ifnull +35 -> 145
    //   113: aload_2
    //   114: aload_1
    //   115: iconst_0
    //   116: invokevirtual 116	Ne$b:a	(I)Ljava/io/File;
    //   119: invokeinterface 121 2 0
    //   124: ifeq +7 -> 131
    //   127: aload_1
    //   128: invokevirtual 123	Ne$b:c	()V
    //   131: aload_1
    //   132: invokevirtual 125	Ne$b:b	()V
    //   135: goto +64 -> 199
    //   138: astore_2
    //   139: aload_1
    //   140: invokevirtual 125	Ne$b:b	()V
    //   143: aload_2
    //   144: athrow
    //   145: new 127	java/lang/IllegalStateException
    //   148: astore_2
    //   149: new 66	java/lang/StringBuilder
    //   152: astore_1
    //   153: aload_1
    //   154: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   157: aload_1
    //   158: ldc -127
    //   160: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload_1
    //   165: aload_3
    //   166: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload_2
    //   171: aload_1
    //   172: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokespecial 131	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   178: aload_2
    //   179: athrow
    //   180: astore_1
    //   181: ldc 58
    //   183: iconst_5
    //   184: invokestatic 64	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   187: ifeq +12 -> 199
    //   190: ldc 58
    //   192: ldc -123
    //   194: aload_1
    //   195: invokestatic 102	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   198: pop
    //   199: aload_0
    //   200: getfield 27	tg:d	Lrg;
    //   203: aload_3
    //   204: invokevirtual 110	rg:b	(Ljava/lang/String;)V
    //   207: return
    //   208: astore_1
    //   209: aload_0
    //   210: getfield 27	tg:d	Lrg;
    //   213: aload_3
    //   214: invokevirtual 110	rg:b	(Ljava/lang/String;)V
    //   217: aload_1
    //   218: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	this	tg
    //   0	219	1	paramg	g
    //   0	219	2	paramb	pg.b
    //   8	206	3	str	String
    //   29	61	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   113	131	138	finally
    //   77	89	180	java/io/IOException
    //   103	109	180	java/io/IOException
    //   131	135	180	java/io/IOException
    //   139	145	180	java/io/IOException
    //   145	180	180	java/io/IOException
    //   17	77	208	finally
    //   77	89	208	finally
    //   103	109	208	finally
    //   131	135	208	finally
    //   139	145	208	finally
    //   145	180	208	finally
    //   181	199	208	finally
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */