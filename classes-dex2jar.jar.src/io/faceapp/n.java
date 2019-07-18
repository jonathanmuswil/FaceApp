package io.faceapp;

import Cka;
import DFa;
import DFa.a;
import EJa;
import EJa.a;
import Fta.a;
import Gta;
import Gta.a;
import HDa;
import HDa.a;
import Hm;
import JDa;
import JOa.d;
import JQa;
import Jua;
import Jua.a;
import KFa;
import KOa;
import Rja;
import Rva.a;
import Rva.b;
import SJa;
import SJa.a;
import Uma;
import VNa;
import VNa.a;
import VOa;
import Vma;
import XHa;
import XHa.a;
import XIa.b;
import Xma;
import Zta.a;
import Zva;
import Zva.a;
import _Va;
import _ta;
import _ta.a;
import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.l;
import android.support.v4.app.s;
import android.support.v7.app.l.a;
import asa;
import bLa;
import bOa.a;
import bra;
import cOa;
import cOa.a;
import com.android.billingclient.api.I;
import com.jakewharton.processphoenix.ProcessPhoenix;
import hNa;
import hNa.a;
import iKa;
import iKa.a;
import io.faceapp.ui.components.q;
import java.util.ArrayList;
import java.util.List;
import kta;
import kta.a;
import lFa;
import lFa.a;
import mua;
import mua.a;
import nsa.b;
import oXa;
import pIa.a;
import qDa;
import qwa;
import qwa.a;
import rDa;
import rDa.a;
import sFa.a;
import sJa;
import sJa.a;
import tHa;
import tHa.a;
import wIa;
import wIa.a;
import wKa;
import wKa.a;
import wwa;
import xva;
import xva.a;
import yOa.d;
import zOa;
import zOa.a;
import zia;

public final class n
  implements m
{
  private static final MainActivity.a.a a = MainActivity.a.a.a;
  public static final a b = new a(null);
  private final s c;
  private final MainActivity d;
  
  public n(MainActivity paramMainActivity)
  {
    this.d = paramMainActivity;
    this.c = this.d.e();
  }
  
  private final void j()
  {
    bra.l.a(this.d, 2L);
  }
  
  public JQa<String> a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "prompt");
    oXa.b(paramString2, "defaultValue");
    l.a locala = new l.a(this.d);
    locala.b(paramString1);
    paramString1 = JQa.a(new u(this, paramString2, locala));
    oXa.a(paramString1, "Maybe.create { subscribe…builder.show()\n        }}");
    return paramString1;
  }
  
  public KFa a(Cka paramCka, List<String> paramList)
  {
    oXa.b(paramCka, "content");
    oXa.b(paramList, "selection");
    paramCka = DFa.la.a(paramCka, paramList);
    MainActivity.a(this.d, paramCka, "fr_stylist_selector", MainActivity.a.a.d, true, false, false, 48, null);
    return paramCka;
  }
  
  public void a()
  {
    MainActivity.a(this.d, hNa.la.a(), "fr_user_settings", MainActivity.a.a.d, false, false, false, 56, null);
  }
  
  public void a(int paramInt)
  {
    if (!this.d.isDestroyed()) {
      this.d.runOnUiThread(new o(this, paramInt));
    }
  }
  
  public void a(Fta.a parama)
  {
    kta localkta = kta.la.a();
    if (parama != null) {
      if (parama != null) {
        localkta.a((l)parama, 0);
      } else {
        throw new _Va("null cannot be cast to non-null type android.support.v4.app.Fragment");
      }
    }
    MainActivity.a(this.d, localkta, "fr_auth", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(JDa paramJDa, sFa.a parama, boolean paramBoolean)
  {
    oXa.b(paramJDa, "request");
    oXa.b(parama, "resultListener");
    parama = (l)parama;
    paramJDa = lFa.ma.a(paramJDa, paramBoolean);
    paramJDa.a(parama, 0);
    this.d.a(paramJDa, "fr_layouts_filter_selector");
  }
  
  public void a(Rja paramRja, pIa.a parama, String paramString, boolean paramBoolean)
  {
    oXa.b(paramRja, "imageDesc");
    oXa.b(parama, "startMode");
    parama = XHa.la.a(paramRja, parama, paramString, paramBoolean);
    if (paramBoolean) {
      paramRja = MainActivity.a.a.d;
    } else {
      paramRja = MainActivity.a.a.j;
    }
    MainActivity.a(this.d, parama, "fr_photo_editor", paramRja, false, false, false, 56, null);
  }
  
  public void a(Rva.a parama, Rva.b paramb)
  {
    oXa.b(parama, "initialData");
    oXa.b(paramb, "resultListener");
    paramb = (l)paramb;
    parama = xva.la.a(parama);
    parama.a(paramb, 0);
    MainActivity.a(this.d, parama, "fr_create_poll", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(Vma paramVma)
  {
    oXa.b(paramVma, "permission");
    Xma.e.a(this.d, paramVma);
  }
  
  public void a(Zta.a parama)
  {
    Gta localGta = Gta.la.a();
    if (parama != null) {
      if (parama != null) {
        localGta.a((l)parama, 0);
      } else {
        throw new _Va("null cannot be cast to non-null type android.support.v4.app.Fragment");
      }
    }
    MainActivity.a(this.d, localGta, "fr_auth_create_profile", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(Uri paramUri, int paramInt, bOa.a parama)
  {
    oXa.b(paramUri, "imageUri");
    oXa.b(parama, "resultListener");
    parama = (l)parama;
    paramUri = VNa.la.a(paramUri, paramInt);
    paramUri.a(parama, 0);
    MainActivity.a(this.d, paramUri, "fr_crop", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(l paraml, boolean paramBoolean1, boolean paramBoolean2)
  {
    oXa.b(paraml, "fragment");
    paraml = paraml.bb();
    if (paraml != null)
    {
      if (paramBoolean1) {
        this.c.b(paraml, paramBoolean2);
      } else {
        this.c.a(paraml, paramBoolean2);
      }
      return;
    }
    throw new IllegalArgumentException("Required value was null.");
  }
  
  public void a(I paramI, String paramString)
  {
    oXa.b(paramI, "skuDetails");
    oXa.b(paramString, "from");
    zia.l.a(this.d, paramString, paramI);
  }
  
  public void a(q paramq, int paramInt)
  {
    oXa.b(paramq, "resultListener");
    l locall = (l)paramq;
    paramq = wIa.la.a();
    paramq.a(locall, paramInt);
    MainActivity.a(this.d, paramq, "fr_photo_picker", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(String paramString)
  {
    oXa.b(paramString, "pollId");
    paramString = _ta.la.a(paramString);
    MainActivity.a(this.d, paramString, "fr_auth_for_vote", MainActivity.a.a.k, false, false, false, 56, null);
  }
  
  public void a(String paramString, XIa.b paramb, boolean paramBoolean)
  {
    oXa.b(paramString, "pollId");
    paramString = sJa.ma.a(paramString);
    if (paramb != null)
    {
      if (paramb != null)
      {
        paramString.a((l)paramb, 0);
        MainActivity.a(this.d, paramString, "fr_single_poll", MainActivity.a.a.d, true, false, false, 48, null);
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type android.support.v4.app.Fragment");
      }
    }
    else if (paramBoolean)
    {
      this.c.e();
      MainActivity.a(this.d, paramString, "fr_single_poll", MainActivity.a.a.h, false, false, false, 24, null);
    }
    else
    {
      MainActivity.a(this.d, paramString, "fr_single_poll", MainActivity.a.a.j, false, false, false, 56, null);
    }
  }
  
  public void a(String paramString, ArrayList<String> paramArrayList, JOa.d paramd)
  {
    oXa.b(paramString, "initComment");
    oXa.b(paramArrayList, "suggestedComments");
    oXa.b(paramd, "resultListener");
    paramd = (l)paramd;
    paramString = zOa.la.a(paramString, paramArrayList);
    paramString.a(paramd, 0);
    MainActivity.a(this.d, paramString, "fr_voting_comment", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(String paramString, yOa.d paramd, boolean paramBoolean)
  {
    oXa.b(paramString, "pollId");
    paramString = cOa.la.a(paramString);
    if (paramd != null)
    {
      if (paramd != null)
      {
        paramString.a((l)paramd, 0);
        MainActivity.a(this.d, paramString, "fr_voting", MainActivity.a.a.d, true, false, false, 48, null);
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type android.support.v4.app.Fragment");
      }
    }
    else if (paramBoolean)
    {
      this.c.e();
      MainActivity.a(this.d, paramString, "fr_voting", MainActivity.a.a.d, false, false, false, 24, null);
    }
    else
    {
      MainActivity.a(this.d, paramString, "fr_voting", MainActivity.a.a.j, false, false, false, 56, null);
    }
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    oXa.b(paramString, "from");
    Object localObject = Uma.qa.x().get();
    oXa.a(localObject, "AppPreferences.lastUploadedGender.get()");
    localObject = (VOa)localObject;
    localObject = EJa.la.a(paramString, (VOa)localObject);
    MainActivity.a(this.d, (l)localObject, "fr_pro", MainActivity.a.a.c, true, false, false, 48, null);
    asa.d.f(paramString);
  }
  
  public void a(nsa.b paramb, boolean paramBoolean1, boolean paramBoolean2)
  {
    oXa.b(paramb, "sharedImage");
    paramb = wKa.la.a(paramb, paramBoolean1, paramBoolean2);
    MainActivity.a(this.d, paramb, "fr_save_image", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(qDa paramqDa)
  {
    oXa.b(paramqDa, "adapter");
    paramqDa = rDa.la.a(paramqDa);
    MainActivity.a(this.d, paramqDa, "fr_save_image", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void a(wwa paramwwa)
  {
    oXa.b(paramwwa, "feedbackMode");
    paramwwa = qwa.la.a(paramwwa);
    MainActivity.a(this.d, paramwwa, "fr_send_feedback", MainActivity.a.a.d, false, false, false, 24, null);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c.f();
    } else {
      this.c.e();
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (!paramBoolean2))
    {
      j();
      MainActivity.a(this.d, wIa.la.a(), "fr_home", a, false, false, false, 56, null);
    }
    else
    {
      this.c.e();
      MainActivity.a.a locala;
      if (paramBoolean1) {
        locala = MainActivity.a.a.d;
      } else {
        locala = MainActivity.a.a.g;
      }
      MainActivity.a(this.d, wIa.la.a(), "fr_home", locala, false, false, false, 24, null);
    }
  }
  
  public void b()
  {
    ProcessPhoenix.b(this.d);
  }
  
  public void b(q paramq, int paramInt)
  {
    oXa.b(paramq, "resultListener");
    paramq = (l)paramq;
    mua localmua = mua.la.a();
    localmua.a(paramq, paramInt);
    MainActivity.a(this.d, localmua, "fr_camera", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void b(qDa paramqDa)
  {
    oXa.b(paramqDa, "adapter");
    paramqDa = HDa.la.a(paramqDa);
    MainActivity.a(this.d, paramqDa, "fr_share_image", MainActivity.a.a.b, true, false, false, 48, null);
  }
  
  public void c()
  {
    SJa localSJa = SJa.la.a();
    MainActivity.a(this.d, localSJa, "fr_profile", MainActivity.a.a.d, false, false, false, 56, null);
  }
  
  public void c(q paramq, int paramInt)
  {
    oXa.b(paramq, "resultListener");
    paramq = (l)paramq;
    Jua localJua = Jua.la.a();
    localJua.a(paramq, paramInt);
    MainActivity.a(this.d, localJua, "fr_celebs", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void d()
  {
    MainActivity.a(this.d, new bLa(), "fr_settings", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void d(q paramq, int paramInt)
  {
    oXa.b(paramq, "resultListener");
    l locall = (l)paramq;
    paramq = Zva.la.a();
    paramq.a(locall, paramInt);
    MainActivity.a(this.d, paramq, "fr_facebook", MainActivity.a.a.c, true, false, false, 48, null);
  }
  
  public void e()
  {
    KOa.b.a(this.d);
  }
  
  public void f()
  {
    this.d.a(iKa.ma.a(), "fr_rate_us");
  }
  
  public boolean g()
  {
    return KOa.b.h(this.d);
  }
  
  public void h()
  {
    KOa.b.i(this.d);
  }
  
  public void i()
  {
    tHa localtHa = tHa.la.a();
    MainActivity.a(this.d, localtHa, "fr_onboarding", MainActivity.a.a.k, false, false, false, 24, null);
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */