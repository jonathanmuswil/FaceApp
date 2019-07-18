import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class Yt$d
{
  Unsafe a;
  
  Yt$d(Unsafe paramUnsafe)
  {
    this.a = paramUnsafe;
  }
  
  public final int a(Object paramObject, long paramLong)
  {
    return this.a.getInt(paramObject, paramLong);
  }
  
  public final long a(Field paramField)
  {
    return this.a.objectFieldOffset(paramField);
  }
  
  public abstract void a(long paramLong, byte paramByte);
  
  public abstract void a(Object paramObject, long paramLong, byte paramByte);
  
  public abstract void a(Object paramObject, long paramLong, double paramDouble);
  
  public abstract void a(Object paramObject, long paramLong, float paramFloat);
  
  public final void a(Object paramObject, long paramLong, int paramInt)
  {
    this.a.putInt(paramObject, paramLong, paramInt);
  }
  
  public final void a(Object paramObject, long paramLong1, long paramLong2)
  {
    this.a.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public abstract void a(Object paramObject, long paramLong, boolean paramBoolean);
  
  public abstract void a(byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3);
  
  public final long b(Object paramObject, long paramLong)
  {
    return this.a.getLong(paramObject, paramLong);
  }
  
  public abstract boolean c(Object paramObject, long paramLong);
  
  public abstract float d(Object paramObject, long paramLong);
  
  public abstract double e(Object paramObject, long paramLong);
  
  public abstract byte f(Object paramObject, long paramLong);
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Yt$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */