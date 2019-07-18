package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

public class w
  extends Y
{
  private static final String o = "com.facebook.internal.w";
  private boolean p;
  
  private w(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1);
    b(paramString2);
  }
  
  public static w a(Context paramContext, String paramString1, String paramString2)
  {
    Y.a(paramContext);
    return new w(paramContext, paramString1, paramString2);
  }
  
  protected Bundle a(String paramString)
  {
    Bundle localBundle = S.d(Uri.parse(paramString).getQuery());
    Object localObject = localBundle.getString("bridge_args");
    localBundle.remove("bridge_args");
    if (!S.b((String)localObject)) {
      try
      {
        paramString = new org/json/JSONObject;
        paramString.<init>((String)localObject);
        localBundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", k.a(paramString));
      }
      catch (JSONException paramString)
      {
        S.a(o, "Unable to parse bridge_args JSON", paramString);
      }
    }
    localObject = localBundle.getString("method_results");
    localBundle.remove("method_results");
    if (!S.b((String)localObject))
    {
      paramString = (String)localObject;
      if (S.b((String)localObject)) {
        paramString = "{}";
      }
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        localBundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", k.a((JSONObject)localObject));
      }
      catch (JSONException paramString)
      {
        S.a(o, "Unable to parse bridge_args JSON", paramString);
      }
    }
    localBundle.remove("version");
    localBundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", J.c());
    return localBundle;
  }
  
  public void cancel()
  {
    WebView localWebView = b();
    if ((d()) && (!c()) && (localWebView != null) && (localWebView.isShown()))
    {
      if (this.p) {
        return;
      }
      this.p = true;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("javascript:");
      localStringBuilder.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
      localWebView.loadUrl(localStringBuilder.toString());
      new Handler(Looper.getMainLooper()).postDelayed(new v(this), 1500L);
      return;
    }
    super.cancel();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */