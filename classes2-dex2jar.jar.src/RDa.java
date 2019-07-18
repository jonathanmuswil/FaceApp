import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.m;
import io.faceapp.m.a;
import io.faceapp.ui.components.CircularProgressBar;
import java.util.HashMap;

public final class rDa
  extends ala<GDa, EDa>
  implements GDa
{
  public static final rDa.a la = new rDa.a(null);
  private final boolean ma;
  private final int na = 2131492990;
  private final int oa = 2131689886;
  private final GVa<GDa.b> pa;
  private nsa.b qa;
  private boolean ra;
  private HashMap sa;
  
  public rDa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.pa = localGVa;
    this.ra = true;
  }
  
  private final void B(boolean paramBoolean)
  {
    if (!paramBoolean) {
      ((FrameLayout)f(k.adContainerView)).removeAllViews();
    } else {
      a(eb(), Vb(), new tDa(this));
    }
  }
  
  private final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    ((TextView)f(k.messageView)).setText(paramInt1);
    ((TextView)f(k.messageView)).setTextColor(Wa().getColor(paramInt2));
    TextView localTextView;
    if (paramInt3 != 0)
    {
      localTextView = (TextView)f(k.messageView);
      oXa.a(localTextView, "messageView");
      UPa.a(localTextView, paramInt3, null, 2, null);
    }
    else
    {
      localTextView = (TextView)f(k.messageView);
      oXa.a(localTextView, "messageView");
      UPa.a(localTextView);
    }
  }
  
  private final void a(APa paramAPa)
  {
    ImageView localImageView = (ImageView)f(k.imageView);
    localImageView.getViewTreeObserver().addOnPreDrawListener(new sDa(localImageView, this, paramAPa));
  }
  
  private final void a(Bitmap paramBitmap, ImageView paramImageView)
  {
    paramImageView.setImageBitmap(paramBitmap);
    a(UPa.a(paramBitmap));
  }
  
  private final void e(float paramFloat)
  {
    ((CircularProgressBar)f(k.progressView)).setProgress(paramFloat);
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.sa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public boolean Qb()
  {
    return this.ma;
  }
  
  public void Sb() {}
  
  public void Tb() {}
  
  public int Xb()
  {
    return this.oa;
  }
  
  public int Zb()
  {
    return this.na;
  }
  
  public void a(GDa.a parama, boolean paramBoolean)
  {
    oXa.b(parama, "model");
    Object localObject = (FrameLayout)f(k.adContainerView);
    if (paramBoolean) {
      UPa.e((View)localObject);
    } else {
      UPa.a((View)localObject);
    }
    boolean bool1 = parama instanceof GDa.a.c;
    if (!bool1) {
      localObject = null;
    } else {
      localObject = parama;
    }
    localObject = (GDa.a.c)localObject;
    if (localObject != null) {
      localObject = ((GDa.a.c)localObject).a();
    } else {
      localObject = null;
    }
    this.qa = ((nsa.b)localObject);
    localObject = (CircularProgressBar)f(k.progressView);
    oXa.a(localObject, "progressView");
    boolean bool2 = parama instanceof GDa.a.b;
    UPa.a((View)localObject, bool2);
    localObject = (ImageView)f(k.imageView);
    oXa.a(localObject, "imageView");
    UPa.a((View)localObject, bool1);
    localObject = (LinearLayout)f(k.shareContainerView);
    oXa.a(localObject, "shareContainerView");
    UPa.a((View)localObject, bool1);
    if (bool2)
    {
      parama = (GDa.a.b)parama;
      e(parama.b());
      parama = parama.a();
      localObject = (ImageView)f(k.blurView);
      oXa.a(localObject, "blurView");
      a(parama, (ImageView)localObject);
      a(2131689547, 2131099883, 0);
      parama = Boolean.valueOf(paramBoolean);
      parama.booleanValue();
      if (!this.ra) {
        parama = null;
      }
      if (parama != null)
      {
        B(parama.booleanValue());
        this.ra = false;
      }
    }
    else if ((parama instanceof GDa.a.d))
    {
      GDa.a.d locald = (GDa.a.d)parama;
      localObject = locald.a();
      parama = (ImageView)f(k.imageView);
      oXa.a(parama, "imageView");
      a((Bitmap)localObject, parama);
      getViewActions().a(new GDa.b.a(locald.b()));
    }
    else if (bool1)
    {
      a(2131689885, 2131099885, 2131231050);
      localObject = (LinearLayout)f(k.shareContainerView);
      oXa.a(localObject, "shareContainerView");
      parama = (LinearLayout)f(k.shareContainerView);
      oXa.a(parama, "shareContainerView");
      ((LinearLayout)localObject).setTranslationY(parama.getHeight() * 0.5F);
      ((LinearLayout)f(k.shareContainerView)).animate().setInterpolator(new DecelerateInterpolator()).translationY(0.0F).start();
      getViewActions().a(GDa.b.g.a);
    }
    else if ((parama instanceof GDa.a.a))
    {
      a(2131689875, 2131099864, 2131230978);
    }
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    if (Pb() == null)
    {
      localObject = getRouter();
      if (localObject != null) {
        m.a.a((m)localObject, false, 1, null);
      }
    }
    Object localObject = (TextView)f(k.instagramLabelView);
    oXa.a(localObject, "instagramLabelView");
    ((View)localObject).setOnClickListener(new uDa(this));
    localObject = (TextView)f(k.facebookLabelView);
    oXa.a(localObject, "facebookLabelView");
    ((View)localObject).setOnClickListener(new vDa(this));
    localObject = (TextView)f(k.twitterLabelView);
    oXa.a(localObject, "twitterLabelView");
    ((View)localObject).setOnClickListener(new wDa(this));
    localObject = (TextView)f(k.commonLabelView);
    oXa.a(localObject, "commonLabelView");
    ((View)localObject).setOnClickListener(new xDa(this));
    super.a(paramView, paramBundle);
  }
  
  public View f(int paramInt)
  {
    if (this.sa == null) {
      this.sa = new HashMap();
    }
    View localView1 = (View)this.sa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.sa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public GVa<GDa.b> getViewActions()
  {
    return this.pa;
  }
  
  public void sb()
  {
    ((FrameLayout)f(k.adContainerView)).removeAllViews();
    super.sb();
    Lb();
  }
  
  public void va()
  {
    a(eb(), 2000L, new yDa(this));
  }
  
  public Context ya()
  {
    o localo = Ea();
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localo != null)
    {
      Mra localMra = Mra.c;
      oXa.a(localo, "it");
      localObject2 = localObject1;
      if (localMra.a(localo)) {
        localObject2 = localo;
      }
    }
    return (Context)localObject2;
  }
  
  public static final class a
  {
    public final rDa a(qDa paramqDa)
    {
      oXa.b(paramqDa, "adapter");
      rDa localrDa = new rDa();
      localrDa.a(new EDa(paramqDa));
      return localrDa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */