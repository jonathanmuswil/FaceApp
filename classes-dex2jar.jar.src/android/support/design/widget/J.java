package android.support.design.widget;

import Gc;
import android.support.v4.view.y;
import android.support.v4.widget.H;
import android.support.v4.widget.H.a;
import android.view.View;
import java.lang.ref.WeakReference;

class j
  extends H.a
{
  j(BottomSheetBehavior paramBottomSheetBehavior) {}
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getLeft();
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    int i = 4;
    if (paramFloat2 < 0.0F) {
      if (BottomSheetBehavior.a(this.a)) {
        j = this.a.g;
      }
    }
    label63:
    BottomSheetBehavior localBottomSheetBehavior;
    int k;
    for (;;)
    {
      i = 3;
      break label335;
      i = paramView.getTop();
      j = this.a.h;
      if (i > j)
      {
        i = 6;
        break label335;
      }
      j = 0;
      continue;
      localBottomSheetBehavior = this.a;
      if ((localBottomSheetBehavior.j) && (localBottomSheetBehavior.a(paramView, paramFloat2)) && ((paramView.getTop() > this.a.i) || (Math.abs(paramFloat1) < Math.abs(paramFloat2))))
      {
        j = this.a.q;
        i = 5;
        break label335;
      }
      if ((paramFloat2 != 0.0F) && (Math.abs(paramFloat1) <= Math.abs(paramFloat2)))
      {
        j = this.a.i;
        break label335;
      }
      k = paramView.getTop();
      if (!BottomSheetBehavior.a(this.a)) {
        break label236;
      }
      if (Math.abs(k - this.a.g) >= Math.abs(k - this.a.i)) {
        break;
      }
      j = this.a.g;
    }
    for (int j = this.a.i;; j = this.a.i)
    {
      break label335;
      label236:
      localBottomSheetBehavior = this.a;
      j = localBottomSheetBehavior.h;
      if (k < j)
      {
        if (k < Math.abs(k - localBottomSheetBehavior.i)) {
          break label63;
        }
        j = this.a.h;
        break label320;
      }
      if (Math.abs(k - j) < Math.abs(k - this.a.i))
      {
        j = this.a.h;
        label320:
        break;
      }
    }
    label335:
    if (this.a.m.d(paramView.getLeft(), j))
    {
      this.a.d(2);
      y.a(paramView, new BottomSheetBehavior.c(this.a, paramView, i));
    }
    else
    {
      this.a.d(i);
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.a(paramInt2);
  }
  
  public int b(View paramView)
  {
    paramView = this.a;
    if (paramView.j) {
      return paramView.q;
    }
    return paramView.i;
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    int i = BottomSheetBehavior.b(this.a);
    paramView = this.a;
    if (paramView.j) {
      paramInt2 = paramView.q;
    } else {
      paramInt2 = paramView.i;
    }
    return Gc.a(paramInt1, i, paramInt2);
  }
  
  public boolean b(View paramView, int paramInt)
  {
    Object localObject = this.a;
    int i = ((BottomSheetBehavior)localObject).l;
    boolean bool = true;
    if (i == 1) {
      return false;
    }
    if (((BottomSheetBehavior)localObject).x) {
      return false;
    }
    if ((i == 3) && (((BottomSheetBehavior)localObject).v == paramInt))
    {
      localObject = (View)((BottomSheetBehavior)localObject).s.get();
      if ((localObject != null) && (((View)localObject).canScrollVertically(-1))) {
        return false;
      }
    }
    localObject = this.a.r;
    if ((localObject == null) || (((WeakReference)localObject).get() != paramView)) {
      bool = false;
    }
    return bool;
  }
  
  public void c(int paramInt)
  {
    if (paramInt == 1) {
      this.a.d(1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */