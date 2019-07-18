package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@yh
public final class sda
{
  private final wda a;
  private final hea b;
  private final boolean c;
  
  private sda()
  {
    this.c = false;
    this.a = new wda();
    this.b = new hea();
    b();
  }
  
  public sda(wda paramwda)
  {
    this.a = paramwda;
    paramwda = ra.Pd;
    this.c = ((Boolean)Kea.e().a(paramwda)).booleanValue();
    this.b = new hea();
    b();
  }
  
  public static sda a()
  {
    return new sda();
  }
  
  private final void b()
  {
    try
    {
      Object localObject1 = this.b;
      Object localObject3 = new com/google/android/gms/internal/ads/dea;
      ((dea)localObject3).<init>();
      ((hea)localObject1).l = ((dea)localObject3);
      localObject1 = this.b.l;
      localObject3 = new com/google/android/gms/internal/ads/eea;
      ((eea)localObject3).<init>();
      ((dea)localObject1).f = ((eea)localObject3);
      localObject3 = this.b;
      localObject1 = new com/google/android/gms/internal/ads/fea;
      ((fea)localObject1).<init>();
      ((hea)localObject3).i = ((fea)localObject1);
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  private final void b(uda paramuda)
  {
    try
    {
      this.b.h = c();
      Ada localAda = this.a.a(jT.a(this.b));
      localAda.b(paramuda.n());
      localAda.a();
      paramuda = String.valueOf(Integer.toString(paramuda.n(), 10));
      if (paramuda.length() != 0) {
        paramuda = "Logging Event with event code : ".concat(paramuda);
      } else {
        paramuda = new String("Logging Event with event code : ");
      }
      mk.f(paramuda);
      return;
    }
    finally {}
  }
  
  /* Error */
  private final void c(uda paramuda)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 144	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnonnull +6 -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: new 146	java/io/File
    //   16: astore_3
    //   17: aload_3
    //   18: aload_2
    //   19: ldc -108
    //   21: invokespecial 151	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   24: new 153	java/io/FileOutputStream
    //   27: astore_2
    //   28: aload_2
    //   29: aload_3
    //   30: iconst_1
    //   31: invokespecial 156	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   34: aload_2
    //   35: aload_0
    //   36: aload_1
    //   37: invokespecial 160	com/google/android/gms/internal/ads/sda:d	(Lcom/google/android/gms/internal/ads/uda;)Ljava/lang/String;
    //   40: invokevirtual 164	java/lang/String:getBytes	()[B
    //   43: invokevirtual 168	java/io/FileOutputStream:write	([B)V
    //   46: aload_2
    //   47: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_1
    //   54: ldc -83
    //   56: invokestatic 134	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: astore_1
    //   63: goto +25 -> 88
    //   66: astore_1
    //   67: ldc -81
    //   69: invokestatic 134	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   72: aload_2
    //   73: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: astore_1
    //   80: ldc -83
    //   82: invokestatic 134	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: aload_2
    //   89: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   92: goto +9 -> 101
    //   95: astore_2
    //   96: ldc -83
    //   98: invokestatic 134	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   101: aload_1
    //   102: athrow
    //   103: astore_1
    //   104: ldc -79
    //   106: invokestatic 134	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   109: aload_0
    //   110: monitorexit
    //   111: return
    //   112: astore_1
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	sda
    //   0	117	1	paramuda	uda
    //   5	84	2	localObject	Object
    //   95	1	2	localIOException	java.io.IOException
    //   16	14	3	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   46	50	53	java/io/IOException
    //   34	46	62	finally
    //   67	72	62	finally
    //   34	46	66	java/io/IOException
    //   72	76	79	java/io/IOException
    //   88	92	95	java/io/IOException
    //   24	34	103	java/io/FileNotFoundException
    //   54	59	103	java/io/FileNotFoundException
    //   80	85	103	java/io/FileNotFoundException
    //   96	101	103	java/io/FileNotFoundException
    //   101	103	103	java/io/FileNotFoundException
    //   2	6	112	finally
    //   13	24	112	finally
    //   24	34	112	finally
    //   46	50	112	finally
    //   54	59	112	finally
    //   72	76	112	finally
    //   80	85	112	finally
    //   88	92	112	finally
    //   96	101	112	finally
    //   101	103	112	finally
    //   104	109	112	finally
  }
  
  private static long[] c()
  {
    Object localObject1 = ra.b();
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = ((List)localObject1).iterator();
    int i;
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      i = 0;
      j = 0;
      if (!bool) {
        break;
      }
      localObject1 = ((String)((Iterator)localObject2).next()).split(",");
      i = localObject1.length;
      while (j < i)
      {
        String str = localObject1[j];
        try
        {
          localArrayList.add(Long.valueOf(str));
        }
        catch (NumberFormatException localNumberFormatException)
        {
          mk.f("Experiment ID is not a number");
        }
        j++;
      }
    }
    localObject2 = new long[localArrayList.size()];
    int k = localArrayList.size();
    for (int j = 0; i < k; j++)
    {
      localObject1 = localArrayList.get(i);
      i++;
      localObject2[j] = ((Long)localObject1).longValue();
    }
    return (long[])localObject2;
  }
  
  private final String d(uda paramuda)
  {
    try
    {
      paramuda = String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[] { this.b.d, Long.valueOf(k.j().b()), Integer.valueOf(paramuda.n()), Base64.encodeToString(jT.a(this.b), 3) });
      return paramuda;
    }
    finally
    {
      paramuda = finally;
      throw paramuda;
    }
  }
  
  public final void a(tda paramtda)
  {
    try
    {
      boolean bool = this.c;
      if (bool) {
        try
        {
          paramtda.a(this.b);
          return;
        }
        catch (NullPointerException paramtda)
        {
          k.g().a(paramtda, "AdMobClearcutLogger.modify");
        }
      }
      return;
    }
    finally {}
  }
  
  public final void a(uda paramuda)
  {
    try
    {
      boolean bool = this.c;
      if (!bool) {
        return;
      }
      ga localga = ra.Qd;
      if (((Boolean)Kea.e().a(localga)).booleanValue())
      {
        c(paramuda);
        return;
      }
      b(paramuda);
      return;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */