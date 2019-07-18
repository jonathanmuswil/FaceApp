package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import mn;
import pn;
import qn;

final class zb
{
  static a a(Fb paramFb, Ga paramGa)
  {
    a locala = new a();
    Bundle localBundle = locala.b();
    localBundle.putParcelable(Tb.c, paramFb);
    localBundle.putString("loginFlowState", paramGa.name());
    return locala;
  }
  
  static a a(Fb paramFb, Ga paramGa, int paramInt)
  {
    paramFb = a(paramFb, paramGa);
    paramFb.b().putInt("layoutResourceId", paramInt);
    return paramFb;
  }
  
  public static final class a
    extends ca
  {
    protected View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      return paramLayoutInflater.inflate(b().getInt("layoutResourceId", qn.com_accountkit_fragment_static_content), paramViewGroup, false);
    }
    
    protected void a(View paramView, Bundle paramBundle)
    {
      super.a(paramView, paramBundle);
      paramView = paramView.findViewById(pn.com_accountkit_icon_view);
      if (paramView != null)
      {
        int i;
        if (Ub.a(a())) {
          i = Ub.a(getActivity(), mn.com_accountkit_icon_color, -1);
        } else {
          i = Ub.d(getActivity(), a());
        }
        if ((paramView instanceof ImageView))
        {
          paramView = (ImageView)paramView;
          Ub.a(getActivity(), paramView, i);
          paramBundle.getString("loginFlowState");
          if ((paramView.getDrawable() instanceof Animatable)) {
            ((Animatable)paramView.getDrawable()).start();
          }
        }
        else
        {
          Ub.a(getActivity(), paramView.getBackground(), i);
        }
      }
    }
    
    Ga e()
    {
      return Ga.valueOf(b().getString("loginFlowState", Ga.a.name()));
    }
    
    boolean f()
    {
      return false;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */