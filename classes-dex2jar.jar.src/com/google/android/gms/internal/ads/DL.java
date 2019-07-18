package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@yh
public final class dl
{
  private final String[] a;
  private final double[] b;
  private final double[] c;
  private final int[] d;
  private int e;
  
  private dl(gl paramgl)
  {
    int i = gl.a(paramgl).size();
    this.a = ((String[])gl.b(paramgl).toArray(new String[i]));
    this.b = a(gl.a(paramgl));
    this.c = a(gl.c(paramgl));
    this.d = new int[i];
    this.e = 0;
  }
  
  private static double[] a(List<Double> paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    for (int i = 0; i < arrayOfDouble.length; i++) {
      arrayOfDouble[i] = ((Double)paramList.get(i)).doubleValue();
    }
    return arrayOfDouble;
  }
  
  public final List<fl> a()
  {
    ArrayList localArrayList = new ArrayList(this.a.length);
    for (int i = 0;; i++)
    {
      Object localObject = this.a;
      if (i >= localObject.length) {
        break;
      }
      String str = localObject[i];
      double d1 = this.c[i];
      double d2 = this.b[i];
      localObject = this.d;
      localArrayList.add(new fl(str, d1, d2, localObject[i] / this.e, localObject[i]));
    }
    return localArrayList;
  }
  
  public final void a(double paramDouble)
  {
    this.e += 1;
    for (int i = 0;; i++)
    {
      Object localObject = this.c;
      if (i >= localObject.length) {
        break;
      }
      if ((localObject[i] <= paramDouble) && (paramDouble < this.b[i]))
      {
        localObject = this.d;
        localObject[i] += 1;
      }
      if (paramDouble < this.c[i]) {
        break;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */