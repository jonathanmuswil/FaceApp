import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class sx<MessageType extends sx<MessageType, BuilderType>, BuilderType extends sx.a<MessageType, BuilderType>>
  extends Iw<MessageType, BuilderType>
{
  private static Map<Object, sx<?, ?>> zzqw = new ConcurrentHashMap();
  protected Ly zzqu = Ly.c();
  private int zzqv = -1;
  
  protected static <E> Ax<E> a(Ax<E> paramAx)
  {
    int i = paramAx.size();
    if (i == 0) {
      i = 10;
    } else {
      i <<= 1;
    }
    return paramAx.h(i);
  }
  
  protected static Object a(by paramby, String paramString, Object[] paramArrayOfObject)
  {
    return new qy(paramby, paramString, paramArrayOfObject);
  }
  
  static Object a(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  static <T extends sx<?, ?>> T a(Class<T> paramClass)
  {
    Object localObject1 = (sx)zzqw.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (sx)zzqw.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (sx)((sx)Qy.a(paramClass)).a(sx.d.f, null, null);
      if (localObject1 != null) {
        zzqw.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (T)localObject1;
  }
  
  protected static <T extends sx<?, ?>> void a(Class<T> paramClass, T paramT)
  {
    zzqw.put(paramClass, paramT);
  }
  
  protected static final <T extends sx<T, ?>> boolean a(T paramT, boolean paramBoolean)
  {
    int i = ((Byte)paramT.a(sx.d.a, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = oy.a().a(paramT).c(paramT);
    if (paramBoolean)
    {
      i = sx.d.b;
      T ?;
      if (bool) {
        ? = paramT;
      } else {
        ? = null;
      }
      paramT.a(i, ?, null);
    }
    return bool;
  }
  
  protected static yx h()
  {
    return tx.n();
  }
  
  protected static <E> Ax<E> i()
  {
    return py.n();
  }
  
  protected abstract Object a(int paramInt, Object paramObject1, Object paramObject2);
  
  final void a(int paramInt)
  {
    this.zzqv = paramInt;
  }
  
  public final void a(cx paramcx)
    throws IOException
  {
    oy.a().a(getClass()).a(this, fx.a(paramcx));
  }
  
  public final int c()
  {
    if (this.zzqv == -1) {
      this.zzqv = oy.a().a(this).e(this);
    }
    return this.zzqv;
  }
  
  final int e()
  {
    return this.zzqv;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!((sx)a(sx.d.f, null, null)).getClass().isInstance(paramObject)) {
      return false;
    }
    return oy.a().a(this).a(this, (sx)paramObject);
  }
  
  protected final <MessageType extends sx<MessageType, BuilderType>, BuilderType extends sx.a<MessageType, BuilderType>> BuilderType f()
  {
    return (sx.a)a(sx.d.e, null, null);
  }
  
  public final BuilderType g()
  {
    sx.a locala = (sx.a)a(sx.d.e, null, null);
    locala.a(this);
    return locala;
  }
  
  public int hashCode()
  {
    int i = this.zzmw;
    if (i != 0) {
      return i;
    }
    this.zzmw = oy.a().a(this).b(this);
    return this.zzmw;
  }
  
  public final boolean isInitialized()
  {
    return a(this, Boolean.TRUE.booleanValue());
  }
  
  public String toString()
  {
    return fy.a(this, super.toString());
  }
  
  public static class a<MessageType extends sx<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    extends Jw<MessageType, BuilderType>
  {
    private final MessageType a;
    protected MessageType b;
    private boolean c;
    
    protected a(MessageType paramMessageType)
    {
      this.a = paramMessageType;
      this.b = ((sx)paramMessageType.a(sx.d.d, null, null));
      this.c = false;
    }
    
    private static void a(MessageType paramMessageType1, MessageType paramMessageType2)
    {
      oy.a().a(paramMessageType1).b(paramMessageType1, paramMessageType2);
    }
    
    public final BuilderType a(MessageType paramMessageType)
    {
      d();
      a(this.b, paramMessageType);
      return this;
    }
    
    protected final void d()
    {
      if (this.c)
      {
        sx localsx = (sx)this.b.a(sx.d.d, null, null);
        a(localsx, this.b);
        this.b = localsx;
        this.c = false;
      }
    }
    
    public MessageType e()
    {
      if (this.c) {
        return this.b;
      }
      sx localsx = this.b;
      oy.a().a(localsx).d(localsx);
      this.c = true;
      return this.b;
    }
    
    public final MessageType f()
    {
      sx localsx = (sx)L();
      if (localsx.isInitialized()) {
        return localsx;
      }
      throw new Jy(localsx);
    }
  }
  
  public static final class b<T extends sx<T, ?>>
    extends Kw<T>
  {
    private final T b;
    
    public b(T paramT)
    {
      this.b = paramT;
    }
  }
  
  public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType>
    extends sx<MessageType, BuilderType>
    implements dy
  {
    protected lx<Object> zzra = lx.f();
  }
  
  public static enum d
  {
    public static int[] a()
    {
      return (int[])h.clone();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */