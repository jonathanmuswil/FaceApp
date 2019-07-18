import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class wc
  extends Bc
{
  private static final Class a;
  private static final Constructor b;
  private static final Method c;
  private static final Method d;
  
  static
  {
    Object localObject1 = null;
    try
    {
      localClass1 = Class.forName("android.graphics.FontFamily");
      Constructor localConstructor = localClass1.getConstructor(new Class[0]);
      localObject2 = localClass1.getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE });
      Method localMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(localClass1, 1).getClass() });
      localObject1 = localConstructor;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi24Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Class localClass1 = null;
    Class localClass2 = localClass1;
    Object localObject2 = localClass2;
    b = (Constructor)localObject1;
    a = localClass1;
    c = (Method)localObject2;
    d = localClass2;
  }
  
  private static Typeface a(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(a, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)d.invoke(null, new Object[] { localObject });
      return (Typeface)paramObject;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  public static boolean a()
  {
    if (c == null) {
      Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
    }
    boolean bool;
    if (c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      paramBoolean = ((Boolean)c.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
      return paramBoolean;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException((Throwable)paramObject);
  }
  
  private static Object b()
  {
    try
    {
      Object localObject = b.newInstance(new Object[0]);
      return localObject;
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
    throw new RuntimeException(localIllegalAccessException);
  }
  
  public Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, Vc.b[] paramArrayOfb, int paramInt)
  {
    Object localObject = b();
    ud localud = new ud();
    int i = paramArrayOfb.length;
    for (int j = 0; j < i; j++)
    {
      Vc.b localb = paramArrayOfb[j];
      Uri localUri = localb.c();
      ByteBuffer localByteBuffer1 = (ByteBuffer)localud.get(localUri);
      ByteBuffer localByteBuffer2 = localByteBuffer1;
      if (localByteBuffer1 == null)
      {
        localByteBuffer2 = Cc.a(paramContext, paramCancellationSignal, localUri);
        localud.put(localUri, localByteBuffer2);
      }
      if (!a(localObject, localByteBuffer2, localb.b(), localb.d(), localb.e())) {
        return null;
      }
    }
    return Typeface.create(a(localObject), paramInt);
  }
  
  public Typeface a(Context paramContext, lc.b paramb, Resources paramResources, int paramInt)
  {
    Object localObject = b();
    for (paramb : paramb.a())
    {
      ByteBuffer localByteBuffer = Cc.a(paramContext, paramResources, paramb.b());
      if (localByteBuffer == null) {
        return null;
      }
      if (!a(localObject, localByteBuffer, paramb.c(), paramb.e(), paramb.f())) {
        return null;
      }
    }
    return a(localObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */