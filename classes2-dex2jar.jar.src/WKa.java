import android.content.Context;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.l;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.m.a;
import io.faceapp.n;
import java.util.HashMap;

public final class wKa
  extends ala<NKa, EKa>
  implements NKa
{
  public static final wKa.a la = new wKa.a(null);
  private final int ma = 2131493010;
  private final int na = 2131689886;
  private final GVa<NKa.a> oa;
  private nsa.b pa;
  private boolean qa;
  private Uri ra;
  private int sa;
  private int ta;
  private int ua;
  private HashMap va;
  
  public wKa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.oa = localGVa;
  }
  
  private final void B(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ((FrameLayout)f(k.adContainerView)).removeAllViews();
      return;
    }
    a(eb(), Vb(), new yKa(this));
  }
  
  private final void a(APa paramAPa)
  {
    ImageView localImageView = (ImageView)f(k.imageView);
    localImageView.getViewTreeObserver().addOnPreDrawListener(new xKa(localImageView, this, paramAPa));
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.va;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public EKa Mb()
  {
    nsa.b localb = this.pa;
    if (localb != null) {
      return new EKa(localb, this.qa, this.ra);
    }
    oXa.b("sharedImage");
    throw null;
  }
  
  public int Xb()
  {
    return this.na;
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    oXa.b(paramLayoutInflater, "inflater");
    TypedValue localTypedValue = new TypedValue();
    me localme = new me(Ea(), this.sa);
    localme.getTheme().resolveAttribute(2130968584, localTypedValue, true);
    this.ta = localTypedValue.resourceId;
    localme.getTheme().resolveAttribute(2130968583, localTypedValue, true);
    this.ua = localTypedValue.resourceId;
    paramLayoutInflater = paramLayoutInflater.cloneInContext(localme);
    oXa.a(paramLayoutInflater, "inflater.cloneInContext(contextWrapper)");
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void a(long paramLong)
  {
    a(eb(), paramLong, new DKa(this));
  }
  
  public void a(NKa.b paramb)
  {
    oXa.b(paramb, "model");
    paramb = (NKa.b.a)paramb;
    Object localObject = (FrameLayout)f(k.adContainerView);
    if (paramb.c()) {
      UPa.e((View)localObject);
    } else {
      UPa.a((View)localObject);
    }
    a(paramb.a());
    localObject = (ImageView)f(k.imageView);
    oXa.a(localObject, "imageView");
    int i;
    if (((ImageView)localObject).getDrawable() == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject = (ImageView)f(k.imageView);
      oXa.a(localObject, "imageView");
      ((ImageView)localObject).setAlpha(0.0F);
    }
    ((ImageView)f(k.imageView)).setImageURI(paramb.b());
    if (i != 0) {
      ((ImageView)f(k.imageView)).animate().alpha(1.0F);
    }
    if (paramb.d())
    {
      ((TextView)f(k.savedLabelView)).setText(2131689885);
      localObject = (TextView)f(k.savedLabelView);
      oXa.a(localObject, "savedLabelView");
      UPa.a((TextView)localObject, this.ta, null, 2, null);
      localObject = (TextView)f(k.savedLabelView);
      oXa.a(localObject, "savedLabelView");
      ((TextView)localObject).setSelected(false);
    }
    else
    {
      ((TextView)f(k.savedLabelView)).setText(2131689875);
      localObject = (TextView)f(k.savedLabelView);
      oXa.a(localObject, "savedLabelView");
      UPa.a((TextView)localObject, this.ua, null, 2, null);
      localObject = (TextView)f(k.savedLabelView);
      oXa.a(localObject, "savedLabelView");
      ((TextView)localObject).setSelected(true);
    }
    if (paramb.d())
    {
      localObject = Ja();
      if (localObject != null) {
        ((Bundle)localObject).putParcelable("saved_image_uri", paramb.b());
      }
    }
    B(paramb.c());
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    ImageView localImageView = (ImageView)f(k.instagramBtnView);
    oXa.a(localImageView, "instagramBtnView");
    localImageView.setOnClickListener(new zKa(this));
    localImageView = (ImageView)f(k.facebookBtnView);
    oXa.a(localImageView, "facebookBtnView");
    localImageView.setOnClickListener(new AKa(this));
    localImageView = (ImageView)f(k.twitterBtnView);
    oXa.a(localImageView, "twitterBtnView");
    localImageView.setOnClickListener(new BKa(this));
    localImageView = (ImageView)f(k.commonBtnView);
    oXa.a(localImageView, "commonBtnView");
    localImageView.setOnClickListener(new CKa(this));
    super.a(paramView, paramBundle);
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.pa = ((nsa.b)EPa.b(paramBundle, "shared_image"));
      this.qa = paramBundle.getBoolean("watermark_needed");
      this.ra = ((Uri)paramBundle.getParcelable("saved_image_uri"));
      boolean bool = paramBundle.getBoolean("is_light_theme");
      int i;
      if (bool == true)
      {
        i = 2131755373;
      }
      else
      {
        if (bool) {
          break label105;
        }
        i = 2131755374;
      }
      this.sa = i;
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        return;
        label105:
        throw new UVa();
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public void dismiss()
  {
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, false, 1, null);
    }
  }
  
  public View f(int paramInt)
  {
    if (this.va == null) {
      this.va = new HashMap();
    }
    View localView1 = (View)this.va.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.va.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public GVa<NKa.a> getViewActions()
  {
    return this.oa;
  }
  
  public Context h()
  {
    Context localContext = Jb();
    oXa.a(localContext, "requireContext()");
    return localContext;
  }
  
  public void sb()
  {
    ((FrameLayout)f(k.adContainerView)).removeAllViews();
    super.sb();
    Lb();
  }
  
  public static final class a
  {
    public final wKa a(nsa.b paramb, boolean paramBoolean1, boolean paramBoolean2)
    {
      oXa.b(paramb, "sharedImage");
      wKa localwKa = new wKa();
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("shared_image", paramb);
      localBundle.putBoolean("watermark_needed", paramBoolean1);
      localBundle.putBoolean("is_light_theme", paramBoolean2);
      localwKa.m(localBundle);
      return localwKa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */