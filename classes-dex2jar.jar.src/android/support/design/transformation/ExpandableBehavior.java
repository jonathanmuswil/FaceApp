package android.support.design.transformation;

import Ba;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.b;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

public abstract class ExpandableBehavior
  extends CoordinatorLayout.b<View>
{
  private int a = 0;
  
  public ExpandableBehavior() {}
  
  public ExpandableBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private boolean a(boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramBoolean)
    {
      int i = this.a;
      if (i != 0)
      {
        paramBoolean = bool2;
        if (i != 2) {}
      }
      else
      {
        paramBoolean = true;
      }
      return paramBoolean;
    }
    paramBoolean = bool1;
    if (this.a == 1) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    if (!y.B(paramView))
    {
      paramCoordinatorLayout = e(paramCoordinatorLayout, paramView);
      if ((paramCoordinatorLayout != null) && (a(paramCoordinatorLayout.a())))
      {
        if (paramCoordinatorLayout.a()) {
          paramInt = 1;
        } else {
          paramInt = 2;
        }
        this.a = paramInt;
        paramInt = this.a;
        paramView.getViewTreeObserver().addOnPreDrawListener(new a(this, paramView, paramInt, paramCoordinatorLayout));
      }
    }
    return false;
  }
  
  protected abstract boolean a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2);
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    paramCoordinatorLayout = (Ba)paramView2;
    if (a(paramCoordinatorLayout.a()))
    {
      int i;
      if (paramCoordinatorLayout.a()) {
        i = 1;
      } else {
        i = 2;
      }
      this.a = i;
      return a((View)paramCoordinatorLayout, paramView1, paramCoordinatorLayout.a(), true);
    }
    return false;
  }
  
  protected Ba e(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    List localList = paramCoordinatorLayout.b(paramView);
    int i = localList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)localList.get(j);
      if (a(paramCoordinatorLayout, paramView, localView)) {
        return (Ba)localView;
      }
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/ExpandableBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */