package io.faceapp.ui.layouts.selector.item;

import Aka;
import Cka;
import EVa;
import Eda;
import Iha;
import KDa;
import QQa;
import UPa;
import VQa;
import XQa;
import _Va;
import android.content.Context;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gRa;
import io.faceapp.ui.components.CircularProgressBar;
import java.util.HashMap;
import jta;
import kRa;
import oXa;
import sFa.b;
import xQa;

public final class PhotoItemView
  extends ConstraintLayout
  implements jta<m>
{
  public static final a u = new a(null);
  private VQa<sFa.b> v;
  private kRa w;
  private HashMap x;
  
  public PhotoItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final void a(Uri paramUri, boolean paramBoolean)
  {
    boolean bool;
    if (((CircularProgressBar)c(io.faceapp.k.progressView)).getProgress() > 0.1F) {
      bool = true;
    } else {
      bool = false;
    }
    a(paramBoolean, bool);
    xQa localxQa;
    if (bool)
    {
      localxQa = ((CircularProgressBar)c(io.faceapp.k.progressView)).a();
    }
    else
    {
      localxQa = xQa.e();
      oXa.a(localxQa, "Completable.complete()");
    }
    localxQa.b(new f(this, paramUri));
  }
  
  private final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    CircularProgressBar localCircularProgressBar;
    if (paramBoolean1)
    {
      ((CircularProgressBar)c(io.faceapp.k.progressView)).setAnimateProgress(paramBoolean2);
      ((CircularProgressBar)c(io.faceapp.k.progressView)).setProgress(1.0F);
      localCircularProgressBar = (CircularProgressBar)c(io.faceapp.k.progressView);
      oXa.a(localCircularProgressBar, "progressView");
      UPa.e(localCircularProgressBar);
    }
    else
    {
      localCircularProgressBar = (CircularProgressBar)c(io.faceapp.k.progressView);
      oXa.a(localCircularProgressBar, "progressView");
      UPa.c(localCircularProgressBar);
    }
  }
  
  private final void b(float paramFloat)
  {
    CircularProgressBar localCircularProgressBar = (CircularProgressBar)c(io.faceapp.k.progressView);
    oXa.a(localCircularProgressBar, "progressView");
    UPa.e(localCircularProgressBar);
    ((CircularProgressBar)c(io.faceapp.k.progressView)).setProgress(paramFloat);
    ((ImageView)c(io.faceapp.k.photo)).setImageResource(2131231087);
  }
  
  private final void i(boolean paramBoolean)
  {
    a(paramBoolean, false);
    ((ImageView)c(io.faceapp.k.photo)).setBackgroundResource(2131230825);
    ((ImageView)c(io.faceapp.k.photo)).setImageResource(2131230992);
  }
  
  public void a(m paramm)
  {
    oXa.b(paramm, "model");
    setOnClickListener(new g(this, paramm));
    Object localObject = this.w;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    localObject = paramm.a().c();
    localObject = paramm.c().a((Aka)localObject).d();
    localObject = paramm.a().c((String)localObject);
    this.w = QQa.b(((Iha)localObject).d().e(h.a), ((Iha)localObject).f().d(i.a).h()).b(EVa.b()).a(gRa.a()).b(new j(this)).a(new k(this, paramm), new l(this, paramm));
  }
  
  public View c(int paramInt)
  {
    if (this.x == null) {
      this.x = new HashMap();
    }
    View localView1 = (View)this.x.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.x.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  protected void onDetachedFromWindow()
  {
    kRa localkRa = this.w;
    if (localkRa != null) {
      localkRa.i();
    }
    this.w = null;
    super.onDetachedFromWindow();
  }
  
  public static final class a
  {
    public final PhotoItemView a(ViewGroup paramViewGroup, VQa<sFa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "screenActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493032, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PhotoItemView)paramViewGroup;
        PhotoItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.selector.item.PhotoItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/PhotoItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */