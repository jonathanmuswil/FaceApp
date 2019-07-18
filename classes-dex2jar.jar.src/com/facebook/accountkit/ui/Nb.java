package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.accountkit.internal.D;
import com.facebook.accountkit.internal.K;
import com.facebook.accountkit.internal.c;
import com.facebook.accountkit.internal.c.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pn;
import qn;
import rn;

final class nb
  extends ba
{
  private static final Ga b = Ga.m;
  private a c;
  private zb.a d;
  private Eb.a e;
  private Eb.a f;
  private zb.a g;
  private zb.a h;
  
  nb(g paramg)
  {
    super(paramg);
  }
  
  public ca a()
  {
    if (this.c == null) {
      a(new a());
    }
    return this.c;
  }
  
  void a(long paramLong)
  {
    a locala = this.c;
    if (locala != null) {
      locala.a(paramLong);
    }
  }
  
  public void a(Eb.a parama)
  {
    this.e = parama;
  }
  
  public void a(ca paramca)
  {
    if (!(paramca instanceof a)) {
      return;
    }
    this.c = ((a)paramca);
    this.c.b().putParcelable(Tb.c, this.a.u());
    this.c.a(new hb(this));
  }
  
  public void a(String paramString)
  {
    a locala = this.c;
    if (locala != null) {
      locala.a(paramString);
    }
  }
  
  void a(List<Ja> paramList)
  {
    a locala = this.c;
    if (locala != null) {
      locala.a(paramList);
    }
  }
  
  public void b(Eb.a parama)
  {
    this.f = parama;
  }
  
  public void b(ca paramca)
  {
    if (!(paramca instanceof zb.a)) {
      return;
    }
    this.h = ((zb.a)paramca);
  }
  
  public Ga c()
  {
    return b;
  }
  
  public void c(ca paramca)
  {
    if (!(paramca instanceof zb.a)) {
      return;
    }
    this.d = ((zb.a)paramca);
  }
  
  public Eb.a d()
  {
    if (this.f == null) {
      b(b.a(this.a.u(), rn.com_accountkit_resend_title, new String[0]));
    }
    return this.f;
  }
  
  public ca e()
  {
    if (this.g == null) {
      this.g = zb.a(this.a.u(), c());
    }
    return this.g;
  }
  
  public ca f()
  {
    if (this.h == null) {
      b(zb.a(this.a.u(), c()));
    }
    return this.h;
  }
  
  protected void g()
  {
    c.a.f(true);
  }
  
  public static final class a
    extends ca
  {
    private static final String e = "a";
    private static final long f = TimeUnit.SECONDS.toMillis(1L);
    private static final String g;
    private static final String h;
    private static final String i;
    private Handler j;
    private TextView k;
    private String l;
    private a m;
    
    static
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(e);
      localStringBuilder.append(".FACEBOOK_NOTIFICATION_CHANNEL");
      g = localStringBuilder.toString();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(e);
      localStringBuilder.append(".VOICE_CALLBACK_NOTIFICATION_CHANNEL");
      h = localStringBuilder.toString();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(e);
      localStringBuilder.append(".RESEND_TIME_KEY");
      i = localStringBuilder.toString();
    }
    
    private void a(Button paramButton, int paramInt1, int paramInt2)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(getString(paramInt1)).append("\n");
      localSpannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, localSpannableStringBuilder.length(), 33);
      paramInt1 = localSpannableStringBuilder.length();
      localSpannableStringBuilder.append(getString(paramInt2));
      localSpannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-light"), paramInt1, localSpannableStringBuilder.length(), 33);
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(Ub.c(paramButton.getContext(), a())), paramInt1, localSpannableStringBuilder.length(), 33);
      paramButton.setText(localSpannableStringBuilder);
    }
    
    private void k()
    {
      View localView1 = getView();
      if (localView1 == null) {
        return;
      }
      View localView2 = localView1.findViewById(pn.com_accountkit_send_in_fb_button);
      boolean bool = h();
      int n = 0;
      if (bool) {
        i1 = 0;
      } else {
        i1 = 8;
      }
      localView2.setVisibility(i1);
      localView2 = localView1.findViewById(pn.com_accountkit_send_in_phone_call);
      if (i()) {
        i1 = 0;
      } else {
        i1 = 8;
      }
      localView2.setVisibility(i1);
      localView1 = localView1.findViewById(pn.com_accountkit_other_ways_textview);
      int i1 = n;
      if (!h()) {
        if (i()) {
          i1 = n;
        } else {
          i1 = 8;
        }
      }
      localView1.setVisibility(i1);
    }
    
    private void l()
    {
      if (isAdded())
      {
        Object localObject = this.l;
        if (localObject != null)
        {
          localObject = new SpannableString(getString(rn.com_accountkit_code_sent_to, new Object[] { localObject }));
          lb locallb = new lb(this);
          int n = ((SpannableString)localObject).toString().indexOf(this.l);
          ((SpannableString)localObject).setSpan(locallb, n, this.l.length() + n, 33);
          this.k.setText((CharSequence)localObject);
          this.k.setMovementMethod(LinkMovementMethod.getInstance());
        }
      }
    }
    
    private void m()
    {
      Object localObject = getView();
      if (localObject == null) {
        return;
      }
      localObject = ((View)localObject).findViewById(pn.com_accountkit_resend_button);
      if (localObject == null) {
        return;
      }
      localObject = (Button)localObject;
      long l1 = j();
      this.j.post(new mb(this, l1, (Button)localObject));
    }
    
    private void n()
    {
      l();
      k();
      m();
    }
    
    protected View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      return paramLayoutInflater.inflate(qn.com_accountkit_fragment_resend_bottom, paramViewGroup, false);
    }
    
    public void a(long paramLong)
    {
      b().putLong(i, paramLong);
      m();
    }
    
    protected void a(View paramView, Bundle paramBundle)
    {
      super.a(paramView, paramBundle);
      paramBundle = paramView.findViewById(pn.com_accountkit_resend_button);
      this.k = ((TextView)paramView.findViewById(pn.com_accountkit_accountkit_verify_number));
      if (paramBundle != null) {
        paramBundle.setOnClickListener(new ib(this));
      }
      paramBundle = (Button)paramView.findViewById(pn.com_accountkit_send_in_fb_button);
      a(paramBundle, rn.com_accountkit_button_send_code_in_fb, rn.com_accountkit_button_send_code_in_fb_details);
      paramBundle.setOnClickListener(new jb(this));
      paramBundle = (Button)paramView.findViewById(pn.com_accountkit_send_in_phone_call);
      paramView = c.n();
      boolean bool = paramView.a(K.c);
      int n;
      if ((paramView.a()) && (bool)) {
        n = rn.com_accountkit_button_send_code_in_call_from_facebook_details;
      } else {
        n = rn.com_accountkit_button_send_code_in_call_details;
      }
      a(paramBundle, rn.com_accountkit_button_send_code_in_call, n);
      paramBundle.setOnClickListener(new kb(this, bool));
      n();
    }
    
    public void a(a parama)
    {
      this.m = parama;
    }
    
    public void a(String paramString)
    {
      this.l = paramString;
      l();
    }
    
    public void a(List<Ja> paramList)
    {
      b().putBoolean(g, paramList.contains(Ja.b));
      b().putBoolean(h, paramList.contains(Ja.c));
      k();
    }
    
    Ga e()
    {
      return nb.h();
    }
    
    boolean f()
    {
      return false;
    }
    
    public boolean h()
    {
      return b().getBoolean(g);
    }
    
    public boolean i()
    {
      return b().getBoolean(h);
    }
    
    public long j()
    {
      return b().getLong(i);
    }
    
    public void onPause()
    {
      super.onPause();
      this.j.removeCallbacksAndMessages(null);
    }
    
    public void onStart()
    {
      super.onStart();
      n();
    }
    
    public void onViewCreated(View paramView, Bundle paramBundle)
    {
      super.onViewCreated(paramView, paramBundle);
      this.j = new Handler();
    }
    
    public static abstract interface a
    {
      public abstract void a(Context paramContext);
      
      public abstract void b(Context paramContext);
      
      public abstract void c(Context paramContext);
      
      public abstract void d(Context paramContext);
    }
  }
  
  public static final class b
    extends Eb.a
  {
    public static b a(Fb paramFb, int paramInt, String... paramVarArgs)
    {
      b localb = new b();
      localb.b().putParcelable(Tb.c, paramFb);
      localb.a(paramInt, paramVarArgs);
      return localb;
    }
    
    protected void a(View paramView, Bundle paramBundle)
    {
      super.a(paramView, paramBundle);
      this.e.setGravity(16);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */