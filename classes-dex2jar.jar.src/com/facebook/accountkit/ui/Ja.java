package com.facebook.accountkit.ui;

import Mp;
import Sm;
import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import com.facebook.accountkit.internal.c;
import com.facebook.accountkit.internal.c.a;
import com.facebook.accountkit.internal.va;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.HintRequest.a;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.common.api.f;
import java.util.List;
import pn;
import qn;
import rn;

final class ja
  extends ba
  implements P
{
  private static final Q b = Q.e;
  private static final Ga c = Ga.c;
  private a d;
  private Q e = b;
  private zb.a f;
  private Eb.a g;
  private Eb.a h;
  private e i;
  private f j;
  private d k;
  
  ja(g paramg)
  {
    super(paramg);
    c.o();
  }
  
  static b a(String paramString1, String paramString2)
  {
    if (!va.e(paramString1))
    {
      if (paramString1.equals(paramString2)) {
        return b.c;
      }
      return b.b;
    }
    return b.a;
  }
  
  static c a(String paramString1, String paramString2, List<String> paramList)
  {
    if (!va.e(paramString1))
    {
      if (paramString1.equals(paramString2)) {
        return c.d;
      }
      return c.b;
    }
    if ((paramList != null) && (!paramList.isEmpty())) {
      return c.c;
    }
    return c.a;
  }
  
  private static void a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("autofill_email_method", paramString);
    c.a.a("ak_email_autofilled", localBundle);
  }
  
  private d m()
  {
    if (this.k == null) {
      this.k = new ha(this);
    }
    return this.k;
  }
  
  private void n()
  {
    f localf = this.j;
    if (localf != null)
    {
      a locala = this.d;
      if (locala != null)
      {
        locala.a(va.e(localf.h()) ^ true);
        this.d.a(j());
      }
    }
  }
  
  public ca a()
  {
    if (this.d == null) {
      a(new a());
    }
    return this.d;
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    Ub.a(k());
  }
  
  public void a(Eb.a parama)
  {
    this.g = parama;
  }
  
  public void a(Q paramQ)
  {
    this.e = paramQ;
    n();
  }
  
  public void a(ca paramca)
  {
    if (!(paramca instanceof a)) {
      return;
    }
    this.d = ((a)paramca);
    this.d.b().putParcelable(Tb.c, this.a.u());
    this.d.a(m());
    n();
  }
  
  public void b(Eb.a parama)
  {
    this.h = parama;
  }
  
  public void b(ca paramca)
  {
    if (!(paramca instanceof f)) {
      return;
    }
    this.j = ((f)paramca);
    this.j.b().putParcelable(Tb.c, this.a.u());
    this.j.a(new ga(this));
    this.j.a(m());
    paramca = this.a;
    if ((paramca != null) && (paramca.n() != null)) {
      this.j.a(this.a.n());
    }
    n();
  }
  
  public boolean b()
  {
    return false;
  }
  
  public Ga c()
  {
    return c;
  }
  
  public void c(ca paramca)
  {
    if (!(paramca instanceof zb.a)) {
      return;
    }
    this.f = ((zb.a)paramca);
  }
  
  public Eb.a d()
  {
    if (this.h == null) {
      this.h = Eb.a(this.a.u(), rn.com_accountkit_email_login_title, new String[0]);
    }
    return this.h;
  }
  
  public void d(ca paramca)
  {
    if (!(paramca instanceof e)) {
      return;
    }
    this.i = ((e)paramca);
    this.i.b().putParcelable(Tb.c, this.a.u());
    this.i.a(new fa(this));
  }
  
  public ca e()
  {
    if (this.i == null) {
      d(new e());
    }
    return this.i;
  }
  
  public ca f()
  {
    if (this.j == null) {
      b(new f());
    }
    return this.j;
  }
  
  protected void g()
  {
    a locala = this.d;
    if (locala == null) {
      return;
    }
    c.a.d(locala.h());
  }
  
  public Q j()
  {
    return this.e;
  }
  
  public View k()
  {
    f localf = this.j;
    if (localf == null) {
      return null;
    }
    return f.d(localf);
  }
  
  void l()
  {
    Object localObject = this.h;
    if (localObject != null) {
      ((Eb.a)localObject).a(rn.com_accountkit_email_login_retry_title, new String[0]);
    }
    localObject = this.d;
    if (localObject != null) {
      ((a)localObject).b(true);
    }
    localObject = this.i;
    if (localObject != null) {
      ((Bb)localObject).i();
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 152) && (paramInt2 == -1))
    {
      paramIntent = (Credential)paramIntent.getParcelableExtra("com.google.android.gms.credentials.Credential");
      if (paramIntent != null)
      {
        f localf = this.j;
        if (localf != null)
        {
          localf.b(paramIntent.B());
          a("autofill_email_by_google");
        }
      }
    }
  }
  
  public static final class a
    extends ca
  {
    private Button e;
    private boolean f;
    private Q g = ja.h();
    private ja.d h;
    
    private void i()
    {
      Button localButton = this.e;
      if (localButton != null) {
        localButton.setText(g());
      }
    }
    
    protected View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      paramViewGroup = paramLayoutInflater.inflate(qn.com_accountkit_fragment_email_login_bottom, paramViewGroup, false);
      paramBundle = a();
      paramLayoutInflater = paramViewGroup;
      if ((paramBundle instanceof ub))
      {
        paramLayoutInflater = paramViewGroup;
        if (((ub)paramBundle).o() == ub.a.c)
        {
          paramLayoutInflater = paramViewGroup.findViewById(pn.com_accountkit_next_button);
          ((ViewGroup)paramViewGroup).removeView(paramLayoutInflater);
          paramLayoutInflater.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
      }
      return paramLayoutInflater;
    }
    
    protected void a(View paramView, Bundle paramBundle)
    {
      super.a(paramView, paramBundle);
      this.e = ((Button)paramView.findViewById(pn.com_accountkit_next_button));
      paramView = this.e;
      if (paramView != null)
      {
        paramView.setEnabled(this.f);
        this.e.setOnClickListener(new ia(this));
      }
      i();
    }
    
    public void a(Q paramQ)
    {
      this.g = paramQ;
      i();
    }
    
    public void a(ja.d paramd)
    {
      this.h = paramd;
    }
    
    public void a(boolean paramBoolean)
    {
      this.f = paramBoolean;
      Button localButton = this.e;
      if (localButton != null) {
        localButton.setEnabled(paramBoolean);
      }
    }
    
    public void b(boolean paramBoolean)
    {
      b().putBoolean("retry", paramBoolean);
      i();
    }
    
    Ga e()
    {
      return ja.i();
    }
    
    boolean f()
    {
      return true;
    }
    
    public int g()
    {
      if (h()) {
        return rn.com_accountkit_resend_email_text;
      }
      return this.g.a();
    }
    
    public boolean h()
    {
      return b().getBoolean("retry", false);
    }
  }
  
  static enum b
  {
    private b() {}
  }
  
  static enum c
  {
    private c() {}
  }
  
  public static abstract interface d
  {
    public abstract void a(Context paramContext, String paramString);
  }
  
  public static final class e
    extends Bb
  {
    protected Spanned a(String paramString)
    {
      return Html.fromHtml(getString(rn.com_accountkit_email_login_text, new Object[] { paramString, Sm.d(), "https://www.accountkit.com/faq" }));
    }
    
    protected View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      return paramLayoutInflater.inflate(qn.com_accountkit_fragment_email_login_text, paramViewGroup, false);
    }
    
    Ga e()
    {
      return ja.i();
    }
    
    boolean f()
    {
      return false;
    }
  }
  
  public static final class f
    extends ca
  {
    private AutoCompleteTextView e;
    private android.support.design.widget.ba f;
    private a g;
    private ja.d h;
    
    private void j()
    {
      Object localObject1 = getActivity();
      Object localObject2 = va.b(((Activity)localObject1).getApplicationContext());
      if (localObject2 != null)
      {
        this.e.setAdapter(new ArrayAdapter((Context)localObject1, 17367050, (List)localObject2));
        this.e.setOnItemClickListener(new ma(this));
      }
      localObject2 = g();
      if (!va.e((String)localObject2))
      {
        this.e.setText((CharSequence)localObject2);
        this.e.setSelection(((String)localObject2).length());
      }
      else if (va.d(getActivity()))
      {
        localObject2 = d();
        if ((localObject2 != null) && (c() == ja.i()) && (va.e(h())))
        {
          localObject1 = new HintRequest.a();
          ((HintRequest.a)localObject1).a(true);
          localObject1 = ((HintRequest.a)localObject1).a();
          localObject2 = Mp.i.a((f)localObject2, (HintRequest)localObject1);
          try
          {
            getActivity().startIntentSenderForResult(((PendingIntent)localObject2).getIntentSender(), 152, null, 0, 0, 0);
          }
          catch (IntentSender.SendIntentException localSendIntentException)
          {
            Log.w(Tb.a, "Failed to send intent", localSendIntentException);
          }
        }
      }
    }
    
    protected View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      return paramLayoutInflater.inflate(qn.com_accountkit_fragment_email_login_top, paramViewGroup, false);
    }
    
    protected void a(View paramView, Bundle paramBundle)
    {
      super.a(paramView, paramBundle);
      this.e = ((AutoCompleteTextView)paramView.findViewById(pn.com_accountkit_email));
      this.f = ((android.support.design.widget.ba)paramView.findViewById(pn.com_accountkit_email_layout));
      paramView = this.e;
      if (paramView != null)
      {
        paramView.addTextChangedListener(new ka(this));
        this.e.setOnEditorActionListener(new la(this));
        this.e.setInputType(33);
      }
    }
    
    public void a(ja.d paramd)
    {
      this.h = paramd;
    }
    
    public void a(a parama)
    {
      this.g = parama;
    }
    
    public void a(String paramString)
    {
      b().putString("appSuppliedEmail", paramString);
    }
    
    public void b(String paramString)
    {
      this.e.setText(paramString);
      this.e.setSelection(paramString.length());
    }
    
    public void c(String paramString)
    {
      b().putString("selectedEmail", paramString);
    }
    
    Ga e()
    {
      return ja.i();
    }
    
    boolean f()
    {
      return false;
    }
    
    public String g()
    {
      return b().getString("appSuppliedEmail");
    }
    
    public String h()
    {
      AutoCompleteTextView localAutoCompleteTextView = this.e;
      if (localAutoCompleteTextView == null) {
        return null;
      }
      return localAutoCompleteTextView.getText().toString();
    }
    
    public String i()
    {
      return b().getString("selectedEmail");
    }
    
    public void onStart()
    {
      super.onStart();
      j();
    }
    
    public static abstract interface a
    {
      public abstract void a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */