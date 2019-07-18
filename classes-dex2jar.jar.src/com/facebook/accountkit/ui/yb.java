package com.facebook.accountkit.ui;

import Vm;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.app.FragmentTransaction;
import android.content.res.Resources;
import android.support.v7.app.m;
import com.facebook.accountkit.internal.c.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import on;
import pn;

final class yb
  implements Fb.a, J.a, FragmentManager.OnBackStackChangedListener
{
  private final WeakReference<AccountKitActivity> a;
  private final Fb b;
  private final g c;
  private aa d;
  private final Map<Ga, aa> e = new HashMap();
  private final List<b> f = new ArrayList();
  private final List<c> g = new ArrayList();
  
  yb(AccountKitActivity paramAccountKitActivity, g paramg)
  {
    this.a = new WeakReference(paramAccountKitActivity);
    paramAccountKitActivity.getFragmentManager().addOnBackStackChangedListener(this);
    this.c = paramg;
    if (paramg == null) {
      paramAccountKitActivity = null;
    } else {
      paramAccountKitActivity = paramg.u();
    }
    this.b = paramAccountKitActivity;
    paramAccountKitActivity = this.b;
    if ((paramAccountKitActivity instanceof L)) {
      ((L)paramAccountKitActivity).m().a(this);
    } else if (paramAccountKitActivity != null) {
      paramAccountKitActivity.a(this);
    }
  }
  
  private aa a(AccountKitActivity paramAccountKitActivity, Ga paramGa1, Ga paramGa2, boolean paramBoolean)
  {
    Object localObject = (aa)this.e.get(paramGa1);
    if (localObject != null) {
      return (aa)localObject;
    }
    switch (xb.c[paramGa1.ordinal()])
    {
    default: 
      return null;
    case 14: 
      paramGa2 = new nb(this.c);
      break;
    case 13: 
      paramGa2 = new ta(this.c);
      break;
    case 12: 
      paramGa2 = new ja(this.c);
      break;
    case 11: 
      paramGa2 = new Ca(paramGa2, this.c);
      break;
    case 10: 
      paramGa2 = new Rb(this.c);
      break;
    case 9: 
      paramGa2 = new Sb(this.c);
      break;
    case 8: 
      paramGa2 = new za(this.c);
      break;
    case 7: 
      paramGa2 = new Sb(this.c);
      break;
    case 6: 
      paramGa2 = new U(this.c);
      break;
    case 5: 
      paramGa2 = new n(this.c);
      break;
    case 4: 
      int i = xb.b[this.c.p().ordinal()];
      if (i != 1)
      {
        if (i == 2)
        {
          paramGa2 = new pa(this.c);
        }
        else
        {
          paramAccountKitActivity = new StringBuilder();
          paramAccountKitActivity.append("Unexpected login type: ");
          paramAccountKitActivity.append(this.c.p().toString());
          throw new RuntimeException(paramAccountKitActivity.toString());
        }
      }
      else {
        paramGa2 = new Za(this.c);
      }
      break;
    case 3: 
      paramGa2 = new pb(this.c);
      break;
    case 2: 
      paramGa2 = new Va(this.c);
      if (paramBoolean)
      {
        localObject = paramAccountKitActivity.getFragmentManager().findFragmentById(pn.com_accountkit_header_fragment);
        if ((localObject instanceof Eb.a)) {
          paramGa2.b((Eb.a)localObject);
        }
        paramGa2.b(a(paramAccountKitActivity, pn.com_accountkit_content_top_fragment));
        paramGa2.c(a(paramAccountKitActivity, pn.com_accountkit_content_center_fragment));
        paramGa2.a(a(paramAccountKitActivity, pn.com_accountkit_content_bottom_fragment));
        localObject = paramAccountKitActivity.getFragmentManager().findFragmentById(pn.com_accountkit_footer_fragment);
        if ((localObject instanceof Eb.a)) {
          paramGa2.a((Eb.a)localObject);
        }
        paramGa2.a(paramAccountKitActivity);
      }
      this.e.put(paramGa1, paramGa2);
      return paramGa2;
    }
    return null;
  }
  
  private ca a(AccountKitActivity paramAccountKitActivity, int paramInt)
  {
    paramAccountKitActivity = paramAccountKitActivity.getFragmentManager().findFragmentById(paramInt);
    if (!(paramAccountKitActivity instanceof ca)) {
      return null;
    }
    return (ca)paramAccountKitActivity;
  }
  
  private void a(AccountKitActivity paramAccountKitActivity, Ea paramEa, Ga paramGa, c paramc)
  {
    Object localObject1 = paramEa.o();
    aa localaa1 = a();
    boolean bool1 = false;
    aa localaa2 = a(paramAccountKitActivity, (Ga)localObject1, paramGa, false);
    if ((localaa2 != null) && (localaa1 != localaa2))
    {
      if ((paramEa instanceof Xa)) {
        localObject2 = ((Xa)paramEa).i();
      } else {
        localObject2 = null;
      }
      c.a.a(this.b);
      if (((localObject1 == Ga.m) && ((localaa2 instanceof nb))) || ((localObject1 == Ga.f) && ((localaa2 instanceof za))) || ((localaa2 instanceof Ca)))
      {
        paramGa = localaa2.d();
      }
      else
      {
        paramGa = this.b.c((Ga)localObject1);
        localObject3 = this.c.p();
        localObject4 = a.c.name();
        if (paramGa != null) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        c.a.a((Ia)localObject3, (String)localObject4, bool2);
      }
      Object localObject5 = this.b.e((Ga)localObject1);
      Object localObject3 = this.c.p();
      Object localObject4 = a.a.name();
      if (localObject5 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      c.a.a((Ia)localObject3, (String)localObject4, bool2);
      localObject3 = this.b.b((Ga)localObject1);
      Ia localIa = this.c.p();
      localObject4 = a.b.name();
      boolean bool2 = bool1;
      if (localObject3 != null) {
        bool2 = true;
      }
      c.a.a(localIa, (String)localObject4, bool2);
      localObject4 = paramGa;
      if (paramGa == null) {
        localObject4 = O.a(this.b, (Ga)localObject1, paramEa.p(), (Ja)localObject2);
      }
      paramGa = (Ga)localObject5;
      if (localObject5 == null) {
        paramGa = O.a(this.b, (Ga)localObject1);
      }
      paramEa = (Ea)localObject3;
      if (localObject3 == null) {
        paramEa = O.a(this.b);
      }
      localObject3 = this.b.a((Ga)localObject1);
      if ((localaa2 instanceof P))
      {
        localObject2 = this.b.d((Ga)localObject1);
        if (localObject2 != null) {
          ((P)localaa2).a((Q)localObject2);
        }
      }
      localObject1 = localaa2.f();
      Object localObject2 = localaa2.e();
      localObject5 = localaa2.a();
      if (paramc != null)
      {
        this.g.add(paramc);
        paramc.a(localaa2);
      }
      paramc = (c)localObject3;
      if (localObject3 == null) {
        paramc = Cb.b;
      }
      if (localObject2 != null)
      {
        i = xb.a[paramc.ordinal()];
        if (i != 1) {
          if (i == 2) {}
        }
        int j;
        for (i = 0;; i = on.com_accountkit_vertical_spacer_small_height)
        {
          j = 0;
          break;
          j = on.com_accountkit_vertical_spacer_small_height;
          i = 0;
          break;
        }
        if (i == 0) {
          i = 0;
        } else {
          i = paramAccountKitActivity.getResources().getDimensionPixelSize(i);
        }
        if (j == 0) {
          j = 0;
        } else {
          j = paramAccountKitActivity.getResources().getDimensionPixelSize(j);
        }
        if ((localObject2 instanceof Bb))
        {
          localObject3 = (Bb)localObject2;
          ((Bb)localObject3).b(i);
          ((Bb)localObject3).a(j);
        }
      }
      localObject3 = paramAccountKitActivity.getFragmentManager();
      if (localaa1 != null)
      {
        paramAccountKitActivity.b(localaa1);
        if (localaa1.b()) {
          ((FragmentManager)localObject3).popBackStack();
        }
      }
      if (Ub.a(this.b, ub.a.c)) {
        paramAccountKitActivity.a(localaa2);
      }
      localObject3 = ((FragmentManager)localObject3).beginTransaction();
      paramAccountKitActivity.a((FragmentTransaction)localObject3, pn.com_accountkit_header_fragment, (Fragment)localObject4);
      paramAccountKitActivity.a((FragmentTransaction)localObject3, pn.com_accountkit_content_top_fragment, (Fragment)localObject1);
      int i = pn.com_accountkit_content_top_text_fragment;
      if (paramc == Cb.a) {
        localObject4 = localObject2;
      } else {
        localObject4 = null;
      }
      paramAccountKitActivity.a((FragmentTransaction)localObject3, i, (Fragment)localObject4);
      paramAccountKitActivity.a((FragmentTransaction)localObject3, pn.com_accountkit_content_center_fragment, paramGa);
      i = pn.com_accountkit_content_bottom_text_fragment;
      if (paramc != Cb.b) {
        localObject2 = null;
      }
      paramAccountKitActivity.a((FragmentTransaction)localObject3, i, (Fragment)localObject2);
      if (!Ub.a(this.b, ub.a.c))
      {
        paramAccountKitActivity.a((FragmentTransaction)localObject3, pn.com_accountkit_content_bottom_fragment, (Fragment)localObject5);
        paramAccountKitActivity.a((FragmentTransaction)localObject3, pn.com_accountkit_footer_fragment, paramEa);
      }
      ((FragmentTransaction)localObject3).addToBackStack(null);
      Ub.a(paramAccountKitActivity);
      ((FragmentTransaction)localObject3).commit();
      localaa2.a(paramAccountKitActivity);
    }
  }
  
  aa a()
  {
    return this.d;
  }
  
  c a(String paramString)
  {
    return new wb(this, paramString);
  }
  
  void a(AccountKitActivity paramAccountKitActivity)
  {
    ca localca = a(paramAccountKitActivity, pn.com_accountkit_content_top_fragment);
    if (localca == null) {
      return;
    }
    paramAccountKitActivity = a(paramAccountKitActivity, localca.e(), Ga.a, true);
    if (paramAccountKitActivity == null) {
      return;
    }
    this.d = paramAccountKitActivity;
    paramAccountKitActivity = new ArrayList(this.f);
    this.f.clear();
    paramAccountKitActivity = paramAccountKitActivity.iterator();
    while (paramAccountKitActivity.hasNext()) {
      ((b)paramAccountKitActivity.next()).a();
    }
    paramAccountKitActivity = new ArrayList(this.g);
    this.g.clear();
    paramAccountKitActivity = paramAccountKitActivity.iterator();
    while (paramAccountKitActivity.hasNext()) {
      ((c)paramAccountKitActivity.next()).a();
    }
  }
  
  void a(AccountKitActivity paramAccountKitActivity, Ea paramEa, Ga paramGa, Vm paramVm, c paramc)
  {
    this.b.a(paramVm);
    a(paramAccountKitActivity, paramEa, paramGa, paramc);
  }
  
  void a(AccountKitActivity paramAccountKitActivity, Ea paramEa, c paramc)
  {
    a(paramAccountKitActivity, paramEa, Ga.a, paramc);
  }
  
  void a(Ga paramGa, b paramb)
  {
    AccountKitActivity localAccountKitActivity = (AccountKitActivity)this.a.get();
    if (localAccountKitActivity == null) {
      return;
    }
    if (paramb != null) {
      this.f.add(paramb);
    }
    paramb = a(localAccountKitActivity, paramGa, Ga.a, false);
    if ((paramGa != Ga.b) && (paramGa != Ga.c)) {
      localAccountKitActivity.getFragmentManager().popBackStack();
    } else {
      localAccountKitActivity.getFragmentManager().popBackStack(0, 0);
    }
    localAccountKitActivity.a(paramb);
  }
  
  void a(b paramb)
  {
    AccountKitActivity localAccountKitActivity = (AccountKitActivity)this.a.get();
    if (localAccountKitActivity == null) {
      return;
    }
    if (paramb != null) {
      this.f.add(paramb);
    }
    localAccountKitActivity.getFragmentManager().popBackStack();
    localAccountKitActivity.a(null);
  }
  
  public void onBackStackChanged()
  {
    AccountKitActivity localAccountKitActivity = (AccountKitActivity)this.a.get();
    if (localAccountKitActivity == null) {
      return;
    }
    a(localAccountKitActivity);
  }
  
  private static enum a
  {
    private a() {}
  }
  
  static abstract interface b
  {
    public abstract void a();
  }
  
  static abstract interface c
  {
    public abstract void a();
    
    public abstract void a(aa paramaa);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/yb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */