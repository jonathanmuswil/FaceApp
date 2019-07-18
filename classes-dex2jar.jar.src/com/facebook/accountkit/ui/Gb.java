package com.facebook.accountkit.ui;

import Sm;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.accountkit.internal.va;
import dn;
import fn;
import pn;
import qn;
import rn;

public class gb
  extends ca
{
  private boolean e = true;
  private a f;
  private Q g;
  private Ga h;
  private TextView i;
  private Button j;
  private boolean k = true;
  private TextView l;
  private String m = null;
  private String n = null;
  
  @SuppressLint({"StringFormatMatches"})
  private Spanned a(CharSequence paramCharSequence)
  {
    return Html.fromHtml(getString(rn.com_accountkit_confirmation_code_agreement, new Object[] { paramCharSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/" }));
  }
  
  public static gb a(Fb paramFb, Ga paramGa, Q paramQ)
  {
    gb localgb = new gb();
    localgb.b().putParcelable(Tb.c, paramFb);
    localgb.a(paramGa);
    localgb.a(paramQ);
    return localgb;
  }
  
  protected View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = (ViewGroup)paramLayoutInflater.inflate(qn.com_accountkit_fragment_confirmation_code_bottom, paramViewGroup, false);
    if (Ub.a(a(), ub.a.c))
    {
      paramBundle = paramLayoutInflater.findViewById(pn.com_accountkit_next_button);
      ((ViewGroup)paramBundle.getParent()).removeView(paramBundle);
      paramViewGroup = paramLayoutInflater.findViewById(pn.com_accountkit_space);
      ((ViewGroup)paramViewGroup.getParent()).removeView(paramViewGroup);
      paramLayoutInflater.addView(paramViewGroup);
      paramLayoutInflater.addView(paramBundle);
    }
    return paramLayoutInflater;
  }
  
  protected void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.g = Q.values()[paramBundle.getInt("next_button_type")];
    this.h = Ga.values()[paramBundle.getInt("login_flow_state")];
    this.k = paramBundle.getBoolean("retry button visible", true);
    this.j = ((Button)paramView.findViewById(pn.com_accountkit_next_button));
    this.i = ((TextView)paramView.findViewById(pn.com_accountkit_retry_button));
    paramBundle = this.j;
    if (paramBundle != null)
    {
      paramBundle.setEnabled(this.e);
      this.j.setOnClickListener(new db(this));
      this.j.setText(this.g.a());
    }
    paramBundle = this.i;
    if (paramBundle != null)
    {
      int i1;
      if (this.k) {
        i1 = 0;
      } else {
        i1 = 8;
      }
      paramBundle.setVisibility(i1);
      this.i.setOnClickListener(new eb(this));
      this.i.setTextColor(Ub.b(getActivity(), a()));
    }
    this.l = ((TextView)paramView.findViewById(pn.com_accountkit_confirmation_code_agreement));
    paramView = this.l;
    if (paramView != null) {
      paramView.setMovementMethod(new ea(new fb(this)));
    }
    a(this.l, this.j.getText());
  }
  
  protected void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    if (paramTextView == null) {
      return;
    }
    if (getActivity() == null) {
      return;
    }
    fn localfn = Sm.h();
    String str;
    if ((localfn != null) && (!va.e(localfn.f()))) {
      str = localfn.f();
    } else {
      str = this.m;
    }
    this.m = str;
    if ((localfn != null) && (!va.e(localfn.e()))) {
      str = localfn.e();
    } else {
      str = this.n;
    }
    this.n = str;
    if (!va.e(this.m))
    {
      if (!va.e(this.n)) {
        paramTextView.setText(Html.fromHtml(getString(rn.com_accountkit_confirmation_code_agreement_app_privacy_policy_and_terms, new Object[] { paramCharSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/", this.m, this.n, Sm.d() })));
      } else {
        paramTextView.setText(Html.fromHtml(getString(rn.com_accountkit_confirmation_code_agreement_app_privacy_policy, new Object[] { paramCharSequence, "https://m.facebook.com/terms", "https://m.facebook.com/about/privacy/", "https://m.facebook.com/policies/cookies/", this.m, Sm.d() })));
      }
    }
    else {
      paramTextView.setText(a(paramCharSequence));
    }
  }
  
  protected void a(Ga paramGa)
  {
    this.h = paramGa;
    b().putInt("login_flow_state", paramGa.ordinal());
  }
  
  public void a(Q paramQ)
  {
    this.g = paramQ;
    b().putInt("next_button_type", this.g.ordinal());
    Button localButton = this.j;
    if (localButton != null) {
      localButton.setText(paramQ.a());
    }
  }
  
  public void a(a parama)
  {
    this.f = parama;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    Button localButton = this.j;
    if (localButton != null) {
      localButton.setEnabled(paramBoolean);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    b().putBoolean("retry", paramBoolean);
  }
  
  public void c(boolean paramBoolean)
  {
    this.k = paramBoolean;
    b().putBoolean("retry button visible", this.k);
    TextView localTextView = this.i;
    if (localTextView != null)
    {
      int i1;
      if (paramBoolean) {
        i1 = 0;
      } else {
        i1 = 8;
      }
      localTextView.setVisibility(i1);
    }
  }
  
  public Ga e()
  {
    return this.h;
  }
  
  boolean f()
  {
    return true;
  }
  
  public boolean g()
  {
    return b().getBoolean("retry", false);
  }
  
  public void onStart()
  {
    super.onStart();
    a(this.l, this.j.getText());
  }
  
  public static abstract interface a
  {
    public abstract void a(Context paramContext);
    
    public abstract void a(Context paramContext, String paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */