package io.faceapp.ui.onboarding.page;

import UPa;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import io.faceapp.k;
import oXa;

public final class c
  implements ViewTreeObserver.OnPreDrawListener
{
  public c(View paramView) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    Object localObject = (YearlyTrialPageView)this.a;
    TextView localTextView = (TextView)((YearlyTrialPageView)localObject).c(k.pros1);
    oXa.a(localTextView, "pros1");
    float f1 = localTextView.getTextSize();
    localTextView = (TextView)((YearlyTrialPageView)localObject).c(k.pros2);
    oXa.a(localTextView, "pros2");
    float f2 = localTextView.getTextSize();
    localTextView = (TextView)((YearlyTrialPageView)localObject).c(k.pros3);
    oXa.a(localTextView, "pros3");
    float f3 = localTextView.getTextSize();
    localTextView = (TextView)((YearlyTrialPageView)localObject).c(k.pros4);
    oXa.a(localTextView, "pros4");
    float f4 = localTextView.getTextSize();
    float f5 = Math.max(f1, Math.max(f2, Math.max(f3, f4)));
    f3 = Math.min(f1, Math.min(f2, Math.min(f3, f4)));
    if (f3 != f5)
    {
      int i = (int)f3;
      localTextView = (TextView)((YearlyTrialPageView)localObject).c(k.pros1);
      oXa.a(localTextView, "pros1");
      UPa.a(localTextView, null, Integer.valueOf(i), null, 5, null);
      localTextView = (TextView)((YearlyTrialPageView)localObject).c(k.pros2);
      oXa.a(localTextView, "pros2");
      UPa.a(localTextView, null, Integer.valueOf(i), null, 5, null);
      localTextView = (TextView)((YearlyTrialPageView)localObject).c(k.pros3);
      oXa.a(localTextView, "pros3");
      UPa.a(localTextView, null, Integer.valueOf(i), null, 5, null);
      localObject = (TextView)((YearlyTrialPageView)localObject).c(k.pros4);
      oXa.a(localObject, "pros4");
      UPa.a((TextView)localObject, null, Integer.valueOf(i), null, 5, null);
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/onboarding/page/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */