package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.f;

public class l
{
  private final SparseIntArray a = new SparseIntArray();
  private f b;
  
  public l(f paramf)
  {
    t.a(paramf);
    this.b = paramf;
  }
  
  public int a(Context paramContext, a.f paramf)
  {
    t.a(paramContext);
    t.a(paramf);
    if (!paramf.f()) {
      return 0;
    }
    int i = paramf.g();
    int j = this.a.get(i, -1);
    if (j != -1) {
      return j;
    }
    int m;
    for (int k = 0;; k++)
    {
      m = j;
      if (k >= this.a.size()) {
        break;
      }
      m = this.a.keyAt(k);
      if ((m > i) && (this.a.get(m) == 0))
      {
        m = 0;
        break;
      }
    }
    k = m;
    if (m == -1) {
      k = this.b.a(paramContext, i);
    }
    this.a.put(i, k);
    return k;
  }
  
  public void a()
  {
    this.a.clear();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */