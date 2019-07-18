package com.facebook.login;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import com.facebook.FacebookSdk;
import com.facebook.G;
import com.facebook.J;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.common.c;
import com.facebook.internal.S.b;
import com.facebook.internal.T;
import com.facebook.p;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oo;

public class l
  extends android.support.v4.app.h
{
  private View ha;
  private TextView ia;
  private TextView ja;
  private n ka;
  private AtomicBoolean la = new AtomicBoolean();
  private volatile G ma;
  private volatile ScheduledFuture na;
  private volatile a oa;
  private Dialog pa;
  private boolean qa = false;
  private boolean ra = false;
  private z.c sa = null;
  
  private com.facebook.E Pb()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("code", this.oa.n());
    return new com.facebook.E(null, "device/login_status", localBundle, J.b, new g(this));
  }
  
  private void Qb()
  {
    this.oa.b(new Date().getTime());
    this.ma = Pb().c();
  }
  
  private void Rb()
  {
    this.na = n.p().schedule(new f(this), this.oa.m(), TimeUnit.SECONDS);
  }
  
  private void a(a parama)
  {
    this.oa = parama;
    this.ia.setText(parama.o());
    Object localObject = oo.b(parama.l());
    localObject = new BitmapDrawable(Wa(), (Bitmap)localObject);
    this.ja.setCompoundDrawablesWithIntrinsicBounds(null, (Drawable)localObject, null, null);
    this.ia.setVisibility(0);
    this.ha.setVisibility(8);
    if ((!this.ra) && (oo.c(parama.o()))) {
      AppEventsLogger.newLogger(La()).logSdkEvent("fb_smart_login_service", null, null);
    }
    if (parama.p()) {
      Rb();
    } else {
      Qb();
    }
  }
  
  private void a(String paramString1, S.b paramb, String paramString2, String paramString3, Date paramDate1, Date paramDate2)
  {
    String str1 = Wa().getString(com.facebook.common.d.com_facebook_smart_login_confirmation_title);
    Object localObject = Wa().getString(com.facebook.common.d.com_facebook_smart_login_confirmation_continue_as);
    String str2 = Wa().getString(com.facebook.common.d.com_facebook_smart_login_confirmation_cancel);
    paramString3 = String.format((String)localObject, new Object[] { paramString3 });
    localObject = new AlertDialog.Builder(La());
    ((AlertDialog.Builder)localObject).setMessage(str1).setCancelable(true).setNegativeButton(paramString3, new i(this, paramString1, paramb, paramString2, paramDate1, paramDate2)).setPositiveButton(str2, new h(this));
    ((AlertDialog.Builder)localObject).create().show();
  }
  
  private void a(String paramString1, S.b paramb, String paramString2, Date paramDate1, Date paramDate2)
  {
    this.ka.a(paramString2, FacebookSdk.e(), paramString1, paramb.b(), paramb.a(), com.facebook.i.i, paramDate1, null, paramDate2);
    this.pa.dismiss();
  }
  
  private void a(String paramString, Long paramLong1, Long paramLong2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id,permissions,name");
    long l = paramLong1.longValue();
    Object localObject1 = null;
    if (l != 0L) {
      paramLong1 = new Date(new Date().getTime() + paramLong1.longValue() * 1000L);
    } else {
      paramLong1 = null;
    }
    Object localObject2 = localObject1;
    if (paramLong2.longValue() != 0L)
    {
      localObject2 = localObject1;
      if (paramLong2 != null) {
        localObject2 = new Date(paramLong2.longValue() * 1000L);
      }
    }
    new com.facebook.E(new com.facebook.b(paramString, FacebookSdk.e(), "0", null, null, null, paramLong1, null, (Date)localObject2), "me", localBundle, J.a, new j(this, paramString, paramLong1, (Date)localObject2)).c();
  }
  
  protected int C(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = c.com_facebook_smart_device_dialog_fragment;
    } else {
      i = c.com_facebook_device_auth_dialog_fragment;
    }
    return i;
  }
  
  protected View D(boolean paramBoolean)
  {
    View localView = Ea().getLayoutInflater().inflate(C(paramBoolean), null);
    this.ha = localView.findViewById(com.facebook.common.b.progress_bar);
    this.ia = ((TextView)localView.findViewById(com.facebook.common.b.confirmation_code));
    ((Button)localView.findViewById(com.facebook.common.b.cancel_button)).setOnClickListener(new e(this));
    this.ja = ((TextView)localView.findViewById(com.facebook.common.b.com_facebook_device_auth_instructions));
    this.ja.setText(Html.fromHtml(b(com.facebook.common.d.com_facebook_device_auth_instructions)));
    return localView;
  }
  
  protected void Ob()
  {
    if (!this.la.compareAndSet(false, true)) {
      return;
    }
    if (this.oa != null) {
      oo.a(this.oa.o());
    }
    n localn = this.ka;
    if (localn != null) {
      localn.q();
    }
    this.pa.dismiss();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    this.ka = ((n)((E)((FacebookActivity)Ea()).j()).Nb().o());
    if (paramBundle != null)
    {
      paramViewGroup = (a)paramBundle.getParcelable("request_state");
      if (paramViewGroup != null) {
        a(paramViewGroup);
      }
    }
    return paramLayoutInflater;
  }
  
  public void a(z.c paramc)
  {
    this.sa = paramc;
    Bundle localBundle = new Bundle();
    localBundle.putString("scope", TextUtils.join(",", paramc.s()));
    String str = paramc.q();
    if (str != null) {
      localBundle.putString("redirect_uri", str);
    }
    paramc = paramc.p();
    if (paramc != null) {
      localBundle.putString("target_user_id", paramc);
    }
    paramc = new StringBuilder();
    paramc.append(T.a());
    paramc.append("|");
    paramc.append(T.b());
    localBundle.putString("access_token", paramc.toString());
    localBundle.putString("device_info", oo.a());
    new com.facebook.E(null, "device/login", localBundle, J.b, new d(this)).c();
  }
  
  protected void a(p paramp)
  {
    if (!this.la.compareAndSet(false, true)) {
      return;
    }
    if (this.oa != null) {
      oo.a(this.oa.o());
    }
    this.ka.a(paramp);
    this.pa.dismiss();
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.oa != null) {
      paramBundle.putParcelable("request_state", this.oa);
    }
  }
  
  public Dialog n(Bundle paramBundle)
  {
    this.pa = new Dialog(Ea(), com.facebook.common.e.com_facebook_auth_dialog);
    boolean bool;
    if ((oo.b()) && (!this.ra)) {
      bool = true;
    } else {
      bool = false;
    }
    paramBundle = D(bool);
    this.pa.setContentView(paramBundle);
    return this.pa;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (!this.qa) {
      Ob();
    }
  }
  
  public void qb()
  {
    this.qa = true;
    this.la.set(true);
    super.qb();
    if (this.ma != null) {
      this.ma.cancel(true);
    }
    if (this.na != null) {
      this.na.cancel(true);
    }
  }
  
  private static class a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new k();
    private String a;
    private String b;
    private String c;
    private long d;
    private long e;
    
    a() {}
    
    protected a(Parcel paramParcel)
    {
      this.a = paramParcel.readString();
      this.b = paramParcel.readString();
      this.c = paramParcel.readString();
      this.d = paramParcel.readLong();
      this.e = paramParcel.readLong();
    }
    
    public void a(long paramLong)
    {
      this.d = paramLong;
    }
    
    public void a(String paramString)
    {
      this.c = paramString;
    }
    
    public void b(long paramLong)
    {
      this.e = paramLong;
    }
    
    public void b(String paramString)
    {
      this.b = paramString;
      this.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[] { paramString });
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String l()
    {
      return this.a;
    }
    
    public long m()
    {
      return this.d;
    }
    
    public String n()
    {
      return this.c;
    }
    
    public String o()
    {
      return this.b;
    }
    
    public boolean p()
    {
      long l = this.e;
      boolean bool = false;
      if (l == 0L) {
        return false;
      }
      if (new Date().getTime() - this.e - this.d * 1000L < 0L) {
        bool = true;
      }
      return bool;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.a);
      paramParcel.writeString(this.b);
      paramParcel.writeString(this.c);
      paramParcel.writeLong(this.d);
      paramParcel.writeLong(this.e);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */