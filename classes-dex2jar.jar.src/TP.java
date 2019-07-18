import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.kb;

@Deprecated
public class tp
  extends FrameLayout
{
  private final FrameLayout a;
  private final kb b;
  
  protected final View a(String paramString)
  {
    try
    {
      paramString = this.b.q(paramString);
      if (paramString != null)
      {
        paramString = (View)Iq.J(paramString);
        return paramString;
      }
    }
    catch (RemoteException paramString)
    {
      Tl.b("Unable to call getAssetView on delegate", paramString);
    }
    return null;
  }
  
  protected final void a(String paramString, View paramView)
  {
    try
    {
      this.b.b(paramString, Iq.a(paramView));
      return;
    }
    catch (RemoteException paramString)
    {
      Tl.b("Unable to call setAssetView on delegate", paramString);
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(this.a);
  }
  
  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    FrameLayout localFrameLayout = this.a;
    if (localFrameLayout != paramView) {
      super.bringChildToFront(localFrameLayout);
    }
  }
  
  public pp getAdChoicesView()
  {
    View localView = a("1098");
    if ((localView instanceof pp)) {
      return (pp)localView;
    }
    return null;
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    kb localkb = this.b;
    if (localkb != null) {
      try
      {
        localkb.a(Iq.a(paramView), paramInt);
        return;
      }
      catch (RemoteException paramView)
      {
        Tl.b("Unable to call onVisibilityChanged on delegate", paramView);
      }
    }
  }
  
  public void removeAllViews()
  {
    super.removeAllViews();
    super.addView(this.a);
  }
  
  public void removeView(View paramView)
  {
    if (this.a == paramView) {
      return;
    }
    super.removeView(paramView);
  }
  
  public void setAdChoicesView(pp parampp)
  {
    a("1098", parampp);
  }
  
  public void setNativeAd(rp paramrp)
  {
    try
    {
      this.b.c((Hq)paramrp.a());
      return;
    }
    catch (RemoteException paramrp)
    {
      Tl.b("Unable to call setNativeAd on delegate", paramrp);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */