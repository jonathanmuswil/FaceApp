package com.google.firebase.analytics;

import QF;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.Fa;
import com.google.android.gms.measurement.internal.ab;
import java.util.List;
import java.util.Map;

final class a
  implements ab
{
  a(QF paramQF) {}
  
  public final long V()
  {
    return this.a.a();
  }
  
  public final String W()
  {
    return this.a.d();
  }
  
  public final String X()
  {
    return this.a.e();
  }
  
  public final String Z()
  {
    return this.a.c();
  }
  
  public final Map<String, Object> a(String paramString1, String paramString2, boolean paramBoolean)
  {
    return this.a.a(paramString1, paramString2, paramBoolean);
  }
  
  public final void a(Fa paramFa)
  {
    this.a.a(paramFa);
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    this.a.b(paramString1, paramString2, paramBundle);
  }
  
  public final void a(String paramString1, String paramString2, Object paramObject)
  {
    this.a.a(paramString1, paramString2, paramObject);
  }
  
  public final List<Bundle> b(String paramString1, String paramString2)
  {
    return this.a.a(paramString1, paramString2);
  }
  
  public final int c(String paramString)
  {
    return this.a.c(paramString);
  }
  
  public final void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    this.a.a(paramString1, paramString2, paramBundle);
  }
  
  public final void e(Bundle paramBundle)
  {
    this.a.a(paramBundle);
  }
  
  public final String ea()
  {
    return this.a.g();
  }
  
  public final void f(String paramString)
  {
    this.a.a(paramString);
  }
  
  public final void g(String paramString)
  {
    this.a.b(paramString);
  }
  
  public final void setDataCollectionEnabled(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/analytics/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */