import sun.misc.Unsafe;

final class Qy$c
  extends Qy.d
{
  Qy$c(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final void a(Object paramObject, long paramLong, byte paramByte)
  {
    this.a.putByte(paramObject, paramLong, paramByte);
  }
  
  public final void a(Object paramObject, long paramLong, double paramDouble)
  {
    this.a.putDouble(paramObject, paramLong, paramDouble);
  }
  
  public final void a(Object paramObject, long paramLong, float paramFloat)
  {
    this.a.putFloat(paramObject, paramLong, paramFloat);
  }
  
  public final void a(Object paramObject, long paramLong, boolean paramBoolean)
  {
    this.a.putBoolean(paramObject, paramLong, paramBoolean);
  }
  
  public final boolean c(Object paramObject, long paramLong)
  {
    return this.a.getBoolean(paramObject, paramLong);
  }
  
  public final float d(Object paramObject, long paramLong)
  {
    return this.a.getFloat(paramObject, paramLong);
  }
  
  public final double e(Object paramObject, long paramLong)
  {
    return this.a.getDouble(paramObject, paramLong);
  }
  
  public final byte f(Object paramObject, long paramLong)
  {
    return this.a.getByte(paramObject, paramLong);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Qy$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */