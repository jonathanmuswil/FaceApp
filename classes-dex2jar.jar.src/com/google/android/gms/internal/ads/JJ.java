package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import hq;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class jj
  extends fq
{
  public static final Parcelable.Creator<jj> CREATOR = new lj();
  public final String a;
  public final String b;
  public final boolean c;
  public final boolean d;
  public final List<String> e;
  public final boolean f;
  public final boolean g;
  public final List<String> h;
  
  public jj(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList1, boolean paramBoolean3, boolean paramBoolean4, List<String> paramList2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramList1;
    this.f = paramBoolean3;
    this.g = paramBoolean4;
    paramString1 = paramList2;
    if (paramList2 == null) {
      paramString1 = new ArrayList();
    }
    this.h = paramString1;
  }
  
  public static jj a(JSONObject paramJSONObject)
    throws JSONException
  {
    if (paramJSONObject == null) {
      return null;
    }
    String str1 = paramJSONObject.optString("click_string", "");
    String str2 = paramJSONObject.optString("report_url", "");
    boolean bool1 = paramJSONObject.optBoolean("rendered_ad_enabled", false);
    boolean bool2 = paramJSONObject.optBoolean("non_malicious_reporting_enabled", false);
    List localList1 = ql.a(paramJSONObject.optJSONArray("allowed_headers"), null);
    List localList2 = ql.a(paramJSONObject.optJSONArray("webview_permissions"), null);
    return new jj(str1, str2, bool1, bool2, localList1, paramJSONObject.optBoolean("protection_enabled", false), paramJSONObject.optBoolean("malicious_reporting_enabled", false), localList2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 3, this.b, false);
    hq.a(paramParcel, 4, this.c);
    hq.a(paramParcel, 5, this.d);
    hq.b(paramParcel, 6, this.e, false);
    hq.a(paramParcel, 7, this.f);
    hq.a(paramParcel, 8, this.g);
    hq.b(paramParcel, 9, this.h, false);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */