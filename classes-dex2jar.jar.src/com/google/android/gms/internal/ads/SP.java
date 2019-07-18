package com.google.android.gms.internal.ads;

import Hq;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.common.util.n;

@yh
public abstract interface sp
  extends j, Dd, be, wn, Qp, Rp, Wp, Zp, _p, aq, mca
{
  public abstract boolean A();
  
  public abstract d B();
  
  public abstract boolean C();
  
  public abstract Fa D();
  
  public abstract gq E();
  
  public abstract bq a();
  
  public abstract void a(Hq paramHq);
  
  public abstract void a(Context paramContext);
  
  public abstract void a(d paramd);
  
  public abstract void a(Jp paramJp);
  
  public abstract void a(Ta paramTa);
  
  public abstract void a(Va paramVa);
  
  public abstract void a(gq paramgq);
  
  public abstract void a(String paramString, n<Ic<? super sp>> paramn);
  
  public abstract void a(String paramString, Ic<? super sp> paramIc);
  
  public abstract void a(String paramString, Lo paramLo);
  
  public abstract void a(String paramString1, String paramString2, String paramString3);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract boolean a(boolean paramBoolean, int paramInt);
  
  public abstract void b(d paramd);
  
  public abstract void b(String paramString, Ic<? super sp> paramIc);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract boolean b();
  
  public abstract String c();
  
  public abstract void c(int paramInt);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract WebViewClient d();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void destroy();
  
  public abstract a e();
  
  public abstract void e(boolean paramBoolean);
  
  public abstract void f();
  
  public abstract boolean g();
  
  public abstract Context getContext();
  
  public abstract int getHeight();
  
  public abstract ViewGroup.LayoutParams getLayoutParams();
  
  public abstract void getLocationOnScreen(int[] paramArrayOfInt);
  
  public abstract ViewParent getParent();
  
  public abstract View getView();
  
  public abstract WebView getWebView();
  
  public abstract int getWidth();
  
  public abstract Activity i();
  
  public abstract boolean isDestroyed();
  
  public abstract void j();
  
  public abstract void loadData(String paramString1, String paramString2, String paramString3);
  
  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);
  
  public abstract void loadUrl(String paramString);
  
  public abstract void m();
  
  public abstract void measure(int paramInt1, int paramInt2);
  
  public abstract hP n();
  
  public abstract void o();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract Va p();
  
  public abstract Hq q();
  
  public abstract void r();
  
  public abstract Context s();
  
  public abstract void setBackgroundColor(int paramInt);
  
  public abstract void setOnClickListener(View.OnClickListener paramOnClickListener);
  
  public abstract void setOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract void setRequestedOrientation(int paramInt);
  
  public abstract void setWebChromeClient(WebChromeClient paramWebChromeClient);
  
  public abstract void setWebViewClient(WebViewClient paramWebViewClient);
  
  public abstract Jp t();
  
  public abstract void u();
  
  public abstract boolean v();
  
  public abstract d w();
  
  public abstract void x();
  
  public abstract void y();
  
  public abstract Yl z();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */