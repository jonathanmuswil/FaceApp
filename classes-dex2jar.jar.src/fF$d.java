import sun.misc.Unsafe;

abstract class fF$d
{
  Unsafe a;
  
  fF$d(Unsafe paramUnsafe)
  {
    this.a = paramUnsafe;
  }
  
  public final int a(Object paramObject, long paramLong)
  {
    return this.a.getInt(paramObject, paramLong);
  }
  
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
  
  public final long b(Object paramObject, long paramLong)
  {
    return this.a.getLong(paramObject, paramLong);
  }
  
  public abstract boolean c(Object paramObject, long paramLong);
  
  public abstract float d(Object paramObject, long paramLong);
  
  public abstract double e(Object paramObject, long paramLong);
  
  public abstract byte f(Object paramObject, long paramLong);
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fF$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */