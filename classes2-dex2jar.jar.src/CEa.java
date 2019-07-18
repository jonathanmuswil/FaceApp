import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.c;
import android.support.v4.app.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.faceapp.k;
import io.faceapp.ui.components.CollagePartView;
import io.faceapp.ui.components.CollagePartView.b.a;
import io.faceapp.ui.components.CollagePartView.b.b;
import io.faceapp.ui.components.CollagePartView.b.c;
import io.faceapp.ui.components.CollagePartView.c.a;
import io.faceapp.ui.components.Watermark;
import io.faceapp.ui.misc.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class cEa
  extends ZDa<AEa, fEa>
  implements AEa
{
  public static final cEa.a pa = new cEa.a(null);
  private final JVa<AEa.d> qa;
  private List<CollagePartView> ra;
  private c sa;
  private c ta;
  private final AEa.c[] ua;
  private boolean va;
  private HashMap wa;
  
  public cEa()
  {
    Object localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create()");
    this.qa = ((JVa)localObject);
    localObject = new AEa.c[4];
    for (int i = 0; i < 4; i++) {
      localObject[i] = null;
    }
    this.ua = ((AEa.c[])localObject);
    this.va = true;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.wa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public int Zb()
  {
    int i;
    if (this.va) {
      i = 2131492995;
    } else {
      i = 2131492994;
    }
    return i;
  }
  
  public void a(AEa.e parame)
  {
    oXa.b(parame, "model");
    AEa.e.a locala = (AEa.e.a)parame;
    Iterator localIterator = locala.a().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      parame = localIterator.next();
      if (i >= 0)
      {
        parame = (AEa.c)parame;
        Object localObject = this.ua;
        if (localObject[i] != parame)
        {
          localObject[i] = parame;
          localObject = this.ra;
          if (localObject == null) {
            break label186;
          }
          localObject = (CollagePartView)((List)localObject).get(i);
          if (oXa.a(parame, AEa.c.b.a))
          {
            parame = CollagePartView.b.b.a;
          }
          else if ((parame instanceof AEa.c.a))
          {
            parame = new CollagePartView.b.c(((AEa.c.a)parame).a());
          }
          else
          {
            if (!(parame instanceof AEa.c.c)) {
              break label178;
            }
            parame = new CollagePartView.b.a(((AEa.c.c)parame).a(), null, 2, null);
          }
          ((CollagePartView)localObject).a(parame);
        }
        else
        {
          i++;
          continue;
        }
        label178:
        throw new UVa();
        label186:
        oXa.b("collagePartViews");
        throw null;
      }
      else
      {
        mWa.c();
        throw null;
      }
    }
    parame = (Watermark)g(k.watermarkView);
    if (locala.b()) {
      UPa.c(parame, 0L, 1, null);
    } else {
      UPa.c(parame);
    }
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject1 = (CollagePartView)g(k.part1View);
    oXa.a(localObject1, "part1View");
    int i = 0;
    Object localObject2 = (CollagePartView)g(k.part2View);
    oXa.a(localObject2, "part2View");
    CollagePartView localCollagePartView1 = (CollagePartView)g(k.part3View);
    oXa.a(localCollagePartView1, "part3View");
    CollagePartView localCollagePartView2 = (CollagePartView)g(k.part4View);
    oXa.a(localCollagePartView2, "part4View");
    this.ra = mWa.c(new CollagePartView[] { localObject1, localObject2, localCollagePartView1, localCollagePartView2 });
    localObject1 = this.ra;
    if (localObject1 != null)
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        if (i >= 0)
        {
          localObject2 = (CollagePartView)localObject2;
          ((CollagePartView)localObject2).setViewStyle(CollagePartView.c.a.d);
          ((View)localObject2).setOnClickListener(new dEa(i, this));
          i++;
        }
        else
        {
          mWa.c();
          throw null;
        }
      }
      localObject1 = (ImageView)g(k.partCountSwitchBtnView);
      oXa.a(localObject1, "partCountSwitchBtnView");
      ((View)localObject1).setOnClickListener(new eEa(this));
      this.sa = new c();
      this.ta = new c();
      localObject1 = (ConstraintLayout)paramView;
      if (this.va)
      {
        localObject2 = this.sa;
        if (localObject2 != null)
        {
          ((c)localObject2).c((ConstraintLayout)localObject1);
          localObject1 = this.ta;
          if (localObject1 != null)
          {
            ((c)localObject1).a(Jb(), 2131492994);
          }
          else
          {
            oXa.b("constraintSet2to1");
            throw null;
          }
        }
        else
        {
          oXa.b("constraintSet2to2");
          throw null;
        }
      }
      else
      {
        localObject2 = this.ta;
        if (localObject2 == null) {
          break label361;
        }
        ((c)localObject2).c((ConstraintLayout)localObject1);
        localObject1 = this.sa;
        if (localObject1 == null) {
          break label353;
        }
        ((c)localObject1).a(Jb(), 2131492995);
      }
      super.a(paramView, paramBundle);
      return;
      label353:
      oXa.b("constraintSet2to2");
      throw null;
      label361:
      oXa.b("constraintSet2to1");
      throw null;
    }
    oXa.b("collagePartViews");
    throw null;
  }
  
  public void a(c.a parama)
  {
    oXa.b(parama, "errorModel");
    f(ePa.a.a(parama));
  }
  
  public void a(c.a parama, Object paramObject)
  {
    oXa.b(parama, "model");
    AEa.b.a(this, parama, paramObject);
  }
  
  public void b(boolean paramBoolean)
  {
    Object localObject1 = (ImageView)g(k.partCountSwitchBtnView);
    int i;
    if (paramBoolean) {
      i = 2131230968;
    } else {
      i = 2131230967;
    }
    ((ImageView)localObject1).setImageResource(i);
    if (paramBoolean == this.va) {
      return;
    }
    this.va = paramBoolean;
    Object localObject2 = eb();
    localObject1 = localObject2;
    if (!(localObject2 instanceof ConstraintLayout)) {
      localObject1 = null;
    }
    localObject2 = (ConstraintLayout)localObject1;
    if (localObject2 != null)
    {
      Hb.a((ViewGroup)localObject2);
      if (paramBoolean)
      {
        localObject1 = this.sa;
        if (localObject1 == null)
        {
          oXa.b("constraintSet2to2");
          throw null;
        }
      }
      else
      {
        localObject1 = this.ta;
        if (localObject1 == null) {
          break label120;
        }
      }
      ((c)localObject1).a((ConstraintLayout)localObject2);
      return;
      label120:
      oXa.b("constraintSet2to1");
      throw null;
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = (fEa)Pb();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.l();
      if (paramBundle != null)
      {
        bool = paramBundle.booleanValue();
        break label36;
      }
    }
    boolean bool = true;
    label36:
    this.va = bool;
  }
  
  public int d()
  {
    return 2131689535;
  }
  
  public View g(int paramInt)
  {
    if (this.wa == null) {
      this.wa = new HashMap();
    }
    View localView1 = (View)this.wa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.wa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public JVa<AEa.d> getViewActions()
  {
    return this.qa;
  }
  
  public Context h()
  {
    return La();
  }
  
  public void sb()
  {
    List localList = this.ra;
    if (localList != null)
    {
      localList.clear();
      gWa.a(this.ua, null, 0, 0, 6, null);
      super.sb();
      Lb();
      return;
    }
    oXa.b("collagePartViews");
    throw null;
  }
  
  public static final class a
  {
    public final cEa a(fEa paramfEa)
    {
      oXa.b(paramfEa, "presenter");
      cEa localcEa = new cEa();
      localcEa.a(paramfEa);
      return localcEa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */