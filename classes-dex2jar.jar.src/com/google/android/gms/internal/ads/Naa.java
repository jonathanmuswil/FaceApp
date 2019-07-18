package com.google.android.gms.internal.ads;

final class naa
{
  private final UY[] a;
  private final WY b;
  private UY c;
  
  public naa(UY[] paramArrayOfUY, WY paramWY)
  {
    this.a = paramArrayOfUY;
    this.b = paramWY;
  }
  
  /* Error */
  public final UY a(VY paramVY, android.net.Uri paramUri)
    throws java.io.IOException, java.lang.InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 29	com/google/android/gms/internal/ads/naa:c	Lcom/google/android/gms/internal/ads/UY;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull +5 -> 11
    //   9: aload_3
    //   10: areturn
    //   11: aload_0
    //   12: getfield 17	com/google/android/gms/internal/ads/naa:a	[Lcom/google/android/gms/internal/ads/UY;
    //   15: astore_3
    //   16: aload_3
    //   17: arraylength
    //   18: istore 4
    //   20: iconst_0
    //   21: istore 5
    //   23: iload 5
    //   25: iload 4
    //   27: if_icmpge +67 -> 94
    //   30: aload_3
    //   31: iload 5
    //   33: aaload
    //   34: astore 6
    //   36: aload 6
    //   38: aload_1
    //   39: invokeinterface 34 2 0
    //   44: ifeq +18 -> 62
    //   47: aload_0
    //   48: aload 6
    //   50: putfield 29	com/google/android/gms/internal/ads/naa:c	Lcom/google/android/gms/internal/ads/UY;
    //   53: aload_1
    //   54: invokeinterface 39 1 0
    //   59: goto +35 -> 94
    //   62: aload_1
    //   63: invokeinterface 39 1 0
    //   68: goto +20 -> 88
    //   71: astore_2
    //   72: aload_1
    //   73: invokeinterface 39 1 0
    //   78: aload_2
    //   79: athrow
    //   80: astore 6
    //   82: aload_1
    //   83: invokeinterface 39 1 0
    //   88: iinc 5 1
    //   91: goto -68 -> 23
    //   94: aload_0
    //   95: getfield 29	com/google/android/gms/internal/ads/naa:c	Lcom/google/android/gms/internal/ads/UY;
    //   98: astore_1
    //   99: aload_1
    //   100: ifnull +18 -> 118
    //   103: aload_1
    //   104: aload_0
    //   105: getfield 19	com/google/android/gms/internal/ads/naa:b	Lcom/google/android/gms/internal/ads/WY;
    //   108: invokeinterface 42 2 0
    //   113: aload_0
    //   114: getfield 29	com/google/android/gms/internal/ads/naa:c	Lcom/google/android/gms/internal/ads/UY;
    //   117: areturn
    //   118: aload_0
    //   119: getfield 17	com/google/android/gms/internal/ads/naa:a	[Lcom/google/android/gms/internal/ads/UY;
    //   122: invokestatic 47	com/google/android/gms/internal/ads/Hba:a	([Ljava/lang/Object;)Ljava/lang/String;
    //   125: astore_1
    //   126: new 49	java/lang/StringBuilder
    //   129: dup
    //   130: aload_1
    //   131: invokestatic 55	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   134: invokevirtual 59	java/lang/String:length	()I
    //   137: bipush 58
    //   139: iadd
    //   140: invokespecial 62	java/lang/StringBuilder:<init>	(I)V
    //   143: astore_3
    //   144: aload_3
    //   145: ldc 64
    //   147: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload_3
    //   152: aload_1
    //   153: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload_3
    //   158: ldc 70
    //   160: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: new 72	com/google/android/gms/internal/ads/Laa
    //   167: dup
    //   168: aload_3
    //   169: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: aload_2
    //   173: invokespecial 79	com/google/android/gms/internal/ads/Laa:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   176: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	naa
    //   0	177	1	paramVY	VY
    //   0	177	2	paramUri	android.net.Uri
    //   4	165	3	localObject	Object
    //   18	10	4	i	int
    //   21	68	5	j	int
    //   34	15	6	localUY	UY
    //   80	1	6	localEOFException	java.io.EOFException
    // Exception table:
    //   from	to	target	type
    //   36	53	71	finally
    //   36	53	80	java/io/EOFException
  }
  
  public final void a()
  {
    UY localUY = this.c;
    if (localUY != null)
    {
      localUY.a();
      this.c = null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/naa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */