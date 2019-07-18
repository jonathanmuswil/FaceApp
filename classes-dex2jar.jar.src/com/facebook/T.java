package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C;
import com.facebook.internal.S;
import com.facebook.internal.y;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
  implements Parcelable
{
  public static final Parcelable.Creator<t> CREATOR = new s();
  static final b a = new b(200, 299, null);
  private final a b;
  private final int c;
  private final int d;
  private final int e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  private final JSONObject k;
  private final JSONObject l;
  private final Object m;
  private final HttpURLConnection n;
  private final p o;
  
  private t(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, p paramp)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramString1;
    this.g = paramString2;
    this.l = paramJSONObject1;
    this.k = paramJSONObject2;
    this.m = paramObject;
    this.n = paramHttpURLConnection;
    this.h = paramString3;
    this.i = paramString4;
    if (paramp != null)
    {
      this.o = paramp;
      paramInt1 = 1;
    }
    else
    {
      this.o = new z(this, paramString2);
      paramInt1 = 0;
    }
    paramString2 = l();
    if (paramInt1 != 0) {
      paramString1 = a.b;
    } else {
      paramString1 = paramString2.a(paramInt2, paramInt3, paramBoolean);
    }
    this.b = paramString1;
    this.j = paramString2.a(this.b);
  }
  
  public t(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, false, null, null, null, null, null);
  }
  
  private t(Parcel paramParcel)
  {
    this(paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), false, null, null, null, null, null);
  }
  
  t(HttpURLConnection paramHttpURLConnection, Exception paramException)
  {
    this(-1, -1, -1, null, null, null, null, false, null, null, null, paramHttpURLConnection, paramException);
  }
  
  static t a(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      if (paramJSONObject.has("code"))
      {
        int i1 = paramJSONObject.getInt("code");
        Object localObject1 = S.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
        if ((localObject1 != null) && ((localObject1 instanceof JSONObject)))
        {
          JSONObject localJSONObject1 = (JSONObject)localObject1;
          boolean bool = localJSONObject1.has("error");
          int i2 = 1;
          Object localObject2;
          int i3;
          int i4;
          Object localObject3;
          Object localObject4;
          if (bool)
          {
            JSONObject localJSONObject2 = (JSONObject)S.a(localJSONObject1, "error", null);
            localObject1 = localJSONObject2.optString("type", null);
            localObject2 = localJSONObject2.optString("message", null);
            i3 = localJSONObject2.optInt("code", -1);
            i4 = localJSONObject2.optInt("error_subcode", -1);
            localObject3 = localJSONObject2.optString("error_user_msg", null);
            localObject4 = localJSONObject2.optString("error_user_title", null);
            bool = localJSONObject2.optBoolean("is_transient", false);
          }
          else
          {
            bool = localJSONObject1.has("error_code");
            if ((!bool) && (!localJSONObject1.has("error_msg")) && (!localJSONObject1.has("error_reason")))
            {
              localObject1 = null;
              localObject2 = localObject1;
              localObject3 = localObject2;
              localObject4 = localObject3;
              i3 = -1;
              i4 = -1;
              i2 = 0;
              bool = false;
            }
            else
            {
              localObject1 = localJSONObject1.optString("error_reason", null);
              localObject2 = localJSONObject1.optString("error_msg", null);
              i3 = localJSONObject1.optInt("error_code", -1);
              i4 = localJSONObject1.optInt("error_subcode", -1);
              localObject3 = null;
              localObject4 = localObject3;
              bool = false;
            }
          }
          if (i2 != 0) {
            return new t(i1, i3, i4, (String)localObject1, (String)localObject2, (String)localObject4, (String)localObject3, bool, localJSONObject1, paramJSONObject, paramObject, paramHttpURLConnection, null);
          }
        }
        if (!a.a(i1))
        {
          if (paramJSONObject.has("body")) {
            localObject1 = (JSONObject)S.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
          } else {
            localObject1 = null;
          }
          paramJSONObject = new t(i1, -1, -1, null, null, null, null, false, (JSONObject)localObject1, paramJSONObject, paramObject, paramHttpURLConnection, null);
          return paramJSONObject;
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return null;
  }
  
  static com.facebook.internal.t l()
  {
    try
    {
      Object localObject1 = C.b(FacebookSdk.e());
      if (localObject1 == null)
      {
        localObject1 = com.facebook.internal.t.a();
        return (com.facebook.internal.t)localObject1;
      }
      localObject1 = ((y)localObject1).e();
      return (com.facebook.internal.t)localObject1;
    }
    finally {}
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int m()
  {
    return this.d;
  }
  
  public String n()
  {
    String str = this.g;
    if (str != null) {
      return str;
    }
    return this.o.getLocalizedMessage();
  }
  
  public String o()
  {
    return this.f;
  }
  
  public p p()
  {
    return this.o;
  }
  
  public int q()
  {
    return this.c;
  }
  
  public int r()
  {
    return this.e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{HttpStatus: ");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", errorCode: ");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", subErrorCode: ");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", errorType: ");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", errorMessage: ");
    localStringBuilder.append(n());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
  }
  
  public static enum a
  {
    private a() {}
  }
  
  private static class b
  {
    private final int a;
    private final int b;
    
    private b(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
    }
    
    boolean a(int paramInt)
    {
      boolean bool;
      if ((this.a <= paramInt) && (paramInt <= this.b)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */