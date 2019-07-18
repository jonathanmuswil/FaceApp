class Va$d
{
  public final long a;
  public final long b;
  
  Va$d(long paramLong1, long paramLong2)
  {
    if (paramLong2 == 0L)
    {
      this.a = 0L;
      this.b = 1L;
      return;
    }
    this.a = paramLong1;
    this.b = paramLong2;
  }
  
  public double a()
  {
    return this.a / this.b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("/");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Va$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */