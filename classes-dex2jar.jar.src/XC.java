import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class xc
  extends vc
{
  protected final Class a;
  protected final Constructor b;
  protected final Method c;
  protected final Method d;
  protected final Method e;
  protected final Method f;
  protected final Method g;
  
  public xc()
  {
    Object localObject1 = null;
    try
    {
      Class localClass = a();
      localObject3 = e(localClass);
      localObject4 = b(localClass);
      localObject5 = c(localClass);
      localObject6 = f(localClass);
      localObject7 = a(localClass);
      localMethod = d(localClass);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Object localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append("Unable to collect necessary methods for class ");
    ((StringBuilder)localObject4).append(localClassNotFoundException.getClass().getName());
    Log.e("TypefaceCompatApi26Impl", ((StringBuilder)localObject4).toString(), localClassNotFoundException);
    Method localMethod = null;
    Object localObject2 = localMethod;
    localObject4 = localObject2;
    Object localObject3 = localObject4;
    Object localObject5 = localObject3;
    Object localObject7 = localObject5;
    Object localObject6 = localObject5;
    localObject5 = localObject3;
    localObject3 = localObject2;
    localObject2 = localObject1;
    this.a = ((Class)localObject2);
    this.b = ((Constructor)localObject3);
    this.c = ((Method)localObject4);
    this.d = ((Method)localObject5);
    this.e = ((Method)localObject6);
    this.f = ((Method)localObject7);
    this.g = localMethod;
  }
  
  private boolean a(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis)
  {
    try
    {
      boolean bool = ((Boolean)this.c.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
      return bool;
    }
    catch (InvocationTargetException paramContext) {}catch (IllegalAccessException paramContext) {}
    throw new RuntimeException(paramContext);
  }
  
  private boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      boolean bool = ((Boolean)this.d.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) })).booleanValue();
      return bool;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  private void b(Object paramObject)
  {
    try
    {
      this.f.invoke(paramObject, new Object[0]);
      return;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  private boolean b()
  {
    if (this.c == null) {
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    }
    boolean bool;
    if (this.c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private Object c()
  {
    try
    {
      Object localObject = this.b.newInstance(new Object[0]);
      return localObject;
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
    throw new RuntimeException(localIllegalAccessException);
  }
  
  private boolean c(Object paramObject)
  {
    try
    {
      boolean bool = ((Boolean)this.e.invoke(paramObject, new Object[0])).booleanValue();
      return bool;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    if (!b()) {
      return super.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    }
    paramResources = c();
    if (!a(paramContext, paramResources, paramString, 0, -1, -1, null))
    {
      b(paramResources);
      return null;
    }
    if (!c(paramResources)) {
      return null;
    }
    return a(paramResources);
  }
  
  /* Error */
  public Typeface a(Context paramContext, android.os.CancellationSignal paramCancellationSignal, Vc.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: invokespecial 142	xc:b	()Z
    //   12: ifne +130 -> 142
    //   15: aload_0
    //   16: aload_3
    //   17: iload 4
    //   19: invokevirtual 165	Bc:a	([LVc$b;I)LVc$b;
    //   22: astore 5
    //   24: aload_1
    //   25: invokevirtual 169	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   28: astore_1
    //   29: aload_1
    //   30: aload 5
    //   32: invokevirtual 174	Vc$b:c	()Landroid/net/Uri;
    //   35: ldc -80
    //   37: aload_2
    //   38: invokevirtual 182	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnonnull +13 -> 56
    //   46: aload_3
    //   47: ifnull +7 -> 54
    //   50: aload_3
    //   51: invokevirtual 187	android/os/ParcelFileDescriptor:close	()V
    //   54: aconst_null
    //   55: areturn
    //   56: new 189	android/graphics/Typeface$Builder
    //   59: astore_1
    //   60: aload_1
    //   61: aload_3
    //   62: invokevirtual 193	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   65: invokespecial 196	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   68: aload_1
    //   69: aload 5
    //   71: invokevirtual 199	Vc$b:d	()I
    //   74: invokevirtual 203	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   77: aload 5
    //   79: invokevirtual 205	Vc$b:e	()Z
    //   82: invokevirtual 209	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   85: invokevirtual 213	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   88: astore_1
    //   89: aload_3
    //   90: ifnull +7 -> 97
    //   93: aload_3
    //   94: invokevirtual 187	android/os/ParcelFileDescriptor:close	()V
    //   97: aload_1
    //   98: areturn
    //   99: astore_1
    //   100: aconst_null
    //   101: astore_2
    //   102: goto +7 -> 109
    //   105: astore_2
    //   106: aload_2
    //   107: athrow
    //   108: astore_1
    //   109: aload_3
    //   110: ifnull +27 -> 137
    //   113: aload_2
    //   114: ifnull +19 -> 133
    //   117: aload_3
    //   118: invokevirtual 187	android/os/ParcelFileDescriptor:close	()V
    //   121: goto +16 -> 137
    //   124: astore_3
    //   125: aload_2
    //   126: aload_3
    //   127: invokevirtual 216	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   130: goto +7 -> 137
    //   133: aload_3
    //   134: invokevirtual 187	android/os/ParcelFileDescriptor:close	()V
    //   137: aload_1
    //   138: athrow
    //   139: astore_1
    //   140: aconst_null
    //   141: areturn
    //   142: aload_1
    //   143: aload_3
    //   144: aload_2
    //   145: invokestatic 221	Vc:a	(Landroid/content/Context;[LVc$b;Landroid/os/CancellationSignal;)Ljava/util/Map;
    //   148: astore_1
    //   149: aload_0
    //   150: invokespecial 148	xc:c	()Ljava/lang/Object;
    //   153: astore 6
    //   155: aload_3
    //   156: arraylength
    //   157: istore 7
    //   159: iconst_0
    //   160: istore 8
    //   162: iconst_0
    //   163: istore 9
    //   165: iload 9
    //   167: iload 7
    //   169: if_icmpge +73 -> 242
    //   172: aload_3
    //   173: iload 9
    //   175: aaload
    //   176: astore 5
    //   178: aload_1
    //   179: aload 5
    //   181: invokevirtual 174	Vc$b:c	()Landroid/net/Uri;
    //   184: invokeinterface 227 2 0
    //   189: checkcast 229	java/nio/ByteBuffer
    //   192: astore_2
    //   193: aload_2
    //   194: ifnonnull +6 -> 200
    //   197: goto +39 -> 236
    //   200: aload_0
    //   201: aload 6
    //   203: aload_2
    //   204: aload 5
    //   206: invokevirtual 231	Vc$b:b	()I
    //   209: aload 5
    //   211: invokevirtual 199	Vc$b:d	()I
    //   214: aload 5
    //   216: invokevirtual 205	Vc$b:e	()Z
    //   219: invokespecial 233	xc:a	(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
    //   222: ifne +11 -> 233
    //   225: aload_0
    //   226: aload 6
    //   228: invokespecial 152	xc:b	(Ljava/lang/Object;)V
    //   231: aconst_null
    //   232: areturn
    //   233: iconst_1
    //   234: istore 8
    //   236: iinc 9 1
    //   239: goto -74 -> 165
    //   242: iload 8
    //   244: ifne +11 -> 255
    //   247: aload_0
    //   248: aload 6
    //   250: invokespecial 152	xc:b	(Ljava/lang/Object;)V
    //   253: aconst_null
    //   254: areturn
    //   255: aload_0
    //   256: aload 6
    //   258: invokespecial 154	xc:c	(Ljava/lang/Object;)Z
    //   261: ifne +5 -> 266
    //   264: aconst_null
    //   265: areturn
    //   266: aload_0
    //   267: aload 6
    //   269: invokevirtual 157	xc:a	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   272: iload 4
    //   274: invokestatic 239	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   277: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	xc
    //   0	278	1	paramContext	Context
    //   0	278	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	278	3	paramArrayOfb	Vc.b[]
    //   0	278	4	paramInt	int
    //   22	193	5	localb	Vc.b
    //   153	115	6	localObject	Object
    //   157	13	7	i	int
    //   160	83	8	j	int
    //   163	74	9	k	int
    // Exception table:
    //   from	to	target	type
    //   56	89	99	finally
    //   56	89	105	java/lang/Throwable
    //   106	108	108	finally
    //   117	121	124	java/lang/Throwable
    //   29	42	139	java/io/IOException
    //   50	54	139	java/io/IOException
    //   93	97	139	java/io/IOException
    //   125	130	139	java/io/IOException
    //   133	137	139	java/io/IOException
    //   137	139	139	java/io/IOException
  }
  
  public Typeface a(Context paramContext, lc.b paramb, Resources paramResources, int paramInt)
  {
    if (!b()) {
      return super.a(paramContext, paramb, paramResources, paramInt);
    }
    paramResources = c();
    for (Object localObject : paramb.a()) {
      if (!a(paramContext, paramResources, ((lc.c)localObject).a(), ((lc.c)localObject).c(), ((lc.c)localObject).e(), ((lc.c)localObject).f(), FontVariationAxis.fromFontVariationSettings(((lc.c)localObject).d())))
      {
        b(paramResources);
        return null;
      }
    }
    if (!c(paramResources)) {
      return null;
    }
    return a(paramResources);
  }
  
  protected Typeface a(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(this.a, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)this.g.invoke(null, new Object[] { localObject, Integer.valueOf(-1), Integer.valueOf(-1) });
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  protected Class a()
    throws ClassNotFoundException
  {
    return Class.forName("android.graphics.FontFamily");
  }
  
  protected Method a(Class paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("abortCreation", new Class[0]);
  }
  
  protected Method b(Class paramClass)
    throws NoSuchMethodException
  {
    Class localClass1 = Integer.TYPE;
    Class localClass2 = Boolean.TYPE;
    Class localClass3 = Integer.TYPE;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, localClass1, localClass2, localClass3, localClass3, localClass3, FontVariationAxis[].class });
  }
  
  protected Method c(Class paramClass)
    throws NoSuchMethodException
  {
    Class localClass = Integer.TYPE;
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, localClass, FontVariationAxis[].class, localClass, localClass });
  }
  
  protected Method d(Class paramClass)
    throws NoSuchMethodException
  {
    Class localClass = Array.newInstance(paramClass, 1).getClass();
    paramClass = Integer.TYPE;
    paramClass = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { localClass, paramClass, paramClass });
    paramClass.setAccessible(true);
    return paramClass;
  }
  
  protected Constructor e(Class paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getConstructor(new Class[0]);
  }
  
  protected Method f(Class paramClass)
    throws NoSuchMethodException
  {
    return paramClass.getMethod("freeze", new Class[0]);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */