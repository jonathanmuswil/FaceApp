package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class ca
{
  /* Error */
  private final da a(Context paramContext, String paramString, da paramda, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 19
    //   2: iconst_3
    //   3: invokestatic 25	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   6: ifeq +11 -> 17
    //   9: ldc 19
    //   11: ldc 27
    //   13: invokestatic 31	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   16: pop
    //   17: new 33	java/util/Properties
    //   20: dup
    //   21: invokespecial 34	java/util/Properties:<init>	()V
    //   24: astore 5
    //   26: aload 5
    //   28: ldc 36
    //   30: aload_3
    //   31: invokestatic 41	com/google/firebase/iid/da:a	(Lcom/google/firebase/iid/da;)Ljava/lang/String;
    //   34: invokevirtual 45	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   37: pop
    //   38: aload 5
    //   40: ldc 47
    //   42: aload_3
    //   43: invokestatic 50	com/google/firebase/iid/da:b	(Lcom/google/firebase/iid/da;)Ljava/lang/String;
    //   46: invokevirtual 45	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   49: pop
    //   50: aload 5
    //   52: ldc 52
    //   54: aload_3
    //   55: invokestatic 56	com/google/firebase/iid/da:c	(Lcom/google/firebase/iid/da;)J
    //   58: invokestatic 62	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   61: invokevirtual 45	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   64: pop
    //   65: aload_1
    //   66: aload_2
    //   67: invokestatic 66	com/google/firebase/iid/ca:e	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   70: astore_1
    //   71: aload_1
    //   72: invokevirtual 72	java/io/File:createNewFile	()Z
    //   75: pop
    //   76: new 74	java/io/RandomAccessFile
    //   79: astore 6
    //   81: aload 6
    //   83: aload_1
    //   84: ldc 76
    //   86: invokespecial 79	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   89: aload 6
    //   91: invokevirtual 83	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   94: astore 7
    //   96: aload 7
    //   98: invokevirtual 89	java/nio/channels/FileChannel:lock	()Ljava/nio/channels/FileLock;
    //   101: pop
    //   102: iload 4
    //   104: ifeq +113 -> 217
    //   107: aload 7
    //   109: invokevirtual 93	java/nio/channels/FileChannel:size	()J
    //   112: lstore 8
    //   114: lload 8
    //   116: lconst_0
    //   117: lcmp
    //   118: ifle +99 -> 217
    //   121: aload 7
    //   123: lconst_0
    //   124: invokevirtual 97	java/nio/channels/FileChannel:position	(J)Ljava/nio/channels/FileChannel;
    //   127: pop
    //   128: aload 7
    //   130: invokestatic 100	com/google/firebase/iid/ca:a	(Ljava/nio/channels/FileChannel;)Lcom/google/firebase/iid/da;
    //   133: astore_1
    //   134: aload 7
    //   136: ifnull +9 -> 145
    //   139: aconst_null
    //   140: aload 7
    //   142: invokestatic 103	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/nio/channels/FileChannel;)V
    //   145: aconst_null
    //   146: aload 6
    //   148: invokestatic 106	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/io/RandomAccessFile;)V
    //   151: aload_1
    //   152: areturn
    //   153: astore_1
    //   154: goto +4 -> 158
    //   157: astore_1
    //   158: ldc 19
    //   160: iconst_3
    //   161: invokestatic 25	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   164: ifeq +53 -> 217
    //   167: aload_1
    //   168: invokestatic 109	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   171: astore_2
    //   172: aload_2
    //   173: invokestatic 109	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   176: invokevirtual 113	java/lang/String:length	()I
    //   179: istore 10
    //   181: new 115	java/lang/StringBuilder
    //   184: astore_1
    //   185: aload_1
    //   186: iload 10
    //   188: bipush 64
    //   190: iadd
    //   191: invokespecial 118	java/lang/StringBuilder:<init>	(I)V
    //   194: aload_1
    //   195: ldc 120
    //   197: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload_1
    //   202: aload_2
    //   203: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: ldc 19
    //   209: aload_1
    //   210: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: invokestatic 31	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   216: pop
    //   217: aload 7
    //   219: lconst_0
    //   220: invokevirtual 97	java/nio/channels/FileChannel:position	(J)Ljava/nio/channels/FileChannel;
    //   223: pop
    //   224: aload 5
    //   226: aload 7
    //   228: invokestatic 134	java/nio/channels/Channels:newOutputStream	(Ljava/nio/channels/WritableByteChannel;)Ljava/io/OutputStream;
    //   231: aconst_null
    //   232: invokevirtual 138	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   235: aload 7
    //   237: ifnull +9 -> 246
    //   240: aconst_null
    //   241: aload 7
    //   243: invokestatic 103	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/nio/channels/FileChannel;)V
    //   246: aconst_null
    //   247: aload 6
    //   249: invokestatic 106	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/io/RandomAccessFile;)V
    //   252: aload_3
    //   253: areturn
    //   254: astore_2
    //   255: aconst_null
    //   256: astore_1
    //   257: goto +7 -> 264
    //   260: astore_1
    //   261: aload_1
    //   262: athrow
    //   263: astore_2
    //   264: aload 7
    //   266: ifnull +9 -> 275
    //   269: aload_1
    //   270: aload 7
    //   272: invokestatic 103	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/nio/channels/FileChannel;)V
    //   275: aload_2
    //   276: athrow
    //   277: astore_1
    //   278: aconst_null
    //   279: astore_2
    //   280: goto +7 -> 287
    //   283: astore_2
    //   284: aload_2
    //   285: athrow
    //   286: astore_1
    //   287: aload_2
    //   288: aload 6
    //   290: invokestatic 106	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/io/RandomAccessFile;)V
    //   293: aload_1
    //   294: athrow
    //   295: astore_1
    //   296: aload_1
    //   297: invokestatic 109	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   300: astore_1
    //   301: new 115	java/lang/StringBuilder
    //   304: dup
    //   305: aload_1
    //   306: invokestatic 109	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   309: invokevirtual 113	java/lang/String:length	()I
    //   312: bipush 21
    //   314: iadd
    //   315: invokespecial 118	java/lang/StringBuilder:<init>	(I)V
    //   318: astore_2
    //   319: aload_2
    //   320: ldc -116
    //   322: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: pop
    //   326: aload_2
    //   327: aload_1
    //   328: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: pop
    //   332: ldc 19
    //   334: aload_2
    //   335: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   338: invokestatic 143	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   341: pop
    //   342: aconst_null
    //   343: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	344	0	this	ca
    //   0	344	1	paramContext	Context
    //   0	344	2	paramString	String
    //   0	344	3	paramda	da
    //   0	344	4	paramBoolean	boolean
    //   24	201	5	localProperties	Properties
    //   79	210	6	localRandomAccessFile	java.io.RandomAccessFile
    //   94	177	7	localFileChannel	FileChannel
    //   112	3	8	l	long
    //   179	12	10	i	int
    // Exception table:
    //   from	to	target	type
    //   121	134	153	com/google/firebase/iid/d
    //   121	134	157	java/io/IOException
    //   96	102	254	finally
    //   107	114	254	finally
    //   121	134	254	finally
    //   158	217	254	finally
    //   217	235	254	finally
    //   96	102	260	java/lang/Throwable
    //   107	114	260	java/lang/Throwable
    //   121	134	260	java/lang/Throwable
    //   158	217	260	java/lang/Throwable
    //   217	235	260	java/lang/Throwable
    //   261	263	263	finally
    //   89	96	277	finally
    //   139	145	277	finally
    //   240	246	277	finally
    //   269	275	277	finally
    //   275	277	277	finally
    //   89	96	283	java/lang/Throwable
    //   139	145	283	java/lang/Throwable
    //   240	246	283	java/lang/Throwable
    //   269	275	283	java/lang/Throwable
    //   275	277	283	java/lang/Throwable
    //   284	286	286	finally
    //   71	89	295	java/io/IOException
    //   145	151	295	java/io/IOException
    //   246	252	295	java/io/IOException
    //   287	295	295	java/io/IOException
  }
  
  private static da a(SharedPreferences paramSharedPreferences, String paramString)
    throws d
  {
    Object localObject1 = z.a(paramString, "|P|");
    Object localObject2 = null;
    String str1 = paramSharedPreferences.getString((String)localObject1, null);
    String str2 = paramSharedPreferences.getString(z.a(paramString, "|K|"), null);
    localObject1 = localObject2;
    if (str1 != null) {
      if (str2 == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = new da(a(str1, str2), b(paramSharedPreferences, paramString));
      }
    }
    return (da)localObject1;
  }
  
  /* Error */
  private final da a(File paramFile)
    throws d, IOException
  {
    // Byte code:
    //   0: new 171	java/io/FileInputStream
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 174	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore_2
    //   9: aconst_null
    //   10: astore_3
    //   11: aload_3
    //   12: astore_1
    //   13: aload_2
    //   14: invokevirtual 175	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   17: astore 4
    //   19: aload 4
    //   21: lconst_0
    //   22: ldc2_w 176
    //   25: iconst_1
    //   26: invokevirtual 180	java/nio/channels/FileChannel:lock	(JJZ)Ljava/nio/channels/FileLock;
    //   29: pop
    //   30: aload 4
    //   32: invokestatic 100	com/google/firebase/iid/ca:a	(Ljava/nio/channels/FileChannel;)Lcom/google/firebase/iid/da;
    //   35: astore 5
    //   37: aload 4
    //   39: ifnull +11 -> 50
    //   42: aload_3
    //   43: astore_1
    //   44: aconst_null
    //   45: aload 4
    //   47: invokestatic 103	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/nio/channels/FileChannel;)V
    //   50: aconst_null
    //   51: aload_2
    //   52: invokestatic 183	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   55: aload 5
    //   57: areturn
    //   58: astore 5
    //   60: aconst_null
    //   61: astore 6
    //   63: goto +10 -> 73
    //   66: astore 6
    //   68: aload 6
    //   70: athrow
    //   71: astore 5
    //   73: aload 4
    //   75: ifnull +12 -> 87
    //   78: aload_3
    //   79: astore_1
    //   80: aload 6
    //   82: aload 4
    //   84: invokestatic 103	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/nio/channels/FileChannel;)V
    //   87: aload_3
    //   88: astore_1
    //   89: aload 5
    //   91: athrow
    //   92: astore 5
    //   94: goto +11 -> 105
    //   97: astore 5
    //   99: aload 5
    //   101: astore_1
    //   102: aload 5
    //   104: athrow
    //   105: aload_1
    //   106: aload_2
    //   107: invokestatic 183	com/google/firebase/iid/ca:a	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   110: aload 5
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	ca
    //   0	113	1	paramFile	File
    //   8	99	2	localFileInputStream	java.io.FileInputStream
    //   10	78	3	localObject1	Object
    //   17	66	4	localFileChannel	FileChannel
    //   35	21	5	localda	da
    //   58	1	5	localObject2	Object
    //   71	19	5	localObject3	Object
    //   92	1	5	localObject4	Object
    //   97	14	5	localThrowable1	Throwable
    //   61	1	6	localObject5	Object
    //   66	15	6	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   19	37	58	finally
    //   19	37	66	java/lang/Throwable
    //   68	71	71	finally
    //   13	19	92	finally
    //   44	50	92	finally
    //   80	87	92	finally
    //   89	92	92	finally
    //   102	105	92	finally
    //   13	19	97	java/lang/Throwable
    //   44	50	97	java/lang/Throwable
    //   80	87	97	java/lang/Throwable
    //   89	92	97	java/lang/Throwable
  }
  
  private static da a(FileChannel paramFileChannel)
    throws d, IOException
  {
    Properties localProperties = new Properties();
    localProperties.load(Channels.newInputStream(paramFileChannel));
    paramFileChannel = localProperties.getProperty("pub");
    String str = localProperties.getProperty("pri");
    if ((paramFileChannel != null) && (str != null))
    {
      paramFileChannel = a(paramFileChannel, str);
      try
      {
        long l = Long.parseLong(localProperties.getProperty("cre"));
        return new da(paramFileChannel, l);
      }
      catch (NumberFormatException paramFileChannel)
      {
        throw new d(paramFileChannel);
      }
    }
    throw new d("Invalid properties file");
  }
  
  private static KeyPair a(String paramString1, String paramString2)
    throws d
  {
    try
    {
      Object localObject1 = Base64.decode(paramString1, 8);
      paramString1 = Base64.decode(paramString2, 8);
      try
      {
        paramString2 = KeyFactory.getInstance("RSA");
        Object localObject2 = new java/security/spec/X509EncodedKeySpec;
        ((X509EncodedKeySpec)localObject2).<init>((byte[])localObject1);
        localObject1 = paramString2.generatePublic((KeySpec)localObject2);
        localObject2 = new java/security/spec/PKCS8EncodedKeySpec;
        ((PKCS8EncodedKeySpec)localObject2).<init>(paramString1);
        paramString1 = new KeyPair((PublicKey)localObject1, paramString2.generatePrivate((KeySpec)localObject2));
        return paramString1;
      }
      catch (NoSuchAlgorithmException paramString1) {}catch (InvalidKeySpecException paramString1) {}
      localObject1 = String.valueOf(paramString1);
      paramString2 = new StringBuilder(String.valueOf(localObject1).length() + 19);
      paramString2.append("Invalid key stored ");
      paramString2.append((String)localObject1);
      Log.w("FirebaseInstanceId", paramString2.toString());
      throw new d(paramString1);
    }
    catch (IllegalArgumentException paramString1)
    {
      throw new d(paramString1);
    }
  }
  
  static void a(Context paramContext)
  {
    for (Object localObject : b(paramContext).listFiles()) {
      if (((File)localObject).getName().startsWith("com.google.InstanceId")) {
        ((File)localObject).delete();
      }
    }
  }
  
  private final void a(Context paramContext, String paramString, da paramda)
  {
    paramContext = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    try
    {
      boolean bool = paramda.equals(a(paramContext, paramString));
      if (bool) {
        return;
      }
    }
    catch (d locald)
    {
      for (;;) {}
    }
    if (Log.isLoggable("FirebaseInstanceId", 3)) {
      Log.d("FirebaseInstanceId", "Writing key to shared preferences");
    }
    paramContext = paramContext.edit();
    paramContext.putString(z.a(paramString, "|P|"), da.a(paramda));
    paramContext.putString(z.a(paramString, "|K|"), da.b(paramda));
    paramContext.putString(z.a(paramString, "cre"), String.valueOf(da.c(paramda)));
    paramContext.commit();
  }
  
  private static long b(SharedPreferences paramSharedPreferences, String paramString)
  {
    paramSharedPreferences = paramSharedPreferences.getString(z.a(paramString, "cre"), null);
    if (paramSharedPreferences != null) {}
    try
    {
      long l = Long.parseLong(paramSharedPreferences);
      return l;
    }
    catch (NumberFormatException paramSharedPreferences)
    {
      for (;;) {}
    }
    return 0L;
  }
  
  private static File b(Context paramContext)
  {
    File localFile = android.support.v4.content.c.b(paramContext);
    if ((localFile != null) && (localFile.isDirectory())) {
      return localFile;
    }
    Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
    return paramContext.getFilesDir();
  }
  
  private final da c(Context paramContext, String paramString)
    throws d
  {
    try
    {
      da localda1 = d(paramContext, paramString);
      if (localda1 != null)
      {
        a(paramContext, paramString, localda1);
        return localda1;
      }
      localda1 = null;
    }
    catch (d locald1) {}
    try
    {
      da localda2 = a(paramContext.getSharedPreferences("com.google.android.gms.appid", 0), paramString);
      if (localda2 != null)
      {
        a(paramContext, paramString, localda2, false);
        return localda2;
      }
    }
    catch (d locald2)
    {
      if (locald2 == null) {
        return null;
      }
      throw locald2;
    }
  }
  
  private final da d(Context paramContext, String paramString)
    throws d
  {
    paramString = e(paramContext, paramString);
    if (!paramString.exists()) {
      return null;
    }
    try
    {
      paramContext = a(paramString);
      return paramContext;
    }
    catch (IOException paramContext) {}catch (d paramContext) {}
    StringBuilder localStringBuilder;
    if (Log.isLoggable("FirebaseInstanceId", 3))
    {
      paramContext = String.valueOf(paramContext);
      localStringBuilder = new StringBuilder(String.valueOf(paramContext).length() + 40);
      localStringBuilder.append("Failed to read key from file, retrying: ");
      localStringBuilder.append(paramContext);
      Log.d("FirebaseInstanceId", localStringBuilder.toString());
    }
    try
    {
      paramContext = a(paramString);
      return paramContext;
    }
    catch (IOException paramString)
    {
      paramContext = String.valueOf(paramString);
      localStringBuilder = new StringBuilder(String.valueOf(paramContext).length() + 45);
      localStringBuilder.append("IID file exists, but failed to read from it: ");
      localStringBuilder.append(paramContext);
      Log.w("FirebaseInstanceId", localStringBuilder.toString());
      throw new d(paramString);
    }
  }
  
  private static File e(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = "com.google.InstanceId.properties";
    }
    try
    {
      paramString = Base64.encodeToString(paramString.getBytes("UTF-8"), 11);
      int i = String.valueOf(paramString).length();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i + 33);
      localStringBuilder.append("com.google.InstanceId_");
      localStringBuilder.append(paramString);
      localStringBuilder.append(".properties");
      paramString = localStringBuilder.toString();
      return new File(b(paramContext), paramString);
    }
    catch (UnsupportedEncodingException paramContext)
    {
      throw new AssertionError(paramContext);
    }
  }
  
  final da a(Context paramContext, String paramString)
    throws d
  {
    da localda = c(paramContext, paramString);
    if (localda != null) {
      return localda;
    }
    return b(paramContext, paramString);
  }
  
  final da b(Context paramContext, String paramString)
  {
    da localda1 = new da(c.a(), System.currentTimeMillis());
    da localda2 = a(paramContext, paramString, localda1, true);
    if ((localda2 != null) && (!localda2.equals(localda1)))
    {
      if (Log.isLoggable("FirebaseInstanceId", 3)) {
        Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
      }
      return localda2;
    }
    if (Log.isLoggable("FirebaseInstanceId", 3)) {
      Log.d("FirebaseInstanceId", "Generated new key");
    }
    a(paramContext, paramString, localda1);
    return localda1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */