package com.facebook.accountkit.ui;

import Ym.a;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.o;
import android.support.v4.content.g;
import android.support.v7.app.m;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.facebook.accountkit.internal.c;
import on;
import pn;
import un;

public final class j
  extends e
  implements Fb.a
{
  private static final IntentFilter y = ;
  private Ym.a A = Ym.a.b;
  private Qb B;
  private String z;
  
  private void a(int paramInt, l paraml)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("account_kit_update_result", paraml);
    setResult(paramInt, localIntent);
    finish();
  }
  
  void a(Ym.a parama)
  {
    this.A = parama;
  }
  
  void a(Nb paramNb, aa paramaa)
  {
    Object localObject1;
    if ((paramNb != Nb.h) && (paramNb != Nb.i)) {
      localObject1 = O.b(this.w, paramNb);
    } else {
      localObject1 = paramaa.d();
    }
    Fragment localFragment1 = O.a(this.w, paramNb);
    Fragment localFragment2 = O.a(this.w);
    ca localca1 = paramaa.f();
    paramNb = paramaa.e();
    ca localca2 = paramaa.a();
    if (paramNb != null)
    {
      int i = on.com_accountkit_vertical_spacer_small_height;
      i = getResources().getDimensionPixelSize(i);
      if ((paramNb instanceof Bb))
      {
        localObject2 = (Bb)paramNb;
        ((Bb)localObject2).b(i);
        ((Bb)localObject2).a(0);
      }
    }
    a(paramaa);
    Object localObject2 = getFragmentManager().beginTransaction();
    a((FragmentTransaction)localObject2, pn.com_accountkit_header_fragment, (Fragment)localObject1);
    a((FragmentTransaction)localObject2, pn.com_accountkit_content_top_fragment, localca1);
    a((FragmentTransaction)localObject2, pn.com_accountkit_content_top_text_fragment, null);
    a((FragmentTransaction)localObject2, pn.com_accountkit_content_center_fragment, localFragment1);
    a((FragmentTransaction)localObject2, pn.com_accountkit_content_bottom_text_fragment, paramNb);
    if (!Ub.a(this.w, ub.a.c))
    {
      a((FragmentTransaction)localObject2, pn.com_accountkit_content_bottom_fragment, localca2);
      a((FragmentTransaction)localObject2, pn.com_accountkit_footer_fragment, localFragment2);
    }
    ((FragmentTransaction)localObject2).addToBackStack(null);
    Ub.a(this);
    ((FragmentTransaction)localObject2).commit();
    paramaa.a(this);
  }
  
  void a(String paramString)
  {
    this.z = paramString;
  }
  
  void n()
  {
    int i;
    if (this.A == Ym.a.a) {
      i = -1;
    } else {
      i = 0;
    }
    a(i, new l(this.z, this.x, false));
  }
  
  void o()
  {
    a(0, new l(null, null, true));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    aa localaa = this.B.b();
    if (localaa != null) {
      localaa.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    if (this.B.b() == null) {
      super.onBackPressed();
    } else {
      this.B.c();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.w.a(this);
    this.B = new Qb(this, this.v);
    c.c(this, paramBundle);
    g.a(this).a(this.B, y);
  }
  
  protected void onDestroy()
  {
    g.a(this).a(this.B);
    super.onDestroy();
    c.b(this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt != 4) {
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    onBackPressed();
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() != 16908332) {
      return super.onOptionsItemSelected(paramMenuItem);
    }
    onBackPressed();
    return true;
  }
  
  protected void onPause()
  {
    super.onPause();
    aa localaa = this.B.b();
    if (localaa != null) {
      localaa.b(this);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    aa localaa = this.B.b();
    if (localaa != null) {
      localaa.a(this);
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    c.d(this, paramBundle);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */