package io.faceapp.ui.image_editor.filter_editor;

import EPa;
import FVa;
import Hza;
import QQa;
import ala;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.ToolRecyclerView;
import io.faceapp.ui.image_editor.common.view.ValueRangeView;
import jRa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kRa;
import kya;
import lka;
import mka;
import oXa;
import pxa;
import pxa.a;
import pya.e;
import qla;
import wza;
import yPa;

public final class f
  extends wza<s, r, s.b>
  implements s
{
  public static final a ta = new a(null);
  private final int ua = 2131492983;
  private final FVa<Boolean> va;
  private final FVa<Boolean> wa;
  private final FVa<Boolean> xa;
  private HashMap ya;
  
  public f()
  {
    Object localObject = FVa.f(Boolean.valueOf(false));
    oXa.a(localObject, "BehaviorSubject.createDefault(false)");
    this.va = ((FVa)localObject);
    localObject = Boolean.valueOf(true);
    FVa localFVa = FVa.f(localObject);
    oXa.a(localFVa, "BehaviorSubject.createDefault(true)");
    this.wa = localFVa;
    localObject = FVa.f(localObject);
    oXa.a(localObject, "BehaviorSubject.createDefault(true)");
    this.xa = ((FVa)localObject);
  }
  
  private final FilterStrengthView.b b(s.a parama, pxa parampxa)
  {
    String str = parampxa.n();
    if (str != null)
    {
      Iterator localIterator = parama.b().a().iterator();
      while (localIterator.hasNext())
      {
        parama = (lka)localIterator.next();
        if (oXa.a(parama.m(), parampxa.m()))
        {
          parampxa = parampxa.m();
          parama = parama.r();
          if (parama != null) {
            return new FilterStrengthView.b(parampxa, str, parama);
          }
          throw new IllegalStateException("Required value was null.");
        }
      }
      throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    parama = null;
    return parama;
  }
  
  private final kRa ic()
  {
    kRa localkRa = QQa.a(this.va, ec(), this.wa, yPa.a.b()).e().c(new g(this));
    oXa.a(localkRa, "Observable.combineLatest…nimateVisibility(!hide) }");
    return localkRa;
  }
  
  private final kRa jc()
  {
    kRa localkRa = QQa.a(this.va, ec(), this.xa, yPa.a.b()).e().c(new h(this));
    oXa.a(localkRa, "Observable.combineLatest…nimateVisibility(!hide) }");
    return localkRa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.ya;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public int Zb()
  {
    return this.ua;
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    View localView = f(k.applyCancelView);
    oXa.a(localView, "applyCancelView");
    ((TextView)localView.findViewById(k.applyView)).setOnClickListener(cc());
    localView = f(k.applyCancelView);
    oXa.a(localView, "applyCancelView");
    ((TextView)localView.findViewById(k.cancelView)).setOnClickListener(dc());
    ((ValueRangeView)f(k.intensityView)).a(fc()).a(new i(this));
    ((ToolRecyclerView)f(k.filterRecyclerView)).a(new e(getViewActions())).animate().translationY(0.0F).start();
    ((FilterStrengthView)f(k.strengthView)).a(new j(this));
    fc().b(ic());
    fc().b(jc());
    super.a(paramView, paramBundle);
  }
  
  public void a(s.a parama, pxa parampxa)
  {
    oXa.b(parama, "model");
    oXa.b(parampxa, "selection");
    this.va.a(Boolean.valueOf(oXa.a(parampxa, pxa.b.a())));
    Object localObject = (ToolRecyclerView)f(k.filterRecyclerView);
    oXa.a(localObject, "filterRecyclerView");
    localObject = ((e)EPa.b((RecyclerView)localObject)).c(parama, parampxa.m());
    if (localObject != null)
    {
      int i = ((Integer)localObject).intValue();
      ((ToolRecyclerView)f(k.filterRecyclerView)).k(i);
    }
    parama = b(parama, parampxa);
    if (parama != null) {
      ((FilterStrengthView)f(k.strengthView)).a(parama);
    } else {
      parama = null;
    }
    parampxa = this.xa;
    boolean bool;
    if (parama == null) {
      bool = true;
    } else {
      bool = false;
    }
    parampxa.a(Boolean.valueOf(bool));
  }
  
  public void a(mka parammka)
  {
    oXa.b(parammka, "folder");
    n(parammka.f());
  }
  
  public void b(float paramFloat)
  {
    this.wa.a(Boolean.valueOf(false));
    ValueRangeView.a((ValueRangeView)f(k.intensityView), pya.e.i, paramFloat, false, 4, null);
  }
  
  public View f(int paramInt)
  {
    if (this.ya == null) {
      this.ya = new HashMap();
    }
    View localView1 = (View)this.ya.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.ya.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final f a(kya paramkya, Bundle paramBundle, mka parammka, QQa<Bitmap> paramQQa, boolean paramBoolean1, boolean paramBoolean2)
    {
      oXa.b(paramkya, "listener");
      oXa.b(paramBundle, "config");
      oXa.b(parammka, "folder");
      oXa.b(paramQQa, "thumbSub");
      f localf = new f();
      localf.a(new r(paramkya, paramBundle, parammka, paramQQa, paramBoolean1, paramBoolean2));
      return localf;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */