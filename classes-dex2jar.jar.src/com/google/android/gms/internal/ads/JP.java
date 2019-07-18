package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.common.util.m;

@yh
@TargetApi(11)
public final class jp
  extends WebChromeClient
{
  private final sp a;
  
  public jp(sp paramsp)
  {
    this.a = paramsp;
  }
  
  private static Context a(WebView paramWebView)
  {
    if (!(paramWebView instanceof sp)) {
      return paramWebView.getContext();
    }
    paramWebView = (sp)paramWebView;
    Activity localActivity = paramWebView.i();
    if (localActivity != null) {
      return localActivity;
    }
    return paramWebView.getContext();
  }
  
  private final boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    try
    {
      Object localObject;
      if ((this.a != null) && (this.a.a() != null) && (this.a.a().h() != null))
      {
        localObject = this.a.a().h();
        if ((localObject != null) && (!((b)localObject).b()))
        {
          int i = String.valueOf(paramString1).length();
          int j = String.valueOf(paramString3).length();
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>(i + 11 + j);
          paramContext.append("window.");
          paramContext.append(paramString1);
          paramContext.append("('");
          paramContext.append(paramString3);
          paramContext.append("')");
          ((b)localObject).a(paramContext.toString());
          return false;
        }
      }
      paramString1 = new android/app/AlertDialog$Builder;
      paramString1.<init>(paramContext);
      paramString1.setTitle(paramString2);
      if (paramBoolean)
      {
        paramJsResult = new android/widget/LinearLayout;
        paramJsResult.<init>(paramContext);
        paramJsResult.setOrientation(1);
        localObject = new android/widget/TextView;
        ((TextView)localObject).<init>(paramContext);
        ((TextView)localObject).setText(paramString3);
        paramString2 = new android/widget/EditText;
        paramString2.<init>(paramContext);
        paramString2.setText(paramString4);
        paramJsResult.addView((View)localObject);
        paramJsResult.addView(paramString2);
        paramContext = paramString1.setView(paramJsResult);
        paramString1 = new com/google/android/gms/internal/ads/pp;
        paramString1.<init>(paramJsPromptResult, paramString2);
        paramContext = paramContext.setPositiveButton(17039370, paramString1);
        paramString1 = new com/google/android/gms/internal/ads/op;
        paramString1.<init>(paramJsPromptResult);
        paramString1 = paramContext.setNegativeButton(17039360, paramString1);
        paramContext = new com/google/android/gms/internal/ads/np;
        paramContext.<init>(paramJsPromptResult);
        paramString1.setOnCancelListener(paramContext).create().show();
      }
      else
      {
        paramString1 = paramString1.setMessage(paramString3);
        paramContext = new com/google/android/gms/internal/ads/mp;
        paramContext.<init>(paramJsResult);
        paramString1 = paramString1.setPositiveButton(17039370, paramContext);
        paramContext = new com/google/android/gms/internal/ads/lp;
        paramContext.<init>(paramJsResult);
        paramContext = paramString1.setNegativeButton(17039360, paramContext);
        paramString1 = new com/google/android/gms/internal/ads/kp;
        paramString1.<init>(paramJsResult);
        paramContext.setOnCancelListener(paramString1).create().show();
      }
    }
    catch (WindowManager.BadTokenException paramContext)
    {
      Tl.c("Fail to display Dialog.", paramContext);
    }
    return true;
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    if (!(paramWebView instanceof sp))
    {
      Tl.d("Tried to close a WebView that wasn't an AdWebView.");
      return;
    }
    paramWebView = ((sp)paramWebView).w();
    if (paramWebView == null)
    {
      Tl.d("Tried to close an AdWebView not associated with an overlay.");
      return;
    }
    paramWebView.Gb();
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str1 = paramConsoleMessage.message();
    String str2 = paramConsoleMessage.sourceId();
    int i = paramConsoleMessage.lineNumber();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 19 + String.valueOf(str2).length());
    localStringBuilder.append("JS: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" (");
    localStringBuilder.append(str2);
    localStringBuilder.append(":");
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    str1 = localStringBuilder.toString();
    if (str1.contains("Application Cache")) {
      return super.onConsoleMessage(paramConsoleMessage);
    }
    i = qp.a[paramConsoleMessage.messageLevel().ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if ((i != 3) && (i != 4))
        {
          if (i != 5) {
            Tl.c(str1);
          } else {
            Tl.a(str1);
          }
        }
        else {
          Tl.c(str1);
        }
      }
      else {
        Tl.d(str1);
      }
    }
    else {
      Tl.b(str1);
    }
    return super.onConsoleMessage(paramConsoleMessage);
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)paramMessage.obj;
    paramWebView = new WebView(paramWebView.getContext());
    if (this.a.d() != null) {
      paramWebView.setWebViewClient(this.a.d());
    }
    localWebViewTransport.setWebView(paramWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l = 5242880L - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L)
    {
      if ((paramLong2 > l) || (paramLong2 > 1048576L)) {
        paramLong2 = 0L;
      }
    }
    else
    {
      if (paramLong2 == 0L) {
        paramLong3 = Math.min(paramLong1 + Math.min(131072L, l), 1048576L);
      }
      for (;;)
      {
        paramLong2 = paramLong3;
        break;
        paramLong3 = paramLong1;
        if (paramLong2 <= Math.min(1048576L - paramLong1, l)) {
          paramLong3 = paramLong1 + paramLong2;
        }
      }
    }
    paramQuotaUpdater.updateQuota(paramLong2);
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      k.c();
      if (!vk.a(this.a.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
      {
        k.c();
        if (!vk.a(this.a.getContext(), "android.permission.ACCESS_COARSE_LOCATION"))
        {
          bool = false;
          break label58;
        }
      }
      boolean bool = true;
      label58:
      paramCallback.invoke(paramString, bool, true);
    }
  }
  
  public final void onHideCustomView()
  {
    d locald = this.a.w();
    if (locald == null)
    {
      Tl.d("Could not get ad overlay when hiding custom view.");
      return;
    }
    locald.Hb();
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), "alert", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), "onBeforeUnload", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), "confirm", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(a(paramWebView), "prompt", paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  @TargetApi(21)
  public final void onPermissionRequest(PermissionRequest paramPermissionRequest)
  {
    if (m.h())
    {
      Object localObject = ra.Sa;
      if (!((Boolean)Kea.e().a((ga)localObject)).booleanValue())
      {
        localObject = this.a;
        if ((localObject != null) && (((sp)localObject).a() != null) && (this.a.a().g() != null))
        {
          localObject = this.a.a().g().a(paramPermissionRequest.getResources());
          if (localObject.length > 0)
          {
            paramPermissionRequest.grant((String[])localObject);
            return;
          }
          paramPermissionRequest.deny();
          return;
        }
        super.onPermissionRequest(paramPermissionRequest);
        return;
      }
    }
    super.onPermissionRequest(paramPermissionRequest);
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    paramLong1 += 131072L;
    if (5242880L - paramLong2 < paramLong1)
    {
      paramQuotaUpdater.updateQuota(0L);
      return;
    }
    paramQuotaUpdater.updateQuota(paramLong1);
  }
  
  @Deprecated
  public final void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    d locald = this.a.w();
    if (locald == null)
    {
      Tl.d("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    locald.a(paramView, paramCustomViewCallback);
    locald.n(paramInt);
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    onShowCustomView(paramView, -1, paramCustomViewCallback);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */