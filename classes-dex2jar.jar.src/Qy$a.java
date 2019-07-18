import sun.misc.Unsafe;

final class Qy$a
  extends Qy.d
{
  Qy$a(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final void a(Object paramObject, long paramLong, byte paramByte)
  {
    if (Qy.a())
    {
      Qy.a(paramObject, paramLong, paramByte);
      return;
    }
    Qy.b(paramObject, paramLong, paramByte);
  }
  
  public final void a(Object paramObject, long paramLong, double paramDouble)
  {
    a(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
  }
  
  public final void a(Object paramObject, long paramLong, float paramFloat)
  {
    a(paramObject, paramLong, Float.floatToIntBits(paramFloat));
  }
  
  public final void a(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (Qy.a())
    {
      Qy.b(paramObject, paramLong, paramBoolean);
      return;
    }
    Qy.c(paramObject, paramLong, paramBoolean);
  }
  
  public final boolean c(Object paramObject, long paramLong)
  {
    if (Qy.a()) {
      return Qy.i(paramObject, paramLong);
    }
    return Qy.j(paramObject, paramLong);
  }
  
  public final float d(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(a(paramObject, paramLong));
  }
  
  public final double e(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(b(paramObject, paramLong));
  }
  
  public final byte f(Object paramObject, long paramLong)
  {
    if (Qy.a()) {
      return Qy.g(paramObject, paramLong);
    }
    return Qy.h(paramObject, paramLong);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Qy$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */