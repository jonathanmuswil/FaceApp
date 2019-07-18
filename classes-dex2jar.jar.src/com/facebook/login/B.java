package com.facebook.login;

import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.l;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookSdk;
import com.facebook.i;
import com.facebook.internal.C;
import com.facebook.internal.S;
import com.facebook.internal.T;
import com.facebook.internal.y;
import com.facebook.p;
import com.facebook.r;
import com.facebook.t;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class b
  extends O
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  private static final String[] d = { "com.android.chrome", "com.chrome.beta", "com.chrome.dev" };
  private String e;
  private String f;
  
  b(Parcel paramParcel)
  {
    super(paramParcel);
    this.f = paramParcel.readString();
  }
  
  b(z paramz)
  {
    super(paramz);
    this.f = S.a(20);
  }
  
  private void a(String paramString, z.c paramc)
  {
    Bundle localBundle;
    String str1;
    String str2;
    if ((paramString != null) && (paramString.startsWith(CustomTabMainActivity.a())))
    {
      paramString = Uri.parse(paramString);
      localBundle = S.d(paramString.getQuery());
      localBundle.putAll(S.d(paramString.getFragment()));
      if (!a(localBundle))
      {
        super.a(paramc, null, new p("Invalid state parameter"));
        return;
      }
      paramString = localBundle.getString("error");
      str1 = paramString;
      if (paramString == null) {
        str1 = localBundle.getString("error_type");
      }
      str2 = localBundle.getString("error_msg");
      paramString = str2;
      if (str2 == null) {
        paramString = localBundle.getString("error_message");
      }
      str2 = paramString;
      if (paramString == null) {
        str2 = localBundle.getString("error_description");
      }
      paramString = localBundle.getString("error_code");
      if (S.b(paramString)) {}
    }
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException paramString)
    {
      int i;
      for (;;) {}
    }
    i = -1;
    if ((S.b(str1)) && (S.b(str2)) && (i == -1)) {
      super.a(paramc, localBundle, null);
    } else if ((str1 != null) && ((str1.equals("access_denied")) || (str1.equals("OAuthAccessDeniedException")))) {
      super.a(paramc, null, new r());
    } else if (i == 4201) {
      super.a(paramc, null, new r());
    } else {
      super.a(paramc, null, new com.facebook.z(new t(i, str1, str2), str2));
    }
  }
  
  private boolean a(Bundle paramBundle)
  {
    try
    {
      paramBundle = paramBundle.getString("state");
      if (paramBundle == null) {
        return false;
      }
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramBundle);
      boolean bool = localJSONObject.getString("7_challenge").equals(this.f);
      return bool;
    }
    catch (JSONException paramBundle) {}
    return false;
  }
  
  private String s()
  {
    Object localObject1 = this.e;
    if (localObject1 != null) {
      return (String)localObject1;
    }
    Object localObject2 = this.b.n();
    localObject1 = new Intent("android.support.customtabs.action.CustomTabsService");
    localObject2 = ((ContextWrapper)localObject2).getPackageManager().queryIntentServices((Intent)localObject1, 0);
    if (localObject2 != null)
    {
      localObject1 = new HashSet(Arrays.asList(d));
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = ((ResolveInfo)localIterator.next()).serviceInfo;
        if ((localObject2 != null) && (((Set)localObject1).contains(((ServiceInfo)localObject2).packageName)))
        {
          this.e = ((ServiceInfo)localObject2).packageName;
          return this.e;
        }
      }
    }
    return null;
  }
  
  private boolean t()
  {
    boolean bool;
    if ((v()) && (s() != null) && (u()) && (T.a(FacebookSdk.d()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean u()
  {
    return !S.d(this.b.n());
  }
  
  private boolean v()
  {
    y localy = C.b(S.c(this.b.n()));
    boolean bool;
    if ((localy != null) && (localy.d())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void a(JSONObject paramJSONObject)
    throws JSONException
  {
    paramJSONObject.put("7_challenge", this.f);
  }
  
  boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 != 1) {
      return super.a(paramInt1, paramInt2, paramIntent);
    }
    z.c localc = this.b.t();
    if (paramInt2 == -1)
    {
      a(paramIntent.getStringExtra(CustomTabMainActivity.c), localc);
      return true;
    }
    super.a(localc, null, new r());
    return false;
  }
  
  boolean a(z.c paramc)
  {
    if (!t()) {
      return false;
    }
    Bundle localBundle = b(paramc);
    a(localBundle, paramc);
    paramc = new Intent(this.b.n(), CustomTabMainActivity.class);
    paramc.putExtra(CustomTabMainActivity.a, localBundle);
    paramc.putExtra(CustomTabMainActivity.b, s());
    this.b.q().a(paramc, 1);
    return true;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  String m()
  {
    return "custom_tab";
  }
  
  protected String o()
  {
    return "chrome_custom_tab";
  }
  
  i p()
  {
    return i.f;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.f);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */