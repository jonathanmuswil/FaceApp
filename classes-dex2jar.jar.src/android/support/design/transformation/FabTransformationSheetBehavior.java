package android.support.design.transformation;

import V;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.e;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;
import na;
import pa;

public class FabTransformationSheetBehavior
  extends FabTransformationBehavior
{
  private Map<View, Integer> g;
  
  public FabTransformationSheetBehavior() {}
  
  public FabTransformationSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getParent();
    if (!(localObject instanceof CoordinatorLayout)) {
      return;
    }
    CoordinatorLayout localCoordinatorLayout = (CoordinatorLayout)localObject;
    int i = localCoordinatorLayout.getChildCount();
    if ((Build.VERSION.SDK_INT >= 16) && (paramBoolean)) {
      this.g = new HashMap(i);
    }
    for (int j = 0; j < i; j++)
    {
      View localView = localCoordinatorLayout.getChildAt(j);
      int k;
      if (((localView.getLayoutParams() instanceof CoordinatorLayout.e)) && ((((CoordinatorLayout.e)localView.getLayoutParams()).d() instanceof FabTransformationScrimBehavior))) {
        k = 1;
      } else {
        k = 0;
      }
      if ((localView != paramView) && (k == 0)) {
        if (!paramBoolean)
        {
          localObject = this.g;
          if ((localObject != null) && (((Map)localObject).containsKey(localView))) {
            y.d(localView, ((Integer)this.g.get(localView)).intValue());
          }
        }
        else
        {
          if (Build.VERSION.SDK_INT >= 16) {
            this.g.put(localView, Integer.valueOf(localView.getImportantForAccessibility()));
          }
          y.d(localView, 4);
        }
      }
    }
    if (!paramBoolean) {
      this.g = null;
    }
  }
  
  protected FabTransformationBehavior.a a(Context paramContext, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = V.mtrl_fab_transformation_sheet_expand_spec;
    } else {
      i = V.mtrl_fab_transformation_sheet_collapse_spec;
    }
    FabTransformationBehavior.a locala = new FabTransformationBehavior.a();
    locala.a = na.a(paramContext, i);
    locala.b = new pa(17, 0.0F, 0.0F);
    return locala;
  }
  
  protected boolean a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramView2, paramBoolean1);
    return super.a(paramView1, paramView2, paramBoolean1, paramBoolean2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/FabTransformationSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */