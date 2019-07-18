import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.m;
import com.google.android.gms.ads.n;
import com.google.android.gms.internal.ads.A;
import com.google.android.gms.internal.ads.Tl;

public final class np
  extends ViewGroup
{
  private final A a;
  
  public final b getAdListener()
  {
    return this.a.b();
  }
  
  public final e getAdSize()
  {
    return this.a.c();
  }
  
  public final e[] getAdSizes()
  {
    return this.a.d();
  }
  
  public final String getAdUnitId()
  {
    return this.a.e();
  }
  
  public final kp getAppEventListener()
  {
    return this.a.f();
  }
  
  public final String getMediationAdapterClassName()
  {
    return this.a.g();
  }
  
  public final mp getOnCustomRenderedAdLoadedListener()
  {
    return this.a.h();
  }
  
  public final m getVideoController()
  {
    return this.a.i();
  }
  
  public final n getVideoOptions()
  {
    return this.a.j();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
  
  protected final void onMeasure(int paramInt1, int paramInt2)
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
  
  public final void setAdListener(b paramb)
  {
    this.a.a(paramb);
  }
  
  public final void setAdSizes(e... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length > 0))
    {
      this.a.b(paramVarArgs);
      return;
    }
    throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
  }
  
  public final void setAdUnitId(String paramString)
  {
    this.a.a(paramString);
  }
  
  public final void setAppEventListener(kp paramkp)
  {
    this.a.a(paramkp);
  }
  
  public final void setCorrelator(h paramh)
  {
    this.a.a(paramh);
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public final void setOnCustomRenderedAdLoadedListener(mp parammp)
  {
    this.a.a(parammp);
  }
  
  public final void setVideoOptions(n paramn)
  {
    this.a.a(paramn);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/np.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */