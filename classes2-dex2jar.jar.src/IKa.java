import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.c;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.faceapp.k;
import io.faceapp.ui.rate_us.item.StarsRatingView;
import io.faceapp.ui.rate_us.item.StarsRatingView.a.a;
import io.faceapp.ui.rate_us.item.StarsRatingView.a.b;
import java.util.HashMap;

public final class iKa
  extends _ka<vKa, uKa>
  implements vKa
{
  public static final iKa.a ma = new iKa.a(null);
  private final int na = 2131493007;
  private final GVa<vKa.a> oa;
  private jRa pa;
  private c qa;
  private c ra;
  private c sa;
  private c ta;
  private HashMap ua;
  
  public iKa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.oa = localGVa;
    b(0, 2131755350);
  }
  
  private final void Ub()
  {
    ((StarsRatingView)e(k.ratingStarsView)).a(StarsRatingView.a.a.a);
    ((TextView)e(k.rateTitleView)).setText(2131689858);
    c localc = this.qa;
    if (localc != null)
    {
      a(this, localc, null, 2, null);
      return;
    }
    oXa.b("constraintSetNoRating");
    throw null;
  }
  
  private final void a(c paramc, bXa<cWa> parambXa)
  {
    if (this.ta == paramc)
    {
      parambXa.b();
      return;
    }
    Kb localKb = new bb().a(new kKa(this, parambXa));
    oXa.a(localKb, "AutoTransition().addList…Transition) {}\n        })");
    View localView = eb();
    parambXa = localView;
    if (!(localView instanceof ConstraintLayout)) {
      parambXa = null;
    }
    parambXa = (ConstraintLayout)parambXa;
    if (parambXa != null)
    {
      Hb.a(parambXa, localKb);
      paramc.a(parambXa);
      this.ta = paramc;
    }
  }
  
  private final void a(vKa.b.b paramb)
  {
    ((StarsRatingView)e(k.ratingStarsView)).a(new StarsRatingView.a.b(paramb.a()));
    StringBuilder localStringBuilder;
    if (paramb.a() <= 3)
    {
      paramb = (TextView)e(k.rateTitleView);
      oXa.a(paramb, "rateTitleView");
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(b(2131689857));
      localStringBuilder.append(" 😥");
      paramb.setText(localStringBuilder.toString());
      paramb = (TextView)e(k.rateSubtitleView);
      oXa.a(paramb, "rateSubtitleView");
      paramb.setText(f(2131689853));
    }
    else
    {
      paramb = (TextView)e(k.rateTitleView);
      oXa.a(paramb, "rateTitleView");
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(b(2131689859));
      localStringBuilder.append(" 😃");
      paramb.setText(localStringBuilder.toString());
      paramb = (TextView)e(k.rateSubtitleView);
      oXa.a(paramb, "rateSubtitleView");
      paramb.setText(f(2131689855));
    }
    ((TextView)e(k.actionView)).setText(2131689953);
    paramb = (TextView)e(k.actionView);
    oXa.a(paramb, "actionView");
    paramb.setAllCaps(true);
    ((TextView)e(k.actionView)).setOnClickListener(null);
    paramb = this.ra;
    if (paramb != null)
    {
      a(paramb, new mKa(this));
      return;
    }
    oXa.b("constraintSetRatedForComment");
    throw null;
  }
  
  private final void a(vKa.b.c paramc)
  {
    ((StarsRatingView)e(k.ratingStarsView)).a(new StarsRatingView.a.b(paramc.a()));
    TextView localTextView = (TextView)e(k.rateTitleView);
    oXa.a(localTextView, "rateTitleView");
    paramc = new StringBuilder();
    paramc.append(b(2131689860));
    paramc.append(" 🙏");
    localTextView.setText(paramc.toString());
    ((TextView)e(k.rateSubtitleView)).setText(2131689854);
    ((TextView)e(k.actionView)).setText(2131689850);
    paramc = (TextView)e(k.actionView);
    oXa.a(paramc, "actionView");
    paramc.setAllCaps(false);
    ((TextView)e(k.actionView)).setOnClickListener(null);
    paramc = this.sa;
    if (paramc != null)
    {
      a(paramc, new oKa(this));
      return;
    }
    oXa.b("constraintSetRatedForStore");
    throw null;
  }
  
  private final String f(int paramInt)
  {
    String str1 = b(paramInt);
    oXa.a(str1, "getString(textRes)");
    String str2 = b(2131689479);
    oXa.a(str2, "getString(R.string.AppName)");
    return zYa.a(str1, "{app_name}", str2, false, 4, null);
  }
  
  public void Ob()
  {
    HashMap localHashMap = this.ua;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public int Tb()
  {
    return this.na;
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    this.qa = new c();
    this.ra = new c();
    this.sa = new c();
    Object localObject = (ConstraintLayout)paramView;
    c localc = this.qa;
    if (localc != null)
    {
      localc.c((ConstraintLayout)localObject);
      localObject = this.ra;
      if (localObject != null)
      {
        ((c)localObject).a(Jb(), 2131493008);
        localObject = this.sa;
        if (localObject != null)
        {
          ((c)localObject).a(Jb(), 2131493009);
          localObject = this.qa;
          if (localObject != null)
          {
            this.ta = ((c)localObject);
            localObject = (ImageView)e(k.dismissView);
            oXa.a(localObject, "dismissView");
            ((View)localObject).setOnClickListener(new qKa(this));
            this.pa = new jRa();
            localObject = this.pa;
            if (localObject != null)
            {
              ((jRa)localObject).b(((StarsRatingView)e(k.ratingStarsView)).a().c(new rKa(this)));
              localObject = this.pa;
              if (localObject != null)
              {
                ((jRa)localObject).b(gW.a((EditText)e(k.feedbackView)).c(new sKa(this)));
                super.a(paramView, paramBundle);
                return;
              }
              oXa.b("disposable");
              throw null;
            }
            oXa.b("disposable");
            throw null;
          }
          oXa.b("constraintSetNoRating");
          throw null;
        }
        oXa.b("constraintSetRatedForStore");
        throw null;
      }
      oXa.b("constraintSetRatedForComment");
      throw null;
    }
    oXa.b("constraintSetNoRating");
    throw null;
  }
  
  public void a(vKa.b paramb)
  {
    oXa.b(paramb, "model");
    if (oXa.a(paramb, vKa.b.a.a))
    {
      Ub();
    }
    else if ((paramb instanceof vKa.b.b))
    {
      a((vKa.b.b)paramb);
    }
    else
    {
      if (!(paramb instanceof vKa.b.c)) {
        break label58;
      }
      a((vKa.b.c)paramb);
    }
    return;
    label58:
    throw new UVa();
  }
  
  public void aa()
  {
    Toast.makeText(Ib(), 2131689851, 1).show();
  }
  
  public void ca()
  {
    dismiss();
  }
  
  public View e(int paramInt)
  {
    if (this.ua == null) {
      this.ua = new HashMap();
    }
    View localView1 = (View)this.ua.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.ua.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public GVa<vKa.a> getViewActions()
  {
    return this.oa;
  }
  
  public Dialog n(Bundle paramBundle)
  {
    return new pKa(this, Jb(), Nb());
  }
  
  public void sb()
  {
    jRa localjRa = this.pa;
    if (localjRa != null)
    {
      localjRa.i();
      super.sb();
      Ob();
      return;
    }
    oXa.b("disposable");
    throw null;
  }
  
  public static final class a
  {
    public final iKa a()
    {
      iKa localiKa = new iKa();
      localiKa.a(new uKa());
      return localiKa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */