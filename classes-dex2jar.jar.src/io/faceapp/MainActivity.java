package io.faceapp;

import EVa;
import Hm;
import Kra;
import Ora;
import Ora.a;
import Ora.a.c;
import Ora.a.f;
import Ora.a.g;
import QQa;
import Roa;
import Ssa;
import UVa;
import Uma;
import VHa;
import Xma;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.G;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v4.app.s;
import android.support.v4.app.s.a;
import android.support.v7.app.m;
import android.view.View;
import asa;
import dQa;
import eoa;
import hda;
import icb;
import icb.a;
import io.faceapp.ui.misc.d;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jna;
import kRa;
import oXa;
import qla;
import zYa;
import zia;

public final class MainActivity
  extends m
{
  public static final a q = new a(null);
  private n r;
  private boolean s;
  private kRa t;
  private dQa u;
  private HashMap v;
  
  private final void o()
  {
    if (Roa.a.b()) {
      Roa.a.a();
    }
  }
  
  private final l p()
  {
    return e().a(2131296572);
  }
  
  private final Ora.a q()
  {
    Object localObject = getIntent();
    oXa.a(localObject, "intent");
    Uri localUri = ((Intent)localObject).getData();
    if (localUri != null)
    {
      localObject = getIntent();
      oXa.a(localObject, "intent");
      ((Intent)localObject).setData(null);
      return Ora.a.a(localUri, false);
    }
    localObject = getIntent();
    oXa.a(localObject, "intent");
    if (oXa.a("android.intent.action.SEND", ((Intent)localObject).getAction()))
    {
      localObject = getIntent();
      oXa.a(localObject, "intent");
      localObject = ((Intent)localObject).getType();
      if ((localObject != null) && (zYa.b((String)localObject, "image/", false, 2, null) == true))
      {
        localUri = (Uri)getIntent().getParcelableExtra("android.intent.extra.STREAM");
        localObject = getIntent();
        oXa.a(localObject, "intent");
        ((Intent)localObject).setType(null);
        return Ora.a.a(localUri);
      }
    }
    return null;
  }
  
  private final void r()
  {
    this.t = QQa.d(QQa.c(15L, TimeUnit.SECONDS).e(Long.valueOf(0L)).e(new i(this))).b(EVa.b()).c(new j(this));
  }
  
  public final void a(h paramh, String paramString)
  {
    oXa.b(paramh, "fragment");
    oXa.b(paramString, "tag");
    paramh.a(e(), paramString);
  }
  
  public final void a(l paraml, String paramString, MainActivity.a.a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    oXa.b(paraml, "fragment");
    oXa.b(paramString, "tag");
    oXa.b(parama, "animType");
    a(paramString);
    boolean bool = getResources().getBoolean(2131034116);
    a locala = q;
    G localG = e().a();
    if (paramBoolean3) {
      localG.a(true);
    }
    oXa.a(localG, "supportFragmentManager.b…ReorderingAllowed(true) }");
    a.a(locala, localG, parama, bool);
    if (paramBoolean1) {
      localG.a(2131296572, paraml, paramString);
    } else {
      localG.b(2131296572, paraml, paramString);
    }
    if (paramBoolean2) {
      localG.a(paramString);
    }
    localG.b();
  }
  
  public final void a(String paramString)
  {
    if (paramString == null)
    {
      paramString = e();
      oXa.a(paramString, "supportFragmentManager");
      if (paramString.b() > 0)
      {
        paramString = e();
        s locals = e();
        oXa.a(locals, "supportFragmentManager");
        paramString = paramString.b(locals.b() - 1);
        oXa.a(paramString, "supportFragmentManager.g….backStackEntryCount - 1)");
        paramString = paramString.getName();
      }
      else
      {
        paramString = null;
      }
    }
    if (paramString != null)
    {
      asa.d.a(this, paramString);
      icb.a("ScreenEntered").a(paramString, new Object[0]);
    }
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final n n()
  {
    n localn = this.r;
    if (localn != null) {
      return localn;
    }
    oXa.b("screenRouter");
    throw null;
  }
  
  public void onBackPressed()
  {
    Object localObject = p();
    if ((localObject != null) && ((localObject instanceof d)) && (((d)localObject).fa())) {
      return;
    }
    localObject = this.u;
    if (localObject != null)
    {
      if (!((dQa)localObject).b()) {
        localObject = null;
      }
      if (localObject != null)
      {
        ((dQa)localObject).a();
        return;
      }
    }
    localObject = e();
    oXa.a(localObject, "supportFragmentManager");
    if (((s)localObject).b() <= 1)
    {
      finish();
    }
    else
    {
      super.onBackPressed();
      a(this, null, 1, null);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    setTheme(2131755044);
    super.onCreate(paramBundle);
    icb.a("Activity").a("created", new Object[0]);
    setContentView(2131492892);
    this.r = new n(this);
    if (p() == null)
    {
      this.s = true;
      paramBundle = q();
      if (paramBundle != null)
      {
        n localn;
        if ((paramBundle instanceof Ora.a.f))
        {
          localn = this.r;
          if (localn != null)
          {
            m.a.a(localn, ((Ora.a.f)paramBundle).c(), null, false, 6, null);
          }
          else
          {
            oXa.b("screenRouter");
            throw null;
          }
        }
        else if ((paramBundle instanceof Ora.a.g))
        {
          if (Kra.b.d())
          {
            localn = this.r;
            if (localn != null)
            {
              m.a.a(localn, ((Ora.a.g)paramBundle).c(), null, false, 6, null);
            }
            else
            {
              oXa.b("screenRouter");
              throw null;
            }
          }
          else
          {
            localn = this.r;
            if (localn != null)
            {
              localn.a(((Ora.a.g)paramBundle).c());
            }
            else
            {
              oXa.b("screenRouter");
              throw null;
            }
          }
        }
        else if ((paramBundle instanceof Ora.a.c))
        {
          localn = this.r;
          if (localn != null)
          {
            m.a.a(localn, ((Ora.a.c)paramBundle).c(), null, null, false, 6, null);
          }
          else
          {
            oXa.b("screenRouter");
            throw null;
          }
        }
      }
      else if (VHa.a.b())
      {
        paramBundle = this.r;
        if (paramBundle != null)
        {
          paramBundle.i();
        }
        else
        {
          oXa.b("screenRouter");
          throw null;
        }
      }
      else
      {
        paramBundle = this.r;
        if (paramBundle != null)
        {
          m.a.a(paramBundle, false, false, 3, null);
        }
        else
        {
          oXa.b("screenRouter");
          throw null;
        }
      }
    }
    if (Kra.b.e())
    {
      paramBundle = this.r;
      if (paramBundle != null)
      {
        m.a.a(paramBundle, null, 1, null);
      }
      else
      {
        oXa.b("screenRouter");
        throw null;
      }
    }
    paramBundle = Uma.qa.e().get();
    oXa.a(paramBundle, "AppPreferences.debugMenuUnlocked.get()");
    if (((Boolean)paramBundle).booleanValue()) {
      this.u = Ssa.a.a(this);
    }
  }
  
  protected void onDestroy()
  {
    hda.c.a();
    this.u = null;
    super.onDestroy();
    icb.a("Activity").a("destroyed", new Object[0]);
  }
  
  protected void onPause()
  {
    hda.c.b();
    zia.l.f();
    super.onPause();
    icb.a("Activity").a("paused", new Object[0]);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    oXa.b(paramArrayOfString, "permissions");
    oXa.b(paramArrayOfInt, "grantResults");
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    int i;
    if (paramArrayOfInt.length == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    if (!Xma.e.a(this, paramInt, paramArrayOfInt[0])) {
      n().h();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    icb.a("Activity").a("resumed", new Object[0]);
    hda.c.c();
    Xma.e.a(this);
    zia.l.g();
  }
  
  protected void onStart()
  {
    super.onStart();
    icb.a("Activity").a("started", new Object[0]);
    r();
    if (!this.s)
    {
      l locall = p();
      if (locall != null)
      {
        Object localObject = locall;
        if (!(locall instanceof qla)) {
          localObject = null;
        }
        localObject = (qla)localObject;
        if (localObject != null) {
          ((qla)localObject).Tb();
        }
      }
    }
    this.s = false;
    eoa.j.d();
    jna.a.a(this);
  }
  
  protected void onStop()
  {
    eoa.j.e();
    l locall = p();
    if (locall != null)
    {
      localObject = locall;
      if (!(locall instanceof qla)) {
        localObject = null;
      }
      localObject = (qla)localObject;
      if (localObject != null) {
        ((qla)localObject).Sb();
      }
    }
    Object localObject = this.t;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    this.t = null;
    super.onStop();
    icb.a("Activity").a("stopped", new Object[0]);
  }
  
  public static final class a
  {
    private final G a(G paramG, a parama, boolean paramBoolean)
    {
      a locala = parama;
      if (paramBoolean) {
        locala = a(parama);
      }
      switch (f.a[locala.ordinal()])
      {
      default: 
        throw new UVa();
      case 11: 
        paramG.a(0, 0, 0, 2130771995);
        oXa.a(paramG, "this.setCustomAnimations…0, R.anim.slide_out_left)");
        break;
      case 10: 
        paramG.a(0, 0, 0, 2130771996);
        oXa.a(paramG, "this.setCustomAnimations…, R.anim.slide_out_right)");
        break;
      case 9: 
        paramG.a(2130771989, 0, 0, 2130771995);
        oXa.a(paramG, "this.setCustomAnimations…0, R.anim.slide_out_left)");
        break;
      case 8: 
        paramG.a(2130771990, 0, 0, 2130771996);
        oXa.a(paramG, "this.setCustomAnimations…, R.anim.slide_out_right)");
        break;
      case 7: 
        paramG.a(2130771990, 0, 0, 0);
        oXa.a(paramG, "this.setCustomAnimations….slide_in_right, 0, 0, 0)");
        break;
      case 6: 
        paramG.a(2130771989, 0, 0, 0);
        oXa.a(paramG, "this.setCustomAnimations…m.slide_in_left, 0, 0, 0)");
        break;
      case 5: 
        paramG.a(2130771990, 2130771996, 2130771989, 2130771995);
        oXa.a(paramG, "this.setCustomAnimations…t, R.anim.slide_out_left)");
        break;
      case 4: 
        paramG.a(2130771989, 2130771995, 2130771990, 2130771996);
        oXa.a(paramG, "this.setCustomAnimations…, R.anim.slide_out_right)");
        break;
      case 3: 
        paramG.a(2130771991, 2130771993, 2130771991, 2130771993);
        oXa.a(paramG, "this.setCustomAnimations…p, R.anim.slide_out_down)");
        break;
      case 2: 
        paramG.a(2130771986, 2130771987, 2130771986, 2130771987);
        oXa.a(paramG, "this.setCustomAnimations…fade_in, R.anim.fade_out)");
      }
      return paramG;
    }
    
    private final a a(a parama)
    {
      a locala = parama;
      switch (f.b[parama.ordinal()])
      {
      default: 
        throw new UVa();
      case 11: 
        locala = a.j;
        break;
      case 10: 
        locala = a.k;
        break;
      case 9: 
        locala = a.h;
        break;
      case 8: 
        locala = a.i;
        break;
      case 7: 
        locala = a.f;
        break;
      case 6: 
        locala = a.g;
        break;
      case 5: 
        locala = a.d;
        break;
      case 4: 
        locala = a.e;
      }
      return locala;
    }
    
    public static enum a
    {
      static
      {
        a locala1 = new a("ANIM_NONE", 0);
        a = locala1;
        a locala2 = new a("ANIM_FADE_IN", 1);
        b = locala2;
        a locala3 = new a("ANIM_SLIDE_FROM_BOTTOM", 2);
        c = locala3;
        a locala4 = new a("ANIM_SLIDE_FROM_RIGHT_TO_LEFT", 3);
        d = locala4;
        a locala5 = new a("ANIM_SLIDE_FROM_LEFT_TO_RIGHT", 4);
        e = locala5;
        a locala6 = new a("ANIM_SLIDE_FROM_RIGHT_ENTER_ONLY", 5);
        f = locala6;
        a locala7 = new a("ANIM_SLIDE_FROM_LEFT_ENTER_ONLY", 6);
        g = locala7;
        a locala8 = new a("ANIM_SLIDE_FROM_LEFT_POP_RIGHT", 7);
        h = locala8;
        a locala9 = new a("ANIM_SLIDE_FROM_RIGHT_POP_LEFT", 8);
        i = locala9;
        a locala10 = new a("ANIM_STABLE_POP_RIGHT", 9);
        j = locala10;
        a locala11 = new a("ANIM_STABLE_POP_LEFT", 10);
        k = locala11;
        l = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11 };
      }
      
      private a() {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */