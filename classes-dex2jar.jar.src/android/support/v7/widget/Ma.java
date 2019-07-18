package android.support.v7.widget;

import java.util.Comparator;

final class ma
  implements Comparator<na.b>
{
  public int a(na.b paramb1, na.b paramb2)
  {
    RecyclerView localRecyclerView = paramb1.d;
    int i = 1;
    int j = 1;
    if (localRecyclerView == null) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (paramb2.d == null) {
      m = 1;
    } else {
      m = 0;
    }
    if (k != m)
    {
      if (paramb1.d == null) {
        k = j;
      } else {
        k = -1;
      }
      return k;
    }
    boolean bool = paramb1.a;
    if (bool != paramb2.a)
    {
      k = i;
      if (bool) {
        k = -1;
      }
      return k;
    }
    int k = paramb2.b - paramb1.b;
    if (k != 0) {
      return k;
    }
    k = paramb1.c - paramb2.c;
    if (k != 0) {
      return k;
    }
    return 0;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */