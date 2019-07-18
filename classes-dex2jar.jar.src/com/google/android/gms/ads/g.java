package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.A;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.kea;
import kp;

class g
  extends ViewGroup
{
  protected final A a;
  
  public g(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = new A(this, paramInt);
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(d paramd)
  {
    this.a.a(paramd.a());
  }
  
  public void b()
  {
    this.a.k();
  }
  
  public void c()
  {
    this.a.l();
  }
  
  public b getAdListener()
  {
    return this.a.b();
  }
  
  public e getAdSize()
  {
    return this.a.c();
  }
  
  public String getAdUnitId()
  {
    return this.a.e();
  }
  
  public String getMediationAdapterClassName()
  {
    return this.a.g();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject = getChildAt(0);
    if ((localObject != null) && (((View)localObject).getVisibility() != 8))
    {
      measureChild((View)localObject, paramInt1, paramInt2);
      i = ((View)localObject).getMeasuredWidth();
      j = ((View)localObject).getMeasuredHeight();
    }
    else
    {
      localObject = null;
      try
      {
        e locale = getAdSize();
        localObject = locale;
      }
      catch (NullPointerException localNullPointerException)
      {
        Tl.b("Unable to retrieve ad size.", localNullPointerException);
      }
      if (localObject != null)
      {
        Context localContext = getContext();
        i = ((e)localObject).b(localContext);
        j = ((e)localObject).a(localContext);
      }
      else
      {
        j = 0;
      }
    }
    i = Math.max(i, getSuggestedMinimumWidth());
    int j = Math.max(j, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSize(i, paramInt1), View.resolveSize(j, paramInt2));
  }
  
  public void setAdListener(b paramb)
  {
    this.a.a(paramb);
    if (paramb == null)
    {
      this.a.a(null);
      this.a.a(null);
      return;
    }
    if ((paramb instanceof kea)) {
      this.a.a((kea)paramb);
    }
    if ((paramb instanceof kp)) {
      this.a.a((kp)paramb);
    }
  }
  
  public void setAdSize(e parame)
  {
    this.a.a(new e[] { parame });
  }
  
  public void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */