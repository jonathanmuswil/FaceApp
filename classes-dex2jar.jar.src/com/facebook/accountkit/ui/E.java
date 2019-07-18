package com.facebook.accountkit.ui;

import Vm;
import Vm.a;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.m;
import android.support.v7.app.o;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.accountkit.internal.O;
import com.facebook.accountkit.internal.c.a;
import pn;
import qn;

abstract class e
  extends m
{
  public static final String q = g.a;
  private static final String r = j.class.getSimpleName();
  private static final String s;
  private wa t;
  private final Bundle u = new Bundle();
  g v;
  Fb w;
  Vm x;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(r);
    localStringBuilder.append(".viewState");
    s = localStringBuilder.toString();
  }
  
  Fragment a(FragmentTransaction paramFragmentTransaction, int paramInt)
  {
    Fragment localFragment = getFragmentManager().findFragmentById(paramInt);
    if (localFragment != null) {
      paramFragmentTransaction.remove(localFragment);
    }
    return localFragment;
  }
  
  void a(FragmentTransaction paramFragmentTransaction, int paramInt, Fragment paramFragment)
  {
    if (getFragmentManager().findFragmentById(paramInt) != paramFragment) {
      paramFragmentTransaction.replace(paramInt, paramFragment);
    }
  }
  
  void a(aa paramaa)
  {
    if (!Ub.a(this.w, ub.a.c)) {
      return;
    }
    Object localObject = getFragmentManager();
    if (paramaa == null)
    {
      paramaa = ((FragmentManager)localObject).beginTransaction();
      if (a(paramaa, pn.com_accountkit_content_bottom_fragment) == null) {
        a(paramaa, pn.com_accountkit_content_bottom_keyboard_fragment);
      }
      paramaa.commit();
      return;
    }
    paramaa = paramaa.a();
    localObject = ((FragmentManager)localObject).beginTransaction();
    if (paramaa.f())
    {
      a((FragmentTransaction)localObject, pn.com_accountkit_content_bottom_fragment);
      a((FragmentTransaction)localObject, pn.com_accountkit_content_bottom_keyboard_fragment, paramaa);
    }
    else
    {
      a((FragmentTransaction)localObject, pn.com_accountkit_content_bottom_keyboard_fragment);
      a((FragmentTransaction)localObject, pn.com_accountkit_content_bottom_fragment, paramaa);
    }
    ((FragmentTransaction)localObject).commit();
  }
  
  abstract void n();
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.v = ((g)getIntent().getParcelableExtra(q));
    Object localObject = this.v;
    if (localObject == null)
    {
      this.x = new Vm(Vm.a.e, O.t);
      n();
      return;
    }
    this.w = ((g)localObject).u();
    if (!Ub.a(this, this.v.u()))
    {
      c.a.a();
      this.x = new Vm(Vm.a.e, O.x);
      n();
      return;
    }
    int i = this.v.u().k();
    if (i != -1) {
      setTheme(i);
    }
    o.a(true);
    if (!Ub.a(this)) {
      setRequestedOrientation(1);
    }
    setContentView(qn.com_accountkit_activity_layout);
    ConstrainedLinearLayout localConstrainedLinearLayout = (ConstrainedLinearLayout)findViewById(pn.com_accountkit_content_view);
    localObject = findViewById(pn.com_accountkit_scroll_view);
    if ((localConstrainedLinearLayout != null) && (localObject != null) && (localConstrainedLinearLayout.getMinHeight() < 0) && (localConstrainedLinearLayout.getRootView() != null))
    {
      this.t = new wa((View)localObject);
      localObject = new d(this, localConstrainedLinearLayout);
      this.t.a((wa.a)localObject);
    }
    if (paramBundle != null) {
      this.u.putAll(paramBundle.getBundle(s));
    }
    Ub.b(this, this.v.u(), findViewById(pn.com_accountkit_background));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    wa localwa = this.t;
    if (localwa != null)
    {
      localwa.a(null);
      this.t = null;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBundle(s, this.u);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */