import android.graphics.Color;

public final class sc
{
  private static final ThreadLocal<double[]> a = new ThreadLocal();
  
  public static double a(int paramInt)
  {
    double[] arrayOfDouble = a();
    a(paramInt, arrayOfDouble);
    return arrayOfDouble[1] / 100.0D;
  }
  
  public static double a(int paramInt1, int paramInt2)
  {
    if (Color.alpha(paramInt2) == 255)
    {
      int i = paramInt1;
      if (Color.alpha(paramInt1) < 255) {
        i = b(paramInt1, paramInt2);
      }
      double d1 = a(i) + 0.05D;
      double d2 = a(paramInt2) + 0.05D;
      return Math.max(d1, d2) / Math.min(d1, d2);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("background can not be translucent: #");
    localStringBuilder.append(Integer.toHexString(paramInt2));
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      return 0;
    }
    return (paramInt1 * 255 * paramInt2 + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble.length == 3)
    {
      double d1 = paramInt1 / 255.0D;
      if (d1 < 0.04045D) {
        d1 /= 12.92D;
      } else {
        d1 = Math.pow((d1 + 0.055D) / 1.055D, 2.4D);
      }
      double d2 = paramInt2 / 255.0D;
      if (d2 < 0.04045D) {
        d2 /= 12.92D;
      } else {
        d2 = Math.pow((d2 + 0.055D) / 1.055D, 2.4D);
      }
      double d3 = paramInt3 / 255.0D;
      if (d3 < 0.04045D) {
        d3 /= 12.92D;
      } else {
        d3 = Math.pow((d3 + 0.055D) / 1.055D, 2.4D);
      }
      paramArrayOfDouble[0] = ((0.4124D * d1 + 0.3576D * d2 + 0.1805D * d3) * 100.0D);
      paramArrayOfDouble[1] = ((0.2126D * d1 + 0.7152D * d2 + 0.0722D * d3) * 100.0D);
      paramArrayOfDouble[2] = ((d1 * 0.0193D + d2 * 0.1192D + d3 * 0.9505D) * 100.0D);
      return;
    }
    throw new IllegalArgumentException("outXyz must have a length of 3.");
  }
  
  public static void a(int paramInt, double[] paramArrayOfDouble)
  {
    a(Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt), paramArrayOfDouble);
  }
  
  private static double[] a()
  {
    double[] arrayOfDouble1 = (double[])a.get();
    double[] arrayOfDouble2 = arrayOfDouble1;
    if (arrayOfDouble1 == null)
    {
      arrayOfDouble2 = new double[3];
      a.set(arrayOfDouble2);
    }
    return arrayOfDouble2;
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = d(j, i);
    return Color.argb(k, a(Color.red(paramInt1), j, Color.red(paramInt2), i, k), a(Color.green(paramInt1), j, Color.green(paramInt2), i, k), a(Color.blue(paramInt1), j, Color.blue(paramInt2), i, k));
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    if ((paramInt2 >= 0) && (paramInt2 <= 255)) {
      return paramInt1 & 0xFFFFFF | paramInt2 << 24;
    }
    throw new IllegalArgumentException("alpha must be between 0 and 255.");
  }
  
  private static int d(int paramInt1, int paramInt2)
  {
    return 255 - (255 - paramInt2) * (255 - paramInt1) / 255;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */