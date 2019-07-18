import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

class of
{
  private static final kf a = new kf();
  private final kf b;
  private final nf c;
  private final bg d;
  private final ContentResolver e;
  private final List<ImageHeaderParser> f;
  
  of(List<ImageHeaderParser> paramList, kf paramkf, nf paramnf, bg parambg, ContentResolver paramContentResolver)
  {
    this.b = paramkf;
    this.c = paramnf;
    this.d = parambg;
    this.e = paramContentResolver;
    this.f = paramList;
  }
  
  of(List<ImageHeaderParser> paramList, nf paramnf, bg parambg, ContentResolver paramContentResolver)
  {
    this(paramList, a, paramnf, parambg, paramContentResolver);
  }
  
  private boolean a(File paramFile)
  {
    boolean bool;
    if ((this.b.a(paramFile)) && (0L < this.b.b(paramFile))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private String c(Uri paramUri)
  {
    paramUri = this.c.a(paramUri);
    if (paramUri != null) {
      try
      {
        if (paramUri.moveToFirst())
        {
          String str = paramUri.getString(0);
          return str;
        }
      }
      finally
      {
        if (paramUri != null) {
          paramUri.close();
        }
      }
    }
    if (paramUri != null) {
      paramUri.close();
    }
    return null;
  }
  
  /* Error */
  int a(Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: aload_0
    //   8: getfield 36	of:e	Landroid/content/ContentResolver;
    //   11: aload_1
    //   12: invokevirtual 80	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   15: astore 5
    //   17: aload 5
    //   19: astore 4
    //   21: aload 5
    //   23: astore_2
    //   24: aload 5
    //   26: astore_3
    //   27: aload_0
    //   28: getfield 38	of:f	Ljava/util/List;
    //   31: aload 5
    //   33: aload_0
    //   34: getfield 34	of:d	Lbg;
    //   37: invokestatic 85	com/bumptech/glide/load/f:a	(Ljava/util/List;Ljava/io/InputStream;Lbg;)I
    //   40: istore 6
    //   42: aload 5
    //   44: ifnull +8 -> 52
    //   47: aload 5
    //   49: invokevirtual 88	java/io/InputStream:close	()V
    //   52: iload 6
    //   54: ireturn
    //   55: astore_1
    //   56: goto +82 -> 138
    //   59: astore 5
    //   61: goto +7 -> 68
    //   64: astore 5
    //   66: aload_3
    //   67: astore_2
    //   68: aload_2
    //   69: astore 4
    //   71: ldc 90
    //   73: iconst_3
    //   74: invokestatic 96	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   77: ifeq +51 -> 128
    //   80: aload_2
    //   81: astore 4
    //   83: new 98	java/lang/StringBuilder
    //   86: astore_3
    //   87: aload_2
    //   88: astore 4
    //   90: aload_3
    //   91: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   94: aload_2
    //   95: astore 4
    //   97: aload_3
    //   98: ldc 101
    //   100: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_2
    //   105: astore 4
    //   107: aload_3
    //   108: aload_1
    //   109: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload_2
    //   114: astore 4
    //   116: ldc 90
    //   118: aload_3
    //   119: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: aload 5
    //   124: invokestatic 115	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   127: pop
    //   128: aload_2
    //   129: ifnull +7 -> 136
    //   132: aload_2
    //   133: invokevirtual 88	java/io/InputStream:close	()V
    //   136: iconst_m1
    //   137: ireturn
    //   138: aload 4
    //   140: ifnull +8 -> 148
    //   143: aload 4
    //   145: invokevirtual 88	java/io/InputStream:close	()V
    //   148: aload_1
    //   149: athrow
    //   150: astore_1
    //   151: goto -99 -> 52
    //   154: astore_1
    //   155: goto -19 -> 136
    //   158: astore 4
    //   160: goto -12 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	of
    //   0	163	1	paramUri	Uri
    //   1	132	2	localObject1	Object
    //   3	116	3	localObject2	Object
    //   5	139	4	localObject3	Object
    //   158	1	4	localIOException1	java.io.IOException
    //   15	33	5	localInputStream	InputStream
    //   59	1	5	localNullPointerException	NullPointerException
    //   64	59	5	localIOException2	java.io.IOException
    //   40	13	6	i	int
    // Exception table:
    //   from	to	target	type
    //   7	17	55	finally
    //   27	42	55	finally
    //   71	80	55	finally
    //   83	87	55	finally
    //   90	94	55	finally
    //   97	104	55	finally
    //   107	113	55	finally
    //   116	128	55	finally
    //   7	17	59	java/lang/NullPointerException
    //   27	42	59	java/lang/NullPointerException
    //   7	17	64	java/io/IOException
    //   27	42	64	java/io/IOException
    //   47	52	150	java/io/IOException
    //   132	136	154	java/io/IOException
    //   143	148	158	java/io/IOException
  }
  
  public InputStream b(Uri paramUri)
    throws FileNotFoundException
  {
    Object localObject1 = c(paramUri);
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      return null;
    }
    localObject1 = this.b.a((String)localObject1);
    if (!a((File)localObject1)) {
      return null;
    }
    localObject1 = Uri.fromFile((File)localObject1);
    try
    {
      localObject2 = this.e.openInputStream((Uri)localObject1);
      return (InputStream)localObject2;
    }
    catch (NullPointerException localNullPointerException)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("NPE opening uri: ");
      ((StringBuilder)localObject2).append(paramUri);
      ((StringBuilder)localObject2).append(" -> ");
      ((StringBuilder)localObject2).append(localObject1);
      throw ((FileNotFoundException)new FileNotFoundException(((StringBuilder)localObject2).toString()).initCause(localNullPointerException));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/of.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */