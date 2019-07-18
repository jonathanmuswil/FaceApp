package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class b
{
  protected static <T extends d> T a(String paramString, b paramb)
  {
    try
    {
      paramString = (d)Class.forName(paramString, true, b.class.getClassLoader()).getDeclaredMethod("read", new Class[] { b.class }).invoke(null, new Object[] { paramb });
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramString);
    }
    catch (NoSuchMethodException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramString);
    }
    catch (InvocationTargetException paramString)
    {
      if ((paramString.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramString.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramString);
    }
    catch (IllegalAccessException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramString);
    }
  }
  
  private static Class a(Class<? extends d> paramClass)
    throws ClassNotFoundException
  {
    return Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
  }
  
  protected static <T extends d> void a(T paramT, b paramb)
  {
    try
    {
      b(paramT).getDeclaredMethod("write", new Class[] { paramT.getClass(), b.class }).invoke(null, new Object[] { paramT, paramb });
      return;
    }
    catch (ClassNotFoundException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramT);
    }
    catch (NoSuchMethodException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramT);
    }
    catch (InvocationTargetException paramT)
    {
      if ((paramT.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramT.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramT);
    }
    catch (IllegalAccessException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramT);
    }
  }
  
  private static <T extends d> Class b(T paramT)
    throws ClassNotFoundException
  {
    return a(paramT.getClass());
  }
  
  private void c(d paramd)
  {
    try
    {
      localObject = a(paramd.getClass());
      a(((Class)localObject).getName());
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramd.getClass().getSimpleName());
      ((StringBuilder)localObject).append(" does not have a Parcelizer");
      throw new RuntimeException(((StringBuilder)localObject).toString(), localClassNotFoundException);
    }
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    if (!a(paramInt2)) {
      return paramInt1;
    }
    return e();
  }
  
  public <T extends Parcelable> T a(T paramT, int paramInt)
  {
    if (!a(paramInt)) {
      return paramT;
    }
    return f();
  }
  
  public <T extends d> T a(T paramT, int paramInt)
  {
    if (!a(paramInt)) {
      return paramT;
    }
    return h();
  }
  
  public String a(String paramString, int paramInt)
  {
    if (!a(paramInt)) {
      return paramString;
    }
    return g();
  }
  
  protected abstract void a();
  
  protected abstract void a(Parcelable paramParcelable);
  
  protected void a(d paramd)
  {
    if (paramd == null)
    {
      a(null);
      return;
    }
    c(paramd);
    b localb = b();
    a(paramd, localb);
    localb.a();
  }
  
  protected abstract void a(String paramString);
  
  public void a(boolean paramBoolean1, boolean paramBoolean2) {}
  
  protected abstract void a(byte[] paramArrayOfByte);
  
  protected abstract boolean a(int paramInt);
  
  public byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if (!a(paramInt)) {
      return paramArrayOfByte;
    }
    return d();
  }
  
  protected abstract b b();
  
  protected abstract void b(int paramInt);
  
  public void b(int paramInt1, int paramInt2)
  {
    b(paramInt2);
    c(paramInt1);
  }
  
  public void b(Parcelable paramParcelable, int paramInt)
  {
    b(paramInt);
    a(paramParcelable);
  }
  
  public void b(d paramd, int paramInt)
  {
    b(paramInt);
    a(paramd);
  }
  
  public void b(String paramString, int paramInt)
  {
    b(paramInt);
    a(paramString);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt)
  {
    b(paramInt);
    a(paramArrayOfByte);
  }
  
  protected abstract void c(int paramInt);
  
  public boolean c()
  {
    return false;
  }
  
  protected abstract byte[] d();
  
  protected abstract int e();
  
  protected abstract <T extends Parcelable> T f();
  
  protected abstract String g();
  
  protected <T extends d> T h()
  {
    String str = g();
    if (str == null) {
      return null;
    }
    return a(str, b());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/versionedparcelable/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */