import java.io.File;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class cm
{
  private static final Charset a = Charset.forName("UTF-8");
  private final File b;
  
  public cm(File paramFile)
  {
    this.b = paramFile;
  }
  
  private static String a(Map<String, String> paramMap)
    throws JSONException
  {
    return new JSONObject(paramMap).toString();
  }
  
  private static String a(JSONObject paramJSONObject, String paramString)
  {
    boolean bool = paramJSONObject.isNull(paramString);
    String str = null;
    if (!bool) {
      str = paramJSONObject.optString(paramString, null);
    }
    return str;
  }
  
  private static ym d(String paramString)
    throws JSONException
  {
    paramString = new JSONObject(paramString);
    return new ym(a(paramString, "userId"), a(paramString, "userName"), a(paramString, "userEmail"));
  }
  
  public File a(String paramString)
  {
    File localFile = this.b;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("keys");
    localStringBuilder.append(".meta");
    return new File(localFile, localStringBuilder.toString());
  }
  
  /* Error */
  public void a(String paramString, Map<String, String> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 92	cm:a	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aconst_null
    //   10: astore 5
    //   12: aload 5
    //   14: astore_1
    //   15: aload_2
    //   16: invokestatic 94	cm:a	(Ljava/util/Map;)Ljava/lang/String;
    //   19: astore 6
    //   21: aload 5
    //   23: astore_1
    //   24: new 96	java/io/BufferedWriter
    //   27: astore_2
    //   28: aload 5
    //   30: astore_1
    //   31: new 98	java/io/OutputStreamWriter
    //   34: astore 7
    //   36: aload 5
    //   38: astore_1
    //   39: new 100	java/io/FileOutputStream
    //   42: astore 8
    //   44: aload 5
    //   46: astore_1
    //   47: aload 8
    //   49: aload_3
    //   50: invokespecial 102	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   53: aload 5
    //   55: astore_1
    //   56: aload 7
    //   58: aload 8
    //   60: getstatic 20	cm:a	Ljava/nio/charset/Charset;
    //   63: invokespecial 105	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   66: aload 5
    //   68: astore_1
    //   69: aload_2
    //   70: aload 7
    //   72: invokespecial 108	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   75: aload_2
    //   76: aload 6
    //   78: invokevirtual 113	java/io/Writer:write	(Ljava/lang/String;)V
    //   81: aload_2
    //   82: invokevirtual 116	java/io/BufferedWriter:flush	()V
    //   85: aload_2
    //   86: ldc 118
    //   88: invokestatic 123	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   91: goto +51 -> 142
    //   94: astore_1
    //   95: goto +48 -> 143
    //   98: astore_1
    //   99: aload_1
    //   100: astore 5
    //   102: goto +18 -> 120
    //   105: astore 5
    //   107: aload_1
    //   108: astore_2
    //   109: aload 5
    //   111: astore_1
    //   112: goto +31 -> 143
    //   115: astore 5
    //   117: aload 4
    //   119: astore_2
    //   120: aload_2
    //   121: astore_1
    //   122: invokestatic 129	Naa:e	()LXaa;
    //   125: ldc -125
    //   127: ldc -123
    //   129: aload 5
    //   131: invokeinterface 138 4 0
    //   136: aload_2
    //   137: ldc 118
    //   139: invokestatic 123	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   142: return
    //   143: aload_2
    //   144: ldc 118
    //   146: invokestatic 123	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   149: aload_1
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	cm
    //   0	151	1	paramString	String
    //   0	151	2	paramMap	Map<String, String>
    //   5	45	3	localFile	File
    //   7	111	4	localObject1	Object
    //   10	91	5	str1	String
    //   105	5	5	localObject2	Object
    //   115	15	5	localException	Exception
    //   19	58	6	str2	String
    //   34	37	7	localOutputStreamWriter	java.io.OutputStreamWriter
    //   42	17	8	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   75	85	94	finally
    //   75	85	98	java/lang/Exception
    //   15	21	105	finally
    //   24	28	105	finally
    //   31	36	105	finally
    //   39	44	105	finally
    //   47	53	105	finally
    //   56	66	105	finally
    //   69	75	105	finally
    //   122	136	105	finally
    //   15	21	115	java/lang/Exception
    //   24	28	115	java/lang/Exception
    //   31	36	115	java/lang/Exception
    //   39	44	115	java/lang/Exception
    //   47	53	115	java/lang/Exception
    //   56	66	115	java/lang/Exception
    //   69	75	115	java/lang/Exception
  }
  
  public File b(String paramString)
  {
    File localFile = this.b;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("user");
    localStringBuilder.append(".meta");
    return new File(localFile, localStringBuilder.toString());
  }
  
  /* Error */
  public ym c(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 144	cm:b	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_2
    //   6: aload_2
    //   7: invokevirtual 148	java/io/File:exists	()Z
    //   10: ifne +7 -> 17
    //   13: getstatic 151	ym:a	Lym;
    //   16: areturn
    //   17: aconst_null
    //   18: astore_3
    //   19: aconst_null
    //   20: astore 4
    //   22: aload 4
    //   24: astore_1
    //   25: new 153	java/io/FileInputStream
    //   28: astore 5
    //   30: aload 4
    //   32: astore_1
    //   33: aload 5
    //   35: aload_2
    //   36: invokespecial 154	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   39: aload 5
    //   41: invokestatic 157	oba:b	(Ljava/io/InputStream;)Ljava/lang/String;
    //   44: invokestatic 159	cm:d	(Ljava/lang/String;)Lym;
    //   47: astore_1
    //   48: aload 5
    //   50: ldc -95
    //   52: invokestatic 123	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   55: aload_1
    //   56: areturn
    //   57: astore 4
    //   59: aload 5
    //   61: astore_1
    //   62: aload 4
    //   64: astore 5
    //   66: goto +48 -> 114
    //   69: astore_1
    //   70: aload_1
    //   71: astore 4
    //   73: goto +13 -> 86
    //   76: astore 5
    //   78: goto +36 -> 114
    //   81: astore 4
    //   83: aload_3
    //   84: astore 5
    //   86: aload 5
    //   88: astore_1
    //   89: invokestatic 129	Naa:e	()LXaa;
    //   92: ldc -125
    //   94: ldc -93
    //   96: aload 4
    //   98: invokeinterface 138 4 0
    //   103: aload 5
    //   105: ldc -95
    //   107: invokestatic 123	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   110: getstatic 151	ym:a	Lym;
    //   113: areturn
    //   114: aload_1
    //   115: ldc -95
    //   117: invokestatic 123	oba:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   120: aload 5
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	cm
    //   0	123	1	paramString	String
    //   5	31	2	localFile	File
    //   18	66	3	localObject1	Object
    //   20	11	4	localObject2	Object
    //   57	6	4	localObject3	Object
    //   71	1	4	str	String
    //   81	16	4	localException	Exception
    //   28	37	5	localObject4	Object
    //   76	1	5	localObject5	Object
    //   84	37	5	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   39	48	57	finally
    //   39	48	69	java/lang/Exception
    //   25	30	76	finally
    //   33	39	76	finally
    //   89	103	76	finally
    //   25	30	81	java/lang/Exception
    //   33	39	81	java/lang/Exception
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */