package com.google.android.gms.vision;

import android.util.SparseArray;

public final class d
{
  private static final Object a = new Object();
  private static int b = 0;
  private SparseArray<Integer> c = new SparseArray();
  private SparseArray<Integer> d = new SparseArray();
  
  public final int a(int paramInt)
  {
    synchronized (a)
    {
      Integer localInteger = (Integer)this.c.get(paramInt);
      if (localInteger != null)
      {
        paramInt = localInteger.intValue();
        return paramInt;
      }
      int i = b;
      b += 1;
      this.c.append(paramInt, Integer.valueOf(i));
      this.d.append(i, Integer.valueOf(paramInt));
      return i;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */