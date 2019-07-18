import libcore.io.Memory;
import sun.misc.Unsafe;

final class Yt$a
  extends Yt.d
{
  Yt$a(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final void a(long paramLong, byte paramByte)
  {
    Memory.pokeByte((int)(paramLong & 0xFFFFFFFFFFFFFFFF), paramByte);
  }
  
  public final void a(Object paramObject, long paramLong, byte paramByte)
  {
    if (Yt.a())
    {
      Yt.a(paramObject, paramLong, paramByte);
      return;
    }
    Yt.b(paramObject, paramLong, paramByte);
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
    if (Yt.a())
    {
      Yt.b(paramObject, paramLong, paramBoolean);
      return;
    }
    Yt.c(paramObject, paramLong, paramBoolean);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3)
  {
    Memory.pokeByteArray((int)(paramLong2 & 0xFFFFFFFFFFFFFFFF), paramArrayOfByte, (int)paramLong1, (int)paramLong3);
  }
  
  public final boolean c(Object paramObject, long paramLong)
  {
    if (Yt.a()) {
      return Yt.i(paramObject, paramLong);
    }
    return Yt.j(paramObject, paramLong);
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
    if (Yt.a()) {
      return Yt.g(paramObject, paramLong);
    }
    return Yt.h(paramObject, paramLong);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Yt$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */