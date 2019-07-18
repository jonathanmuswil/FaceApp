package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.accountkit.internal.c.a;

class lb
  extends ClickableSpan
{
  lb(nb.a parama) {}
  
  public void onClick(View paramView)
  {
    c.a.d(S.q.name());
    if (nb.a.a(this.a) != null) {
      nb.a.a(this.a).b(paramView.getContext());
    }
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(Ub.b(this.a.getActivity(), this.a.a()));
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */