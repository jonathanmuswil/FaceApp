package io.faceapp.ui.onboarding.page;

import HHa.b;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class TutorialPageView
  extends ConstraintLayout
  implements jta<HHa.b>
{
  public static final a u = new a(null);
  private HashMap v;
  
  public TutorialPageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(HHa.b paramb)
  {
    oXa.b(paramb, "model");
    ((TextView)c(k.tutorialLabel)).setText(paramb.b());
    ((ImageView)c(k.tutorialImage)).setImageResource(paramb.a());
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final TutorialPageView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493133, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (TutorialPageView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.onboarding.page.TutorialPageView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/onboarding/page/TutorialPageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */