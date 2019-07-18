package io.faceapp.ui.onboarding.page;

import KOa;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import oXa;

public final class a
  extends ClickableSpan
{
  public void onClick(View paramView)
  {
    oXa.b(paramView, "widget");
    paramView = this.a.getContext();
    if (paramView != null) {
      KOa.b.k(paramView);
    }
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    oXa.b(paramTextPaint, "ds");
    paramTextPaint.setColor(-1);
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/onboarding/page/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */