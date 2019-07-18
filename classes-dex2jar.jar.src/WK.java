import java.util.Random;

class wk
  implements cca
{
  final cca a;
  final Random b;
  final double c;
  
  public wk(cca paramcca, double paramDouble)
  {
    this(paramcca, paramDouble, new Random());
  }
  
  public wk(cca paramcca, double paramDouble, Random paramRandom)
  {
    if ((paramDouble >= 0.0D) && (paramDouble <= 1.0D))
    {
      if (paramcca != null)
      {
        if (paramRandom != null)
        {
          this.a = paramcca;
          this.c = paramDouble;
          this.b = paramRandom;
          return;
        }
        throw new NullPointerException("random must not be null");
      }
      throw new NullPointerException("backoff must not be null");
    }
    throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
  }
  
  double a()
  {
    double d1 = this.c;
    double d2 = 1.0D - d1;
    return d2 + (d1 + 1.0D - d2) * this.b.nextDouble();
  }
  
  public long a(int paramInt)
  {
    return (a() * this.a.a(paramInt));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */